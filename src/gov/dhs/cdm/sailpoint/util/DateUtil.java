package gov.dhs.cdm.sailpoint.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Common Date utility functions.
 */
public class DateUtil {
    private static Map<String, DateFormat> formatters = new HashMap<>();

    /**
     * Returns today's date plus a given amount of days.
     *
     * @param days the number of days to advance
     * @return the Date object of today plus days
     */
    public static Date getTodayPlusDays(int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    /**
     * Checks if the given date string is in the past.
     *
     * @param date    the date string to parse
     * @param pattern the pattern the string is in
     * @return true if and only if the date is in the past
     * @throws ParseException if the date string cannot be parsed
     */
    public static boolean inPast(String date, String pattern) throws ParseException {
        return inPast(stringToDate(date, pattern));
    }

    /**
     * Checks if the given date is in the past.
     *
     * @param date the date object to check
     * @return true if date is before today
     */
    public static boolean inPast(Date date) {
        return date.before(new Date());
    }

    /**
     * Checks if the given date string is in the future.
     *
     * @param date    the date string to parse
     * @param pattern the pattern the string is in
     * @return true if and only if the date is in the future
     * @throws ParseException if the date string cannot be parsed
     */
    public static boolean inFuture(String date, String pattern) throws ParseException {
        return inFuture(stringToDate(date, pattern));
    }

    /**
     * Checks if the given date is in the future.
     *
     * @param date the date object to check
     * @return true if date is after today
     */
    public static boolean inFuture(Date date) {
        return date.after(new Date());
    }

    /**
     * Get today's date formatted with the given pattern
     *
     * @param pattern the date pattern to format
     */
    public static String getFormattedToday(String pattern) {
        return getFormattedDate(new Date(), pattern);
    }

    /**
     * Format the date object according to the pattern
     *
     * @param date    the date object to format
     * @param pattern the date format pattern
     * @return a string representation of the date
     */
    public static String getFormattedDate(Date date, String pattern) {
        DateFormat dateFormat = getFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * Convert a date string into an object according to the pattern
     *
     * @param dateString the date string to parse
     * @param pattern    the date format pattern
     * @return a Date object
     * @throws ParseException if the date string is malformed
     */
    public static Date stringToDate(String dateString, String pattern) throws ParseException {
        DateFormat df = getFormat(pattern);

        Date date = df.parse(dateString);
        if (date == null) throw new ParseException("Failed to parse: " + dateString, 0);

        return date;
    }

    /**
     * Convert a date string to epoch time
     *
     * @param dateString the date string to parse
     * @param pattern    the date format pattern
     * @return a string representation of the epoch time for this date
     * @throws ParseException if the date is malformed and cannot be parsed
     */
    public static String dateToEpoch(String dateString, String pattern) throws ParseException {
        Date date = stringToDate(dateString, pattern);
        return String.valueOf(date.getTime());
    }

    /**
     * Convert an epoch string to a date string
     *
     * @param epochString the epoch string to convert
     * @param pattern     the pattern in which to format the output date string
     * @return a string representation of the date in the given pattern
     */
    public static String epochToDate(String epochString, String pattern) {
        Date date = new Date(Long.parseLong(epochString));
        return getFormattedDate(date, pattern);
    }

    /**
     * Internal helper method for caching date formatters, but is public so
     * that it may be used elsewhere if needed.
     *
     * This optimizes DateUtil so that we're not needlessly creating new
     * formatters for every operation.
     *
     * @param pattern the date format pattern
     * @return a DateFormatter for the pattern
     */
    public static DateFormat getFormat(String pattern) {
        DateFormat format = formatters.get(pattern);

        if (format == null) {
            format = new SimpleDateFormat(pattern);
            formatters.put(pattern, format);
        }

        return format;
    }
    
    
    /**
     * Method for validating a date passed in as a string
     *
     *
     * @param date: the date that needs validation
     * @param acceptedDateFormats: a list of valid date formats
     * @return a DateFormatter for the pattern
     * @throws ParseException 
     */
    public static String getValidDate(String date, String[] acceptedDateFormats) throws ParseException {
    	for (String dateFormat : acceptedDateFormats) {
    		 try
    	        {
    			 Date formattedDate = stringToDate(date, dateFormat);
    			 return getFormattedDate(formattedDate, dateFormat);
    	        }
    	        catch (ParseException e) {
    	        	//try all date formats in list before throwing parse exception
    	        }
    	}
    	throw new ParseException("Failed to parse: " + date, 0);
    }
    

}
