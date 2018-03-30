package io.vertx.php.redis.op;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MigrateOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class MigrateOptions extends DataObjectWrapper<io.vertx.redis.op.MigrateOptions> { 
    public MigrateOptions(Environment env, io.vertx.redis.op.MigrateOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public MigrateOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.MigrateOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.MigrateOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }
}
