package io.vertx.php.ext.auth.oauth2.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.AccessToken;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AccessTokenImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\impl")
public class AccessTokenImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.AccessToken> implements AccessToken<io.vertx.ext.auth.oauth2.AccessToken>{
    
    public AccessTokenImpl(Environment env, io.vertx.ext.auth.oauth2.AccessToken wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory isAuthorized(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorized(authority, resultHandler)
    }

    @Signature
    public Memory isAuthorised(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorised(authority, resultHandler)
    }

    @Signature
    public void setAuthProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthProvider(authProvider)
    }

    @Signature
    public Memory setTrustJWT(Environment __env__, Memory... args) {
        this.getWrappedObject().setTrustJWT(trust)
    }

    @Signature
    public Memory refresh(Environment __env__, Memory... args) {
        this.getWrappedObject().refresh(callback)
    }

    @Signature
    public Memory revoke(Environment __env__, Memory... args) {
        this.getWrappedObject().revoke(token_type, callback)
    }

    @Signature
    public Memory logout(Environment __env__, Memory... args) {
        this.getWrappedObject().logout(callback)
    }

    @Signature
    public Memory introspect(Environment __env__, Memory... args) {
        this.getWrappedObject().introspect(callback)
    }

    @Signature
    public Memory userInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().userInfo(callback)
    }

    @Signature
    public Memory fetch(Environment __env__, Memory... args) {
        this.getWrappedObject().fetch(resource, callback)
    }

}
