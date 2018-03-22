package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttSubAckMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttSubAckMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttSubAckMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttSubAckMessage> implements MqttSubAckMessage<io.vertx.mqtt.messages.MqttSubAckMessage>{
    
    public MqttSubAckMessageImpl(Environment env, io.vertx.mqtt.messages.MqttSubAckMessage wrappedObject){
        super(env, wrappedObject);
    }

}
