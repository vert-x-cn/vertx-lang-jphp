package io.vertx.php.servicediscovery;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.servicediscovery.Status;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Record")
@Namespace("io\\vertx\\php\\servicediscovery")
//false
public  class Record extends DataObjectWrapper<io.vertx.servicediscovery.Record> { 
    public Record(Environment env, io.vertx.servicediscovery.Record wrappedObject) {
        super(env, wrappedObject);
    }

    public Record(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.servicediscovery.Record();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.servicediscovery.Record(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getLocation(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getLocation().encode());
    }

    @Signature
    public Record setLocation(Memory location){ 
        this.getWrappedObject().setLocation(new JsonObject(JsonFunctions.json_encode(location)));
        return this;
    }

    @Signature
    public Memory getMetadata(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getMetadata().encode());
    }

    @Signature
    public Record setMetadata(Memory metadata){ 
        this.getWrappedObject().setMetadata(new JsonObject(JsonFunctions.json_encode(metadata)));
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Record setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getRegistration(){ 
        return this.getWrappedObject().getRegistration();
    }

    @Signature
    public Record setRegistration(String registration){ 
        this.getWrappedObject().setRegistration(registration);
        return this;
    }

    @Signature
    public Status getStatus(){ 
        return this.getWrappedObject().getStatus();
    }

    @Signature
    public Record setStatus(Status status){ 
        this.getWrappedObject().setStatus(status);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public Record setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
