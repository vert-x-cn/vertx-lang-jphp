package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Cookie")
@Namespace("io\\vertx\\php\\ext\\web")
public interface Cookie<S extends io.vertx.ext.web.Cookie> extends IWrapper<S>{

    @Signature
    static Memory cookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, io.vertx.ext.web.Cookie.cookie(name, value)
    }
    
    @Signature
    default Memory getName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getName()
    }
    
    @Signature
    default Memory getValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getValue()
    }

    @Signature
    default Memory setValue(Environment __env__, Memory... args) {
        this.getWrappedObject().setValue(value)
    }

    @Signature
    default Memory setDomain(Environment __env__, Memory... args) {
        this.getWrappedObject().setDomain(domain)
    }
    
    @Signature
    default Memory getDomain(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getDomain()
    }

    @Signature
    default Memory setPath(Environment __env__, Memory... args) {
        this.getWrappedObject().setPath(path)
    }
    
    @Signature
    default Memory getPath(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getPath()
    }

    @Signature
    default Memory setMaxAge(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAge(maxAge)
    }

    @Signature
    default Memory setSecure(Environment __env__, Memory... args) {
        this.getWrappedObject().setSecure(secure)
    }

    @Signature
    default Memory setHttpOnly(Environment __env__, Memory... args) {
        this.getWrappedObject().setHttpOnly(httpOnly)
    }
    
    @Signature
    default Memory encode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().encode()
    }
    
    @Signature
    default Memory isChanged(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isChanged()
    }

    @Signature
    default void setChanged(Environment __env__, Memory... args) {
        this.getWrappedObject().setChanged(changed)
    }
    
    @Signature
    default Memory isFromUserAgent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isFromUserAgent()
    }

}
