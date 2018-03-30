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
@Name("KeyValue")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class KeyValue extends DataObjectWrapper<io.vertx.ext.consul.KeyValue> { 
    public KeyValue(Environment env, io.vertx.ext.consul.KeyValue wrappedObject) {
        super(env, wrappedObject);
    }

    public KeyValue(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.KeyValue();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.KeyValue(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getCreateIndex(){ 
        return this.getWrappedObject().getCreateIndex();
    }

    @Signature
    public KeyValue setCreateIndex(long createIndex){ 
        this.getWrappedObject().setCreateIndex(createIndex);
        return this;
    }

    @Signature
    public long getFlags(){ 
        return this.getWrappedObject().getFlags();
    }

    @Signature
    public KeyValue setFlags(long flags){ 
        this.getWrappedObject().setFlags(flags);
        return this;
    }

    @Signature
    public String getKey(){ 
        return this.getWrappedObject().getKey();
    }

    @Signature
    public KeyValue setKey(String key){ 
        this.getWrappedObject().setKey(key);
        return this;
    }

    @Signature
    public long getLockIndex(){ 
        return this.getWrappedObject().getLockIndex();
    }

    @Signature
    public KeyValue setLockIndex(long lockIndex){ 
        this.getWrappedObject().setLockIndex(lockIndex);
        return this;
    }

    @Signature
    public long getModifyIndex(){ 
        return this.getWrappedObject().getModifyIndex();
    }

    @Signature
    public KeyValue setModifyIndex(long modifyIndex){ 
        this.getWrappedObject().setModifyIndex(modifyIndex);
        return this;
    }

    @Signature
    public String getSession(){ 
        return this.getWrappedObject().getSession();
    }

    @Signature
    public KeyValue setSession(String session){ 
        this.getWrappedObject().setSession(session);
        return this;
    }

    @Signature
    public String getValue(){ 
        return this.getWrappedObject().getValue();
    }

    @Signature
    public KeyValue setValue(String value){ 
        this.getWrappedObject().setValue(value);
        return this;
    }
}
