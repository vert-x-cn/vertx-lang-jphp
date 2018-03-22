package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttMessage> implements MqttMessage<io.vertx.mqtt.messages.MqttMessage>{
    
    public MqttMessageImpl(Environment env, io.vertx.mqtt.messages.MqttMessage wrappedObject){
        super(env, wrappedObject);
    }

}
