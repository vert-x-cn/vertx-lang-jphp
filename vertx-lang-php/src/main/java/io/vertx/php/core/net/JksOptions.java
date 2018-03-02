package io.vertx.php.core.net;

//7
import com.google.gson.JsonElement;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\net\\JksOptions")
public class JksOptions extends BaseWrapper<io.vertx.core.net.JksOptions> { 
    public JksOptions(Environment env, io.vertx.core.net.JksOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JksOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof JksOptions) {
            io.vertx.core.net.JksOptions value = ((JksOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.JksOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.JksOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.JksOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }
    
    @Signature
    public JksOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }
    
    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }
    
    @Signature
    public JksOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }
    
    @Signature
    public Buffer getValue(){ 
        return new Buffer(__env__, this.getWrappedObject().getValue());
    }
    
    @Signature
    public JksOptions setValue(Buffer value){ 
        this.getWrappedObject().setValue(value.getWrappedObject());
        return this;
    }
    
}
