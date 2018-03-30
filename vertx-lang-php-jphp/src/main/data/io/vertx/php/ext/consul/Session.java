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
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Session extends DataObjectWrapper<io.vertx.ext.consul.Session> { 
    public Session(Environment env, io.vertx.ext.consul.Session wrappedObject) {
        super(env, wrappedObject);
    }

    public Session(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Session();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Session(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<String> getChecks(){ 
        return this.getWrappedObject().getChecks();
    }

    @Signature
    public Session setChecks(List<String> checks){ 
        this.getWrappedObject().setChecks(checks);
        return this;
    }

    @Signature
    public long getCreateIndex(){ 
        return this.getWrappedObject().getCreateIndex();
    }

    @Signature
    public Session setCreateIndex(long createIndex){ 
        this.getWrappedObject().setCreateIndex(createIndex);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Session setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public Session setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public long getLockDelay(){ 
        return this.getWrappedObject().getLockDelay();
    }

    @Signature
    public Session setLockDelay(long lockDelay){ 
        this.getWrappedObject().setLockDelay(lockDelay);
        return this;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public Session setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }
}
