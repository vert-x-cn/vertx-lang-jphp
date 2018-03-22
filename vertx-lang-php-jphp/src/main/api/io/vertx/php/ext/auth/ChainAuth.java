package io.vertx.php.ext.auth;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.auth.AuthProvider;
@Name("ChainAuth")
@Namespace("io\\vertx\\php\\ext\\auth")
public interface ChainAuth<S extends io.vertx.ext.auth.ChainAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ChainAuthImpl::new, io.vertx.ext.auth.ChainAuth.create()
    }

    @Signature
    default Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(other)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(other)
    }
    
    @Signature
    default void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear()
    }

}
