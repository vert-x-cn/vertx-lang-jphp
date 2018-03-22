package io.vertx.lang.jphp;

import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.BiFunction;

public class Utils {
    public static <API, WRAPPER extends VertxGenWrapper<API>> Memory convReturnVertxGen(Environment env, BiFunction<Environment, API, WRAPPER> wraper, API api){
        return api == null ? Memory.NULL : wraper.apply(env, api).toMemory();
    }
    public static Memory convReturnUnknow(Environment env, Object obj){
        //TODO test
        return Memory.NULL;
    }
}
