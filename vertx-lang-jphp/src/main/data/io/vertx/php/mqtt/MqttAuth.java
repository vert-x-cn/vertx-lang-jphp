package io.vertx.php.mqtt;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MqttAuth")
@Namespace("io\\vertx\\php\\mqtt")
//false
public  class MqttAuth extends DataObjectWrapper<io.vertx.mqtt.MqttAuth> { 
    public MqttAuth(Environment env, io.vertx.mqtt.MqttAuth wrappedObject) {
        super(env, wrappedObject);
    }

    public MqttAuth(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.mqtt.MqttAuth(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }
}
