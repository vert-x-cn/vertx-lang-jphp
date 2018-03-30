package io.vertx.php.mqtt;
import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.mqtt.messages.MqttConnAckMessage;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.mqtt.messages.MqttSubAckMessage;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MqttClient")
@Namespace("io\\vertx\\php\\mqtt")
@SuppressWarnings("ALL")
public class MqttClient extends VertxGenVariable0Wrapper<io.vertx.mqtt.MqttClient>{
    
    private MqttClient(Environment env, io.vertx.mqtt.MqttClient wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttClient __create(Environment env, io.vertx.mqtt.MqttClient wrappedObject){
        return new MqttClient(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.mqtt.MqttClient, MqttClient>convReturnVertxGenVariable0(__ENV__, MqttClient.class, MqttClient::__create, io.vertx.mqtt.MqttClient.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.mqtt.MqttClientOptions.class, arg1)) {
            return Utils.<io.vertx.mqtt.MqttClient, MqttClient>convReturnVertxGenVariable0(__ENV__, MqttClient.class, MqttClient::__create, io.vertx.mqtt.MqttClient.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.mqtt.MqttClientOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().connect(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttConnAckMessage, MqttConnAckMessage>create0(MqttConnAckMessage.class, MqttConnAckMessage::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().connect(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttConnAckMessage, MqttConnAckMessage>create0(MqttConnAckMessage.class, MqttConnAckMessage::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory disconnect(Environment __ENV__) {
        this.getWrappedObject().disconnect();
        return toMemory();
    }/*4*/

    @Signature
    public Memory disconnect(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().disconnect(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
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
    public Memory publishCompletionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().publishCompletionHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
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
    public Memory subscribeCompletionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().subscribeCompletionHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.mqtt.messages.MqttSubAckMessage, MqttSubAckMessage>create0(MqttSubAckMessage.class, MqttSubAckMessage::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.INTEGER, arg0)) {
            this.getWrappedObject().subscribe(Utils.convParamMap(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1)) {
            this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.INTEGER, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().subscribe(Utils.convParamMap(__ENV__, TypeConverter.INTEGER, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribeCompletionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribeCompletionHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pingResponseHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pingResponseHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
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
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ping(Environment __ENV__) {
        this.getWrappedObject().ping();
        return toMemory();
    }/*1*/

    @Signature
    public Memory clientId(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().clientId());
    }/*1*/

    @Signature
    public Memory isConnected(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isConnected());
    }/*1*/

}
