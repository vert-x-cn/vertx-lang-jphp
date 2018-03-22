package io.vertx.php.mqtt.messages.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.messages.MqttConnAckMessage;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttConnAckMessageImpl")
@Namespace("io\\vertx\\php\\mqtt\\messages\\impl")
public class MqttConnAckMessageImpl extends VertxGenWrapper<io.vertx.mqtt.messages.MqttConnAckMessage> implements MqttConnAckMessage<io.vertx.mqtt.messages.MqttConnAckMessage>{
    
    public MqttConnAckMessageImpl(Environment env, io.vertx.mqtt.messages.MqttConnAckMessage wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttConnAckMessageImpl::new, io.vertx.mqtt.messages.MqttConnAckMessage.create(code, isSessionPresent)
    }

}
