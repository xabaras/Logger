package it.xabaras.android.logger;

import android.util.Log;

public class Logger {
	
	public static void d(String tag, Exception e) {
		Log.d(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}
	
	public static void d(String tag, String msg) {
		Log.d(tag, msg);
	}
	
	public static void e(String tag, Exception e) {
		Log.e(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}

	public static void e(String tag, String msg) {
		Log.e(tag, msg);
	}
	
	public static void i(String tag, Exception e) {
		Log.i(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}
	
	public static void i(String tag, String msg) {
		Log.i(tag, msg);
	}
	
	public static void v(String tag, Exception e) {
		Log.v(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}
	
	public static void v(String tag, String msg) {
		Log.v(tag, msg);
	}
	
	public static void w(String tag, Exception e) {
		Log.w(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}
	
	public static void w(String tag, String msg) {
		Log.w(tag, msg);
	}
	
	public static void wtf(String tag, Exception e) {
		Log.wtf(tag, e.getMessage() != null ? e.getMessage() : e.getClass().toString() + ": No message");
	}
	
	public static void wtf(String tag, String msg) {
		Log.wtf(tag, msg);
	}
}
