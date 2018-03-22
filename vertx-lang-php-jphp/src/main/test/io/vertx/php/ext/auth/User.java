package io.vertx.php.ext.auth;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.AuthProvider;
@Name("User")
@Namespace("io\\vertx\\php\\ext\\auth")
public interface User<S extends io.vertx.ext.auth.User> extends IWrapper<S>{

    @Signature
    default Memory isAuthorized(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorized(authority, resultHandler)
    }

    @Signature
    default Memory isAuthorised(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorised(authority, resultHandler)
    }
    
    @Signature
    default Memory clearCache(Environment __env__, Memory... args) {
        this.getWrappedObject().clearCache()
    }
    
    @Signature
    default Memory principal(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().principal()
    }

    @Signature
    default void setAuthProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthProvider(authProvider)
    }

}
