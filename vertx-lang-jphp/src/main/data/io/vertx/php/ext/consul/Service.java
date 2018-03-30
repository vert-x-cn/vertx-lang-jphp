package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Service")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Service extends DataObjectWrapper<io.vertx.ext.consul.Service> { 
    public Service(Environment env, io.vertx.ext.consul.Service wrappedObject) {
        super(env, wrappedObject);
    }

    public Service(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Service();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Service(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAddress(){ 
        return this.getWrappedObject().getAddress();
    }

    @Signature
    public Service setAddress(String address){ 
        this.getWrappedObject().setAddress(address);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Service setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Service setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public Service setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }

    @Signature
    public String getNodeAddress(){ 
        return this.getWrappedObject().getNodeAddress();
    }

    @Signature
    public Service setNodeAddress(String nodeAddress){ 
        this.getWrappedObject().setNodeAddress(nodeAddress);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public Service setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public List<String> getTags(){ 
        return this.getWrappedObject().getTags();
    }

    @Signature
    public Service setTags(List<String> tags){ 
        this.getWrappedObject().setTags(tags);
        return this;
    }
}
