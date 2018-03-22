package io.vertx.php.mqtt.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.MqttClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttClientImpl")
@Namespace("io\\vertx\\php\\mqtt\\impl")
public class MqttClientImpl extends VertxGenWrapper<io.vertx.mqtt.MqttClient> implements MqttClient<io.vertx.mqtt.MqttClient>{
    
    public MqttClientImpl(Environment env, io.vertx.mqtt.MqttClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MqttClientImpl::new, io.vertx.mqtt.MqttClient.create(vertx)
    }

    @Signature
    public Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(port, host, connectHandler)
    }

    @Signature
    public Memory disconnect(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnect()
    }

    @Signature
    public Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(topic, payload, qosLevel, isDup, isRetain)
    }

    @Signature
    public Memory publishCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishCompletionHandler(publishCompletionHandler)
    }

    @Signature
    public Memory publishHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishHandler(publishHandler)
    }

    @Signature
    public Memory subscribeCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeCompletionHandler(subscribeCompletionHandler)
    }

    @Signature
    public Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(topics)
    }

    @Signature
    public Memory unsubscribeCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeCompletionHandler(unsubscribeCompletionHandler)
    }

    @Signature
    public Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe(topic)
    }

    @Signature
    public Memory pingResponseHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingResponseHandler(pingResponseHandler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(closeHandler)
    }

}
