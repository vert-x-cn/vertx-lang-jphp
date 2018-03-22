package io.vertx.php.core.net;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.net.NetSocket;
import io.vertx.php.core.net.SocketAddress;
@Name("NetClient")
@Namespace("io\\vertx\\php\\core\\net")
public interface NetClient<S extends io.vertx.core.net.NetClient> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

    @Signature
    default Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(remoteAddress, connectHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
