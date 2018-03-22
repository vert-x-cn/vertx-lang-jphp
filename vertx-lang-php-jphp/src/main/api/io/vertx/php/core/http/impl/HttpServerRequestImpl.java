package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerRequestImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpServerRequestImpl extends VertxGenWrapper<io.vertx.core.http.HttpServerRequest> implements HttpServerRequest<io.vertx.core.http.HttpServerRequest>{
    
    public HttpServerRequestImpl(Environment env, io.vertx.core.http.HttpServerRequest wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory getHeader(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHeader(headerName)
    }

    @Signature
    public Memory getParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getParam(paramName)
    }

    @Signature
    public Memory bodyHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().bodyHandler(bodyHandler)
    }

    @Signature
    public Memory setExpectMultipart(Environment __env__, Memory... args) {
        this.getWrappedObject().setExpectMultipart(expect)
    }

    @Signature
    public Memory uploadHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().uploadHandler(uploadHandler)
    }

    @Signature
    public Memory getFormAttribute(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getFormAttribute(attributeName)
    }

    @Signature
    public Memory customFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().customFrameHandler(handler)
    }

}
