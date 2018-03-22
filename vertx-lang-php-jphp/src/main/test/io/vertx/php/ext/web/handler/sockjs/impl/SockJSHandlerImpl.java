package io.vertx.php.ext.web.handler.sockjs.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.sockjs.SockJSHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SockJSHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs\\impl")
public class SockJSHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.sockjs.SockJSHandler> implements SockJSHandler<io.vertx.ext.web.handler.sockjs.SockJSHandler>{
    
    public SockJSHandlerImpl(Environment env, io.vertx.ext.web.handler.sockjs.SockJSHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SockJSHandlerImpl::new, io.vertx.ext.web.handler.sockjs.SockJSHandler.create(vertx)
    }

    @Signature
    public static void installTestApplications(Environment __env__, Memory... args) {
        io.vertx.ext.web.handler.sockjs.SockJSHandler.installTestApplications(router, vertx)
    }

    @Signature
    public Memory socketHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().socketHandler(handler)
    }

    @Signature
    public Memory bridge(Environment __env__, Memory... args) {
        this.getWrappedObject().bridge(bridgeOptions)
    }

}
