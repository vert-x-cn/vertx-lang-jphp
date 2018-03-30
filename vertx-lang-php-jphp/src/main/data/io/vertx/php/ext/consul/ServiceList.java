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
@Name("ServiceList")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class ServiceList extends DataObjectWrapper<io.vertx.ext.consul.ServiceList> { 
    public ServiceList(Environment env, io.vertx.ext.consul.ServiceList wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceList(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.ServiceList();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.ServiceList(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public ServiceList setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public List<Service> getList(){ 
        return this.getWrappedObject().getList().stream().map(v -> new Service(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public ServiceList setList(List<Service> list){ 
        this.getWrappedObject().setList((list.stream().map(Service::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
