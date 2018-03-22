package io.vertx.php.mqtt.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.MqttServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttServerImpl")
@Namespace("io\\vertx\\php\\mqtt\\impl")
public class MqttServerImpl extends VertxGenWrapper<io.vertx.mqtt.MqttServer> implements MqttServer<io.vertx.mqtt.MqttServer>{
    
    public MqttServerImpl(Environment env, io.vertx.mqtt.MqttServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttServerImpl::new, io.vertx.mqtt.MqttServer.create(vertx)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public Memory endpointHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endpointHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
