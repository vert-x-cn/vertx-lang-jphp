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
@Name("RangeLimitOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class RangeLimitOptions extends DataObjectWrapper<io.vertx.redis.op.RangeLimitOptions> { 
    public RangeLimitOptions(Environment env, io.vertx.redis.op.RangeLimitOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public RangeLimitOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.RangeLimitOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.RangeLimitOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }
}
