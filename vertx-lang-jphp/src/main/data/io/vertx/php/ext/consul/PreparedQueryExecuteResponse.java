package io.vertx.php.ext.consul;

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
@Name("PreparedQueryExecuteResponse")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class PreparedQueryExecuteResponse extends DataObjectWrapper<io.vertx.ext.consul.PreparedQueryExecuteResponse> { 
    public PreparedQueryExecuteResponse(Environment env, io.vertx.ext.consul.PreparedQueryExecuteResponse wrappedObject) {
        super(env, wrappedObject);
    }

    public PreparedQueryExecuteResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryExecuteResponse();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryExecuteResponse(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getDc(){ 
        return this.getWrappedObject().getDc();
    }

    @Signature
    public PreparedQueryExecuteResponse setDc(String dc){ 
        this.getWrappedObject().setDc(dc);
        return this;
    }

    @Signature
    public String getDnsTtl(){ 
        return this.getWrappedObject().getDnsTtl();
    }

    @Signature
    public PreparedQueryExecuteResponse setDnsTtl(String dnsTtl){ 
        this.getWrappedObject().setDnsTtl(dnsTtl);
        return this;
    }

    @Signature
    public int getFailovers(){ 
        return this.getWrappedObject().getFailovers();
    }

    @Signature
    public PreparedQueryExecuteResponse setFailovers(int failovers){ 
        this.getWrappedObject().setFailovers(failovers);
        return this;
    }

    @Signature
    public List<ServiceEntry> getNodes(){ 
        return this.getWrappedObject().getNodes().stream().map(v -> new ServiceEntry(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public PreparedQueryExecuteResponse setNodes(List<ServiceEntry> nodes){ 
        this.getWrappedObject().setNodes((nodes.stream().map(ServiceEntry::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public String getService(){ 
        return this.getWrappedObject().getService();
    }

    @Signature
    public PreparedQueryExecuteResponse setService(String service){ 
        this.getWrappedObject().setService(service);
        return this;
    }
}
