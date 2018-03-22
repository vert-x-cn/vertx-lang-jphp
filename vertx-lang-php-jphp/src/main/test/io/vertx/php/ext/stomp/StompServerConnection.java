package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.StompServerHandler;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.stomp.StompServer;
@Name("StompServerConnection")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface StompServerConnection<S extends io.vertx.ext.stomp.StompServerConnection> extends IWrapper<S>{

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(frame)
    }
    
    @Signature
    default Memory server(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerImpl::new, this.getWrappedObject().server()
    }
    
    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerHandlerImpl::new, this.getWrappedObject().handler()
    }
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().session()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default void ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping()
    }
    
    @Signature
    default void onServerActivity(Environment __env__, Memory... args) {
        this.getWrappedObject().onServerActivity()
    }

    @Signature
    default void configureHeartbeat(Environment __env__, Memory... args) {
        this.getWrappedObject().configureHeartbeat(ping, pong, pingHandler)
    }

}
