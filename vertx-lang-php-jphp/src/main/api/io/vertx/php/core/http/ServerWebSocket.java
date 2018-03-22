package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.WebSocketBase;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.http.WebSocketFrame;
import io.vertx.php.core.net.SocketAddress;
@Name("ServerWebSocket")
@Namespace("io\\vertx\\php\\core\\http")
public interface ServerWebSocket<S extends io.vertx.core.http.ServerWebSocket> extends IWrapper<S>{
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }
    
    @Signature
    default Memory writeQueueFull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().writeQueueFull()
    }
    
    @Signature
    default Memory binaryHandlerID(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().binaryHandlerID()
    }
    
    @Signature
    default Memory textHandlerID(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().textHandlerID()
    }
    
    @Signature
    default Memory subProtocol(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subProtocol()
    }

    @Signature
    default Memory writeTextMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().writeTextMessage(text)
    }

    @Signature
    default Memory writePing(Environment __env__, Memory... args) {
        this.getWrappedObject().writePing(data)
    }

    @Signature
    default Memory writePong(Environment __env__, Memory... args) {
        this.getWrappedObject().writePong(data)
    }

    @Signature
    default Memory textMessageHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().textMessageHandler(handler)
    }

    @Signature
    default Memory binaryMessageHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().binaryMessageHandler(handler)
    }

    @Signature
    default Memory pongHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pongHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory remoteAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().remoteAddress()
    }
    
    @Signature
    default Memory localAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().localAddress()
    }
    
    @Signature
    default Memory isSsl(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSsl()
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    default Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    default Memory writeFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFrame(frame)
    }

    @Signature
    default Memory writeFinalTextFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFinalTextFrame(text)
    }

    @Signature
    default Memory writeFinalBinaryFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeFinalBinaryFrame(data)
    }

    @Signature
    default Memory writeBinaryMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().writeBinaryMessage(data)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default Memory frameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().frameHandler(handler)
    }
    
    @Signature
    default Memory uri(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().uri()
    }
    
    @Signature
    default Memory path(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().path()
    }
    
    @Signature
    default Memory query(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().query()
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }
    
    @Signature
    default void accept(Environment __env__, Memory... args) {
        this.getWrappedObject().accept()
    }
    
    @Signature
    default void reject(Environment __env__, Memory... args) {
        this.getWrappedObject().reject()
    }

    @Signature
    default void reject(Environment __env__, Memory... args) {
        this.getWrappedObject().reject()
    }

}
