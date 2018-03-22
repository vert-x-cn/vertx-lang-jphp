package io.vertx.php.core;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.Future;
@Name("WorkerExecutor")
@Namespace("io\\vertx\\php\\core")
public interface WorkerExecutor<S extends io.vertx.core.WorkerExecutor> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

    @Signature
    default void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
