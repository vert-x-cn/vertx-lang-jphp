package io.vertx.php.core.streams.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.streams.StreamBase;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StreamBaseImpl")
@Namespace("io\\vertx\\php\\core\\streams\\impl")
public class StreamBaseImpl extends VertxGenWrapper<io.vertx.core.streams.StreamBase> implements StreamBase<io.vertx.core.streams.StreamBase>{
    
    public StreamBaseImpl(Environment env, io.vertx.core.streams.StreamBase wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
