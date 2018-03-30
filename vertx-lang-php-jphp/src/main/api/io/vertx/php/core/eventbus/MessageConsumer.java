package io.vertx.php.core.eventbus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.eventbus.Message;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MessageConsumer")
@Namespace("io\\vertx\\php\\core\\eventbus")
@SuppressWarnings("ALL")
public class MessageConsumer<T> extends VertxGenVariable1Wrapper<io.vertx.core.eventbus.MessageConsumer<T>,T>{
    
    private MessageConsumer(Environment env, io.vertx.core.eventbus.MessageConsumer<T> wrappedObject, TypeConverter<T> messageConsumerVariableTConverter){
        super(env, wrappedObject, messageConsumerVariableTConverter);
    }
    public static <T> MessageConsumer<T> __create(Environment env, io.vertx.core.eventbus.MessageConsumer<T> wrappedObject, TypeConverter<T> messageConsumerVariableTConverter){
        return new MessageConsumer<>(env, wrappedObject, messageConsumerVariableTConverter);
    }

    public static MessageConsumer<Object> __create(Environment env, io.vertx.core.eventbus.MessageConsumer<Object> wrappedObject) {
        return new MessageConsumer<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getMessageConsumerVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setMessageConsumerVariableTConverter(TypeConverter<T> messageConsumerVariableTConverter) {
        this.setTypeConverter1(messageConsumerVariableTConverter);
    }

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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.Message<T>, Message<T>, T>create1(Message.class, Message::__create, getMessageConsumerVariableTConverter()), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bodyStream(Environment __ENV__) {
        return Utils.<io.vertx.core.streams.ReadStream<T>, ReadStream<T>, T>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, getMessageConsumerVariableTConverter(), this.getWrappedObject().bodyStream());
    }/*1*/

    @Signature
    public Memory isRegistered(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isRegistered());
    }/*1*/

    @Signature
    public Memory address(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().address());
    }/*1*/

    @Signature
    public Memory setMaxBufferedMessages(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<T>, MessageConsumer<T>, T>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, getMessageConsumerVariableTConverter(), this.getWrappedObject().setMaxBufferedMessages(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getMaxBufferedMessages(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().getMaxBufferedMessages());
    }/*1*/

    @Signature
    public void completionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().completionHandler(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void unregister(Environment __ENV__) {
        this.getWrappedObject().unregister();
    }/*4*/

    @Signature
    public void unregister(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unregister(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
