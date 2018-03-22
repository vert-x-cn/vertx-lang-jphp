package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.StompServerConnection;
@Name("Destination")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface Destination<S extends io.vertx.ext.stomp.Destination> extends IWrapper<S>{

    @Signature
    static Memory topic(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.topic(vertx, destination)
    }

    @Signature
    static Memory queue(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.queue(vertx, destination)
    }

    @Signature
    static Memory bridge(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.bridge(vertx, options)
    }
    
    @Signature
    default Memory destination(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().destination()
    }

    @Signature
    default Memory dispatch(Environment __env__, Memory... args) {
        this.getWrappedObject().dispatch(connection, frame)
    }

    @Signature
    default Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(connection, frame)
    }

    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().unsubscribe(connection, frame)
    }

    @Signature
    default Memory unsubscribeConnection(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeConnection(connection)
    }

    @Signature
    default Memory ack(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().ack(connection, frame)
    }

    @Signature
    default Memory nack(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nack(connection, frame)
    }

    @Signature
    default Memory getSubscriptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSubscriptions(connection)
    }
    
    @Signature
    default Memory numberOfSubscriptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().numberOfSubscriptions()
    }

    @Signature
    default Memory matches(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().matches(address)
    }

}
