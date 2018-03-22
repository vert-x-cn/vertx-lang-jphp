package io.vertx.php.core.net;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.net.NetSocket;
import io.vertx.php.core.net.SocketAddress;
@Name("NetServer")
@Namespace("io\\vertx\\php\\core\\net")
public interface NetServer<S extends io.vertx.core.net.NetServer> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }
    
    @Signature
    default Memory connectStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().connectStream()
    }

    @Signature
    default Memory connectHandler(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetServerImpl::new, this.getWrappedObject().connectHandler(handler)
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
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
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
    default Memory actualPort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().actualPort()
    }

}
