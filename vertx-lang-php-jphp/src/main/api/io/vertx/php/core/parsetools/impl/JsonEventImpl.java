package io.vertx.php.core.parsetools.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.parsetools.JsonEvent;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JsonEventImpl")
@Namespace("io\\vertx\\php\\core\\parsetools\\impl")
public class JsonEventImpl extends VertxGenWrapper<io.vertx.core.parsetools.JsonEvent> implements JsonEvent<io.vertx.core.parsetools.JsonEvent>{
    
    public JsonEventImpl(Environment env, io.vertx.core.parsetools.JsonEvent wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory mapTo(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().mapTo(type)
    }

}
