package io.vertx.php.ext.auth.mongo;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
@Name("HashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
public interface HashStrategy<S extends io.vertx.ext.auth.mongo.HashStrategy> extends IWrapper<S>{

    @Signature
    default Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, user)
    }

    @Signature
    default Memory getStoredPwd(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getStoredPwd(user)
    }

    @Signature
    default Memory getSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSalt(user)
    }

    @Signature
    default void setExternalSalt(Environment __env__, Memory... args) {
        this.getWrappedObject().setExternalSalt(salt)
    }

    @Signature
    default void setSaltStyle(Environment __env__, Memory... args) {
        this.getWrappedObject().setSaltStyle(saltStyle)
    }
    
    @Signature
    default Memory getSaltStyle(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSaltStyle()
    }

    @Signature
    default void setAlgorithm(Environment __env__, Memory... args) {
        this.getWrappedObject().setAlgorithm(algorithm)
    }

}
