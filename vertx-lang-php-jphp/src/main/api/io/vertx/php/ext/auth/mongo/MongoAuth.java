package io.vertx.php.ext.auth.mongo;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.mongo.MongoClient;
import io.vertx.php.ext.auth.mongo.HashStrategy;
import io.vertx.php.ext.auth.AuthProvider;
@Name("MongoAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
public interface MongoAuth<S extends io.vertx.ext.auth.mongo.MongoAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MongoAuthImpl::new, io.vertx.ext.auth.mongo.MongoAuth.create(mongoClient, config)
    }

    @Signature
    default Memory setCollectionName(Environment __env__, Memory... args) {
        this.getWrappedObject().setCollectionName(collectionName)
    }

    @Signature
    default Memory setUsernameField(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameField(fieldName)
    }

    @Signature
    default Memory setPasswordField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordField(fieldName)
    }

    @Signature
    default Memory setRoleField(Environment __env__, Memory... args) {
        this.getWrappedObject().setRoleField(fieldName)
    }

    @Signature
    default Memory setPermissionField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPermissionField(fieldName)
    }

    @Signature
    default Memory setUsernameCredentialField(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameCredentialField(fieldName)
    }

    @Signature
    default Memory setPasswordCredentialField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordCredentialField(fieldName)
    }

    @Signature
    default Memory setSaltField(Environment __env__, Memory... args) {
        this.getWrappedObject().setSaltField(fieldName)
    }
    
    @Signature
    default Memory getCollectionName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getCollectionName()
    }
    
    @Signature
    default Memory getUsernameField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUsernameField()
    }
    
    @Signature
    default Memory getPasswordField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getPasswordField()
    }
    
    @Signature
    default Memory getRoleField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRoleField()
    }
    
    @Signature
    default Memory getPermissionField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getPermissionField()
    }
    
    @Signature
    default Memory getUsernameCredentialField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUsernameCredentialField()
    }
    
    @Signature
    default Memory getPasswordCredentialField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getPasswordCredentialField()
    }
    
    @Signature
    default Memory getSaltField(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSaltField()
    }

    @Signature
    default Memory setHashStrategy(Environment __env__, Memory... args) {
        this.getWrappedObject().setHashStrategy(hashStrategy)
    }
    
    @Signature
    default Memory getHashStrategy(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HashStrategyImpl::new, this.getWrappedObject().getHashStrategy()
    }

    @Signature
    default Memory setHashAlgorithm(Environment __env__, Memory... args) {
        this.getWrappedObject().setHashAlgorithm(hashAlgorithm)
    }

    @Signature
    default void insertUser(Environment __env__, Memory... args) {
        this.getWrappedObject().insertUser(username, password, roles, permissions, resultHandler)
    }

}
