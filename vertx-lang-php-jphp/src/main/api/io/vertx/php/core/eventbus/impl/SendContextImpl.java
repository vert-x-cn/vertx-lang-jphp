package io.vertx.php.core.eventbus.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.eventbus.SendContext;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SendContextImpl")
@Namespace("io\\vertx\\php\\core\\eventbus\\impl")
public class SendContextImpl<T> extends VertxGenWrapper<io.vertx.core.eventbus.SendContext<T>> implements SendContext<io.vertx.core.eventbus.SendContext<T>, T>{
    
    public SendContextImpl(Environment env, io.vertx.core.eventbus.SendContext<T> wrappedObject){
        super(env, wrappedObject);
    }

}
