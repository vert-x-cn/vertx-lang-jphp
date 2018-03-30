package io.vertx.php.mqtt;
import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MqttTopicSubscription")
@Namespace("io\\vertx\\php\\mqtt")
@SuppressWarnings("ALL")
public class MqttTopicSubscription extends VertxGenVariable0Wrapper<io.vertx.mqtt.MqttTopicSubscription>{
    
    private MqttTopicSubscription(Environment env, io.vertx.mqtt.MqttTopicSubscription wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttTopicSubscription __create(Environment env, io.vertx.mqtt.MqttTopicSubscription wrappedObject){
        return new MqttTopicSubscription(env, wrappedObject);
    }

    @Signature
    public Memory topicName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().topicName());
    }/*1*/

    @Signature
    public Memory qualityOfService(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().qualityOfService());
    }/*1*/

}
