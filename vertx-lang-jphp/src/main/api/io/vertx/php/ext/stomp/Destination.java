package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Destination")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class Destination extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.Destination>{
    
    private Destination(Environment env, io.vertx.ext.stomp.Destination wrappedObject){
        super(env, wrappedObject);
    }
    public static  Destination __create(Environment env, io.vertx.ext.stomp.Destination wrappedObject){
        return new Destination(env, wrappedObject);
    }

    @Signature
    public static Memory topic(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, io.vertx.ext.stomp.Destination.topic(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory queue(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, io.vertx.ext.stomp.Destination.queue(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory bridge(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.BridgeOptions.class, arg1)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, io.vertx.ext.stomp.Destination.bridge(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.BridgeOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory destination(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().destination());
    }/*1*/

    @Signature
    public Memory dispatch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)) {
            this.getWrappedObject().dispatch(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)) {
            this.getWrappedObject().subscribe(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().unsubscribe(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribeConnection(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0)) {
            this.getWrappedObject().unsubscribeConnection(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ack(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().ack(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory nack(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().nack(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSubscriptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().getSubscriptions(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory numberOfSubscriptions(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().numberOfSubscriptions());
    }/*1*/

    @Signature
    public Memory matches(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().matches(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
