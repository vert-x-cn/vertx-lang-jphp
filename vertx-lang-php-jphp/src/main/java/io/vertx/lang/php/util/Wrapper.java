package io.vertx.lang.php.util;

import io.vertx.lang.php.wrapper.Handler;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.Closure;

public class Wrapper {
    public static Handler wrapperHandler(Environment env, Memory handler){
    }
    public static Handler wrapperHandler(Environment env, Closure handler) {
        return new Handler(env, event -> {

        });
    }
}
