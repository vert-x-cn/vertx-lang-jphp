package io.vertx.php.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.WriteOption;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("BulkWriteOptions")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class BulkWriteOptions extends DataObjectWrapper<io.vertx.ext.mongo.BulkWriteOptions> { 
    public BulkWriteOptions(Environment env, io.vertx.ext.mongo.BulkWriteOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public BulkWriteOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.BulkWriteOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.BulkWriteOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isOrdered(){ 
        return this.getWrappedObject().isOrdered();
    }

    @Signature
    public BulkWriteOptions setOrdered(boolean ordered){ 
        this.getWrappedObject().setOrdered(ordered);
        return this;
    }

    @Signature
    public WriteOption getWriteOption(){ 
        return this.getWrappedObject().getWriteOption();
    }

    @Signature
    public BulkWriteOptions setWriteOption(WriteOption writeOption){ 
        this.getWrappedObject().setWriteOption(writeOption);
        return this;
    }
}
