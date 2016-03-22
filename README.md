#Logger#
Is a simple class wrapping android logger introducing some utilities.

Logger supports all android log levels (VERBOSE, INFO, WARNING, DEBUG, ERROR, WTF) and handles error prone cases such as Exceptions with no message.

## How do I get set up? ##
Download the [latest JAR](https://github.com/xabaras/Logger/releases/latest) and add it to your project's libraries.

Soon you will be able to get it via maven or gradle

## Usage ##
Logger is simple to use, you just have to call static methods from the Logger class.

E.g.
```java
try {
  // Your code
} catch(Exception e) {
  Logger.e("MyTag", e);
}
```

Logger has three kinds of logging calls so far.

#### (String tag, String msg) methods ###
Wrap the usual call to android Log which takes as parameters a tag and a messagge.
Usually it gets called like this:
```java
Logger.d(TAG, "You just pressed the Cancel button.");
```
#### (String tag, Throwable t) methods ###
Take a tag and a Throwable (e.g. Exception) as parameters and log the Throwable message if any
```java
try {
  // Your code
} catch(Exception e) {
  Logger.e(TAG, e);
}
```
#### (Object o, Throwable t) methods ###
Take an Object and a Throwable (e.g. Exception) as parameter, use the object class name as tag and log the error message if any
```java
try {
  // Your code
} catch(Exception e) {
  Logger.e(this, e);
}
```

##Proguard##
You can add the following lines to your app's proguard configuration file to enforce security (avoid adding logging methods to realed app):
```proguard
-assumenosideeffects class it.xabaras.android.logger.Logger {
	public static void <methods>;
}
```
