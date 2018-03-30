package io.vertx.php.amqpbridge;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.core.eventbus.MessageProducer;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("AmqpBridge")
@Namespace("io\\vertx\\php\\amqpbridge")
@SuppressWarnings("ALL")
public class AmqpBridge extends VertxGenVariable0Wrapper<io.vertx.amqpbridge.AmqpBridge>{
    
    private AmqpBridge(Environment env, io.vertx.amqpbridge.AmqpBridge wrappedObject){
        super(env, wrappedObject);
    }
    public static  AmqpBridge __create(Environment env, io.vertx.amqpbridge.AmqpBridge wrappedObject){
        return new AmqpBridge(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.amqpbridge.AmqpBridge, AmqpBridge>convReturnVertxGenVariable0(__ENV__, AmqpBridge.class, AmqpBridge::__create, io.vertx.amqpbridge.AmqpBridge.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.amqpbridge.AmqpBridgeOptions.class, arg1)) {
            return Utils.<io.vertx.amqpbridge.AmqpBridge, AmqpBridge>convReturnVertxGenVariable0(__ENV__, AmqpBridge.class, AmqpBridge::__create, io.vertx.amqpbridge.AmqpBridge.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.amqpbridge.AmqpBridgeOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void start(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().start(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.amqpbridge.AmqpBridge, AmqpBridge>create0(AmqpBridge.class, AmqpBridge::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void start(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().start(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.amqpbridge.AmqpBridge, AmqpBridge>create0(AmqpBridge.class, AmqpBridge::__create), arg4));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createConsumer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().createConsumer(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createProducer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageProducer<Object>, MessageProducer<Object>, Object>convReturnVertxGenVariable1(__ENV__, MessageProducer.class, MessageProducer::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().createProducer(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
