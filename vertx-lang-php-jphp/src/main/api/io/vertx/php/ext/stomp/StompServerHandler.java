package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.stomp.Acknowledgement;
import io.vertx.php.ext.stomp.Destination;
import io.vertx.php.ext.stomp.DestinationFactory;
import io.vertx.php.ext.stomp.ServerFrame;
import io.vertx.php.ext.stomp.StompServerConnection;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServerHandler")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class StompServerHandler extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.StompServerHandler>{
    
    private StompServerHandler(Environment env, io.vertx.ext.stomp.StompServerHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  StompServerHandler __create(Environment env, io.vertx.ext.stomp.StompServerHandler wrappedObject){
        return new StompServerHandler(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.ServerFrame.class, ServerFrame.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.ext.stomp.ServerFrame, ServerFrame  >convParamVertxGenVariable0(__ENV__, ServerFrame.class, ServerFrame::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.stomp.StompServerHandler, StompServerHandler>convReturnVertxGenVariable0(__ENV__, StompServerHandler.class, StompServerHandler::__create, io.vertx.ext.stomp.StompServerHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory receivedFrameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().receivedFrameHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connectHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().connectHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory stompHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().stompHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().subscribeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sendHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().sendHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServerConnection, StompServerConnection>create0(StompServerConnection.class, StompServerConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void onClose(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0)) {
            this.getWrappedObject().onClose(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commitHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().commitHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory abortHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().abortHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory beginHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().beginHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory disconnectHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().disconnectHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ackHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().ackHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory nackHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().nackHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory onAuthenticationRequest(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().onAuthenticationRequest(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getUserBySession(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.auth.User, User>convReturnVertxGenVariable0(__ENV__, User.class, User::__create, this.getWrappedObject().getUserBySession(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory authProvider(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            this.getWrappedObject().authProvider(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getDestinations(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.Destination, Destination>create0(Destination.class, Destination::__create),this.getWrappedObject().getDestinations());
    }/*1*/

    @Signature
    public Memory getDestination(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, this.getWrappedObject().getDestination(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory onAck(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2)) {
            this.getWrappedObject().onAck(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1), Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory onNack(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerConnection.class, StompServerConnection.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2)) {
            this.getWrappedObject().onNack(Utils.  <io.vertx.ext.stomp.StompServerConnection, StompServerConnection  >convParamVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg1), Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory onAckHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().onAckHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.Acknowledgement, Acknowledgement>create0(Acknowledgement.class, Acknowledgement::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory onNackHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().onNackHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.Acknowledgement, Acknowledgement>create0(Acknowledgement.class, Acknowledgement::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pingHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pingHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServerConnection, StompServerConnection>create0(StompServerConnection.class, StompServerConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getOrCreateDestination(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, this.getWrappedObject().getOrCreateDestination(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory destinationFactory(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.DestinationFactory.class, DestinationFactory.class, arg0)) {
            this.getWrappedObject().destinationFactory(Utils.  <io.vertx.ext.stomp.DestinationFactory, DestinationFactory  >convParamVertxGenVariable0(__ENV__, DestinationFactory.class, DestinationFactory::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bridge(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.BridgeOptions.class, arg0)) {
            this.getWrappedObject().bridge(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.BridgeOptions.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
