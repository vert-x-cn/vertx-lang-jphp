package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.OAuth2AuthHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("OAuth2AuthHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class OAuth2AuthHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.OAuth2AuthHandler> implements OAuth2AuthHandler<io.vertx.ext.web.handler.OAuth2AuthHandler>{
    
    public OAuth2AuthHandlerImpl(Environment env, io.vertx.ext.web.handler.OAuth2AuthHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public Memory addAuthority(Environment __env__, Memory... args) {
        this.getWrappedObject().addAuthority(authority)
    }

    @Signature
    public Memory addAuthorities(Environment __env__, Memory... args) {
        this.getWrappedObject().addAuthorities(authorities)
    }

    @Signature
    public void parseCredentials(Environment __env__, Memory... args) {
        this.getWrappedObject().parseCredentials(context, handler)
    }

    @Signature
    public void authorize(Environment __env__, Memory... args) {
        this.getWrappedObject().authorize(user, handler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthHandlerImpl::new, io.vertx.ext.web.handler.OAuth2AuthHandler.create(authProvider)
    }

    @Signature
    public Memory extraParams(Environment __env__, Memory... args) {
        this.getWrappedObject().extraParams(extraParams)
    }

    @Signature
    public Memory setupCallback(Environment __env__, Memory... args) {
        this.getWrappedObject().setupCallback(route)
    }

}
