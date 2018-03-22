package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\web")
public interface Session<S extends io.vertx.ext.web.Session> extends IWrapper<S>{
    
    @Signature
    default Memory regenerateId(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().regenerateId()
    }
    
    @Signature
    default Memory id(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().id()
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, obj)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }
    
    @Signature
    default Memory lastAccessed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastAccessed()
    }
    
    @Signature
    default void destroy(Environment __env__, Memory... args) {
        this.getWrappedObject().destroy()
    }
    
    @Signature
    default Memory isDestroyed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isDestroyed()
    }
    
    @Signature
    default Memory isRegenerated(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isRegenerated()
    }
    
    @Signature
    default Memory oldId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().oldId()
    }
    
    @Signature
    default Memory timeout(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().timeout()
    }
    
    @Signature
    default void setAccessed(Environment __env__, Memory... args) {
        this.getWrappedObject().setAccessed()
    }

}
