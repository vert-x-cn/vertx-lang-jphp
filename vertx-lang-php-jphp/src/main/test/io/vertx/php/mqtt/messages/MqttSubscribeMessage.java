package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.mqtt.MqttTopicSubscription;
import io.vertx.php.mqtt.messages.MqttMessage;
@Name("MqttSubscribeMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttSubscribeMessage<S extends io.vertx.mqtt.messages.MqttSubscribeMessage> extends IWrapper<S>{
    
    @Signature
    default Memory messageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().messageId()
    }
    
    @Signature
    default Memory topicSubscriptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topicSubscriptions()
    }

}
