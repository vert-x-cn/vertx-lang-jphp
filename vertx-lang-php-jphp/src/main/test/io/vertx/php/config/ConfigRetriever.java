package io.vertx.php.config;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.Future;
@Name("ConfigRetriever")
@Namespace("io\\vertx\\php\\config")
public interface ConfigRetriever<S extends io.vertx.config.ConfigRetriever> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ConfigRetrieverImpl::new, io.vertx.config.ConfigRetriever.create(vertx)
    }

    @Signature
    static Memory getConfigAsFuture(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.config.ConfigRetriever.getConfigAsFuture(retriever)
    }

    @Signature
    default void getConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().getConfig(completionHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory getCachedConfig(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getCachedConfig()
    }

    @Signature
    default void listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen(listener)
    }
    
    @Signature
    default Memory configStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().configStream()
    }

}
