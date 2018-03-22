package io.vertx.php.ext.consul.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.consul.WatchResult;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WatchResultImpl")
@Namespace("io\\vertx\\php\\ext\\consul\\impl")
public class WatchResultImpl<T> extends VertxGenWrapper<io.vertx.ext.consul.WatchResult<T>> implements WatchResult<io.vertx.ext.consul.WatchResult<T>, T>{
    
    public WatchResultImpl(Environment env, io.vertx.ext.consul.WatchResult<T> wrappedObject){
        super(env, wrappedObject);
    }

}
