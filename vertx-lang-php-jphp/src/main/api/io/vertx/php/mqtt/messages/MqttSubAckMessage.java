package io.vertx.php.mqtt.messages;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.mqtt.messages.MqttMessage;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttSubAckMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
@SuppressWarnings("ALL")
public class MqttSubAckMessage extends VertxGenVariable0Wrapper<io.vertx.mqtt.messages.MqttSubAckMessage>{
    
    private MqttSubAckMessage(Environment env, io.vertx.mqtt.messages.MqttSubAckMessage wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttSubAckMessage __create(Environment env, io.vertx.mqtt.messages.MqttSubAckMessage wrappedObject){
        return new MqttSubAckMessage(env, wrappedObject);
    }

    @Signature
    public Memory messageId(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().messageId());
    }/*1*/

    @Signature
    public Memory grantedQoSLevels(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.INTEGER,this.getWrappedObject().grantedQoSLevels());
    }/*1*/

}
