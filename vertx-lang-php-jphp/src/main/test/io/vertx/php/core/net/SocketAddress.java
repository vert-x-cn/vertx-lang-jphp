package io.vertx.php.core.net;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("SocketAddress")
@Namespace("io\\vertx\\php\\core\\net")
public interface SocketAddress<S extends io.vertx.core.net.SocketAddress> extends IWrapper<S>{

    @Signature
    static Memory inetSocketAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, io.vertx.core.net.SocketAddress.inetSocketAddress(port, host)
    }

    @Signature
    static Memory domainSocketAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, io.vertx.core.net.SocketAddress.domainSocketAddress(path)
    }
    
    @Signature
    default Memory host(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().host()
    }
    
    @Signature
    default Memory port(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().port()
    }
    
    @Signature
    default Memory path(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().path()
    }

}
