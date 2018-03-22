package io.vertx.php.amqpbridge.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.amqpbridge.AmqpBridge;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AmqpBridgeImpl")
@Namespace("io\\vertx\\php\\amqpbridge\\impl")
public class AmqpBridgeImpl extends VertxGenWrapper<io.vertx.amqpbridge.AmqpBridge> implements AmqpBridge<io.vertx.amqpbridge.AmqpBridge>{
    
    public AmqpBridgeImpl(Environment env, io.vertx.amqpbridge.AmqpBridge wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AmqpBridgeImpl::new, io.vertx.amqpbridge.AmqpBridge.create(vertx)
    }

    @Signature
    public void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(hostname, port, resultHandler)
    }

    @Signature
    public Memory createConsumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().createConsumer(amqpAddress)
    }

    @Signature
    public Memory createProducer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().createProducer(amqpAddress)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(resultHandler)
    }

    @Signature
    public void endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
