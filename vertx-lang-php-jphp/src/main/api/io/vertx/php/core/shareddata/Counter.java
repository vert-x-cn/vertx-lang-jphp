package io.vertx.php.core.shareddata;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Counter")
@Namespace("io\\vertx\\php\\core\\shareddata")
public interface Counter<S extends io.vertx.core.shareddata.Counter> extends IWrapper<S>{

    @Signature
    default void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(resultHandler)
    }

    @Signature
    default void incrementAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().incrementAndGet(resultHandler)
    }

    @Signature
    default void getAndIncrement(Environment __env__, Memory... args) {
        this.getWrappedObject().getAndIncrement(resultHandler)
    }

    @Signature
    default void decrementAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().decrementAndGet(resultHandler)
    }

    @Signature
    default void addAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().addAndGet(value, resultHandler)
    }

    @Signature
    default void getAndAdd(Environment __env__, Memory... args) {
        this.getWrappedObject().getAndAdd(value, resultHandler)
    }

    @Signature
    default void compareAndSet(Environment __env__, Memory... args) {
        this.getWrappedObject().compareAndSet(expected, value, resultHandler)
    }

}
