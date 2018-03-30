package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.stomp.StompServer;
import io.vertx.php.ext.stomp.StompServerHandler;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServerConnection")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class StompServerConnection extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.StompServerConnection>{
    
    private StompServerConnection(Environment env, io.vertx.ext.stomp.StompServerConnection wrappedObject){
        super(env, wrappedObject);
    }
    public static  StompServerConnection __create(Environment env, io.vertx.ext.stomp.StompServerConnection wrappedObject){
        return new StompServerConnection(env, wrappedObject);
    }

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0)) {
            this.getWrappedObject().write(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().write(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory server(Environment __ENV__) {
        return Utils.<io.vertx.ext.stomp.StompServer, StompServer>convReturnVertxGenVariable0(__ENV__, StompServer.class, StompServer::__create, this.getWrappedObject().server());
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__) {
        return Utils.<io.vertx.ext.stomp.StompServerHandler, StompServerHandler>convReturnVertxGenVariable0(__ENV__, StompServerHandler.class, StompServerHandler::__create, this.getWrappedObject().handler());
    }/*1*/

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public void ping(Environment __ENV__) {
        this.getWrappedObject().ping();
    }/*1*/

    @Signature
    public void onServerActivity(Environment __ENV__) {
        this.getWrappedObject().onServerActivity();
    }/*1*/

    @Signature
    public void configureHeartbeat(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().configureHeartbeat(Utils.convParamLong(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServerConnection, StompServerConnection>create0(StompServerConnection.class, StompServerConnection::__create), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
