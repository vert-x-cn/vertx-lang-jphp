package io.vertx.php.core.eventbus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MessageProducer")
@Namespace("io\\vertx\\php\\core\\eventbus")
@SuppressWarnings("ALL")
public class MessageProducer<T> extends VertxGenVariable1Wrapper<io.vertx.core.eventbus.MessageProducer<T>,T>{
    
    private MessageProducer(Environment env, io.vertx.core.eventbus.MessageProducer<T> wrappedObject, TypeConverter<T> messageProducerVariableTConverter){
        super(env, wrappedObject, messageProducerVariableTConverter);
    }
    public static <T> MessageProducer<T> __create(Environment env, io.vertx.core.eventbus.MessageProducer<T> wrappedObject, TypeConverter<T> messageProducerVariableTConverter){
        return new MessageProducer<>(env, wrappedObject, messageProducerVariableTConverter);
    }

    public static MessageProducer<Object> __create(Environment env, io.vertx.core.eventbus.MessageProducer<Object> wrappedObject) {
        return new MessageProducer<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getMessageProducerVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setMessageProducerVariableTConverter(TypeConverter<T> messageProducerVariableTConverter) {
        this.setTypeConverter1(messageProducerVariableTConverter);
    }

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(getMessageProducerVariableTConverter().accept(__ENV__, arg0)) {
            this.getWrappedObject().end(getMessageProducerVariableTConverter().convParam(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeQueueFull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().writeQueueFull());
    }/*1*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0) {
        if(getMessageProducerVariableTConverter().accept(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<T>, MessageProducer<T>, T>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, getMessageProducerVariableTConverter(), this.getWrappedObject().send(getMessageProducerVariableTConverter().convParam(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getMessageProducerVariableTConverter().accept(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<T>, MessageProducer<T>, T>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, getMessageProducerVariableTConverter(), this.getWrappedObject().send(getMessageProducerVariableTConverter().convParam(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<Object>, Message<Object>, Object>create1(Message.class, Message::__create, TypeConverter.UNKNOWN_TYPE), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(getMessageProducerVariableTConverter().accept(__ENV__, arg0)) {
            this.getWrappedObject().write(getMessageProducerVariableTConverter().convParam(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setWriteQueueMaxSize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setWriteQueueMaxSize(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory drainHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().drainHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deliveryOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg0)) {
            this.getWrappedObject().deliveryOptions(Utils.convParamDataObject(__ENV__, io.vertx.core.eventbus.DeliveryOptions.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory address(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().address());
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
