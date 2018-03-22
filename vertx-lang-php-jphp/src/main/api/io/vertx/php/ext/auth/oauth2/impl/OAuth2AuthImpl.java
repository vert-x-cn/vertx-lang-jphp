package io.vertx.php.ext.auth.oauth2.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("OAuth2AuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\impl")
public class OAuth2AuthImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.OAuth2Auth> implements OAuth2Auth<io.vertx.ext.auth.oauth2.OAuth2Auth>{
    
    public OAuth2AuthImpl(Environment env, io.vertx.ext.auth.oauth2.OAuth2Auth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory createKeycloak(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.OAuth2Auth.createKeycloak(vertx, flow, config)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.OAuth2Auth.create(vertx, flow)
    }

    @Signature
    public Memory authorizeURL(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().authorizeURL(params)
    }

    @Signature
    public void getToken(Environment __env__, Memory... args) {
        this.getWrappedObject().getToken(params, handler)
    }

    @Signature
    public Memory decodeToken(Environment __env__, Memory... args) {
        this.getWrappedObject().decodeToken(token, handler)
    }

    @Signature
    public Memory introspectToken(Environment __env__, Memory... args) {
        this.getWrappedObject().introspectToken(token, handler)
    }

    @Signature
    public Memory loadJWK(Environment __env__, Memory... args) {
        this.getWrappedObject().loadJWK(handler)
    }

}
