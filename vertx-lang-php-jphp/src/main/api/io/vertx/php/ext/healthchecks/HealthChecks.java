package io.vertx.php.ext.healthchecks;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
@Name("HealthChecks")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
public interface HealthChecks<S extends io.vertx.ext.healthchecks.HealthChecks> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthChecksImpl::new, io.vertx.ext.healthchecks.HealthChecks.create(vertx)
    }

    @Signature
    default Memory register(Environment __env__, Memory... args) {
        this.getWrappedObject().register(name, procedure)
    }

    @Signature
    default Memory unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister(name)
    }

    @Signature
    default Memory invoke(Environment __env__, Memory... args) {
        this.getWrappedObject().invoke(resultHandler)
    }

}
