package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("KeyValueList")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class KeyValueList extends DataObjectWrapper<io.vertx.ext.consul.KeyValueList> { 
    public KeyValueList(Environment env, io.vertx.ext.consul.KeyValueList wrappedObject) {
        super(env, wrappedObject);
    }

    public KeyValueList(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.KeyValueList();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.KeyValueList(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public KeyValueList setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public List<KeyValue> getList(){ 
        return this.getWrappedObject().getList().stream().map(v -> new KeyValue(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public KeyValueList setList(List<KeyValue> list){ 
        this.getWrappedObject().setList((list.stream().map(KeyValue::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
