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
@Name("ScanOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class ScanOptions extends DataObjectWrapper<io.vertx.redis.op.ScanOptions> { 
    public ScanOptions(Environment env, io.vertx.redis.op.ScanOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ScanOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.ScanOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.ScanOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public ScanOptions setCount(int count){ 
        this.getWrappedObject().setCount(count);
        return this;
    }

    @Signature
    public ScanOptions setMatch(String match){ 
        this.getWrappedObject().setMatch(match);
        return this;
    }
}
