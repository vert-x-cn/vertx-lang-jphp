package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttUnsubscribeMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttUnsubscribeMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttUnsubscribeMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttUnsubscribeMessage> implements MqttUnsubscribeMessage<io.vertx.mqtt.messages.MqttUnsubscribeMessage>{
    
    public MqttUnsubscribeMessageImpl(Environment env, io.vertx.mqtt.messages.MqttUnsubscribeMessage wrappedObject){
        super(env, wrappedObject);
    }

}
