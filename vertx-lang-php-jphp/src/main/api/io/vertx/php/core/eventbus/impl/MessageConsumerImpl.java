package io.vertx.php.core.eventbus.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MessageConsumerImpl")
@Namespace("io\\vertx\\php\\core\\eventbus\\impl")
public class MessageConsumerImpl<T> extends VertxGenWrapper<io.vertx.core.eventbus.MessageConsumer<T>> implements MessageConsumer<io.vertx.core.eventbus.MessageConsumer<T>, T>{
    
    public MessageConsumerImpl(Environment env, io.vertx.core.eventbus.MessageConsumer<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory setMaxBufferedMessages(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().setMaxBufferedMessages(maxBufferedMessages)
    }

    @Signature
    public void completionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().completionHandler(completionHandler)
    }

    @Signature
    public void unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister()
    }

}
