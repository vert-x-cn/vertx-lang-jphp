package io.vertx.php.kafka.client.common;

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
@Namespace("io\\vertx\\php\\kafka\\client\\common")
//false
public  class Node extends DataObjectWrapper<io.vertx.kafka.client.common.Node> { 
    public Node(Environment env, io.vertx.kafka.client.common.Node wrappedObject) {
        super(env, wrappedObject);
    }

    public Node(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.common.Node();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.common.Node(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isEmpty(){ 
        return this.getWrappedObject().isEmpty();
    }

    @Signature
    public Node setHasRack(boolean hasRack){ 
        this.getWrappedObject().setHasRack(hasRack);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public Node setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Node setId(int id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getIdString(){ 
        return this.getWrappedObject().getIdString();
    }

    @Signature
    public Node setIdString(String idString){ 
        this.getWrappedObject().setIdString(idString);
        return this;
    }

    @Signature
    public Node setIsEmpty(boolean isEmpty){ 
        this.getWrappedObject().setIsEmpty(isEmpty);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public Node setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public Node setRack(String rack){ 
        this.getWrappedObject().setRack(rack);
        return this;
    }
}
