package io.vertx.php.core;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("MultiMap")
@Namespace("io\\vertx\\php\\core")
public interface MultiMap<S extends io.vertx.core.MultiMap> extends IWrapper<S>{
    
    @Signature
    static Memory caseInsensitiveMultiMap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, io.vertx.core.MultiMap.caseInsensitiveMultiMap()
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(name)
    }

    @Signature
    default Memory getAll(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getAll(name)
    }

    @Signature
    default Memory contains(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().contains(name)
    }
    
    @Signature
    default Memory isEmpty(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isEmpty()
    }
    
    @Signature
    default Memory names(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().names()
    }

    @Signature
    default Memory add(Environment __env__, Memory... args) {
        this.getWrappedObject().add(name, value)
    }

    @Signature
    default Memory addAll(Environment __env__, Memory... args) {
        this.getWrappedObject().addAll(map)
    }

    @Signature
    default Memory set(Environment __env__, Memory... args) {
        this.getWrappedObject().set(name, value)
    }

    @Signature
    default Memory setAll(Environment __env__, Memory... args) {
        this.getWrappedObject().setAll(map)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(name)
    }
    
    @Signature
    default Memory clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear()
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }

}
