package io.vertx.php.amqpbridge;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.core.eventbus.MessageProducer;
@Name("AmqpBridge")
@Namespace("io\\vertx\\php\\amqpbridge")
public interface AmqpBridge<S extends io.vertx.amqpbridge.AmqpBridge> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AmqpBridgeImpl::new, io.vertx.amqpbridge.AmqpBridge.create(vertx)
    }

    @Signature
    default void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(hostname, port, resultHandler)
    }

    @Signature
    default Memory createConsumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().createConsumer(amqpAddress)
    }

    @Signature
    default Memory createProducer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().createProducer(amqpAddress)
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(resultHandler)
    }

    @Signature
    default void endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
