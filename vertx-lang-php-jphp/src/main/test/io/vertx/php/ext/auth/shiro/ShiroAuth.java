package io.vertx.php.ext.auth.shiro;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
@Name("ShiroAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\shiro")
public interface ShiroAuth<S extends io.vertx.ext.auth.shiro.ShiroAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShiroAuthImpl::new, io.vertx.ext.auth.shiro.ShiroAuth.create(vertx, options)
    }

    @Signature
    default Memory setRolePrefix(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShiroAuthImpl::new, this.getWrappedObject().setRolePrefix(rolePrefix)
    }

}
