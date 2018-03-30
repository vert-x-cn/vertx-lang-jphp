package io.vertx.php.ext.mongo;

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
@Name("MongoClientBulkWriteResult")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class MongoClientBulkWriteResult extends DataObjectWrapper<io.vertx.ext.mongo.MongoClientBulkWriteResult> { 
    public MongoClientBulkWriteResult(Environment env, io.vertx.ext.mongo.MongoClientBulkWriteResult wrappedObject) {
        super(env, wrappedObject);
    }

    public MongoClientBulkWriteResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientBulkWriteResult();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.MongoClientBulkWriteResult(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getDeletedCount(){ 
        return this.getWrappedObject().getDeletedCount();
    }

    @Signature
    public long getInsertedCount(){ 
        return this.getWrappedObject().getInsertedCount();
    }

    @Signature
    public long getMatchedCount(){ 
        return this.getWrappedObject().getMatchedCount();
    }

    @Signature
    public long getModifiedCount(){ 
        return this.getWrappedObject().getModifiedCount();
    }

    @Signature
    public List<JsonObject> getUpserts(){ 
        return this.getWrappedObject().getUpserts();
    }
}
