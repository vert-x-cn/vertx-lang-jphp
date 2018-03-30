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
@Name("Node")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Node extends DataObjectWrapper<io.vertx.ext.consul.Node> { 
    public Node(Environment env, io.vertx.ext.consul.Node wrappedObject) {
        super(env, wrappedObject);
    }

    public Node(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Node();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Node(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAddress(){ 
        return this.getWrappedObject().getAddress();
    }

    @Signature
    public Node setAddress(String address){ 
        this.getWrappedObject().setAddress(address);
        return this;
    }

    @Signature
    public String getLanAddress(){ 
        return this.getWrappedObject().getLanAddress();
    }

    @Signature
    public Node setLanAddress(String lanAddress){ 
        this.getWrappedObject().setLanAddress(lanAddress);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Node setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getWanAddress(){ 
        return this.getWrappedObject().getWanAddress();
    }

    @Signature
    public Node setWanAddress(String wanAddress){ 
        this.getWrappedObject().setWanAddress(wanAddress);
        return this;
    }
}
