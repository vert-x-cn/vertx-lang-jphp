package io.vertx.php.core.net;

import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\net\\JdkSSLEngineOptions")
public class JdkSSLEngineOptions extends BaseWrapper<io.vertx.core.net.JdkSSLEngineOptions> { 
    public JdkSSLEngineOptions(Environment env, io.vertx.core.net.JdkSSLEngineOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JdkSSLEngineOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof JdkSSLEngineOptions) {
            io.vertx.core.net.JdkSSLEngineOptions value = ((JdkSSLEngineOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.JdkSSLEngineOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.JdkSSLEngineOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.JdkSSLEngineOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public boolean isAlpnAvailable(){ 
        return this.getWrappedObject().isAlpnAvailable();
    }
    
}
