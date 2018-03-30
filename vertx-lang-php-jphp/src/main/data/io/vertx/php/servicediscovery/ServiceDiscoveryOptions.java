package io.vertx.php.servicediscovery;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ServiceDiscoveryOptions")
@Namespace("io\\vertx\\php\\servicediscovery")
//false
public  class ServiceDiscoveryOptions extends DataObjectWrapper<io.vertx.servicediscovery.ServiceDiscoveryOptions> { 
    public ServiceDiscoveryOptions(Environment env, io.vertx.servicediscovery.ServiceDiscoveryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceDiscoveryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.servicediscovery.ServiceDiscoveryOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.servicediscovery.ServiceDiscoveryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAnnounceAddress(){ 
        return this.getWrappedObject().getAnnounceAddress();
    }

    @Signature
    public ServiceDiscoveryOptions setAnnounceAddress(String announceAddress){ 
        this.getWrappedObject().setAnnounceAddress(announceAddress);
        return this;
    }

    @Signature
    public boolean isAutoRegistrationOfImporters(){ 
        return this.getWrappedObject().isAutoRegistrationOfImporters();
    }

    @Signature
    public ServiceDiscoveryOptions setAutoRegistrationOfImporters(boolean autoRegistrationOfImporters){ 
        this.getWrappedObject().setAutoRegistrationOfImporters(autoRegistrationOfImporters);
        return this;
    }

    @Signature
    public Memory getBackendConfiguration(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getBackendConfiguration().encode());
    }

    @Signature
    public ServiceDiscoveryOptions setBackendConfiguration(Memory backendConfiguration){ 
        this.getWrappedObject().setBackendConfiguration(new JsonObject(JsonFunctions.json_encode(backendConfiguration)));
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public ServiceDiscoveryOptions setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getUsageAddress(){ 
        return this.getWrappedObject().getUsageAddress();
    }

    @Signature
    public ServiceDiscoveryOptions setUsageAddress(String usageAddress){ 
        this.getWrappedObject().setUsageAddress(usageAddress);
        return this;
    }
}
