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
@Name("GeoRadiusOptions")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class GeoRadiusOptions extends DataObjectWrapper<io.vertx.redis.op.GeoRadiusOptions> { 
    public GeoRadiusOptions(Environment env, io.vertx.redis.op.GeoRadiusOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public GeoRadiusOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.GeoRadiusOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.GeoRadiusOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public GeoRadiusOptions setCount(Long count){ 
        this.getWrappedObject().setCount(count);
        return this;
    }

    @Signature
    public GeoRadiusOptions setWithCoord(boolean withCoord){ 
        this.getWrappedObject().setWithCoord(withCoord);
        return this;
    }

    @Signature
    public GeoRadiusOptions setWithDist(boolean withDist){ 
        this.getWrappedObject().setWithDist(withDist);
        return this;
    }

    @Signature
    public GeoRadiusOptions setWithHash(boolean withHash){ 
        this.getWrappedObject().setWithHash(withHash);
        return this;
    }
}
