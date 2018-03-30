package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Frames")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class Frames extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.Frames>{
    
    private Frames(Environment env, io.vertx.ext.stomp.Frames wrappedObject){
        super(env, wrappedObject);
    }
    public static  Frames __create(Environment env, io.vertx.ext.stomp.Frames wrappedObject){
        return new Frames(env, wrappedObject);
    }

    @Signature
    public static Memory createErrorFrame(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, Frame::new, io.vertx.ext.stomp.Frames.createErrorFrame(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createReceiptFrame(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, Frame::new, io.vertx.ext.stomp.Frames.createReceiptFrame(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void handleReceipt(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg1)) {
            io.vertx.ext.stomp.Frames.handleReceipt(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0), Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory ping(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, Frame::new, io.vertx.ext.stomp.Frames.ping());
    }/*1*/

}
