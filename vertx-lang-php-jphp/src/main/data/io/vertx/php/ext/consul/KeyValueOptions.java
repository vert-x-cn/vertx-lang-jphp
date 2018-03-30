package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("KeyValueOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class KeyValueOptions extends DataObjectWrapper<io.vertx.ext.consul.KeyValueOptions> { 
    public KeyValueOptions(Environment env, io.vertx.ext.consul.KeyValueOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public KeyValueOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.KeyValueOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.KeyValueOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAcquireSession(){ 
        return this.getWrappedObject().getAcquireSession();
    }

    @Signature
    public KeyValueOptions setAcquireSession(String acquireSession){ 
        this.getWrappedObject().setAcquireSession(acquireSession);
        return this;
    }

    @Signature
    public long getCasIndex(){ 
        return this.getWrappedObject().getCasIndex();
    }

    @Signature
    public KeyValueOptions setCasIndex(long casIndex){ 
        this.getWrappedObject().setCasIndex(casIndex);
        return this;
    }

    @Signature
    public long getFlags(){ 
        return this.getWrappedObject().getFlags();
    }

    @Signature
    public KeyValueOptions setFlags(long flags){ 
        this.getWrappedObject().setFlags(flags);
        return this;
    }

    @Signature
    public String getReleaseSession(){ 
        return this.getWrappedObject().getReleaseSession();
    }

    @Signature
    public KeyValueOptions setReleaseSession(String releaseSession){ 
        this.getWrappedObject().setReleaseSession(releaseSession);
        return this;
    }
}
