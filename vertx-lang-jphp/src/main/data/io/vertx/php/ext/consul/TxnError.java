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
@Name("TxnError")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class TxnError extends DataObjectWrapper<io.vertx.ext.consul.TxnError> { 
    public TxnError(Environment env, io.vertx.ext.consul.TxnError wrappedObject) {
        super(env, wrappedObject);
    }

    public TxnError(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.TxnError();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.TxnError(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getOpIndex(){ 
        return this.getWrappedObject().getOpIndex();
    }

    @Signature
    public TxnError setOpIndex(int opIndex){ 
        this.getWrappedObject().setOpIndex(opIndex);
        return this;
    }

    @Signature
    public String getWhat(){ 
        return this.getWrappedObject().getWhat();
    }

    @Signature
    public TxnError setWhat(String what){ 
        this.getWrappedObject().setWhat(what);
        return this;
    }
}
