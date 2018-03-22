package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.DigestAuthHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DigestAuthHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class DigestAuthHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.DigestAuthHandler> implements DigestAuthHandler<io.vertx.ext.web.handler.DigestAuthHandler>{
    
    public DigestAuthHandlerImpl(Environment env, io.vertx.ext.web.handler.DigestAuthHandler wrappedObject){
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
        return Utils.convReturnVertxGen(__env__, DigestAuthHandlerImpl::new, io.vertx.ext.web.handler.DigestAuthHandler.create(authProvider)
    }

}
