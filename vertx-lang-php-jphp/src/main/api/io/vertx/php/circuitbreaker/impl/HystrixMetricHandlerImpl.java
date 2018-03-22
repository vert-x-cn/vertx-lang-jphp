package io.vertx.php.circuitbreaker.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.circuitbreaker.HystrixMetricHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HystrixMetricHandlerImpl")
@Namespace("io\\vertx\\php\\circuitbreaker\\impl")
public class HystrixMetricHandlerImpl extends VertxGenWrapper<io.vertx.circuitbreaker.HystrixMetricHandler> implements HystrixMetricHandler<io.vertx.circuitbreaker.HystrixMetricHandler>{
    
    public HystrixMetricHandlerImpl(Environment env, io.vertx.circuitbreaker.HystrixMetricHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HystrixMetricHandlerImpl::new, io.vertx.circuitbreaker.HystrixMetricHandler.create(vertx)
    }

}
