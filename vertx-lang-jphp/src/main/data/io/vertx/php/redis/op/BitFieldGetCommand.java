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
@Name("BitFieldGetCommand")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class BitFieldGetCommand extends DataObjectWrapper<io.vertx.redis.op.BitFieldGetCommand> { 
    public BitFieldGetCommand(Environment env, io.vertx.redis.op.BitFieldGetCommand wrappedObject) {
        super(env, wrappedObject);
    }

    public BitFieldGetCommand(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.BitFieldGetCommand();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.BitFieldGetCommand(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getOffset(){ 
        return this.getWrappedObject().getOffset();
    }

    @Signature
    public BitFieldGetCommand setOffset(long offset){ 
        this.getWrappedObject().setOffset(offset);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public BitFieldGetCommand setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
