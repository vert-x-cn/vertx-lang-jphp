package io.vertx.php.mqtt;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.mqtt.MqttEndpoint;
@Name("MqttServer")
@Namespace("io\\vertx\\php\\mqtt")
public interface MqttServer<S extends io.vertx.mqtt.MqttServer> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttServerImpl::new, io.vertx.mqtt.MqttServer.create(vertx)
    }
    
    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    default Memory endpointHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endpointHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }
    
    @Signature
    default Memory actualPort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().actualPort()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
