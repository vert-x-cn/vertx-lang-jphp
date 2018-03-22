package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttSubscribeMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttSubscribeMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttSubscribeMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttSubscribeMessage> implements MqttSubscribeMessage<io.vertx.mqtt.messages.MqttSubscribeMessage>{
    
    public MqttSubscribeMessageImpl(Environment env, io.vertx.mqtt.messages.MqttSubscribeMessage wrappedObject){
        super(env, wrappedObject);
    }

}
