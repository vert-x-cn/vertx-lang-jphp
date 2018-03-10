package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.php.core.buffer.Buffer;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PfxOptions")
@Namespace("io\\vertx\\php\\core\\net")
public class PfxOptions extends BaseWrapper<io.vertx.core.net.PfxOptions> { 
    public PfxOptions(Environment env, io.vertx.core.net.PfxOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PfxOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof PfxOptions) {
            io.vertx.core.net.PfxOptions value = ((PfxOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.PfxOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.PfxOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.PfxOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }
    
    @Signature
    public PfxOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }
    
    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }
    
    @Signature
    public PfxOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }
    
    @Signature
    public Buffer getValue(){ 
        return new Buffer(__env__, this.getWrappedObject().getValue());
    }
    
    @Signature
    public PfxOptions setValue(Buffer value){ 
        this.getWrappedObject().setValue(value.getWrappedObject());
        return this;
    }
    
}
