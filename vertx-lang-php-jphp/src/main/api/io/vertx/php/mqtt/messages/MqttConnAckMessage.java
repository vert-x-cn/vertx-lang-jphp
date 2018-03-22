package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("MqttConnAckMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttConnAckMessage<S extends io.vertx.mqtt.messages.MqttConnAckMessage> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttConnAckMessageImpl::new, io.vertx.mqtt.messages.MqttConnAckMessage.create(code, isSessionPresent)
    }
    
    @Signature
    default Memory code(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().code()
    }
    
    @Signature
    default Memory isSessionPresent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSessionPresent()
    }

}
