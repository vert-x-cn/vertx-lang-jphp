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
@Name("FindOptions")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class FindOptions extends DataObjectWrapper<io.vertx.ext.mongo.FindOptions> { 
    public FindOptions(Environment env, io.vertx.ext.mongo.FindOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public FindOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.FindOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.FindOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getBatchSize(){ 
        return this.getWrappedObject().getBatchSize();
    }

    @Signature
    public FindOptions setBatchSize(int batchSize){ 
        this.getWrappedObject().setBatchSize(batchSize);
        return this;
    }

    @Signature
    public Memory getFields(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getFields().encode());
    }

    @Signature
    public FindOptions setFields(Memory fields){ 
        this.getWrappedObject().setFields(new JsonObject(JsonFunctions.json_encode(fields)));
        return this;
    }

    @Signature
    public int getLimit(){ 
        return this.getWrappedObject().getLimit();
    }

    @Signature
    public FindOptions setLimit(int limit){ 
        this.getWrappedObject().setLimit(limit);
        return this;
    }

    @Signature
    public int getSkip(){ 
        return this.getWrappedObject().getSkip();
    }

    @Signature
    public FindOptions setSkip(int skip){ 
        this.getWrappedObject().setSkip(skip);
        return this;
    }

    @Signature
    public Memory getSort(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getSort().encode());
    }

    @Signature
    public FindOptions setSort(Memory sort){ 
        this.getWrappedObject().setSort(new JsonObject(JsonFunctions.json_encode(sort)));
        return this;
    }
}
