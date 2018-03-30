package io.vertx.php.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MongoClientDeleteResult")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class MongoClientDeleteResult extends DataObjectWrapper<io.vertx.ext.mongo.MongoClientDeleteResult> { 
    public MongoClientDeleteResult(Environment env, io.vertx.ext.mongo.MongoClientDeleteResult wrappedObject) {
        super(env, wrappedObject);
    }

    public MongoClientDeleteResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientDeleteResult();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientDeleteResult(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getRemovedCount(){ 
        return this.getWrappedObject().getRemovedCount();
    }
}
