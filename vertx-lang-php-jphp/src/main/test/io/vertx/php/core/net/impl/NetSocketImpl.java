package io.vertx.php.core.net.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.net.NetSocket;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("NetSocketImpl")
@Namespace("io\\vertx\\php\\core\\net\\impl")
public class NetSocketImpl extends VertxGenWrapper<io.vertx.core.net.NetSocket> implements NetSocket<io.vertx.core.net.NetSocket>{
    
    public NetSocketImpl(Environment env, io.vertx.core.net.NetSocket wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    public Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    public Memory sendFile(Environment __env__, Memory... args) {
        this.getWrappedObject().sendFile(filename)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory upgradeToSsl(Environment __env__, Memory... args) {
        this.getWrappedObject().upgradeToSsl(handler)
    }

}
