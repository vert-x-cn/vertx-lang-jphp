package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("OpenSSLEngineOptions")
@Namespace("io\\vertx\\php\\core\\net")
public class OpenSSLEngineOptions extends BaseWrapper<io.vertx.core.net.OpenSSLEngineOptions> { 
    public OpenSSLEngineOptions(Environment env, io.vertx.core.net.OpenSSLEngineOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public OpenSSLEngineOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof OpenSSLEngineOptions) {
            io.vertx.core.net.OpenSSLEngineOptions value = ((OpenSSLEngineOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.OpenSSLEngineOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.OpenSSLEngineOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.OpenSSLEngineOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public boolean isAlpnAvailable(){ 
        return this.getWrappedObject().isAlpnAvailable();
    }
    
    @Signature
    public boolean isAvailable(){ 
        return this.getWrappedObject().isAvailable();
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
