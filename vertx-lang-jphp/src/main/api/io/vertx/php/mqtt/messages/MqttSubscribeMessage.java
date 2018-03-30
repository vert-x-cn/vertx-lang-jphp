package io.vertx.php.mqtt.messages;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.mqtt.MqttTopicSubscription;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MqttSubscribeMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
@SuppressWarnings("ALL")
public class MqttSubscribeMessage extends VertxGenVariable0Wrapper<io.vertx.mqtt.messages.MqttSubscribeMessage>{
    
    private MqttSubscribeMessage(Environment env, io.vertx.mqtt.messages.MqttSubscribeMessage wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttSubscribeMessage __create(Environment env, io.vertx.mqtt.messages.MqttSubscribeMessage wrappedObject){
        return new MqttSubscribeMessage(env, wrappedObject);
    }

    @Signature
    public Memory messageId(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().messageId());
    }/*1*/

    @Signature
    public Memory topicSubscriptions(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.MqttTopicSubscription, MqttTopicSubscription>create0(MqttTopicSubscription.class, MqttTopicSubscription::__create),this.getWrappedObject().topicSubscriptions());
    }/*1*/

}
