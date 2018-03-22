package io.vertx.lang.php.wrapper;

import io.vertx.lang.php.BaseWrapper;
import php.runtime.env.Environment;

import java.lang.Throwable;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JavaThrowable")
@Namespace("io\\vertx\\lang\\php\\wrapper")
public class JavaThrowable extends BaseWrapper<Throwable>{

    public JavaThrowable(Environment env, Throwable throwable) {
        super(env, throwable);
    }

    @Signature
    public String getMessage() {
        return getWrappedObject().getMessage();
    }
    @Signature
    public String getLocalizedMessage() {
        return getWrappedObject().getLocalizedMessage();
    }
    @Signature
    public synchronized JavaThrowable getCause() {
        return new JavaThrowable(__env__, getWrappedObject().getCause());
    }
    @Signature
    public synchronized JavaThrowable initCause(Throwable cause) {
        getWrappedObject().initCause(cause);
        return this;
    }
    @Signature
    public String toString() {
        return getWrappedObject().toString();
    }
    @Signature
    public void printStackTrace() {
        getWrappedObject().printStackTrace();
    }

//    public void printStackTrace(PrintStream s) {
//        throwable.printStackTrace(s);
//    }
//
//    public void printStackTrace(PrintWriter s) {
//        throwable.printStackTrace(s);
//    }
    @Signature
    public synchronized JavaThrowable fillInStackTrace() {
        getWrappedObject().fillInStackTrace();
        return this;
    }

    public static JavaThrowable of(Environment env, Throwable throwable){
        return new JavaThrowable(env, throwable);
    }

//    public StackTraceElement[] getStackTrace() {
//        return throwable.getStackTrace();
//    }
//
//    public void setStackTrace(StackTraceElement[] stackTrace) {
//        throwable.setStackTrace(stackTrace);
//    }
}
