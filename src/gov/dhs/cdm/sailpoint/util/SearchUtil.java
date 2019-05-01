package gov.dhs.cdm.sailpoint.util;

import java.util.Iterator;

import sailpoint.api.ObjectUtil;
import sailpoint.api.SailPointContext;
import sailpoint.object.Application;
import sailpoint.object.Configuration;
import sailpoint.object.Custom;
import sailpoint.object.Filter;
import sailpoint.object.Identity;
import sailpoint.object.Link;
import sailpoint.object.QueryOptions;
import sailpoint.object.SailPointObject;
import sailpoint.tools.GeneralException;
import sailpoint.tools.Util;

/**
 * A new Search utility that is more organized than the original and where all object-specific
 * methods use the same abstracted underlying methods.
 */
public class SearchUtil {
  private SearchUtil() {}

  /*
   * Identity Methods
   */

  /**
   * Get the identity by name while ignoring case.
   *
   * @param name the identity name
   * @return the Identity object or null
   */
  public static Identity getIdentityIgnoreCase(SailPointContext context, String name)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.setIgnoreCase(true);
    qo.addFilter(Filter.eq("name", name));

    return (Identity) getObject(context, Identity.class, qo);
  }
  
  /**
   * Gets Identity for any given attributeName and value
   *
   * @param context
   * @param attributeName
   * @param attributeValue
   *
   * @return Identity - Returns an identity that matches the given attributeName with the given attributeValue,ignoring case considerations.
   *
   */
	public static Identity getIdentityGivenAttribute (SailPointContext context, String attributeName, String attributeValue) throws GeneralException
	{
		QueryOptions qo = new QueryOptions();
		qo.addFilter(Filter.eq(attributeName, attributeValue));
		qo.setIgnoreCase(true);
		Identity identity = null;
		Iterator<Identity> it = context.search(Identity.class, qo);
		// if found, return that identity
		if (it.hasNext()){
			identity = (Identity) it.next();
		}
		return identity;
	}


  /**
   * Get the identity given an account name
   *
   * @param accountName the account native identity
   * @return the Identity object or null
   */
  public static Identity getIdentityGivenAccount(SailPointContext context, String accountName)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("links.nativeIdentity", accountName));

    return (Identity) getObject(context, Identity.class, qo);
  }

  /**
   * Get the identity given the account name and application name
   *
   * @param application the application name
   * @param accountName the account native identity
   * @return the Identity object or null
   */
  public static Identity getIdentityGivenAccount(SailPointContext context, String application,
      String accountName) throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("links.application.name", application));
    qo.addFilter(Filter.eq("links.nativeIdentity", accountName));

    return (Identity) getObject(context, Identity.class, qo);
  }
  
  /**
   * Gets Identity for the given email
   *
   * @param context
   * @param email
   *
   * @return Identity - Returns an identity that matches with the given email,ignoring case considerations.
   *
   */
	public static Identity getIdentityGivenEmail (SailPointContext context, String email) throws GeneralException
	{
		QueryOptions qo = new QueryOptions();
		qo.addFilter(Filter.eq("email", email));
		qo.setIgnoreCase(true);
		Identity identity = null;
		Iterator<Identity> it = context.search(Identity.class, qo);
		// if found, return that identity
		if (it.hasNext()){
			identity = (Identity) it.next();
		}
		return identity;
	}

  
  /**
   * Gets correlated Identity Object by its name
   *
   * @param context
   * @param name
   *
   * @return Identity - Returns an correlated Identity that matches with the given name, ignoring case considerations.
   *
   */
	public static Identity getCorrelatedIdentity (SailPointContext context,String name) throws GeneralException	{
		Identity identity = getCorrelatedIdentityFirst(context, name);

		return identity;
	}
	
	/**
	 * Gets correlated Identity Object by a given attribute
	 * @param context
	 * @param attributeName
	 * @param attributeValue
	 * @return Identity - Returns an correlated Identity that matches the given attributeName with the given attributeValue, ignoring case considerations.
	 * @throws GeneralException
	 */
	 public static Identity getCorrelatedIdentityGivenAttribute (SailPointContext context,String attributeName, String attributeValue) throws GeneralException	{
		QueryOptions qo = new QueryOptions();

		qo.addFilter(Filter.eq(attributeName, attributeValue));
		qo.addFilter(Filter.eq("correlated", true));
		qo.setIgnoreCase(true);
		qo.addFilter(ObjectUtil.buildWorkgroupInclusiveIdentityFilter());
		Identity identity = null;
		Iterator<Identity> it = context.search(Identity.class, qo);

		// if found, return that identity
		if (it.hasNext())
		{
			identity = (Identity) it.next();
		}
		//if correlated account null, correlate to an existing orphan account (if it exists)
		else if(identity == null)
		{
			identity = getIdentityGivenAttribute(context, attributeName, attributeValue);
		}

		return identity;
	}

	
	/**
	 * Gets correlated Identity Object by its email
	 * @param context
	 * @param email
	 * @return Identity - Returns an correlated Identity that matches with the given email, ignoring case considerations.
	 * @throws GeneralException
	 */
	 public static Identity getCorrelatedIdentityGivenEmail (SailPointContext context,String email) throws GeneralException	{
		QueryOptions qo = new QueryOptions();

		qo.addFilter(Filter.eq("email", email));
		qo.addFilter(Filter.eq("correlated", true));
		qo.setIgnoreCase(true);
		qo.addFilter(ObjectUtil.buildWorkgroupInclusiveIdentityFilter());
		Identity identity = null;
		Iterator<Identity> it = context.search(Identity.class, qo);

		// if found, return that identity
		if (it.hasNext())
		{
			identity = (Identity) it.next();
		}
		//if correlated account null, correlate to an existing orphan account (if it exists)
		else if(identity == null)
		{
			identity = getIdentityGivenEmail(context, email);
		}

		return identity;
	}

  /**
   * Get a Workgroup object
   *
   * @param workgroup the workgroup name
   * @return the Identity object or null
   */
  public static Identity getWorkgroup(SailPointContext context, String workgroup)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("workgroup", true));
    qo.addFilter(Filter.eq("name", workgroup));

    return (Identity) getObject(context, Identity.class, qo);
  }

  /**
   * Get a specific property or attribute for an identity
   *
   * @param name the name of the identity
   * @param property the property to retrieve
   * @return the value of the property or null
   */
  public static Object getIdentityProperty(SailPointContext context, String name, String property)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("name", name));

    return getObjectProperty(context, Identity.class, qo, property);
  }

  /**
   * Get an identity's manager
   *
   * @param name the name of the identity
   * @return the Identity object of the manager
   */
  public static Identity getIdentityManager(SailPointContext context, String name)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("name", name));

    return (Identity) getObjectProperty(context, Identity.class, qo, "manager");
  }

  /**
   * Checks whether an identity matches the given filter
   *
   * @param identity the identity object
   * @param filter the filter to match
   * @return true iff the identity matches the filter
   */
  public static boolean identityMatches(SailPointContext context, Identity identity, Filter filter)
      throws GeneralException {
    Filter searchFilter = Filter.and(Filter.eq("id", identity.getId()), filter);

    return doesExist(context, Identity.class, searchFilter);
  }

  /**
   * Checks whether an identity matches the given filter
   *
   * @param name the name of the identity
   * @param filter the filter to match
   * @return true iff the identity matches the filter
   */
  public static boolean identityMatches(SailPointContext context, String name, Filter filter)
      throws GeneralException {
    Filter searchFilter = Filter.and(Filter.eq("name", name), filter);

    return doesExist(context, Identity.class, searchFilter);
  }

  /*
   * Link Methods
   */

  /**
   * Get the first account for an identity on the specified application
   *
   * @param identity the Identity object
   * @param application the application name
   * @return the Link object or null
   */
  public static Link getAccount(SailPointContext context, Identity identity, String application)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("identity.id", identity.getId()));
    qo.addFilter(Filter.eq("application.name", application));

    return (Link) getObject(context, Link.class, qo);
  }

  /**
   * Get the first account for an identity on the specified application
   *
   * @param name the identity name
   * @param application the application name
   * @return the Link object or null
   */
  public static Link getAccount(SailPointContext context, String name, String application)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("identity.name", name));
    qo.addFilter(Filter.eq("application.name", application));

    return (Link) getObject(context, Link.class, qo);
  }

  /**
   * Get a specific property or attribute for an account
   *
   * @param name the native identity of the account
   * @param property the property to get
   * @return the value of the property or null
   */
  public static Object getAccountProperty(SailPointContext context, String name, String property)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("nativeIdentity", name));

    return getObjectProperty(context, Link.class, qo, property);
  }

  /*
   * Application Methods
   */

  /**
   * Get the application object given the application name
   *
   * @param name the name of the application
   * @return the application object
   */
  public static Application getApplication(SailPointContext context, String name)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("name", name));

    // return getObjectProperty(context, Application.class, qo);
    return null;
  }

  /**
   * Get a specific property or attribute for an application
   *
   * @param name the name of the application
   * @param property the property to get
   * @return the value of the property or null
   */
  public static Object getApplicationProperty(SailPointContext context, String name,
      String property) throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(Filter.eq("name", name));

    return getObjectProperty(context, Application.class, qo, property);
  }

  /*
   * Custom and Configuration helpers
   */

  /**
   * Get the value of a Custom object entry
   *
   * @param name the name of the custom object
   * @param key the key in the map
   * @return the value of the key or null
   */
  public static Object getCustomValue(SailPointContext context, String name, String key)
      throws GeneralException {
    Custom custom = context.getObject(Custom.class, name);
    if (custom != null)
      return custom.get(key);

    return null;
  }

  /**
   * Get the value of a Configuration object entry
   *
   * @param name the name of the configuration object
   * @param key the key in the map
   * @return the value of the key or null
   */
  public static Object getConfigurationValue(SailPointContext context, String name, String key)
      throws GeneralException {
    Configuration config = context.getObject(Configuration.class, name);
    if (config != null)
      return config.get(key);

    return null;
  }

  /**
   * Get the value of a key in the system configuration
   *
   * @param key the key in the map
   * @return the vlaue of the key or null
   */
  public static Object getSysConfigValue(SailPointContext context, String key)
      throws GeneralException {
    Configuration config = context.getConfiguration();
    return config.get(key);
  }

  /*
   * Main methods that are used to search by other methods
   */

  /**
   * Search for a SailPointObject given the class and filter
   *
   * @param klass a class that extends SailPointObject
   * @param filter the filter that should be applied
   * @return the first object found or null
   */
  public static SailPointObject getObject(SailPointContext context,
      Class<? extends SailPointObject> klass, Filter filter) throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(filter);

    return getObject(context, klass, qo);
  }

  /**
   * Search for a SailPointObject given then class and query options
   *
   * @param klass a class that extends SailPointObject
   * @param qo the query options that should be applied
   * @return the first object found or null
   */
  public static SailPointObject getObject(SailPointContext context,
      Class<? extends SailPointObject> klass, QueryOptions qo) throws GeneralException {
    SailPointObject object = null;
    Iterator<? extends SailPointObject> it = context.search(klass, qo);

    if (it.hasNext())
      object = it.next();

    Util.flushIterator(it);

    return object;
  }

  /**
   * Search for a specific property for the given class and filter
   *
   * @param klass a class that extends SailPointObject
   * @param filter the filter that should be applied
   * @param property the property to get
   * @return the value of the property or null
   */
  public static Object getObjectProperty(SailPointContext context,
      Class<? extends SailPointObject> klass, Filter filter, String property)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(filter);

    return getObjectProperty(context, klass, qo, property);
  }

  /**
   * Search for a specific property for the given class and query options
   *
   * @param klass a class that extends SailPointObject
   * @param qo the query options that should be applied
   * @param property the property to get
   * @return the value of the property or null
   */
  public static Object getObjectProperty(SailPointContext context,
      Class<? extends SailPointObject> klass, QueryOptions qo, String property)
      throws GeneralException {
    Object value = null;

    Iterator<Object[]> it = context.search(klass, qo, property);
    if (it.hasNext())
      value = it.next()[0];

    Util.flushIterator(it);
    return value;
  }

  /**
   * Search for multiple properties for the given class and filter
   *
   * @param klass a class that extends SailPointObject
   * @param filter the filter that should be applied
   * @param properties the properties to get
   * @return the values of the properties in an array
   */
  public static Object[] getObjectProperties(SailPointContext context,
      Class<? extends SailPointObject> klass, Filter filter, String properties)
      throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(filter);

    return getObjectProperties(context, klass, qo, properties);
  }

  /**
   * Search for multiple properties for the given class and query options
   *
   * @param klass a class that extends SailPointObject
   * @param qo the query options that should be applied
   * @param properties the properties to get
   * @return the values of the properties in an array
   */
  public static Object[] getObjectProperties(SailPointContext context,
      Class<? extends SailPointObject> klass, QueryOptions qo, String properties)
      throws GeneralException {
    Object[] value = null;

    Iterator<Object[]> it = context.search(klass, qo, properties);

    if (it.hasNext())
      value = it.next();

    Util.flushIterator(it);
    return value;
  }

  /**
   * Checks whether an object exists that matches the given query options
   *
   * @param klass a class that extends SailPointObject
   * @param qo the query options that should be applied
   * @return true iff an object matching the query options exists
   */
  public static boolean doesExist(SailPointContext context, Class<? extends SailPointObject> klass,
      QueryOptions qo) throws GeneralException {
    boolean exists = false;

    Iterator<Object[]> it = context.search(klass, qo, "id");
    if (it.hasNext())
      exists = true;

    Util.flushIterator(it);
    return exists;
  }

  /**
   * Checks whether an object exists that matches the given filter
   *
   * @param klass a class that extends SailPointObject
   * @param filter the filter that should be applied
   * @return true iff an object matching the filter exists
   */
  public static boolean doesExist(SailPointContext context, Class<? extends SailPointObject> klass,
      Filter filter) throws GeneralException {
    QueryOptions qo = new QueryOptions();
    qo.addFilter(filter);

    return doesExist(context, klass, qo);
  }

  /**
   * Checks whether an attribute for a SailpointObject is unique
   *
   * @param context SailPointContext
   * @param klass a class that extends SailPointObject
   * @param attributeName name of the attribute for the object
   * @param attributeValue value for which you are checking uniqueness
   * @return true iff an object matching the filter exists
   * @throws GeneralException
   */
  public static boolean isAttributeUnique(SailPointContext context,
      Class<? extends SailPointObject> klass, String attributeName, Object attributeValue)
      throws GeneralException {
    Filter filter = Filter.eq(attributeName, attributeValue);
    QueryOptions qo = new QueryOptions(filter);
    Iterator<? extends SailPointObject> results = context.search(klass, qo);

    if (results != null && results.hasNext()) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Checks whether an attribute for a Identity is unique
   *
   * @param context SailPointContext
   * @param attributeName name of the attribute for the object
   * @param attributeValue value for which you are checking uniqueness
   * @return true iff an object matching the filter exists
   * @throws GeneralException
   */
  public static boolean isIdentityAttributeUnique(SailPointContext context, String attributeName,
      Object attributeValue) throws GeneralException {
    return isAttributeUnique(context, Identity.class, attributeName, attributeValue);
  }
  
	/**
	 *
	 * @param context
	 * @param name
	 * @return
	 * @throws GeneralException
	 */
	public static Identity getCorrelatedIdentityFirst(SailPointContext context, String name) throws GeneralException
	{
		Identity identity = null;

		QueryOptions qo = new QueryOptions();

		qo.setIgnoreCase(true);
		qo.addOrdering("correlated", false);
		qo.addFilter(Filter.eq("name", name));
		qo.addFilter(ObjectUtil.buildWorkgroupInclusiveIdentityFilter());

		Iterator<Identity> it = context.search(Identity.class, qo);
		if (it.hasNext())
		{
			identity = it.next();
		}

		Util.flushIterator(it);

		return identity;
	}
}
