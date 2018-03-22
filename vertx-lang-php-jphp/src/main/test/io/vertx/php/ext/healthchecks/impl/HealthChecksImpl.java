package io.vertx.php.ext.healthchecks.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.healthchecks.HealthChecks;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HealthChecksImpl")
@Namespace("io\\vertx\\php\\ext\\healthchecks\\impl")
public class HealthChecksImpl extends VertxGenWrapper<io.vertx.ext.healthchecks.HealthChecks> implements HealthChecks<io.vertx.ext.healthchecks.HealthChecks>{
    
    public HealthChecksImpl(Environment env, io.vertx.ext.healthchecks.HealthChecks wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthChecksImpl::new, io.vertx.ext.healthchecks.HealthChecks.create(vertx)
    }

    @Signature
    public Memory register(Environment __env__, Memory... args) {
        this.getWrappedObject().register(name, procedure)
    }

    @Signature
    public Memory unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister(name)
    }

    @Signature
    public Memory invoke(Environment __env__, Memory... args) {
        this.getWrappedObject().invoke(resultHandler)
    }

}
