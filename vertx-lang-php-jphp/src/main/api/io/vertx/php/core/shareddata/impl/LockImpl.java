package io.vertx.php.core.shareddata.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.shareddata.Lock;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("LockImpl")
@Namespace("io\\vertx\\php\\core\\shareddata\\impl")
public class LockImpl extends VertxGenWrapper<io.vertx.core.shareddata.Lock> implements Lock<io.vertx.core.shareddata.Lock>{
    
    public LockImpl(Environment env, io.vertx.core.shareddata.Lock wrappedObject){
        super(env, wrappedObject);
    }

}
