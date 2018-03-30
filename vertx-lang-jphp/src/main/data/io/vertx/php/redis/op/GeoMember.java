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
@Name("GeoMember")
@Namespace("io\\vertx\\php\\redis\\op")
//false
public  class GeoMember extends DataObjectWrapper<io.vertx.redis.op.GeoMember> { 
    public GeoMember(Environment env, io.vertx.redis.op.GeoMember wrappedObject) {
        super(env, wrappedObject);
    }

    public GeoMember(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.redis.op.GeoMember();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.redis.op.GeoMember(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public GeoMember setLatitude(Double latitude){ 
        this.getWrappedObject().setLatitude(latitude);
        return this;
    }

    @Signature
    public GeoMember setLongitude(Double longitude){ 
        this.getWrappedObject().setLongitude(longitude);
        return this;
    }

    @Signature
    public GeoMember setMember(String member){ 
        this.getWrappedObject().setMember(member);
        return this;
    }
}
