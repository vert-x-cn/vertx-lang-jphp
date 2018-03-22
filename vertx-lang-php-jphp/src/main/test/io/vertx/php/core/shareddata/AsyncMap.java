package io.vertx.php.core.shareddata;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("AsyncMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
public interface AsyncMap<S extends io.vertx.core.shareddata.AsyncMap<K,V>, K, V> extends IWrapper<S>{

    @Signature
    default void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(k, resultHandler)
    }

    @Signature
    default void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(k, v, completionHandler)
    }

    @Signature
    default void putIfAbsent(Environment __env__, Memory... args) {
        this.getWrappedObject().putIfAbsent(k, v, completionHandler)
    }

    @Signature
    default void remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(k, resultHandler)
    }

    @Signature
    default void removeIfPresent(Environment __env__, Memory... args) {
        this.getWrappedObject().removeIfPresent(k, v, resultHandler)
    }

    @Signature
    default void replace(Environment __env__, Memory... args) {
        this.getWrappedObject().replace(k, v, resultHandler)
    }

    @Signature
    default void replaceIfPresent(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceIfPresent(k, oldValue, newValue, resultHandler)
    }

    @Signature
    default void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear(resultHandler)
    }

    @Signature
    default void size(Environment __env__, Memory... args) {
        this.getWrappedObject().size(resultHandler)
    }

}
