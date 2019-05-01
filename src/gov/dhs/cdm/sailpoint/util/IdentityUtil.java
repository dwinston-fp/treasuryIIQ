package gov.dhs.cdm.sailpoint.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sailpoint.api.Aggregator;
import sailpoint.api.Identitizer;
import sailpoint.api.SailPointContext;
import sailpoint.connector.AbstractConnector;
import sailpoint.connector.Connector;
import sailpoint.connector.ConnectorFactory;
import sailpoint.object.Application;
import sailpoint.object.Attributes;
import sailpoint.object.Capability;
import sailpoint.object.Certification;
import sailpoint.object.CertificationEntity;
import sailpoint.object.CertificationItem;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.Link;
import sailpoint.object.ObjectAttribute;
import sailpoint.object.ObjectConfig;
import sailpoint.object.ResourceObject;
import sailpoint.object.TaskResult;
import sailpoint.object.TaskResult.CompletionStatus;
import sailpoint.tools.GeneralException;

/**
 * Utility class aimed at common Identity related operations.
 */
public final class IdentityUtil {

    private static final Log log = LogFactory.getLog(IdentityUtil.class);

    /**
     * Private constructor to prevent instantiation.
     */
    private IdentityUtil() {
    }

    /**
     * Check if an identity is active based on their inactive flag.
     *
     * @param context  the SailPointContext to use for querying
     * @param identity the identity to query
     * @return false if the identity is inactive or does not exist or has a null inactive attribute,
     * true otherwise
     * @throws GeneralException if user is not found or has a null inactive attribute
     */
    public static boolean isActive(SailPointContext context, String identity) throws GeneralException {
        Filter filter = Filter.eq(Identity.ATT_USERNAME, identity);
        Object flag = SearchUtil.getObjectProperty(context, Identity.class, filter, Identity.ATT_INACTIVE);

        return flag != null && flag instanceof Boolean && !((Boolean) flag);
    }

    /**
     * Returns the next active manager, null otherwise.
     *
     * NOTE: this method can be infinitely recursive if there's a cyclical path within the manager
     * chain.
     *
     * @param manager the identity to start the search from
     * @return the next active manager, null otherwise
     */
    public static Identity getActiveManagerRecursive(Identity manager) {
        while ((manager = manager.getManager()) != null) {
            if (!manager.isInactive()) {
                return manager;
            }
        }

        return null;
    }

    /**
     * Returns true if the specified identity is a System Administrator.
     *
     * @param identity the identity to check
     * @return true if the identity has SystemAdministrator privileges
     */
    public static boolean isSysAdmin(Identity identity) {
        return identity.getCapabilityManager().hasCapability(Capability.SYSTEM_ADMINISTRATOR);
    }


    /**
     * Returns true if the specified identity is in the given certification.
     *
     * This may be used during self certification checks.
     *
     * @param identity      the identity to check
     * @param certification the certification to check
     */
    public static boolean isInCertification(Identity identity, Certification certification) {
        for (CertificationEntity entity : certification.getEntities()) {
            for (CertificationItem item : entity.getItems()) {
                if (item.getTargetId().equals(identity.getId())) return true;
            }
        }

        return false;
    }

    /**
     * Checks whether two Identity objects are different based on ObjectConfig's
     * non-system attributes.
     *
     * @param one the first Identity
     * @param two the second Identity
     * @return true if they're different
     */
    public static boolean isDifferent(Identity one, Identity two) {
        ObjectConfig config = ObjectConfig.getObjectConfig(Identity.class);
        List<ObjectAttribute> attributes = config.getObjectAttributes();

        for (ObjectAttribute attribute : attributes) {
            if (!attribute.isSystem()) {

                String name = attribute.getName();
                Object old = one.getAttribute(name);
                Object nue = two.getAttribute(name);

                if (log.isTraceEnabled()) {
                    log.trace(String.format("Comparing attribute %s, old: %s, new: %s, for: %s", name, old, nue, one.getName()));
                }

                if (!equals(old, nue)) {
                    if (log.isDebugEnabled()) {
                        log.debug(String.format("%s is different (%s, %s) for %s", name, old, nue, one.getName()));
                    }
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Finds the differences between two Identity objects and returns the
     * different attributes and their values.
     *
     * @return two maps representing the differences, the first are the old values, the second are
     * the new
     */
    public static List<Map<String, Object>> getDifferences(Identity one, Identity two) {
        Map<String, Object> oldValues = new HashMap<>();
        Map<String, Object> newValues = new HashMap<>();

        ObjectConfig config = ObjectConfig.getObjectConfig(Identity.class);
        List<ObjectAttribute> attributes = config.getObjectAttributes();

        for (ObjectAttribute attribute : attributes) {
            if (!attribute.isSystem()) {
                String name = attribute.getName();

                Object old = one.getAttribute(name);
                Object nue = two.getAttribute(name);

                if (log.isTraceEnabled()) {
                    log.trace(String.format("Comparing attribute %s, old: %s, new: %s, for: %s", name, old, nue, one.getName()));
                }

                if (!equals(old, nue)) {
                    if (log.isDebugEnabled()) {
                        log.debug(String.format("%s is different (%s, %s) for %s", name, old, nue, one.getName()));
                    }
                    oldValues.put(name, old);
                    newValues.put(name, nue);
                }
            }
        }

        return Arrays.asList(oldValues, newValues);
    }

    /**
     * Checks equality of two objects taking into consideration if they're null.
     *
     * @param one the first object
     * @param two the second object
     * @return true if they're equal (or both null), false otherwise
     */
    public static boolean equals(Object one, Object two) {
        if (one == null && two == null) return true;
        if (one == null || two == null) return false;
        return one.equals(two);
    }

    public static boolean aggregateAccount(SailPointContext context, Application application, Identity identity, String nativeIdentity) throws Exception {
        if (log.isTraceEnabled()) log.trace("Enter aggregateAccount");

        if (context == null || application == null || identity == null || StringUtils.isEmpty(nativeIdentity))
            throw new GeneralException("No null parameters are allowed.");

        String applicationName = application.getName();
        String identityName = identity.getName();

        if (log.isTraceEnabled()) {
            log.trace("Performing targeted aggregation");
            log.trace("Identity: " + identityName);
            log.trace("Application: " + applicationName);
        }

        if (log.isTraceEnabled()) log.trace("Getting connector");
        Connector connector = ConnectorFactory.getConnector(application, null);
        if (connector == null)
            throw new GeneralException("Unabled to obtain connector for application: " + applicationName);

        if (log.isTraceEnabled()) log.trace("Getting data from connector");
        ResourceObject resourceObject = connector.getObject(AbstractConnector.TYPE_ACCOUNT, nativeIdentity, null);

        if (log.isTraceEnabled()) log.trace("Configuring aggregation");
        Attributes<String, Object> argMap = new Attributes<>();
        argMap.put(Aggregator.ARG_AGGREGATION_TYPE, Aggregator.TYPE_ACCOUNT);
        argMap.put(Aggregator.ARG_APPLICATIONS, applicationName);
        argMap.put("descriptionAttribute", "description");
        argMap.put("descriptionLocale", "en_US");

        if (log.isTraceEnabled()) log.trace("Running aggregation");
        Aggregator aggregator = new Aggregator(context, argMap);
        TaskResult taskResult = aggregator.aggregate(application, resourceObject);

        if (taskResult.hasErrors()) taskResult.setCompletionStatus(CompletionStatus.Error);
        else if (taskResult.hasWarnings()) taskResult.setCompletionStatus(CompletionStatus.Warning);
        else taskResult.setCompletionStatus(CompletionStatus.Success);

        if (log.isTraceEnabled())
            log.trace("Completion status: " + taskResult.getCompletionStatus().name());
        boolean isSuccess = taskResult.getCompletionStatus().equals(CompletionStatus.Success);

        if (log.isTraceEnabled()) log.trace("Exit aggregateAccount: " + isSuccess);
        return isSuccess;
    }

    public static boolean aggregateAccount(SailPointContext context, String applicationName, String identityName, String nativeIdentity) throws Exception {
        if (context == null || StringUtils.isEmpty(applicationName) || StringUtils.isEmpty(identityName) || StringUtils.isEmpty(nativeIdentity))
            throw new GeneralException("No null parameters are allowed.");

        Application application = SearchUtil.getApplication(context, applicationName);
        Identity identity = SearchUtil.getIdentityIgnoreCase(context, identityName);

        if (application == null || identity == null)
            throw new GeneralException("Problem obtaining application and/or identity from context.");

        return aggregateAccount(context, application, identity, nativeIdentity);
    }

    /**
     *
     * @param context
     * @param identity
     * @throws GeneralException
     */
    public static void saveIdentity(SailPointContext context, Identity identity) throws GeneralException {
        if (context == null || identity == null) {
            throw new GeneralException("Cannot save identity obejct, context or identity was null.");
        }
        context.saveObject(identity);
        context.commitTransaction();
    }

    public static void refreshIdentity(SailPointContext context, Identity identity, Attributes<String, Object> args) throws GeneralException {
        Identitizer identitizer = new Identitizer(context, args);
        identitizer.refresh(identity);
        saveIdentity(context, identity);
    }

    public static void refreshAllLinks(SailPointContext context, Identity identity) throws GeneralException {
        Identitizer identitizer = new Identitizer(context);
        identitizer.reload(identity);
        saveIdentity(context, identity);
    }

    public static void refreshLinks(SailPointContext context, Identity identity, List<Link> links) throws GeneralException {
        Identitizer identitizer = new Identitizer(context);
        identitizer.reload(identity, links);
        saveIdentity(context, identity);
    }

    public static void refreshLinks(SailPointContext context, Identity identity, Set<String> applicationNames) throws GeneralException {
        List<Link> links = new ArrayList<>(applicationNames.size());
        for (Link link : identity.getLinks())
            if (applicationNames.contains(link.getApplicationName())) links.add(link);
        refreshLinks(context, identity, links);
    }

    public static void refreshLinks(SailPointContext context, String identityName, List<Link> links) throws GeneralException {
        Identity identity = SearchUtil.getIdentityIgnoreCase(context, identityName);
        refreshLinks(context, identity, links);
    }

    public static void refreshLinks(SailPointContext context, String identityName, Set<String> applicationNames) throws GeneralException {
        Identity identity = SearchUtil.getIdentityIgnoreCase(context, identityName);
        refreshLinks(context, identity, applicationNames);
    }

    public static void refreshLink(SailPointContext context, Identity identity, Link link) throws GeneralException {
        refreshLinks(context, identity, Collections.singletonList(link));
    }

    public static void refreshLink(SailPointContext context, Identity identity, String applicationName) throws GeneralException {
        refreshLinks(context, identity, Collections.singleton(applicationName));
    }

    public static void refreshLink(SailPointContext context, String identityName, Link link) throws GeneralException {
        refreshLinks(context, identityName, Collections.singletonList(link));
    }

    public static void refreshLink(SailPointContext context, String identityName, String applicationName) throws GeneralException {
        refreshLinks(context, identityName, Collections.singleton(applicationName));
    }

}
