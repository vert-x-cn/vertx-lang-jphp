package io.vertx.php.core.metrics;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MetricsOptions")
@Namespace("io\\vertx\\php\\core\\metrics")
//false
public  class MetricsOptions extends DataObjectWrapper<io.vertx.core.metrics.MetricsOptions> { 
    public MetricsOptions(Environment env, io.vertx.core.metrics.MetricsOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public MetricsOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.metrics.MetricsOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.metrics.MetricsOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
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
