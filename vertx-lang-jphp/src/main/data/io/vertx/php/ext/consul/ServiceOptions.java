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
@Name("ServiceOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class ServiceOptions extends DataObjectWrapper<io.vertx.ext.consul.ServiceOptions> { 
    public ServiceOptions(Environment env, io.vertx.ext.consul.ServiceOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.ServiceOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.ServiceOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAddress(){ 
        return this.getWrappedObject().getAddress();
    }

    @Signature
    public ServiceOptions setAddress(String address){ 
        this.getWrappedObject().setAddress(address);
        return this;
    }

    @Signature
    public CheckOptions getCheckOptions(){ 
        return new CheckOptions(__env__, this.getWrappedObject().getCheckOptions());
    }

    @Signature
    public ServiceOptions setCheckOptions(CheckOptions checkOptions){ 
        this.getWrappedObject().setCheckOptions(checkOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public ServiceOptions setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public ServiceOptions setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public ServiceOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public List<String> getTags(){ 
        return this.getWrappedObject().getTags();
    }

    @Signature
    public ServiceOptions setTags(List<String> tags){ 
        this.getWrappedObject().setTags(tags);
        return this;
    }
}
