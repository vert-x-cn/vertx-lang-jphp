package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.Destination;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DestinationImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class DestinationImpl extends VertxGenWrapper<io.vertx.ext.stomp.Destination> implements Destination<io.vertx.ext.stomp.Destination>{
    
    public DestinationImpl(Environment env, io.vertx.ext.stomp.Destination wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory topic(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.topic(vertx, destination)
    }

    @Signature
    public static Memory queue(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.queue(vertx, destination)
    }

    @Signature
    public static Memory bridge(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, io.vertx.ext.stomp.Destination.bridge(vertx, options)
    }

    @Signature
    public Memory dispatch(Environment __env__, Memory... args) {
        this.getWrappedObject().dispatch(connection, frame)
    }

    @Signature
    public Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(connection, frame)
    }

    @Signature
    public Memory unsubscribe(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().unsubscribe(connection, frame)
    }

    @Signature
    public Memory unsubscribeConnection(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeConnection(connection)
    }

    @Signature
    public Memory ack(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().ack(connection, frame)
    }

    @Signature
    public Memory nack(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nack(connection, frame)
    }

    @Signature
    public Memory getSubscriptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSubscriptions(connection)
    }

    @Signature
    public Memory matches(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().matches(address)
    }

}
