package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.ChainAuthHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ChainAuthHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class ChainAuthHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.ChainAuthHandler> implements ChainAuthHandler<io.vertx.ext.web.handler.ChainAuthHandler>{
    
    public ChainAuthHandlerImpl(Environment env, io.vertx.ext.web.handler.ChainAuthHandler wrappedObject){
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
        return Utils.convReturnVertxGen(__env__, ChainAuthHandlerImpl::new, io.vertx.ext.web.handler.ChainAuthHandler.create()
    }

    @Signature
    public Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(authHandler)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(authHandler)
    }

}
