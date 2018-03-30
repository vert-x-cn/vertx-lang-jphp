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
@Name("BitFieldIncrbyCommand")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class BitFieldIncrbyCommand extends DataObjectWrapper<io.vertx.redis.op.BitFieldIncrbyCommand> { 
    public BitFieldIncrbyCommand(Environment env, io.vertx.redis.op.BitFieldIncrbyCommand wrappedObject) {
        super(env, wrappedObject);
    }

    public BitFieldIncrbyCommand(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.BitFieldIncrbyCommand();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.BitFieldIncrbyCommand(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIncrement(){ 
        return this.getWrappedObject().getIncrement();
    }

    @Signature
    public BitFieldIncrbyCommand setIncrement(long increment){ 
        this.getWrappedObject().setIncrement(increment);
        return this;
    }

    @Signature
    public long getOffset(){ 
        return this.getWrappedObject().getOffset();
    }

    @Signature
    public BitFieldIncrbyCommand setOffset(long offset){ 
        this.getWrappedObject().setOffset(offset);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public BitFieldIncrbyCommand setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
