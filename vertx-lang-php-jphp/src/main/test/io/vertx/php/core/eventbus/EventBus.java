package io.vertx.php.core.eventbus;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.eventbus.SendContext;
import io.vertx.php.core.eventbus.Message;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.core.eventbus.MessageProducer;
@Name("EventBus")
@Namespace("io\\vertx\\php\\core\\eventbus")
public interface EventBus<S extends io.vertx.core.eventbus.EventBus> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

    @Signature
    default Memory send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(address, message)
    }

    @Signature
    default Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(address, message)
    }

    @Signature
    default Memory consumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().consumer(address)
    }

    @Signature
    default Memory localConsumer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().localConsumer(address)
    }

    @Signature
    default Memory sender(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().sender(address)
    }

    @Signature
    default Memory publisher(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().publisher(address)
    }

    @Signature
    default Memory addInterceptor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusImpl::new, this.getWrappedObject().addInterceptor(interceptor)
    }

    @Signature
    default Memory removeInterceptor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusImpl::new, this.getWrappedObject().removeInterceptor(interceptor)
    }

}
