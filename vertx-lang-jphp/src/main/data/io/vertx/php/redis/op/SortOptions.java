package io.vertx.php.redis.op;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("SortOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class SortOptions extends DataObjectWrapper<io.vertx.redis.op.SortOptions> { 
    public SortOptions(Environment env, io.vertx.redis.op.SortOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SortOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.SortOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.SortOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public SortOptions setBy(String by){ 
        this.getWrappedObject().setBy(by);
        return this;
    }

    @Signature
    public SortOptions addGet(String gets){ 
        this.getWrappedObject().addGet(gets);
        return this;
    }

    @Signature
    public SortOptions setStore(String store){ 
        this.getWrappedObject().setStore(store);
        return this;
    }
}
