package io.vertx.php.ext.auth.htdigest;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
@Name("HtdigestAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\htdigest")
public interface HtdigestAuth<S extends io.vertx.ext.auth.htdigest.HtdigestAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HtdigestAuthImpl::new, io.vertx.ext.auth.htdigest.HtdigestAuth.create(vertx)
    }
    
    @Signature
    default Memory realm(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().realm()
    }

}
