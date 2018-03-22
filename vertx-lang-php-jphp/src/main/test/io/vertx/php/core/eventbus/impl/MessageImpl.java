package io.vertx.php.core.eventbus.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.eventbus.Message;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MessageImpl")
@Namespace("io\\vertx\\php\\core\\eventbus\\impl")
public class MessageImpl<T> extends VertxGenWrapper<io.vertx.core.eventbus.Message<T>> implements Message<io.vertx.core.eventbus.Message<T>, T>{
    
    public MessageImpl(Environment env, io.vertx.core.eventbus.Message<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void reply(Environment __env__, Memory... args) {
        this.getWrappedObject().reply(message)
    }

    @Signature
    public void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(failureCode, message)
    }

}
