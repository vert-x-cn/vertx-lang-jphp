package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerResponseImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpServerResponseImpl extends VertxGenWrapper<io.vertx.core.http.HttpServerResponse> implements HttpServerResponse<io.vertx.core.http.HttpServerResponse>{
    
    public HttpServerResponseImpl(Environment env, io.vertx.core.http.HttpServerResponse wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    public Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    public Memory setStatusCode(Environment __env__, Memory... args) {
        this.getWrappedObject().setStatusCode(statusCode)
    }

    @Signature
    public Memory setStatusMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().setStatusMessage(statusMessage)
    }

    @Signature
    public Memory setChunked(Environment __env__, Memory... args) {
        this.getWrappedObject().setChunked(chunked)
    }

    @Signature
    public Memory putHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().putHeader(name, value)
    }

    @Signature
    public Memory putTrailer(Environment __env__, Memory... args) {
        this.getWrappedObject().putTrailer(name, value)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory sendFile(Environment __env__, Memory... args) {
        this.getWrappedObject().sendFile(filename)
    }

    @Signature
    public Memory headersEndHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().headersEndHandler(handler)
    }

    @Signature
    public Memory bodyEndHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().bodyEndHandler(handler)
    }

    @Signature
    public Memory push(Environment __env__, Memory... args) {
        this.getWrappedObject().push(method, path, handler)
    }

    @Signature
    public void reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset()
    }

    @Signature
    public Memory writeCustomFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeCustomFrame(frame)
    }

}
