package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.MessageSource;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MessageSourceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class MessageSourceImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.MessageSource> implements MessageSource<io.vertx.servicediscovery.types.MessageSource>{
    
    public MessageSourceImpl(Environment env, io.vertx.servicediscovery.types.MessageSource wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.MessageSource.createRecord(name, address)
    }

    @Signature
    public static void getConsumer(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.MessageSource.getConsumer(discovery, filter, resultHandler)
    }

}
