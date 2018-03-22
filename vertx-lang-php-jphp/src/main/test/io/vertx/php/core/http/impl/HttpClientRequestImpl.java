package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpClientRequest;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpClientRequestImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpClientRequestImpl extends VertxGenWrapper<io.vertx.core.http.HttpClientRequest> implements HttpClientRequest<io.vertx.core.http.HttpClientRequest>{
    
    public HttpClientRequestImpl(Environment env, io.vertx.core.http.HttpClientRequest wrappedObject){
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
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory setFollowRedirects(Environment __env__, Memory... args) {
        this.getWrappedObject().setFollowRedirects(followRedirects)
    }

    @Signature
    public Memory setChunked(Environment __env__, Memory... args) {
        this.getWrappedObject().setChunked(chunked)
    }

    @Signature
    public Memory setRawMethod(Environment __env__, Memory... args) {
        this.getWrappedObject().setRawMethod(method)
    }

    @Signature
    public Memory setHost(Environment __env__, Memory... args) {
        this.getWrappedObject().setHost(host)
    }

    @Signature
    public Memory putHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().putHeader(name, value)
    }

    @Signature
    public Memory continueHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().continueHandler(handler)
    }

    @Signature
    public Memory sendHead(Environment __env__, Memory... args) {
        this.getWrappedObject().sendHead()
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory setTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setTimeout(timeoutMs)
    }

    @Signature
    public Memory pushHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pushHandler(handler)
    }

    @Signature
    public Memory reset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().reset()
    }

    @Signature
    public Memory connectionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionHandler(handler)
    }

    @Signature
    public Memory writeCustomFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeCustomFrame(frame)
    }

}
