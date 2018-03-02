package io.vertx.php.core.http;

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
@Name("io\\vertx\\php\\core\\http\\GoAway")
public class GoAway extends BaseWrapper<io.vertx.core.http.GoAway> { 
    public GoAway(Environment env, io.vertx.core.http.GoAway wrappedObject) {
        super(env, wrappedObject);
    }

    public GoAway(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof GoAway) {
            io.vertx.core.http.GoAway value = ((GoAway) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.http.GoAway(value);
        } else {
            this.__wrappedObject = new io.vertx.core.http.GoAway(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.http.GoAway getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public Buffer getDebugData(){ 
        return new Buffer(__env__, this.getWrappedObject().getDebugData());
    }
    
    @Signature
    public GoAway setDebugData(Buffer debugData){ 
        this.getWrappedObject().setDebugData(debugData.getWrappedObject());
        return this;
    }
    
    @Signature
    public long getErrorCode(){ 
        return this.getWrappedObject().getErrorCode();
    }
    
    @Signature
    public GoAway setErrorCode(long errorCode){ 
        this.getWrappedObject().setErrorCode(errorCode);
        return this;
    }
    
    @Signature
    public int getLastStreamId(){ 
        return this.getWrappedObject().getLastStreamId();
    }
    
    @Signature
    public GoAway setLastStreamId(int lastStreamId){ 
        this.getWrappedObject().setLastStreamId(lastStreamId);
        return this;
    }
    
}
