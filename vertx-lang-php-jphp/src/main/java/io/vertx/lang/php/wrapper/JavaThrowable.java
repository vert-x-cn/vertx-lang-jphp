package io.vertx.lang.php.wrapper;

import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import java.lang.Throwable;
import php.runtime.annotation.Reflection.*;

@Name("JavaThrowable")
@Namespace("io\\vertx\\lang\\php\\wrapper")
public class JavaThrowable extends BaseObject{
    private Throwable throwable;

    public JavaThrowable(Environment env, Throwable throwable) {
        super(env);
        this.throwable = throwable;
    }

    public JavaThrowable(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    @Signature
    public String getMessage() {
        return throwable.getMessage();
    }
    @Signature
    public String getLocalizedMessage() {
        return throwable.getLocalizedMessage();
    }
    @Signature
    public synchronized JavaThrowable getCause() {
        return new JavaThrowable(__env__, throwable.getCause());
    }
    @Signature
    public synchronized JavaThrowable initCause(Throwable cause) {
        throwable.initCause(cause);
        return this;
    }
    @Signature
    public String toString() {
        return throwable.toString();
    }
    @Signature
    public void printStackTrace() {
        throwable.printStackTrace();
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
        throwable.fillInStackTrace();
        return this;
    }

//    public StackTraceElement[] getStackTrace() {
//        return throwable.getStackTrace();
//    }
//
//    public void setStackTrace(StackTraceElement[] stackTrace) {
//        throwable.setStackTrace(stackTrace);
//    }
}
