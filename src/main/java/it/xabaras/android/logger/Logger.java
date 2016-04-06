package it.xabaras.android.logger;

import android.util.Log;

/***
 * This is a simple class wrapping android logger introducing some utilities
 * 
 * @author Paolo Montalto &lt;webmaster@xabaras.it&gt;
 *
 */
public class Logger {

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
     */
	public static void d(String tag, Throwable t) {
		Log.d(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
     */
	public static void d(String tag, String msg) {
		Log.d(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
     */
	public static void d(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.d(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
     */
	public static void d(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.d(tag, msg);
	}

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void e(String tag, Throwable t) {
		Log.e(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void e(String tag, String msg) {
		Log.e(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void e(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.e(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void e(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.e(tag, msg);
	}

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void i(String tag, Throwable t) {
		Log.i(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void i(String tag, String msg) {
		Log.i(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void i(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.i(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void i(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.i(tag, msg);
	}

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void v(String tag, Throwable t) {
		Log.v(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void v(String tag, String msg) {
		Log.v(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void v(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.v(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void v(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.v(tag, msg);
	}

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void w(String tag, Throwable t) {
		Log.w(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void w(String tag, String msg) {
		Log.w(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void w(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.w(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void w(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.w(tag, msg);
	}

	/**
	 * Takes a tag and a Throwable (e.g. Exception) as parameters and logs the exception message if any
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void wtf(String tag, Throwable t) {
		Log.wtf(tag, getMessage(t));
	}

	/**
	 * Wraps the usual call to the android Log which takes as parameters a tag and a messagge
	 * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void wtf(String tag, String msg) {
		Log.wtf(tag, msg);
	}

	/**
	 * Takes an Object and a Throwable (e.g. Exception) as parameters, use the object class name as tag and logs the exception message if any
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param t An exception to log
	 */
	public static void wtf(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.wtf(tag, getMessage(t));
	}

	/**
	 * Takes an Object and a String as parameters, use the object class name as tag and logs the message
	 * @param o Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg The message you would like logged.
	 */
	public static void wtf(Object o, String msg) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.wtf(tag, msg);
	}

	/**
	 * Gets a human readable message from a Throwable
	 * @param t An exception to log
	 * @return A human readable string
     */
	private static String getMessage(Throwable t ) {
		String message = t.getClass().toString().replaceAll("class ", "") + ": No message";
		
		try {
		
			if ( t.getMessage() != null ) {
				message = t.getMessage();
			} else if ( t.getCause() != null && t.getCause().getMessage() != null  ) {
				message = t.getClass().toString().replaceAll("class ", "") + " Caused by " + t.getCause().getClass().toString().replaceAll("class ", "") + ": " + t.getCause().getMessage();
			}
			
		} catch(Throwable t1){}
		
		return message;
	}
}
