package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.consul.CheckStatus;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Check")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Check extends DataObjectWrapper<io.vertx.ext.consul.Check> { 
    public Check(Environment env, io.vertx.ext.consul.Check wrappedObject) {
        super(env, wrappedObject);
    }

    public Check(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Check();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Check(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Check setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Check setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getNodeName(){ 
        return this.getWrappedObject().getNodeName();
    }

    @Signature
    public Check setNodeName(String nodeName){ 
        this.getWrappedObject().setNodeName(nodeName);
        return this;
    }

    @Signature
    public String getNotes(){ 
        return this.getWrappedObject().getNotes();
    }

    @Signature
    public Check setNotes(String notes){ 
        this.getWrappedObject().setNotes(notes);
        return this;
    }

    @Signature
    public String getOutput(){ 
        return this.getWrappedObject().getOutput();
    }

    @Signature
    public Check setOutput(String output){ 
        this.getWrappedObject().setOutput(output);
        return this;
    }

    @Signature
    public String getServiceId(){ 
        return this.getWrappedObject().getServiceId();
    }

    @Signature
    public Check setServiceId(String serviceId){ 
        this.getWrappedObject().setServiceId(serviceId);
        return this;
    }

    @Signature
    public String getServiceName(){ 
        return this.getWrappedObject().getServiceName();
    }

    @Signature
    public Check setServiceName(String serviceName){ 
        this.getWrappedObject().setServiceName(serviceName);
        return this;
    }

    @Signature
    public CheckStatus getStatus(){ 
        return this.getWrappedObject().getStatus();
    }

    @Signature
    public Check setStatus(CheckStatus status){ 
        this.getWrappedObject().setStatus(status);
        return this;
    }
}
