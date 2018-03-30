package io.vertx.php.redis.op;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.redis.op.KillFilter.Type;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("KillFilter")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class KillFilter extends DataObjectWrapper<io.vertx.redis.op.KillFilter> { 
    public KillFilter(Environment env, io.vertx.redis.op.KillFilter wrappedObject) {
        super(env, wrappedObject);
    }

    public KillFilter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.KillFilter();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.KillFilter(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public KillFilter setAddr(String addr){ 
        this.getWrappedObject().setAddr(addr);
        return this;
    }

    @Signature
    public KillFilter setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public KillFilter setSkipme(boolean skipme){ 
        this.getWrappedObject().setSkipme(skipme);
        return this;
    }

    @Signature
    public KillFilter setType(Type type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
