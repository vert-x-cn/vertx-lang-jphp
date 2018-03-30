package io.vertx.php.mqtt;
import io.netty.handler.codec.mqtt.MqttConnectReturnCode;
import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.EnumConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.mqtt.messages.MqttSubscribeMessage;
import io.vertx.php.mqtt.messages.MqttUnsubscribeMessage;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttEndpoint")
@Namespace("io\\vertx\\php\\mqtt")
@SuppressWarnings("ALL")
public class MqttEndpoint extends VertxGenVariable0Wrapper<io.vertx.mqtt.MqttEndpoint>{
    
    private MqttEndpoint(Environment env, io.vertx.mqtt.MqttEndpoint wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttEndpoint __create(Environment env, io.vertx.mqtt.MqttEndpoint wrappedObject){
        return new MqttEndpoint(env, wrappedObject);
    }

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public Memory remoteAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().remoteAddress());
    }/*1*/

    @Signature
    public Memory localAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().localAddress());
    }/*1*/

    @Signature
    public Memory clientIdentifier(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().clientIdentifier());
    }/*1*/

    @Signature
    public Memory auth(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.mqtt.MqttAuth.class, MqttAuth::new, this.getWrappedObject().auth());
    }/*1*/

    @Signature
    public Memory will(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.mqtt.MqttWill.class, MqttWill::new, this.getWrappedObject().will());
    }/*1*/

    @Signature
    public Memory protocolVersion(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().protocolVersion());
    }/*1*/

    @Signature
    public Memory protocolName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().protocolName());
    }/*1*/

    @Signature
    public Memory isCleanSession(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isCleanSession());
    }/*1*/

    @Signature
    public Memory keepAliveTimeSeconds(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().keepAliveTimeSeconds());
    }/*1*/

    @Signature
    public Memory lastMessageId(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().lastMessageId());
    }/*1*/

    @Signature
    public void subscriptionAutoAck(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().subscriptionAutoAck(Utils.convParamBoolean(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isSubscriptionAutoAck(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSubscriptionAutoAck());
    }/*1*/

    @Signature
    public Memory publishAutoAck(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().publishAutoAck(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isPublishAutoAck(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isPublishAutoAck());
    }/*1*/

    @Signature
    public Memory autoKeepAlive(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().autoKeepAlive(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isAutoKeepAlive(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isAutoKeepAlive());
    }/*1*/

    @Signature
    public Memory isConnected(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isConnected());
    }/*1*/

    @Signature
    public Memory setClientIdentifier(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setClientIdentifier(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory disconnectHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().disconnectHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().subscribeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttSubscribeMessage, MqttSubscribeMessage>create0(MqttSubscribeMessage.class, MqttSubscribeMessage::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttUnsubscribeMessage, MqttUnsubscribeMessage>create0(MqttUnsubscribeMessage.class, MqttUnsubscribeMessage::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttPublishMessage, MqttPublishMessage>create0(MqttPublishMessage.class, MqttPublishMessage::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishAcknowledgeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishAcknowledgeHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishReceivedHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishReceivedHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishReleaseHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishReleaseHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishCompletionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishCompletionHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pingHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pingHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory accept(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().accept(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory reject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, MqttConnectReturnCode.class, arg0)) {
            this.getWrappedObject().reject(Utils.convParamEnum(__ENV__, MqttConnectReturnCode.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribeAcknowledge(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, EnumConverter.create(MqttQoS.class), arg1)) {
            this.getWrappedObject().subscribeAcknowledge(Utils.convParamInteger(__ENV__, arg0), Utils.convParamList(__ENV__, EnumConverter.create(MqttQoS.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribeAcknowledge(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribeAcknowledge(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishAcknowledge(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().publishAcknowledge(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishReceived(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().publishReceived(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishRelease(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().publishRelease(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publishComplete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().publishComplete(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publish(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, MqttQoS.class, arg2) && Utils.isNotNull(arg3) && Utils.isBoolean(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isBoolean(__ENV__, arg4)) {
            this.getWrappedObject().publish(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamEnum(__ENV__, MqttQoS.class, arg2), Utils.convParamBoolean(__ENV__, arg3), Utils.convParamBoolean(__ENV__, arg4));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory publish(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, MqttQoS.class, arg2) && Utils.isNotNull(arg3) && Utils.isBoolean(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isBoolean(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().publish(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamEnum(__ENV__, MqttQoS.class, arg2), Utils.convParamBoolean(__ENV__, arg3), Utils.convParamBoolean(__ENV__, arg4), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pong(Environment __ENV__) {
        this.getWrappedObject().pong();
        return toMemory();
    }/*1*/

}
