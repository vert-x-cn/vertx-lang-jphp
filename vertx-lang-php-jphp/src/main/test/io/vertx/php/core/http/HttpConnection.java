package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
@Name("HttpConnection")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpConnection<S extends io.vertx.core.http.HttpConnection> extends IWrapper<S>{
    
    @Signature
    default Memory getWindowSize(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getWindowSize()
    }

    @Signature
    default Memory setWindowSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWindowSize(windowSize)
    }

    @Signature
    default Memory goAway(Environment __env__, Memory... args) {
        this.getWrappedObject().goAway(errorCode)
    }

    @Signature
    default Memory goAwayHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().goAwayHandler(handler)
    }

    @Signature
    default Memory shutdownHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().shutdownHandler(handler)
    }
    
    @Signature
    default Memory shutdown(Environment __env__, Memory... args) {
        this.getWrappedObject().shutdown()
    }

    @Signature
    default Memory shutdown(Environment __env__, Memory... args) {
        this.getWrappedObject().shutdown()
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory settings(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().settings()
    }

    @Signature
    default Memory updateSettings(Environment __env__, Memory... args) {
        this.getWrappedObject().updateSettings(settings)
    }
    
    @Signature
    default Memory remoteSettings(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remoteSettings()
    }

    @Signature
    default Memory remoteSettingsHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().remoteSettingsHandler(handler)
    }

    @Signature
    default Memory ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping(data, pongHandler)
    }

    @Signature
    default Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
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
    default Memory indicatedServerName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().indicatedServerName()
    }

}
