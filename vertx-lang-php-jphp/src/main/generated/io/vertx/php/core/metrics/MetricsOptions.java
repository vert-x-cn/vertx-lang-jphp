package io.vertx.php.core.metrics;

import io.vertx.core.json.JsonObject;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MetricsOptions")
@Namespace("io\\vertx\\php\\core\\metrics")
public class MetricsOptions extends BaseWrapper<io.vertx.core.metrics.MetricsOptions> { 
    public MetricsOptions(Environment env, io.vertx.core.metrics.MetricsOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public MetricsOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof MetricsOptions) {
            io.vertx.core.metrics.MetricsOptions value = ((MetricsOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.metrics.MetricsOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.metrics.MetricsOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.metrics.MetricsOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public boolean isEnabled(){ 
        return this.getWrappedObject().isEnabled();
    }
    
    @Signature
    public MetricsOptions setEnabled(boolean enabled){ 
        this.getWrappedObject().setEnabled(enabled);
        return this;
    }
    
}
