package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.Destination;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.stomp.DestinationFactory;
import io.vertx.php.ext.stomp.Acknowledgement;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.ServerFrame;
import io.vertx.php.ext.stomp.StompServerConnection;
import io.vertx.php.ext.auth.AuthProvider;
@Name("StompServerHandler")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface StompServerHandler<S extends io.vertx.ext.stomp.StompServerHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerHandlerImpl::new, io.vertx.ext.stomp.StompServerHandler.create(vertx)
    }

    @Signature
    default Memory receivedFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().receivedFrameHandler(handler)
    }

    @Signature
    default Memory connectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectHandler(handler)
    }

    @Signature
    default Memory stompHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stompHandler(handler)
    }

    @Signature
    default Memory subscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeHandler(handler)
    }

    @Signature
    default Memory unsubscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeHandler(handler)
    }

    @Signature
    default Memory sendHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().sendHandler(handler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default void onClose(Environment __env__, Memory... args) {
        this.getWrappedObject().onClose(connection)
    }

    @Signature
    default Memory commitHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().commitHandler(handler)
    }

    @Signature
    default Memory abortHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().abortHandler(handler)
    }

    @Signature
    default Memory beginHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().beginHandler(handler)
    }

    @Signature
    default Memory disconnectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnectHandler(handler)
    }

    @Signature
    default Memory ackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().ackHandler(handler)
    }

    @Signature
    default Memory nackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().nackHandler(handler)
    }

    @Signature
    default Memory onAuthenticationRequest(Environment __env__, Memory... args) {
        this.getWrappedObject().onAuthenticationRequest(connection, login, passcode, handler)
    }

    @Signature
    default Memory getUserBySession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, UserImpl::new, this.getWrappedObject().getUserBySession(session)
    }

    @Signature
    default Memory authProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().authProvider(handler)
    }
    
    @Signature
    default Memory getDestinations(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getDestinations()
    }

    @Signature
    default Memory getDestination(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().getDestination(destination)
    }

    @Signature
    default Memory onAck(Environment __env__, Memory... args) {
        this.getWrappedObject().onAck(connection, subscribe, messages)
    }

    @Signature
    default Memory onNack(Environment __env__, Memory... args) {
        this.getWrappedObject().onNack(connection, subscribe, messages)
    }

    @Signature
    default Memory onAckHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().onAckHandler(handler)
    }

    @Signature
    default Memory onNackHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().onNackHandler(handler)
    }

    @Signature
    default Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    default Memory getOrCreateDestination(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().getOrCreateDestination(destination)
    }

    @Signature
    default Memory destinationFactory(Environment __env__, Memory... args) {
        this.getWrappedObject().destinationFactory(factory)
    }

    @Signature
    default Memory bridge(Environment __env__, Memory... args) {
        this.getWrappedObject().bridge(options)
    }

}
