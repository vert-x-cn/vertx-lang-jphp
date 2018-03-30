package io.vertx.php.core.eventbus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.eventbus.Message;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SendContext")
@Namespace("io\\vertx\\php\\core\\eventbus")
@SuppressWarnings("ALL")
public class SendContext<T> extends VertxGenVariable1Wrapper<io.vertx.core.eventbus.SendContext<T>,T>{
    
    private SendContext(Environment env, io.vertx.core.eventbus.SendContext<T> wrappedObject, TypeConverter<T> sendContextVariableTConverter){
        super(env, wrappedObject, sendContextVariableTConverter);
    }
    public static <T> SendContext<T> __create(Environment env, io.vertx.core.eventbus.SendContext<T> wrappedObject, TypeConverter<T> sendContextVariableTConverter){
        return new SendContext<>(env, wrappedObject, sendContextVariableTConverter);
    }

    public static SendContext<Object> __create(Environment env, io.vertx.core.eventbus.SendContext<Object> wrappedObject) {
        return new SendContext<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getSendContextVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setSendContextVariableTConverter(TypeConverter<T> sendContextVariableTConverter) {
        this.setTypeConverter1(sendContextVariableTConverter);
    }

    @Signature
    public Memory message(Environment __ENV__) {
        return Utils.<io.vertx.core.eventbus.Message<T>, Message<T>, T>convReturnVertxGenVariable1(__ENV__, Message.class, Message::__create, getSendContextVariableTConverter(), this.getWrappedObject().message());
    }/*1*/

    @Signature
    public void next(Environment __ENV__) {
        this.getWrappedObject().next();
    }/*1*/

    @Signature
    public Memory send(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().send());
    }/*1*/

    @Signature
    public Memory sentBody(Environment __ENV__) {
        return Utils.convReturnObject(__ENV__, this.getWrappedObject().sentBody());
    }/*1*/

}
