package io.vertx.php.mqtt.messages;
import io.netty.handler.codec.mqtt.MqttQoS;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MqttPublishMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
@SuppressWarnings("ALL")
public class MqttPublishMessage extends VertxGenVariable0Wrapper<io.vertx.mqtt.messages.MqttPublishMessage>{
    
    private MqttPublishMessage(Environment env, io.vertx.mqtt.messages.MqttPublishMessage wrappedObject){
        super(env, wrappedObject);
    }
    public static  MqttPublishMessage __create(Environment env, io.vertx.mqtt.messages.MqttPublishMessage wrappedObject){
        return new MqttPublishMessage(env, wrappedObject);
    }

    @Signature
    public Memory messageId(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().messageId());
    }/*1*/

    @Signature
    public Memory qosLevel(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().qosLevel());
    }/*1*/

    @Signature
    public Memory isDup(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isDup());
    }/*1*/

    @Signature
    public Memory isRetain(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isRetain());
    }/*1*/

    @Signature
    public Memory topicName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().topicName());
    }/*1*/

    @Signature
    public Memory payload(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().payload());
    }/*1*/

}
