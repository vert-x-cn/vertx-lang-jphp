package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.CookieHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CookieHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class CookieHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.CookieHandler> implements CookieHandler<io.vertx.ext.web.handler.CookieHandler>{
    
    public CookieHandlerImpl(Environment env, io.vertx.ext.web.handler.CookieHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieHandlerImpl::new, io.vertx.ext.web.handler.CookieHandler.create()
    }

}
