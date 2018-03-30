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
@Name("Coordinate")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Coordinate extends DataObjectWrapper<io.vertx.ext.consul.Coordinate> { 
    public Coordinate(Environment env, io.vertx.ext.consul.Coordinate wrappedObject) {
        super(env, wrappedObject);
    }

    public Coordinate(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Coordinate();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Coordinate(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public float getAdj(){ 
        return this.getWrappedObject().getAdj();
    }

    @Signature
    public Coordinate setAdj(float adj){ 
        this.getWrappedObject().setAdj(adj);
        return this;
    }

    @Signature
    public float getErr(){ 
        return this.getWrappedObject().getErr();
    }

    @Signature
    public Coordinate setErr(float err){ 
        this.getWrappedObject().setErr(err);
        return this;
    }

    @Signature
    public float getHeight(){ 
        return this.getWrappedObject().getHeight();
    }

    @Signature
    public Coordinate setHeight(float height){ 
        this.getWrappedObject().setHeight(height);
        return this;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public Coordinate setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }

    @Signature
    public List<Float> getVec(){ 
        return this.getWrappedObject().getVec();
    }

    @Signature
    public Coordinate setVec(List<Float> vec){ 
        this.getWrappedObject().setVec(vec);
        return this;
    }
}
