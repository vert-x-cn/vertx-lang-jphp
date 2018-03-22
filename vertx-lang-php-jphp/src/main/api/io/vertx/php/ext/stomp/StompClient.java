package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.StompClientConnection;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.net.NetClient;
@Name("StompClient")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface StompClient<S extends io.vertx.ext.stomp.StompClient> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompClientImpl::new, io.vertx.ext.stomp.StompClient.create(vertx)
    }

    @Signature
    default Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(resultHandler)
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
    default Memory errorFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().errorFrameHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
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
    default Memory isClosed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isClosed()
    }

}
