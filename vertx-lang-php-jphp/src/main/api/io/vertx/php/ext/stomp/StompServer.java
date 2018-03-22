package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.StompServerHandler;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.net.NetServer;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.ServerFrame;
@Name("StompServer")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface StompServer<S extends io.vertx.ext.stomp.StompServer> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerImpl::new, io.vertx.ext.stomp.StompServer.create(vertx)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
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
    default Memory isListening(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isListening()
    }
    
    @Signature
    default Memory actualPort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().actualPort()
    }
    
    @Signature
    default Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().options()
    }
    
    @Signature
    default Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, this.getWrappedObject().vertx()
    }
    
    @Signature
    default Memory stompHandler(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerHandlerImpl::new, this.getWrappedObject().stompHandler()
    }
    
    @Signature
    default Memory webSocketHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().webSocketHandler()
    }

    @Signature
    default Memory writingFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().writingFrameHandler(handler)
    }

}
