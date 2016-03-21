package it.xabaras.android.logger;

import android.util.Log;

/***
 * Logger v. 1.3.5
 * 
 * This is a simple class wrapping android logger introducing some utilities
 * 
 * @author Paolo Montalto
 *
 * Copyright (C) 2012 Paolo Montalto <webmaster@xabaras.it>
 */
public class Logger {
	
	public static void d(String tag, Throwable t) {
		Log.d(tag, getMessage(t));
	}
	
	public static void d(String tag, String msg) {
		Log.d(tag, msg);
	}
	
	public static void d(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.d(tag, getMessage(t));
	}
	
	public static void e(String tag, Throwable t) {
		Log.e(tag, getMessage(t));
	}

	public static void e(String tag, String msg) {
		Log.e(tag, msg);
	}
	
	public static void e(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.e(tag, getMessage(t));
	}
	
	public static void i(String tag, Throwable t) {
		Log.i(tag, getMessage(t));
	}
	
	public static void i(String tag, String msg) {
		Log.i(tag, msg);
	}
	
	public static void i(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.i(tag, getMessage(t));
	}
	
	public static void v(String tag, Throwable t) {
		Log.v(tag, getMessage(t));
	}
	
	public static void v(String tag, String msg) {
		Log.v(tag, msg);
	}
	
	public static void v(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.v(tag, getMessage(t));
	}
	
	public static void w(String tag, Throwable t) {
		Log.w(tag, getMessage(t));
	}
	
	public static void w(String tag, String msg) {
		Log.w(tag, msg);
	}
	
	public static void w(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.w(tag, getMessage(t));
	}
	
	public static void wtf(String tag, Throwable t) {
		Log.wtf(tag, getMessage(t));
	}
	
	public static void wtf(String tag, String msg) {
		Log.wtf(tag, msg);
	}
	
	public static void wtf(Object o, Throwable t) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.wtf(tag, getMessage(t));
	}
	
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
