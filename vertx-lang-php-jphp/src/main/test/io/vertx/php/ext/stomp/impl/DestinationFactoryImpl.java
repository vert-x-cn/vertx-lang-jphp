package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.DestinationFactory;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DestinationFactoryImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class DestinationFactoryImpl extends VertxGenWrapper<io.vertx.ext.stomp.DestinationFactory> implements DestinationFactory<io.vertx.ext.stomp.DestinationFactory>{
    
    public DestinationFactoryImpl(Environment env, io.vertx.ext.stomp.DestinationFactory wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().create(vertx, name)
    }

}
