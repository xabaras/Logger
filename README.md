#Logger#
Is a simple class wrapping android logger introducing some utilities.

Logger supports all android log levels (VERBOSE, INFO, WARNING, DEBUG, ERROR, WTF) and handles error prone cases such as Exceptions with no message.

[ ![Methods count](https://img.shields.io/badge/Methods count-42-e91e63.svg)](http://www.methodscount.com/?lib=it.xabaras.android.logger%3ALogger%3A1.3.6)
[ ![Size](https://img.shields.io/badge/Size-3KB-e91e63.svg)](http://www.methodscount.com/?lib=it.xabaras.android.logger%3ALogger%3A1.3.6)
[ ![Download](https://api.bintray.com/packages/xabaras/maven/Logger/images/download.svg) ](https://bintray.com/xabaras/maven/Logger/_latestVersion)

## How do I get set up? ##
Get it via Gradle
```groovy
compile 'it.xabaras.android.logger:Logger:1.3.6'
```
or Maven
```xml
<dependency>
	<groupId>it.xabaras.android.logger</groupId>
	<artifactId>Logger</artifactId>
	<version>1.3.6</version>
	<type>pom</type>
</dependency>
```

Or download the [latest JAR](https://github.com/xabaras/Logger/releases/latest) and add it to your project's libraries.

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
#### (Object o, String msg) methods ###
Take an Object and a String as parameters, use the object class name as tag and log the message
```java
try {
  // Your code
} catch(Exception e) {
  Logger.e(this, "We're sorry! An Exception occurred.");
}
```

## Proguard ##
You can add the following lines to your app's proguard configuration file to enforce security (avoid adding logging methods to released app):
```proguard
-assumenosideeffects class it.xabaras.android.logger.Logger {
    public static void d(...);
    public static void e(...);
    public static void i(...);
    public static void v(...);
    public static void w(...);
    public static void wtf(...);
}
```
