package io.vertx.php.ext.sql;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("UpdateResult")
@Namespace("io\\vertx\\php\\ext\\sql")
//false
public  class UpdateResult extends DataObjectWrapper<io.vertx.ext.sql.UpdateResult> { 
    public UpdateResult(Environment env, io.vertx.ext.sql.UpdateResult wrappedObject) {
        super(env, wrappedObject);
    }

    public UpdateResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.sql.UpdateResult();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.sql.UpdateResult(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public JsonArray getKeys(){ 
        return this.getWrappedObject().getKeys();
    }

    @Signature
    public UpdateResult setKeys(JsonArray keys){ 
        this.getWrappedObject().setKeys(keys);
        return this;
    }

    @Signature
    public int getUpdated(){ 
        return this.getWrappedObject().getUpdated();
    }

    @Signature
    public UpdateResult setUpdated(int updated){ 
        this.getWrappedObject().setUpdated(updated);
        return this;
    }
}
