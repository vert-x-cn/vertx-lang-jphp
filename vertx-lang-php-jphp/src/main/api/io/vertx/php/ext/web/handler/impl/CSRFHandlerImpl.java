package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.CSRFHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CSRFHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class CSRFHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.CSRFHandler> implements CSRFHandler<io.vertx.ext.web.handler.CSRFHandler>{
    
    public CSRFHandlerImpl(Environment env, io.vertx.ext.web.handler.CSRFHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CSRFHandlerImpl::new, io.vertx.ext.web.handler.CSRFHandler.create(secret)
    }

    @Signature
    public Memory setCookieName(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieName(name)
    }

    @Signature
    public Memory setCookiePath(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookiePath(path)
    }

    @Signature
    public Memory setHeaderName(Environment __env__, Memory... args) {
        this.getWrappedObject().setHeaderName(name)
    }

    @Signature
    public Memory setNagHttps(Environment __env__, Memory... args) {
        this.getWrappedObject().setNagHttps(nag)
    }

    @Signature
    public Memory setResponseBody(Environment __env__, Memory... args) {
        this.getWrappedObject().setResponseBody(responseBody)
    }

    @Signature
    public Memory setTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setTimeout(timeout)
    }

}
