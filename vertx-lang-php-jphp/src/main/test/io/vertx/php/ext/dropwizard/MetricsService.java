package io.vertx.php.ext.dropwizard;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.Vertx;
@Name("MetricsService")
@Namespace("io\\vertx\\php\\ext\\dropwizard")
public interface MetricsService<S extends io.vertx.ext.dropwizard.MetricsService> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MetricsServiceImpl::new, io.vertx.ext.dropwizard.MetricsService.create(vertx)
    }

    @Signature
    default Memory getBaseName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBaseName(measured)
    }
    
    @Signature
    default Memory metricsNames(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().metricsNames()
    }

    @Signature
    default Memory getMetricsSnapshot(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMetricsSnapshot(measured)
    }

}
