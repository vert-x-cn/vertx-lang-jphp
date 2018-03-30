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
@Name("ServiceEntry")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class ServiceEntry extends DataObjectWrapper<io.vertx.ext.consul.ServiceEntry> { 
    public ServiceEntry(Environment env, io.vertx.ext.consul.ServiceEntry wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceEntry(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.ServiceEntry();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.ServiceEntry(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<Check> getChecks(){ 
        return this.getWrappedObject().getChecks().stream().map(v -> new Check(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public ServiceEntry setChecks(List<Check> checks){ 
        this.getWrappedObject().setChecks((checks.stream().map(Check::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public Node getNode(){ 
        return new Node(__env__, this.getWrappedObject().getNode());
    }

    @Signature
    public ServiceEntry setNode(Node node){ 
        this.getWrappedObject().setNode(node.getWrappedObject());
        return this;
    }

    @Signature
    public Service getService(){ 
        return new Service(__env__, this.getWrappedObject().getService());
    }

    @Signature
    public ServiceEntry setService(Service service){ 
        this.getWrappedObject().setService(service.getWrappedObject());
        return this;
    }
}
