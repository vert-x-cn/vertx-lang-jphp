package io.vertx.php.mqtt.messages;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.mqtt.messages.MqttMessage;
@Name("MqttPublishMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public interface MqttPublishMessage<S extends io.vertx.mqtt.messages.MqttPublishMessage> extends IWrapper<S>{
    
    @Signature
    default Memory messageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().messageId()
    }
    
    @Signature
    default Memory qosLevel(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().qosLevel()
    }
    
    @Signature
    default Memory isDup(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isDup()
    }
    
    @Signature
    default Memory isRetain(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isRetain()
    }
    
    @Signature
    default Memory topicName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topicName()
    }
    
    @Signature
    default Memory payload(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().payload()
    }

}
