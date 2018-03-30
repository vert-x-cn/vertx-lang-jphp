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
@Name("DcCoordinates")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class DcCoordinates extends DataObjectWrapper<io.vertx.ext.consul.DcCoordinates> { 
    public DcCoordinates(Environment env, io.vertx.ext.consul.DcCoordinates wrappedObject) {
        super(env, wrappedObject);
    }

    public DcCoordinates(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.DcCoordinates();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.DcCoordinates(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getDatacenter(){ 
        return this.getWrappedObject().getDatacenter();
    }

    @Signature
    public DcCoordinates setDatacenter(String datacenter){ 
        this.getWrappedObject().setDatacenter(datacenter);
        return this;
    }

    @Signature
    public List<Coordinate> getServers(){ 
        return this.getWrappedObject().getServers().stream().map(v -> new Coordinate(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public DcCoordinates setServers(List<Coordinate> servers){ 
        this.getWrappedObject().setServers((servers.stream().map(Coordinate::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
