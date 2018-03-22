package io.vertx.php.core.shareddata;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.shareddata.AsyncMap;
import io.vertx.php.core.shareddata.Lock;
import io.vertx.php.core.shareddata.LocalMap;
import io.vertx.php.core.shareddata.Counter;
@Name("SharedData")
@Namespace("io\\vertx\\php\\core\\shareddata")
public interface SharedData<S extends io.vertx.core.shareddata.SharedData> extends IWrapper<S>{

    @Signature
    default void getClusterWideMap(Environment __env__, Memory... args) {
        this.getWrappedObject().getClusterWideMap(name, resultHandler)
    }

    @Signature
    default void getAsyncMap(Environment __env__, Memory... args) {
        this.getWrappedObject().getAsyncMap(name, resultHandler)
    }

    @Signature
    default void getLock(Environment __env__, Memory... args) {
        this.getWrappedObject().getLock(name, resultHandler)
    }

    @Signature
    default void getLockWithTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().getLockWithTimeout(name, timeout, resultHandler)
    }

    @Signature
    default void getCounter(Environment __env__, Memory... args) {
        this.getWrappedObject().getCounter(name, resultHandler)
    }

    @Signature
    default Memory getLocalMap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocalMapImpl::new, this.getWrappedObject().getLocalMap(name)
    }

}
