package io.vertx.php.core.datagram;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
@Name("DatagramPacket")
@Namespace("io\\vertx\\php\\core\\datagram")
public interface DatagramPacket<S extends io.vertx.core.datagram.DatagramPacket> extends IWrapper<S>{
    
    @Signature
    default Memory sender(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().sender()
    }
    
    @Signature
    default Memory data(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().data()
    }

}
