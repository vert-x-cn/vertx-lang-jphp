package io.vertx.php.circuitbreaker;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.RoutingContext;
@Name("HystrixMetricHandler")
@Namespace("io\\vertx\\php\\circuitbreaker")
public interface HystrixMetricHandler<S extends io.vertx.circuitbreaker.HystrixMetricHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HystrixMetricHandlerImpl::new, io.vertx.circuitbreaker.HystrixMetricHandler.create(vertx)
    }

}
