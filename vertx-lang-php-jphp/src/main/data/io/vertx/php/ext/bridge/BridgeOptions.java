package io.vertx.php.ext.bridge;

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
@Name("BridgeOptions")
@Namespace("io\\vertx\\php\\ext\\bridge")
//false
public  class BridgeOptions extends DataObjectWrapper<io.vertx.ext.bridge.BridgeOptions> { 
    public BridgeOptions(Environment env, io.vertx.ext.bridge.BridgeOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public BridgeOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.bridge.BridgeOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.bridge.BridgeOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BridgeOptions addInboundPermitted(io.vertx.ext.bridge.PermittedOptions inboundPermitteds){ 
        this.getWrappedObject().addInboundPermitted(inboundPermitteds);
        return this;
    }

    @Signature
    public List<PermittedOptions> getInboundPermitteds(){ 
        return this.getWrappedObject().getInboundPermitteds().stream().map(v -> new PermittedOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public BridgeOptions setInboundPermitteds(List<PermittedOptions> inboundPermitteds){ 
        this.getWrappedObject().setInboundPermitteds((inboundPermitteds.stream().map(PermittedOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public BridgeOptions addOutboundPermitted(io.vertx.ext.bridge.PermittedOptions outboundPermitteds){ 
        this.getWrappedObject().addOutboundPermitted(outboundPermitteds);
        return this;
    }

    @Signature
    public List<PermittedOptions> getOutboundPermitteds(){ 
        return this.getWrappedObject().getOutboundPermitteds().stream().map(v -> new PermittedOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public BridgeOptions setOutboundPermitteds(List<PermittedOptions> outboundPermitteds){ 
        this.getWrappedObject().setOutboundPermitteds((outboundPermitteds.stream().map(PermittedOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
