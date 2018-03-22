package io.vertx.php.ext.auth.jdbc;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("JDBCHashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
public interface JDBCHashStrategy<S extends io.vertx.ext.auth.jdbc.JDBCHashStrategy> extends IWrapper<S>{

    @Signature
    static Memory createSHA512(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCHashStrategyImpl::new, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createSHA512(vertx)
    }

    @Signature
    static Memory createPBKDF2(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCHashStrategyImpl::new, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createPBKDF2(vertx)
    }
    
    @Signature
    default Memory generateSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().generateSalt()
    }

    @Signature
    default Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, salt, version)
    }

    @Signature
    default Memory getHashedStoredPwd(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHashedStoredPwd(row)
    }

    @Signature
    default Memory getSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSalt(row)
    }

    @Signature
    default void setNonces(Environment __env__, Memory... args) {
        this.getWrappedObject().setNonces(nonces)
    }

    @Signature
    static Memory isEqual(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.jdbc.JDBCHashStrategy.isEqual(hasha, hashb)
    }

}
