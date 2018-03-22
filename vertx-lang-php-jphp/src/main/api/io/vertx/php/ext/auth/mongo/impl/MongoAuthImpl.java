package io.vertx.php.ext.auth.mongo.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.mongo.MongoAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MongoAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo\\impl")
public class MongoAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.mongo.MongoAuth> implements MongoAuth<io.vertx.ext.auth.mongo.MongoAuth>{
    
    public MongoAuthImpl(Environment env, io.vertx.ext.auth.mongo.MongoAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MongoAuthImpl::new, io.vertx.ext.auth.mongo.MongoAuth.create(mongoClient, config)
    }

    @Signature
    public Memory setCollectionName(Environment __env__, Memory... args) {
        this.getWrappedObject().setCollectionName(collectionName)
    }

    @Signature
    public Memory setUsernameField(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameField(fieldName)
    }

    @Signature
    public Memory setPasswordField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordField(fieldName)
    }

    @Signature
    public Memory setRoleField(Environment __env__, Memory... args) {
        this.getWrappedObject().setRoleField(fieldName)
    }

    @Signature
    public Memory setPermissionField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPermissionField(fieldName)
    }

    @Signature
    public Memory setUsernameCredentialField(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameCredentialField(fieldName)
    }

    @Signature
    public Memory setPasswordCredentialField(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordCredentialField(fieldName)
    }

    @Signature
    public Memory setSaltField(Environment __env__, Memory... args) {
        this.getWrappedObject().setSaltField(fieldName)
    }

    @Signature
    public Memory setHashStrategy(Environment __env__, Memory... args) {
        this.getWrappedObject().setHashStrategy(hashStrategy)
    }

    @Signature
    public Memory setHashAlgorithm(Environment __env__, Memory... args) {
        this.getWrappedObject().setHashAlgorithm(hashAlgorithm)
    }

    @Signature
    public void insertUser(Environment __env__, Memory... args) {
        this.getWrappedObject().insertUser(username, password, roles, permissions, resultHandler)
    }

}
