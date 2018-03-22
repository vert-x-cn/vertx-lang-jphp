package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("MqttMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttMessage<S extends io.vertx.mqtt.messages.MqttMessage> extends IWrapper<S>{
    
    @Signature
    default Memory messageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().messageId()
    }

}
