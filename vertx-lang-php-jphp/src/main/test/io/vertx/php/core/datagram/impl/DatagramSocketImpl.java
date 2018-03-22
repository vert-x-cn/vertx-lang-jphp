package io.vertx.php.core.datagram.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.datagram.DatagramSocket;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DatagramSocketImpl")
@Namespace("io\\vertx\\php\\core\\datagram\\impl")
public class DatagramSocketImpl extends VertxGenWrapper<io.vertx.core.datagram.DatagramSocket> implements DatagramSocket<io.vertx.core.datagram.DatagramSocket>{
    
    public DatagramSocketImpl(Environment env, io.vertx.core.datagram.DatagramSocket wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(packet, port, host, handler)
    }

    @Signature
    public Memory sender(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WriteStreamImpl::new, this.getWrappedObject().sender(port, host)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public Memory listenMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().listenMulticastGroup(multicastAddress, handler)
    }

    @Signature
    public Memory unlistenMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().unlistenMulticastGroup(multicastAddress, handler)
    }

    @Signature
    public Memory blockMulticastGroup(Environment __env__, Memory... args) {
        this.getWrappedObject().blockMulticastGroup(multicastAddress, sourceToBlock, handler)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen(port, host, handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
