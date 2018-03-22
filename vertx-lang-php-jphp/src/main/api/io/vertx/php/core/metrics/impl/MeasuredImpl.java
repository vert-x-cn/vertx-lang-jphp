package io.vertx.php.core.metrics.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.metrics.Measured;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MeasuredImpl")
@Namespace("io\\vertx\\php\\core\\metrics\\impl")
public class MeasuredImpl extends VertxGenWrapper<io.vertx.core.metrics.Measured> implements Measured<io.vertx.core.metrics.Measured>{
    
    public MeasuredImpl(Environment env, io.vertx.core.metrics.Measured wrappedObject){
        super(env, wrappedObject);
    }

}
