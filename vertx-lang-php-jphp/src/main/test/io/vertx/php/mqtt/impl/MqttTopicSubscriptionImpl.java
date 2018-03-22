package io.vertx.php.mqtt.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.MqttTopicSubscription;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttTopicSubscriptionImpl")
@Namespace("io\\vertx\\php\\mqtt\\impl")
public class MqttTopicSubscriptionImpl extends VertxGenWrapper<io.vertx.mqtt.MqttTopicSubscription> implements MqttTopicSubscription<io.vertx.mqtt.MqttTopicSubscription>{
    
    public MqttTopicSubscriptionImpl(Environment env, io.vertx.mqtt.MqttTopicSubscription wrappedObject){
        super(env, wrappedObject);
    }

}
