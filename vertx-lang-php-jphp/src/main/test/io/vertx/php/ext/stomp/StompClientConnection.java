package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
@Name("StompClientConnection")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface StompClientConnection<S extends io.vertx.ext.stomp.StompClientConnection> extends IWrapper<S>{
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().session()
    }
    
    @Signature
    default Memory version(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().version()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory server(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().server()
    }

    @Signature
    default Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(frame)
    }

    @Signature
    default Memory subscribe(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subscribe(destination, handler)
    }

    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(destination)
    }

    @Signature
    default Memory errorHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().errorHandler(handler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default Memory connectionDroppedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionDroppedHandler(handler)
    }

    @Signature
    default Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    default Memory beginTX(Environment __env__, Memory... args) {
        this.getWrappedObject().beginTX(id)
    }

    @Signature
    default Memory commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit(id)
    }

    @Signature
    default Memory abort(Environment __env__, Memory... args) {
        this.getWrappedObject().abort(id)
    }
    
    @Signature
    default Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    default Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    default Memory ack(Environment __env__, Memory... args) {
        this.getWrappedObject().ack(id)
    }

    @Signature
    default Memory nack(Environment __env__, Memory... args) {
        this.getWrappedObject().nack(id)
    }

    @Signature
    default Memory receivedFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().receivedFrameHandler(handler)
    }

    @Signature
    default Memory writingFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().writingFrameHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(exceptionHandler)
    }
    
    @Signature
    default Memory isConnected(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isConnected()
    }

}
