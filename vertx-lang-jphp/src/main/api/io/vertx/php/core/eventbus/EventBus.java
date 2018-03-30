package io.vertx.php.core.eventbus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("EventBus")
@Namespace("io\\vertx\\php\\core\\eventbus")
@SuppressWarnings("ALL")
public class EventBus extends VertxGenVariable0Wrapper<io.vertx.core.eventbus.EventBus>{
    
    private EventBus(Environment env, io.vertx.core.eventbus.EventBus wrappedObject){
        super(env, wrappedObject);
    }
    public static  EventBus __create(Environment env, io.vertx.core.eventbus.EventBus wrappedObject){
        return new EventBus(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publish(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().publish(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory publish(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2)) {
            this.getWrappedObject().publish(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory consumer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().consumer(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory consumer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().consumer(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory localConsumer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().localConsumer(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory localConsumer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().localConsumer(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sender(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<Object>, MessageProducer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().sender(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory sender(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<Object>, MessageProducer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().sender(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory publisher(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<Object>, MessageProducer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().publisher(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory publisher(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<Object>, MessageProducer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().publisher(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addInterceptor(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.EventBus, EventBus>convReturnVertxGenVariable0(__ENV__, EventBus.class, EventBus::__create, this.getWrappedObject().addInterceptor(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.SendContext, SendContext>create0(SendContext.class, SendContext::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeInterceptor(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.EventBus, EventBus>convReturnVertxGenVariable0(__ENV__, EventBus.class, EventBus::__create, this.getWrappedObject().removeInterceptor(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.SendContext, SendContext>create0(SendContext.class, SendContext::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
