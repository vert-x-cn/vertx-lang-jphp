package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.StompServerHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServerHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class StompServerHandlerImpl extends VertxGenWrapper<io.vertx.ext.stomp.StompServerHandler> implements StompServerHandler<io.vertx.ext.stomp.StompServerHandler>{
    
    public StompServerHandlerImpl(Environment env, io.vertx.ext.stomp.StompServerHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerHandlerImpl::new, io.vertx.ext.stomp.StompServerHandler.create(vertx)
    }

    @Signature
    public Memory receivedFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().receivedFrameHandler(handler)
    }

    @Signature
    public Memory connectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectHandler(handler)
    }

    @Signature
    public Memory stompHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stompHandler(handler)
    }

    @Signature
    public Memory subscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeHandler(handler)
    }

    @Signature
    public Memory unsubscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeHandler(handler)
    }

    @Signature
    public Memory sendHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().sendHandler(handler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public void onClose(Environment __env__, Memory... args) {
        this.getWrappedObject().onClose(connection)
    }

    @Signature
    public Memory commitHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().commitHandler(handler)
    }

    @Signature
    public Memory abortHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().abortHandler(handler)
    }

    @Signature
    public Memory beginHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().beginHandler(handler)
    }

    @Signature
    public Memory disconnectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnectHandler(handler)
    }

    @Signature
    public Memory ackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().ackHandler(handler)
    }

    @Signature
    public Memory nackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().nackHandler(handler)
    }

    @Signature
    public Memory onAuthenticationRequest(Environment __env__, Memory... args) {
        this.getWrappedObject().onAuthenticationRequest(connection, login, passcode, handler)
    }

    @Signature
    public Memory getUserBySession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, UserImpl::new, this.getWrappedObject().getUserBySession(session)
    }

    @Signature
    public Memory authProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().authProvider(handler)
    }

    @Signature
    public Memory getDestination(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().getDestination(destination)
    }

    @Signature
    public Memory onAck(Environment __env__, Memory... args) {
        this.getWrappedObject().onAck(connection, subscribe, messages)
    }

    @Signature
    public Memory onNack(Environment __env__, Memory... args) {
        this.getWrappedObject().onNack(connection, subscribe, messages)
    }

    @Signature
    public Memory onAckHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().onAckHandler(handler)
    }

    @Signature
    public Memory onNackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().onNackHandler(handler)
    }

    @Signature
    public Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    public Memory getOrCreateDestination(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().getOrCreateDestination(destination)
    }

    @Signature
    public Memory destinationFactory(Environment __env__, Memory... args) {
        this.getWrappedObject().destinationFactory(factory)
    }

    @Signature
    public Memory bridge(Environment __env__, Memory... args) {
        this.getWrappedObject().bridge(options)
    }

}
