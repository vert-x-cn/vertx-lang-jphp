package io.vertx.php.mqtt;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("MqttTopicSubscription")
@Namespace("io\\vertx\\php\\mqtt")
public interface MqttTopicSubscription<S extends io.vertx.mqtt.MqttTopicSubscription> extends IWrapper<S>{
    
    @Signature
    default Memory topicName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topicName()
    }
    
    @Signature
    default Memory qualityOfService(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().qualityOfService()
    }

}
