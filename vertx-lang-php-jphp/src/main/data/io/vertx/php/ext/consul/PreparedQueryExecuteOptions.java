package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PreparedQueryExecuteOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class PreparedQueryExecuteOptions extends DataObjectWrapper<io.vertx.ext.consul.PreparedQueryExecuteOptions> { 
    public PreparedQueryExecuteOptions(Environment env, io.vertx.ext.consul.PreparedQueryExecuteOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PreparedQueryExecuteOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryExecuteOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryExecuteOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getLimit(){ 
        return this.getWrappedObject().getLimit();
    }

    @Signature
    public PreparedQueryExecuteOptions setLimit(int limit){ 
        this.getWrappedObject().setLimit(limit);
        return this;
    }

    @Signature
    public String getNear(){ 
        return this.getWrappedObject().getNear();
    }

    @Signature
    public PreparedQueryExecuteOptions setNear(String near){ 
        this.getWrappedObject().setNear(near);
        return this;
    }
}
