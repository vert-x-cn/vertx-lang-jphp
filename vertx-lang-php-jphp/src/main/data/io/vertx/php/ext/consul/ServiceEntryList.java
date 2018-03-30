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
@Name("ServiceEntryList")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class ServiceEntryList extends DataObjectWrapper<io.vertx.ext.consul.ServiceEntryList> { 
    public ServiceEntryList(Environment env, io.vertx.ext.consul.ServiceEntryList wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceEntryList(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.ServiceEntryList();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.ServiceEntryList(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public ServiceEntryList setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public List<ServiceEntry> getList(){ 
        return this.getWrappedObject().getList().stream().map(v -> new ServiceEntry(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public ServiceEntryList setList(List<ServiceEntry> list){ 
        this.getWrappedObject().setList((list.stream().map(ServiceEntry::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
