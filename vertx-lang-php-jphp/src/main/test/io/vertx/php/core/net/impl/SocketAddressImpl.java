package io.vertx.php.core.net.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SocketAddressImpl")
@Namespace("io\\vertx\\php\\core\\net\\impl")
public class SocketAddressImpl extends VertxGenWrapper<io.vertx.core.net.SocketAddress> implements SocketAddress<io.vertx.core.net.SocketAddress>{
    
    public SocketAddressImpl(Environment env, io.vertx.core.net.SocketAddress wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory inetSocketAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, io.vertx.core.net.SocketAddress.inetSocketAddress(port, host)
    }

    @Signature
    public static Memory domainSocketAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, io.vertx.core.net.SocketAddress.domainSocketAddress(path)
    }

}
