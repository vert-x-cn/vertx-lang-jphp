package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.mqtt.messages.MqttMessage;
@Name("MqttSubAckMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttSubAckMessage<S extends io.vertx.mqtt.messages.MqttSubAckMessage> extends IWrapper<S>{
    
    @Signature
    default Memory messageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().messageId()
    }
    
    @Signature
    default Memory grantedQoSLevels(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().grantedQoSLevels()
    }

}
