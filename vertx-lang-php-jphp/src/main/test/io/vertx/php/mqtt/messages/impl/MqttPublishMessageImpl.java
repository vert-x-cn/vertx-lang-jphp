package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttPublishMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttPublishMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttPublishMessage> implements MqttPublishMessage<io.vertx.mqtt.messages.MqttPublishMessage>{
    
    public MqttPublishMessageImpl(Environment env, io.vertx.mqtt.messages.MqttPublishMessage wrappedObject){
        super(env, wrappedObject);
    }

}
