package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.StompClientConnection;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompClientConnectionImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class StompClientConnectionImpl extends VertxGenWrapper<io.vertx.ext.stomp.StompClientConnection> implements StompClientConnection<io.vertx.ext.stomp.StompClientConnection>{
    
    public StompClientConnectionImpl(Environment env, io.vertx.ext.stomp.StompClientConnection wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(frame)
    }

    @Signature
    public Memory subscribe(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subscribe(destination, handler)
    }

    @Signature
    public Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(destination)
    }

    @Signature
    public Memory errorHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().errorHandler(handler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory connectionDroppedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionDroppedHandler(handler)
    }

    @Signature
    public Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    public Memory beginTX(Environment __env__, Memory... args) {
        this.getWrappedObject().beginTX(id)
    }

    @Signature
    public Memory commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit(id)
    }

    @Signature
    public Memory abort(Environment __env__, Memory... args) {
        this.getWrappedObject().abort(id)
    }

    @Signature
    public Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    public Memory ack(Environment __env__, Memory... args) {
        this.getWrappedObject().ack(id)
    }

    @Signature
    public Memory nack(Environment __env__, Memory... args) {
        this.getWrappedObject().nack(id)
    }

    @Signature
    public Memory receivedFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().receivedFrameHandler(handler)
    }

    @Signature
    public Memory writingFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().writingFrameHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(exceptionHandler)
    }

}
