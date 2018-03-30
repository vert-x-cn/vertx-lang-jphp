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
@Name("TxnRequest")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class TxnRequest extends DataObjectWrapper<io.vertx.ext.consul.TxnRequest> { 
    public TxnRequest(Environment env, io.vertx.ext.consul.TxnRequest wrappedObject) {
        super(env, wrappedObject);
    }

    public TxnRequest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.TxnRequest();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.TxnRequest(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getOperationsSize(){ 
        return this.getWrappedObject().getOperationsSize();
    }
}
