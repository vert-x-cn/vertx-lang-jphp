package io.vertx.php.ext.web.handler.sockjs;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.ext.bridge.PermittedOptions;
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
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
//false
public  class BridgeOptions extends DataObjectWrapper<io.vertx.ext.web.handler.sockjs.BridgeOptions> { 
    public BridgeOptions(Environment env, io.vertx.ext.web.handler.sockjs.BridgeOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public BridgeOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.BridgeOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.BridgeOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BridgeOptions setInboundPermitted(List<PermittedOptions> inboundPermitted){ 
        this.getWrappedObject().setInboundPermitted((inboundPermitted.stream().map(PermittedOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
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
    public int getMaxAddressLength(){ 
        return this.getWrappedObject().getMaxAddressLength();
    }

    @Signature
    public BridgeOptions setMaxAddressLength(int maxAddressLength){ 
        this.getWrappedObject().setMaxAddressLength(maxAddressLength);
        return this;
    }

    @Signature
    public int getMaxHandlersPerSocket(){ 
        return this.getWrappedObject().getMaxHandlersPerSocket();
    }

    @Signature
    public BridgeOptions setMaxHandlersPerSocket(int maxHandlersPerSocket){ 
        this.getWrappedObject().setMaxHandlersPerSocket(maxHandlersPerSocket);
        return this;
    }

    @Signature
    public BridgeOptions setOutboundPermitted(List<PermittedOptions> outboundPermitted){ 
        this.getWrappedObject().setOutboundPermitted((outboundPermitted.stream().map(PermittedOptions::getWrappedObject).collect(Collectors.toList())));
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
    public long getPingTimeout(){ 
        return this.getWrappedObject().getPingTimeout();
    }

    @Signature
    public BridgeOptions setPingTimeout(long pingTimeout){ 
        this.getWrappedObject().setPingTimeout(pingTimeout);
        return this;
    }

    @Signature
    public long getReplyTimeout(){ 
        return this.getWrappedObject().getReplyTimeout();
    }

    @Signature
    public BridgeOptions setReplyTimeout(long replyTimeout){ 
        this.getWrappedObject().setReplyTimeout(replyTimeout);
        return this;
    }
}