package io.vertx.php.ext.dropwizard.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.dropwizard.MetricsService;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MetricsServiceImpl")
@Namespace("io\\vertx\\php\\ext\\dropwizard\\impl")
public class MetricsServiceImpl extends VertxGenWrapper<io.vertx.ext.dropwizard.MetricsService> implements MetricsService<io.vertx.ext.dropwizard.MetricsService>{
    
    public MetricsServiceImpl(Environment env, io.vertx.ext.dropwizard.MetricsService wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MetricsServiceImpl::new, io.vertx.ext.dropwizard.MetricsService.create(vertx)
    }

    @Signature
    public Memory getBaseName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBaseName(measured)
    }

    @Signature
    public Memory getMetricsSnapshot(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMetricsSnapshot(measured)
    }

}
