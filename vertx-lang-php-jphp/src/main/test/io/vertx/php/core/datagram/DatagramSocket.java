package io.vertx.php.core.datagram;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.datagram.DatagramPacket;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.net.SocketAddress;
@Name("DatagramSocket")
@Namespace("io\\vertx\\php\\core\\datagram")
public interface DatagramSocket<S extends io.vertx.core.datagram.DatagramSocket> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

    @Signature
    default Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(packet, port, host, handler)
    }

    @Signature
    default Memory sender(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WriteStreamImpl::new, this.getWrappedObject().sender(port, host)
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
    default Memory localAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().localAddress()
    }

    @Signature
    default Memory listenMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().listenMulticastGroup(multicastAddress, handler)
    }

    @Signature
    default Memory unlistenMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().unlistenMulticastGroup(multicastAddress, handler)
    }

    @Signature
    default Memory blockMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().blockMulticastGroup(multicastAddress, sourceToBlock, handler)
    }

    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen(port, host, handler)
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
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
