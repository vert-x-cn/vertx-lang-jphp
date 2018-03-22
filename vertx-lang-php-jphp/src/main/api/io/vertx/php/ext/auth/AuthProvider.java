package io.vertx.php.ext.auth;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
@Name("AuthProvider")
@Namespace("io\\vertx\\php\\ext\\auth")
public interface AuthProvider<S extends io.vertx.ext.auth.AuthProvider> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

}
