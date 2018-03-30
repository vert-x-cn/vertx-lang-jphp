package io.vertx.php.core.eventbus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.MultiMap;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Message")
@Namespace("io\\vertx\\php\\core\\eventbus")
@SuppressWarnings("ALL")
public class Message<T> extends VertxGenVariable1Wrapper<io.vertx.core.eventbus.Message<T>,T>{
    
    private Message(Environment env, io.vertx.core.eventbus.Message<T> wrappedObject, TypeConverter<T> messageVariableTConverter){
        super(env, wrappedObject, messageVariableTConverter);
    }
    public static <T> Message<T> __create(Environment env, io.vertx.core.eventbus.Message<T> wrappedObject, TypeConverter<T> messageVariableTConverter){
        return new Message<>(env, wrappedObject, messageVariableTConverter);
    }

    public static Message<Object> __create(Environment env, io.vertx.core.eventbus.Message<Object> wrappedObject) {
        return new Message<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getMessageVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setMessageVariableTConverter(TypeConverter<T> messageVariableTConverter) {
        this.setTypeConverter1(messageVariableTConverter);
    }

    @Signature
    public Memory address(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().address());
    }/*1*/

    @Signature
    public Memory headers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().headers());
    }/*1*/

    @Signature
    public Memory body(Environment __ENV__) {
        return getMessageVariableTConverter().convReturn(__ENV__, this.getWrappedObject().body());
    }/*1*/

    @Signature
    public Memory replyAddress(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().replyAddress());
    }/*1*/

    @Signature
    public Memory isSend(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSend());
    }/*1*/

    @Signature
    public void reply(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            this.getWrappedObject().reply(Utils.convParamObject(__ENV__, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void reply(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().reply(Utils.convParamObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg1));
        } else if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1)) {
            this.getWrappedObject().reply(Utils.convParamObject(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void reply(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().reply(Utils.convParamObject(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void fail(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().fail(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
