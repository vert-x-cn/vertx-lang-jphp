package io.vertx.php.ext.web.client.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.client.HttpRequest;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpRequestImpl")
@Namespace("io\\vertx\\php\\ext\\web\\client\\impl")
public class HttpRequestImpl<T> extends VertxGenWrapper<io.vertx.ext.web.client.HttpRequest<T>> implements HttpRequest<io.vertx.ext.web.client.HttpRequest<T>, T>{
    
    public HttpRequestImpl(Environment env, io.vertx.ext.web.client.HttpRequest<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory method(Environment __env__, Memory... args) {
        this.getWrappedObject().method(value)
    }

    @Signature
    public Memory port(Environment __env__, Memory... args) {
        this.getWrappedObject().port(value)
    }

    @Signature
    public Memory as(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().as(responseCodec)
    }

    @Signature
    public Memory host(Environment __env__, Memory... args) {
        this.getWrappedObject().host(value)
    }

    @Signature
    public Memory virtualHost(Environment __env__, Memory... args) {
        this.getWrappedObject().virtualHost(value)
    }

    @Signature
    public Memory uri(Environment __env__, Memory... args) {
        this.getWrappedObject().uri(value)
    }

    @Signature
    public Memory putHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().putHeader(name, value)
    }

    @Signature
    public Memory ssl(Environment __env__, Memory... args) {
        this.getWrappedObject().ssl(value)
    }

    @Signature
    public Memory timeout(Environment __env__, Memory... args) {
        this.getWrappedObject().timeout(value)
    }

    @Signature
    public Memory addQueryParam(Environment __env__, Memory... args) {
        this.getWrappedObject().addQueryParam(paramName, paramValue)
    }

    @Signature
    public Memory setQueryParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setQueryParam(paramName, paramValue)
    }

    @Signature
    public Memory followRedirects(Environment __env__, Memory... args) {
        this.getWrappedObject().followRedirects(value)
    }

    @Signature
    public void sendStream(Environment __env__, Memory... args) {
        this.getWrappedObject().sendStream(body, handler)
    }

    @Signature
    public void sendBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().sendBuffer(body, handler)
    }

    @Signature
    public void sendJsonObject(Environment __env__, Memory... args) {
        this.getWrappedObject().sendJsonObject(body, handler)
    }

    @Signature
    public void sendJson(Environment __env__, Memory... args) {
        this.getWrappedObject().sendJson(body, handler)
    }

    @Signature
    public void sendForm(Environment __env__, Memory... args) {
        this.getWrappedObject().sendForm(body, handler)
    }

    @Signature
    public void send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(handler)
    }

}
