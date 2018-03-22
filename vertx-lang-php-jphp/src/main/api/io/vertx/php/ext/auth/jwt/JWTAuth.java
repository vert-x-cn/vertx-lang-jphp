package io.vertx.php.ext.auth.jwt;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
@Name("JWTAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt")
public interface JWTAuth<S extends io.vertx.ext.auth.jwt.JWTAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JWTAuthImpl::new, io.vertx.ext.auth.jwt.JWTAuth.create(vertx, config)
    }

    @Signature
    default Memory generateToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().generateToken(claims)
    }

}
