package io.vertx.php.core.shareddata;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("LocalMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
public interface LocalMap<S extends io.vertx.core.shareddata.LocalMap<K,V>, K, V> extends IWrapper<S>{

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().put(key, value)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }
    
    @Signature
    default void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear()
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }
    
    @Signature
    default Memory isEmpty(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isEmpty()
    }

    @Signature
    default Memory putIfAbsent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().putIfAbsent(key, value)
    }

    @Signature
    default Memory removeIfPresent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeIfPresent(key, value)
    }

    @Signature
    default Memory replaceIfPresent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().replaceIfPresent(key, oldValue, newValue)
    }

    @Signature
    default Memory replace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().replace(key, value)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default Memory containsKey(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().containsKey(key)
    }

    @Signature
    default Memory containsValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().containsValue(value)
    }

    @Signature
    default Memory getOrDefault(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOrDefault(key, defaultValue)
    }

}
