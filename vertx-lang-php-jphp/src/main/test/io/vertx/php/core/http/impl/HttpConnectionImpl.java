package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpConnection;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpConnectionImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpConnectionImpl extends VertxGenWrapper<io.vertx.core.http.HttpConnection> implements HttpConnection<io.vertx.core.http.HttpConnection>{
    
    public HttpConnectionImpl(Environment env, io.vertx.core.http.HttpConnection wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory setWindowSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWindowSize(windowSize)
    }

    @Signature
    public Memory goAway(Environment __env__, Memory... args) {
        this.getWrappedObject().goAway(errorCode)
    }

    @Signature
    public Memory goAwayHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().goAwayHandler(handler)
    }

    @Signature
    public Memory shutdownHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().shutdownHandler(handler)
    }

    @Signature
    public Memory shutdown(Environment __env__, Memory... args) {
        this.getWrappedObject().shutdown()
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory updateSettings(Environment __env__, Memory... args) {
        this.getWrappedObject().updateSettings(settings)
    }

    @Signature
    public Memory remoteSettingsHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().remoteSettingsHandler(handler)
    }

    @Signature
    public Memory ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping(data, pongHandler)
    }

    @Signature
    public Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
