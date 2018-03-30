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
@Name("MqttWill")
@Namespace("io\\vertx\\php\\mqtt")
//false
public  class MqttWill extends DataObjectWrapper<io.vertx.mqtt.MqttWill> { 
    public MqttWill(Environment env, io.vertx.mqtt.MqttWill wrappedObject) {
        super(env, wrappedObject);
    }

    public MqttWill(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.mqtt.MqttWill(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isWillFlag(){ 
        return this.getWrappedObject().isWillFlag();
    }

    @Signature
    public boolean isWillRetain(){ 
        return this.getWrappedObject().isWillRetain();
    }
}
