package io.vertx.php.mqtt;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.mqtt.messages.MqttUnsubscribeMessage;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.mqtt.messages.MqttSubscribeMessage;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.core.net.SocketAddress;
@Name("MqttEndpoint")
@Namespace("io\\vertx\\php\\mqtt")
public interface MqttEndpoint<S extends io.vertx.mqtt.MqttEndpoint> extends IWrapper<S>{
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory remoteAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().remoteAddress()
    }
    
    @Signature
    default Memory localAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().localAddress()
    }
    
    @Signature
    default Memory clientIdentifier(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().clientIdentifier()
    }
    
    @Signature
    default Memory auth(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().auth()
    }
    
    @Signature
    default Memory will(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().will()
    }
    
    @Signature
    default Memory protocolVersion(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().protocolVersion()
    }
    
    @Signature
    default Memory protocolName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().protocolName()
    }
    
    @Signature
    default Memory isCleanSession(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isCleanSession()
    }
    
    @Signature
    default Memory keepAliveTimeSeconds(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().keepAliveTimeSeconds()
    }
    
    @Signature
    default Memory lastMessageId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastMessageId()
    }

    @Signature
    default void subscriptionAutoAck(Environment __env__, Memory... args) {
        this.getWrappedObject().subscriptionAutoAck(isSubscriptionAutoAck)
    }
    
    @Signature
    default Memory isSubscriptionAutoAck(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSubscriptionAutoAck()
    }

    @Signature
    default Memory publishAutoAck(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAutoAck(isPublishAutoAck)
    }
    
    @Signature
    default Memory isPublishAutoAck(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isPublishAutoAck()
    }

    @Signature
    default Memory autoKeepAlive(Environment __env__, Memory... args) {
        this.getWrappedObject().autoKeepAlive(isAutoKeepAlive)
    }
    
    @Signature
    default Memory isAutoKeepAlive(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isAutoKeepAlive()
    }
    
    @Signature
    default Memory isConnected(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isConnected()
    }

    @Signature
    default Memory setClientIdentifier(Environment __env__, Memory... args) {
        this.getWrappedObject().setClientIdentifier(clientIdentifier)
    }

    @Signature
    default Memory disconnectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().disconnectHandler(handler)
    }

    @Signature
    default Memory subscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeHandler(handler)
    }

    @Signature
    default Memory unsubscribeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeHandler(handler)
    }

    @Signature
    default Memory publishHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishHandler(handler)
    }

    @Signature
    default Memory publishAcknowledgeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAcknowledgeHandler(handler)
    }

    @Signature
    default Memory publishReceivedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReceivedHandler(handler)
    }

    @Signature
    default Memory publishReleaseHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReleaseHandler(handler)
    }

    @Signature
    default Memory publishCompletionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().publishCompletionHandler(handler)
    }

    @Signature
    default Memory pingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pingHandler(handler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory accept(Environment __env__, Memory... args) {
        this.getWrappedObject().accept(sessionPresent)
    }

    @Signature
    default Memory reject(Environment __env__, Memory... args) {
        this.getWrappedObject().reject(returnCode)
    }

    @Signature
    default Memory subscribeAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribeAcknowledge(subscribeMessageId, grantedQoSLevels)
    }

    @Signature
    default Memory unsubscribeAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribeAcknowledge(unsubscribeMessageId)
    }

    @Signature
    default Memory publishAcknowledge(Environment __env__, Memory... args) {
        this.getWrappedObject().publishAcknowledge(publishMessageId)
    }

    @Signature
    default Memory publishReceived(Environment __env__, Memory... args) {
        this.getWrappedObject().publishReceived(publishMessageId)
    }

    @Signature
    default Memory publishRelease(Environment __env__, Memory... args) {
        this.getWrappedObject().publishRelease(publishMessageId)
    }

    @Signature
    default Memory publishComplete(Environment __env__, Memory... args) {
        this.getWrappedObject().publishComplete(publishMessageId)
    }

    @Signature
    default Memory publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(topic, payload, qosLevel, isDup, isRetain)
    }
    
    @Signature
    default Memory pong(Environment __env__, Memory... args) {
        this.getWrappedObject().pong()
    }

}
