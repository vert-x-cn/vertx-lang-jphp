package io.vertx.php.core.eventbus;

//6
import com.google.gson.JsonElement;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\eventbus\\DeliveryOptions")
public class DeliveryOptions extends BaseWrapper<io.vertx.core.eventbus.DeliveryOptions> { 
    public DeliveryOptions(Environment env, io.vertx.core.eventbus.DeliveryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DeliveryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof DeliveryOptions) {
            io.vertx.core.eventbus.DeliveryOptions value = ((DeliveryOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.eventbus.DeliveryOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.eventbus.DeliveryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.eventbus.DeliveryOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getCodecName(){ 
        return this.getWrappedObject().getCodecName();
    }
    
    @Signature
    public DeliveryOptions setCodecName(String codecName){ 
        this.getWrappedObject().setCodecName(codecName);
        return this;
    }
        
    @Signature
    public DeliveryOptions addHeader(String key, String value){ 
        this.getWrappedObject().addHeader(key, value);
        return this;
    }
        
    @Signature
    public long getSendTimeout(){ 
        return this.getWrappedObject().getSendTimeout();
    }
    
    @Signature
    public DeliveryOptions setSendTimeout(long sendTimeout){ 
        this.getWrappedObject().setSendTimeout(sendTimeout);
        return this;
    }
    
}
