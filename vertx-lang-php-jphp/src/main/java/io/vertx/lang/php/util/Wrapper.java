package io.vertx.lang.php.util;

import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.Handler;
import io.vertx.lang.php.wrapper.JavaThrowable;
//import io.vertx.php.core.CompositeFuture;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.lang.Closure;
import php.runtime.memory.ObjectMemory;

import java.util.function.Function;

public class Wrapper {
    public static Handler wrapperHandler(Environment env, Memory handler){
        Invoker invoker = handler.toInvoker(env);
        if (invoker != null) {
            return new Handler(env, event -> {
                try {
                    invoker.call(event);
                } catch (Throwable throwable) {
                    env.forwardThrow(throwable);
                }
            });
        }
        throw new RuntimeException("handler cannot wrapper to invoker");
    }
    public static Handler wrapperHandler(Environment env, Closure handler) {
        return new Handler(env, event -> {
            try {
                handler.__invoke(env, event);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        });
    }

//    public static Handler wrapperAsyncResultHandler(Environment env, Closure handler){
//        return new Handler(env, event -> {
//            try {
//                AsyncResult r = new AsyncResult(env, )
//                handler.__invoke(env, event);
//            } catch (Throwable throwable) {
//                env.forwardThrow(throwable);
//            }
//        });
//    }

    public static io.vertx.core.Handler<io.vertx.core.AsyncResult<Memory>> wrapperAsyncResultHandler(Environment env, Closure handler) {
        return res -> {
            Memory result;
            Memory cause;
            if (res.succeeded()) {
                result = res.result();
                cause = Memory.NULL;
            } else {
                result = Memory.NULL;
                cause = ObjectMemory.valueOf(new JavaThrowable(env, res.cause()));
            }
            try {
                handler.__invoke(env, result, cause);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
//    public static io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.CompositeFuture>> wrapperCompositeFutureHandler(Environment env, Closure handler){
//        return res -> {
//            Memory result;
//            Memory cause;
//            if (res.succeeded()) {
//                result = ObjectMemory.valueOf(new CompositeFuture(env, res.result()));
//                cause = Memory.NULL;
//            } else {
//                result = Memory.NULL;
//                cause = ObjectMemory.valueOf(new JavaThrowable(env, res.cause()));
//            }
//            try {
//                handler.__invoke(env, result, cause);
//            } catch (Throwable throwable) {
//                env.forwardThrow(throwable);
//            }
//        };
//    }

}
