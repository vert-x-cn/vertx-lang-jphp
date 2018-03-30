package io.vertx.php.core.eventbus;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("DeliveryOptions")
@Namespace("io\\vertx\\php\\core\\eventbus")
//false
public  class DeliveryOptions extends DataObjectWrapper<io.vertx.core.eventbus.DeliveryOptions> { 
    public DeliveryOptions(Environment env, io.vertx.core.eventbus.DeliveryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DeliveryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.eventbus.DeliveryOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.eventbus.DeliveryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
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
