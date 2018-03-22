package io.vertx.php.mqtt;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.mqtt.messages.MqttConnAckMessage;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.Vertx;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.mqtt.messages.MqttSubAckMessage;
@Name("MqttClient")
@Namespace("io\\vertx\\php\\mqtt")
public interface MqttClient<S extends io.vertx.mqtt.MqttClient> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttClientImpl::new, io.vertx.mqtt.MqttClient.create(vertx)
    }

    @Signature
    default Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(port, host, connectHandler)
    }
    
    @Signature
    default Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    default Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    default Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(topic, payload, qosLevel, isDup, isRetain)
    }

    @Signature
    default Memory publishCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishCompletionHandler(publishCompletionHandler)
    }

    @Signature
    default Memory publishHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishHandler(publishHandler)
    }

    @Signature
    default Memory subscribeCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeCompletionHandler(subscribeCompletionHandler)
    }

    @Signature
    default Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(topics)
    }

    @Signature
    default Memory unsubscribeCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeCompletionHandler(unsubscribeCompletionHandler)
    }

    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(topic)
    }

    @Signature
    default Memory pingResponseHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingResponseHandler(pingResponseHandler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(closeHandler)
    }
    
    @Signature
    default Memory ping(Environment __env__, Memory... args) {
        this.getWrappedObject().ping()
    }
    
    @Signature
    default Memory clientId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().clientId()
    }
    
    @Signature
    default Memory isConnected(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isConnected()
    }

}
