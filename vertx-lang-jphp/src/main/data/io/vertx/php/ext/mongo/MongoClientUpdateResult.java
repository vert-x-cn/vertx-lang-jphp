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
@Name("MongoClientUpdateResult")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class MongoClientUpdateResult extends DataObjectWrapper<io.vertx.ext.mongo.MongoClientUpdateResult> { 
    public MongoClientUpdateResult(Environment env, io.vertx.ext.mongo.MongoClientUpdateResult wrappedObject) {
        super(env, wrappedObject);
    }

    public MongoClientUpdateResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientUpdateResult();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientUpdateResult(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getDocMatched(){ 
        return this.getWrappedObject().getDocMatched();
    }

    @Signature
    public long getDocModified(){ 
        return this.getWrappedObject().getDocModified();
    }

    @Signature
    public Memory getDocUpsertedId(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getDocUpsertedId().encode());
    }
}
