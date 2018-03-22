package io.vertx.php.ext.unit.collect.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.collect.EventBusCollector;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("EventBusCollectorImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\collect\\impl")
public class EventBusCollectorImpl extends VertxGenWrapper<io.vertx.ext.unit.collect.EventBusCollector> implements EventBusCollector<io.vertx.ext.unit.collect.EventBusCollector>{
    
    public EventBusCollectorImpl(Environment env, io.vertx.ext.unit.collect.EventBusCollector wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusCollectorImpl::new, io.vertx.ext.unit.collect.EventBusCollector.create(vertx, options)
    }

    @Signature
    public Memory register(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().register(address)
    }

}
