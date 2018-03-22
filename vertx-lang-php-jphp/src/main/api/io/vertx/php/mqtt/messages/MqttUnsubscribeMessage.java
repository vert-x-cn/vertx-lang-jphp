package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.mqtt.messages.MqttMessage;
@Name("MqttUnsubscribeMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttUnsubscribeMessage<S extends io.vertx.mqtt.messages.MqttUnsubscribeMessage> extends IWrapper<S>{
    
    @Signature
    default Memory messageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().messageId()
    }
    
    @Signature
    default Memory topics(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topics()
    }

}
