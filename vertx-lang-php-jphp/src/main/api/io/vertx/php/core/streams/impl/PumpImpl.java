package io.vertx.php.core.streams.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.streams.Pump;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("PumpImpl")
@Namespace("io\\vertx\\php\\core\\streams\\impl")
public class PumpImpl extends VertxGenWrapper<io.vertx.core.streams.Pump> implements Pump<io.vertx.core.streams.Pump>{
    
    public PumpImpl(Environment env, io.vertx.core.streams.Pump wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory pump(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PumpImpl::new, io.vertx.core.streams.Pump.pump(rs, ws)
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

}
