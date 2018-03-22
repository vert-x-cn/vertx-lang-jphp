package io.vertx.php.core.eventbus.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.eventbus.EventBus;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("EventBusImpl")
@Namespace("io\\vertx\\php\\core\\eventbus\\impl")
public class EventBusImpl extends VertxGenWrapper<io.vertx.core.eventbus.EventBus> implements EventBus<io.vertx.core.eventbus.EventBus>{
    
    public EventBusImpl(Environment env, io.vertx.core.eventbus.EventBus wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(address, message)
    }

    @Signature
    public Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(address, message)
    }

    @Signature
    public Memory consumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().consumer(address)
    }

    @Signature
    public Memory localConsumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().localConsumer(address)
    }

    @Signature
    public Memory sender(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().sender(address)
    }

    @Signature
    public Memory publisher(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().publisher(address)
    }

    @Signature
    public Memory addInterceptor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusImpl::new, this.getWrappedObject().addInterceptor(interceptor)
    }

    @Signature
    public Memory removeInterceptor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusImpl::new, this.getWrappedObject().removeInterceptor(interceptor)
    }

}
