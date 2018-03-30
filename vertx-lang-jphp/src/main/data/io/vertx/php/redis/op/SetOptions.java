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
@Name("SetOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class SetOptions extends DataObjectWrapper<io.vertx.redis.op.SetOptions> { 
    public SetOptions(Environment env, io.vertx.redis.op.SetOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SetOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.SetOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.SetOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public SetOptions setEX(long ex){ 
        this.getWrappedObject().setEX(ex);
        return this;
    }

    @Signature
    public SetOptions setNX(boolean nx){ 
        this.getWrappedObject().setNX(nx);
        return this;
    }

    @Signature
    public SetOptions setPX(long px){ 
        this.getWrappedObject().setPX(px);
        return this;
    }

    @Signature
    public SetOptions setXX(boolean xx){ 
        this.getWrappedObject().setXX(xx);
        return this;
    }
}
