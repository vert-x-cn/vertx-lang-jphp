package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.consul.TxnKVVerb;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("TxnKVOperation")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class TxnKVOperation extends DataObjectWrapper<io.vertx.ext.consul.TxnKVOperation> { 
    public TxnKVOperation(Environment env, io.vertx.ext.consul.TxnKVOperation wrappedObject) {
        super(env, wrappedObject);
    }

    public TxnKVOperation(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.TxnKVOperation();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.TxnKVOperation(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getFlags(){ 
        return this.getWrappedObject().getFlags();
    }

    @Signature
    public TxnKVOperation setFlags(long flags){ 
        this.getWrappedObject().setFlags(flags);
        return this;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public TxnKVOperation setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public String getKey(){ 
        return this.getWrappedObject().getKey();
    }

    @Signature
    public TxnKVOperation setKey(String key){ 
        this.getWrappedObject().setKey(key);
        return this;
    }

    @Signature
    public String getSession(){ 
        return this.getWrappedObject().getSession();
    }

    @Signature
    public TxnKVOperation setSession(String session){ 
        this.getWrappedObject().setSession(session);
        return this;
    }

    @Signature
    public TxnKVVerb getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public TxnKVOperation setType(TxnKVVerb type){ 
        this.getWrappedObject().setType(type);
        return this;
    }

    @Signature
    public String getValue(){ 
        return this.getWrappedObject().getValue();
    }

    @Signature
    public TxnKVOperation setValue(String value){ 
        this.getWrappedObject().setValue(value);
        return this;
    }
}
