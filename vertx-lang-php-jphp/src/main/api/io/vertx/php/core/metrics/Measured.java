package io.vertx.php.core.metrics;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Measured")
@Namespace("io\\vertx\\php\\core\\metrics")
public interface Measured<S extends io.vertx.core.metrics.Measured> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

}
