package io.vertx.php.ext.auth.htpasswd;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
@Name("HtpasswdAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\htpasswd")
public interface HtpasswdAuth<S extends io.vertx.ext.auth.htpasswd.HtpasswdAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HtpasswdAuthImpl::new, io.vertx.ext.auth.htpasswd.HtpasswdAuth.create(vertx)
    }

}
