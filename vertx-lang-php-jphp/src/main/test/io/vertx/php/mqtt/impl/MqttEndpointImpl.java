package io.vertx.php.mqtt.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.mqtt.MqttEndpoint;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttEndpointImpl")
@Namespace("io\\vertx\\php\\mqtt\\impl")
public class MqttEndpointImpl extends VertxGenWrapper<io.vertx.mqtt.MqttEndpoint> implements MqttEndpoint<io.vertx.mqtt.MqttEndpoint>{
    
    public MqttEndpointImpl(Environment env, io.vertx.mqtt.MqttEndpoint wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void subscriptionAutoAck(Environment __env__, Memory... args) {
        this.getWrappedObject().subscriptionAutoAck(isSubscriptionAutoAck)
    }

    @Signature
    public Memory publishAutoAck(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAutoAck(isPublishAutoAck)
    }

    @Signature
    public Memory autoKeepAlive(Environment __env__, Memory... args) {
        this.getWrappedObject().autoKeepAlive(isAutoKeepAlive)
    }

    @Signature
    public Memory setClientIdentifier(Environment __env__, Memory... args) {
        this.getWrappedObject().setClientIdentifier(clientIdentifier)
    }

    @Signature
    public Memory disconnectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnectHandler(handler)
    }

    @Signature
    public Memory subscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeHandler(handler)
    }

    @Signature
    public Memory unsubscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeHandler(handler)
    }

    @Signature
    public Memory publishHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishHandler(handler)
    }

    @Signature
    public Memory publishAcknowledgeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAcknowledgeHandler(handler)
    }

    @Signature
    public Memory publishReceivedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReceivedHandler(handler)
    }

    @Signature
    public Memory publishReleaseHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReleaseHandler(handler)
    }

    @Signature
    public Memory publishCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishCompletionHandler(handler)
    }

    @Signature
    public Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory accept(Environment __env__, Memory... args) {
        this.getWrappedObject().accept(sessionPresent)
    }

    @Signature
    public Memory reject(Environment __env__, Memory... args) {
        this.getWrappedObject().reject(returnCode)
    }

    @Signature
    public Memory subscribeAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeAcknowledge(subscribeMessageId, grantedQoSLevels)
    }

    @Signature
    public Memory unsubscribeAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeAcknowledge(unsubscribeMessageId)
    }

    @Signature
    public Memory publishAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAcknowledge(publishMessageId)
    }

    @Signature
    public Memory publishReceived(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReceived(publishMessageId)
    }

    @Signature
    public Memory publishRelease(Environment __env__, Memory... args) {
        this.getWrappedObject().publishRelease(publishMessageId)
    }

    @Signature
    public Memory publishComplete(Environment __env__, Memory... args) {
        this.getWrappedObject().publishComplete(publishMessageId)
    }

    @Signature
    public Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(topic, payload, qosLevel, isDup, isRetain)
    }

}
