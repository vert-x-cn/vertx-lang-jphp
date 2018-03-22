package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.CorsHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CorsHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class CorsHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.CorsHandler> implements CorsHandler<io.vertx.ext.web.handler.CorsHandler>{
    
    public CorsHandlerImpl(Environment env, io.vertx.ext.web.handler.CorsHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CorsHandlerImpl::new, io.vertx.ext.web.handler.CorsHandler.create(allowedOriginPattern)
    }

    @Signature
    public Memory allowedMethod(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedMethod(method)
    }

    @Signature
    public Memory allowedHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedHeader(headerName)
    }

    @Signature
    public Memory allowedHeaders(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedHeaders(headerNames)
    }

    @Signature
    public Memory exposedHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().exposedHeader(headerName)
    }

    @Signature
    public Memory exposedHeaders(Environment __env__, Memory... args) {
        this.getWrappedObject().exposedHeaders(headerNames)
    }

    @Signature
    public Memory allowCredentials(Environment __env__, Memory... args) {
        this.getWrappedObject().allowCredentials(allow)
    }

    @Signature
    public Memory maxAgeSeconds(Environment __env__, Memory... args) {
        this.getWrappedObject().maxAgeSeconds(maxAgeSeconds)
    }

}
