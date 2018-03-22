package io.vertx.php.ext.healthchecks;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.healthchecks.HealthChecks;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.core.Future;
import io.vertx.php.ext.auth.AuthProvider;
@Name("HealthCheckHandler")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
public interface HealthCheckHandler<S extends io.vertx.ext.healthchecks.HealthCheckHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthCheckHandlerImpl::new, io.vertx.ext.healthchecks.HealthCheckHandler.create(vertx)
    }

    @Signature
    static Memory createWithHealthChecks(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HealthCheckHandlerImpl::new, io.vertx.ext.healthchecks.HealthCheckHandler.createWithHealthChecks(hc)
    }

    @Signature
    default Memory register(Environment __env__, Memory... args) {
        this.getWrappedObject().register(name, procedure)
    }

    @Signature
    default Memory unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister(name)
    }

}
