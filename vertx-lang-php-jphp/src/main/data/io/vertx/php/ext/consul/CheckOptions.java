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
@Name("CheckOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class CheckOptions extends DataObjectWrapper<io.vertx.ext.consul.CheckOptions> { 
    public CheckOptions(Environment env, io.vertx.ext.consul.CheckOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public CheckOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.CheckOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.CheckOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getDeregisterAfter(){ 
        return this.getWrappedObject().getDeregisterAfter();
    }

    @Signature
    public CheckOptions setDeregisterAfter(String deregisterAfter){ 
        this.getWrappedObject().setDeregisterAfter(deregisterAfter);
        return this;
    }

    @Signature
    public String getGrpc(){ 
        return this.getWrappedObject().getGrpc();
    }

    @Signature
    public CheckOptions setGrpc(String grpc){ 
        this.getWrappedObject().setGrpc(grpc);
        return this;
    }

    @Signature
    public boolean isGrpcTls(){ 
        return this.getWrappedObject().isGrpcTls();
    }

    @Signature
    public CheckOptions setGrpcTls(boolean grpcTls){ 
        this.getWrappedObject().setGrpcTls(grpcTls);
        return this;
    }

    @Signature
    public String getHttp(){ 
        return this.getWrappedObject().getHttp();
    }

    @Signature
    public CheckOptions setHttp(String http){ 
        this.getWrappedObject().setHttp(http);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public CheckOptions setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getInterval(){ 
        return this.getWrappedObject().getInterval();
    }

    @Signature
    public CheckOptions setInterval(String interval){ 
        this.getWrappedObject().setInterval(interval);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public CheckOptions setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getNotes(){ 
        return this.getWrappedObject().getNotes();
    }

    @Signature
    public CheckOptions setNotes(String notes){ 
        this.getWrappedObject().setNotes(notes);
        return this;
    }

    @Signature
    public String getScript(){ 
        return this.getWrappedObject().getScript();
    }

    @Signature
    public CheckOptions setScript(String script){ 
        this.getWrappedObject().setScript(script);
        return this;
    }

    @Signature
    public String getServiceId(){ 
        return this.getWrappedObject().getServiceId();
    }

    @Signature
    public CheckOptions setServiceId(String serviceId){ 
        this.getWrappedObject().setServiceId(serviceId);
        return this;
    }

    @Signature
    public CheckStatus getStatus(){ 
        return this.getWrappedObject().getStatus();
    }

    @Signature
    public CheckOptions setStatus(CheckStatus status){ 
        this.getWrappedObject().setStatus(status);
        return this;
    }

    @Signature
    public String getTcp(){ 
        return this.getWrappedObject().getTcp();
    }

    @Signature
    public CheckOptions setTcp(String tcp){ 
        this.getWrappedObject().setTcp(tcp);
        return this;
    }

    @Signature
    public boolean isTlsSkipVerify(){ 
        return this.getWrappedObject().isTlsSkipVerify();
    }

    @Signature
    public CheckOptions setTlsSkipVerify(boolean tlsSkipVerify){ 
        this.getWrappedObject().setTlsSkipVerify(tlsSkipVerify);
        return this;
    }

    @Signature
    public String getTtl(){ 
        return this.getWrappedObject().getTtl();
    }

    @Signature
    public CheckOptions setTtl(String ttl){ 
        this.getWrappedObject().setTtl(ttl);
        return this;
    }
}
