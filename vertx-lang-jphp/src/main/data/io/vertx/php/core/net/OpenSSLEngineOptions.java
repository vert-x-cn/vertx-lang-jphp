package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("OpenSSLEngineOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class OpenSSLEngineOptions extends DataObjectWrapper<io.vertx.core.net.OpenSSLEngineOptions> { 
    public OpenSSLEngineOptions(Environment env, io.vertx.core.net.OpenSSLEngineOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public OpenSSLEngineOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.OpenSSLEngineOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.OpenSSLEngineOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isSessionCacheEnabled(){ 
        return this.getWrappedObject().isSessionCacheEnabled();
    }

    @Signature
    public OpenSSLEngineOptions setSessionCacheEnabled(boolean sessionCacheEnabled){ 
        this.getWrappedObject().setSessionCacheEnabled(sessionCacheEnabled);
        return this;
    }
}
