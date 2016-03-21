package it.xabaras.android.logger;

import android.util.Log;

/***
 * Logger v. 1.3
 * 
 * This is a simple class wrapping android logger introducing some utilities
 * 
 * @author Paolo Montalto
 *
 * Copyright (C) 2012 Paolo Montalto <webmaster@xabaras.it>
 */
public class Logger {
	
	public static void d(String tag, Exception e) {
		Log.d(tag, getMessage(e));
	}
	
	public static void d(String tag, String msg) {
		Log.d(tag, msg);
	}
	
	public static void d(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.d(tag, getMessage(e));
	}
	
	public static void e(String tag, Exception e) {
		Log.e(tag, getMessage(e));
	}

	public static void e(String tag, String msg) {
		Log.e(tag, msg);
	}
	
	public static void e(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.e(tag, getMessage(e));
	}
	
	public static void i(String tag, Exception e) {
		Log.i(tag, getMessage(e));
	}
	
	public static void i(String tag, String msg) {
		Log.i(tag, msg);
	}
	
	public static void i(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.i(tag, getMessage(e));
	}
	
	public static void v(String tag, Exception e) {
		Log.v(tag, getMessage(e));
	}
	
	public static void v(String tag, String msg) {
		Log.v(tag, msg);
	}
	
	public static void v(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.v(tag, getMessage(e));
	}
	
	public static void w(String tag, Exception e) {
		Log.w(tag, getMessage(e));
	}
	
	public static void w(String tag, String msg) {
		Log.w(tag, msg);
	}
	
	public static void w(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.w(tag, getMessage(e));
	}
	
	public static void wtf(String tag, Exception e) {
		Log.wtf(tag, getMessage(e));
	}
	
	public static void wtf(String tag, String msg) {
		Log.wtf(tag, msg);
	}
	
	public static void wtf(Object o, Exception e) {
		String tag = o != null ? o.getClass().getSimpleName() : "";
		Log.wtf(tag, getMessage(e));
	}
	
	private static String getMessage(Exception e ) {
		String message = e.getClass().toString().replaceAll("class ", "") + ": No message";
		
		try {
		
			if ( e.getMessage() != null ) {
				message = e.getMessage();
			} else if ( e.getCause() != null && e.getCause().getMessage() != null  ) {
				message = e.getClass().toString().replaceAll("class ", "") + " Caused by " + e.getCause().getClass().toString().replaceAll("class ", "") + ": " + e.getCause().getMessage();
			}
			
		} catch(Throwable t){}
		
		return message;
	}
}
