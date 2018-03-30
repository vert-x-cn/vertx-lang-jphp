package io.vertx.php.mqtt.messages;
import io.netty.handler.codec.mqtt.MqttConnectReturnCode;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttConnAckMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
@SuppressWarnings("ALL")
public class MqttConnAckMessage extends VertxGenVariable0Wrapper<io.vertx.mqtt.messages.MqttConnAckMessage>{
    
    private MqttConnAckMessage(Environment env, io.vertx.mqtt.messages.MqttConnAckMessage wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttConnAckMessage __create(Environment env, io.vertx.mqtt.messages.MqttConnAckMessage wrappedObject){
        return new MqttConnAckMessage(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, MqttConnectReturnCode.class, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.mqtt.messages.MqttConnAckMessage, MqttConnAckMessage>convReturnVertxGenVariable0(__ENV__, MqttConnAckMessage.class, MqttConnAckMessage::__create, io.vertx.mqtt.messages.MqttConnAckMessage.create(Utils.convParamEnum(__ENV__, MqttConnectReturnCode.class, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory code(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().code());
    }/*1*/

    @Signature
    public Memory isSessionPresent(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSessionPresent());
    }/*1*/

}
