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
@Name("BitFieldOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class BitFieldOptions extends DataObjectWrapper<io.vertx.redis.op.BitFieldOptions> { 
    public BitFieldOptions(Environment env, io.vertx.redis.op.BitFieldOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public BitFieldOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.BitFieldOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.BitFieldOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BitFieldGetCommand getGet(){ 
        return new BitFieldGetCommand(__env__, this.getWrappedObject().getGet());
    }

    @Signature
    public BitFieldOptions setGet(BitFieldGetCommand get){ 
        this.getWrappedObject().setGet(get.getWrappedObject());
        return this;
    }

    @Signature
    public BitFieldIncrbyCommand getIncrby(){ 
        return new BitFieldIncrbyCommand(__env__, this.getWrappedObject().getIncrby());
    }

    @Signature
    public BitFieldOptions setIncrby(BitFieldIncrbyCommand incrby){ 
        this.getWrappedObject().setIncrby(incrby.getWrappedObject());
        return this;
    }

    @Signature
    public BitFieldSetCommand getSet(){ 
        return new BitFieldSetCommand(__env__, this.getWrappedObject().getSet());
    }

    @Signature
    public BitFieldOptions setSet(BitFieldSetCommand set){ 
        this.getWrappedObject().setSet(set.getWrappedObject());
        return this;
    }
}
