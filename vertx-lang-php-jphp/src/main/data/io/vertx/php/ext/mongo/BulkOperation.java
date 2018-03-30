package io.vertx.php.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.BulkOperation.BulkOperationType;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("BulkOperation")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class BulkOperation extends DataObjectWrapper<io.vertx.ext.mongo.BulkOperation> { 
    public BulkOperation(Environment env, io.vertx.ext.mongo.BulkOperation wrappedObject) {
        super(env, wrappedObject);
    }

    public BulkOperation(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.BulkOperation(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getDocument(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getDocument().encode());
    }

    @Signature
    public BulkOperation setDocument(Memory document){ 
        this.getWrappedObject().setDocument(new JsonObject(JsonFunctions.json_encode(document)));
        return this;
    }

    @Signature
    public Memory getFilter(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getFilter().encode());
    }

    @Signature
    public BulkOperation setFilter(Memory filter){ 
        this.getWrappedObject().setFilter(new JsonObject(JsonFunctions.json_encode(filter)));
        return this;
    }

    @Signature
    public boolean isMulti(){ 
        return this.getWrappedObject().isMulti();
    }

    @Signature
    public BulkOperation setMulti(boolean multi){ 
        this.getWrappedObject().setMulti(multi);
        return this;
    }

    @Signature
    public BulkOperationType getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public BulkOperation setType(BulkOperationType type){ 
        this.getWrappedObject().setType(type);
        return this;
    }

    @Signature
    public boolean isUpsert(){ 
        return this.getWrappedObject().isUpsert();
    }

    @Signature
    public BulkOperation setUpsert(boolean upsert){ 
        this.getWrappedObject().setUpsert(upsert);
        return this;
    }
}
