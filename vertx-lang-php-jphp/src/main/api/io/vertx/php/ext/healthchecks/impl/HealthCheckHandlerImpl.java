package io.vertx.php.ext.healthchecks.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.healthchecks.HealthCheckHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HealthCheckHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\healthchecks\\impl")
public class HealthCheckHandlerImpl extends VertxGenWrapper<io.vertx.ext.healthchecks.HealthCheckHandler> implements HealthCheckHandler<io.vertx.ext.healthchecks.HealthCheckHandler>{
    
    public HealthCheckHandlerImpl(Environment env, io.vertx.ext.healthchecks.HealthCheckHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthCheckHandlerImpl::new, io.vertx.ext.healthchecks.HealthCheckHandler.create(vertx)
    }

    @Signature
    public static Memory createWithHealthChecks(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthCheckHandlerImpl::new, io.vertx.ext.healthchecks.HealthCheckHandler.createWithHealthChecks(hc)
    }

    @Signature
    public Memory register(Environment __env__, Memory... args) {
        this.getWrappedObject().register(name, procedure)
    }

    @Signature
    public Memory unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister(name)
    }

}
