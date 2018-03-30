package io.vertx.php.mqtt.messages;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MqttMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
@SuppressWarnings("ALL")
public class MqttMessage extends VertxGenVariable0Wrapper<io.vertx.mqtt.messages.MqttMessage>{
    
    private MqttMessage(Environment env, io.vertx.mqtt.messages.MqttMessage wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttMessage __create(Environment env, io.vertx.mqtt.messages.MqttMessage wrappedObject){
        return new MqttMessage(env, wrappedObject);
    }

    @Signature
    public Memory messageId(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().messageId());
    }/*1*/

}
