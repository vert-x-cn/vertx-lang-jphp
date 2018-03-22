package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.WebSocket;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WebSocketImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class WebSocketImpl extends VertxGenWrapper<io.vertx.core.http.WebSocket> implements WebSocket<io.vertx.core.http.WebSocket>{
    
    public WebSocketImpl(Environment env, io.vertx.core.http.WebSocket wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory writePing(Environment __env__, Memory... args) {
        this.getWrappedObject().writePing(data)
    }

    @Signature
    public Memory writePong(Environment __env__, Memory... args) {
        this.getWrappedObject().writePong(data)
    }

    @Signature
    public Memory textMessageHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().textMessageHandler(handler)
    }

    @Signature
    public Memory binaryMessageHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().binaryMessageHandler(handler)
    }

    @Signature
    public Memory pongHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pongHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
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
    public Memory writeFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFrame(frame)
    }

    @Signature
    public Memory writeFinalTextFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFinalTextFrame(text)
    }

    @Signature
    public Memory writeFinalBinaryFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFinalBinaryFrame(data)
    }

    @Signature
    public Memory writeBinaryMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().writeBinaryMessage(data)
    }

    @Signature
    public Memory writeTextMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().writeTextMessage(text)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory frameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().frameHandler(handler)
    }

}
