package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.consul.SessionBehavior;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("SessionOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class SessionOptions extends DataObjectWrapper<io.vertx.ext.consul.SessionOptions> { 
    public SessionOptions(Environment env, io.vertx.ext.consul.SessionOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SessionOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.SessionOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.SessionOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public SessionBehavior getBehavior(){ 
        return this.getWrappedObject().getBehavior();
    }

    @Signature
    public SessionOptions setBehavior(SessionBehavior behavior){ 
        this.getWrappedObject().setBehavior(behavior);
        return this;
    }

    @Signature
    public List<String> getChecks(){ 
        return this.getWrappedObject().getChecks();
    }

    @Signature
    public SessionOptions setChecks(List<String> checks){ 
        this.getWrappedObject().setChecks(checks);
        return this;
    }

    @Signature
    public long getLockDelay(){ 
        return this.getWrappedObject().getLockDelay();
    }

    @Signature
    public SessionOptions setLockDelay(long lockDelay){ 
        this.getWrappedObject().setLockDelay(lockDelay);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public SessionOptions setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public SessionOptions setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }

    @Signature
    public long getTtl(){ 
        return this.getWrappedObject().getTtl();
    }

    @Signature
    public SessionOptions setTtl(long ttl){ 
        this.getWrappedObject().setTtl(ttl);
        return this;
    }
}
