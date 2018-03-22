package io.vertx.php.core.eventbus.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.eventbus.MessageProducer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MessageProducerImpl")
@Namespace("io\\vertx\\php\\core\\eventbus\\impl")
public class MessageProducerImpl<T> extends VertxGenWrapper<io.vertx.core.eventbus.MessageProducer<T>> implements MessageProducer<io.vertx.core.eventbus.MessageProducer<T>, T>{
    
    public MessageProducerImpl(Environment env, io.vertx.core.eventbus.MessageProducer<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory send(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().send(message)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
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
    public Memory deliveryOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().deliveryOptions(options)
    }

}
