package io.vertx.lang.jphp.wrapper;


import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.spl.exception.RuntimeException;
import php.runtime.memory.ObjectMemory;

@Reflection.Name("BaseThrowable")
public class BaseThrowable extends RuntimeException {
    private Memory __INSTANCE;
    private BaseThrowable(Environment env, Throwable cause) {
        super(env);
        clazz = env.fetchClass(getClass());
        initCause(cause);
    }

    public static BaseThrowable of(Environment env, Throwable cause) {
        return new BaseThrowable(env, cause);
    }

    public Memory toMemory(){
        if (__INSTANCE == null) {
            __INSTANCE = ObjectMemory.valueOf(this);
        }
        return __INSTANCE;
    }
}
