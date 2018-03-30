package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("StompClientConnection")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class StompClientConnection extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.StompClientConnection>{
    
    private StompClientConnection(Environment env, io.vertx.ext.stomp.StompClientConnection wrappedObject){
        super(env, wrappedObject);
    }
    public static  StompClientConnection __create(Environment env, io.vertx.ext.stomp.StompClientConnection wrappedObject){
        return new StompClientConnection(env, wrappedObject);
    }

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public Memory version(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().version());
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public Memory server(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().server());
    }/*1*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0)) {
            this.getWrappedObject().send(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1)) {
            this.getWrappedObject().send(Utils.convParamMap(__ENV__, TypeConverter.STRING, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().send(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().send(Utils.convParamMap(__ENV__, TypeConverter.STRING, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg2)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg2), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory subscribe(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().subscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory unsubscribe(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().unsubscribe(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory errorHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().errorHandler(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompClientConnection, StompClientConnection>create0(StompClientConnection.class, StompClientConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connectionDroppedHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().connectionDroppedHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompClientConnection, StompClientConnection>create0(StompClientConnection.class, StompClientConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pingHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pingHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompClientConnection, StompClientConnection>create0(StompClientConnection.class, StompClientConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory beginTX(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().beginTX(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory beginTX(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().beginTX(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            this.getWrappedObject().beginTX(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory beginTX(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().beginTX(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commit(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().commit(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory commit(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().commit(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            this.getWrappedObject().commit(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory commit(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().commit(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory abort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().abort(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory abort(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().abort(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1)) {
            this.getWrappedObject().abort(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory abort(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isMap(__ENV__, TypeConverter.STRING, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().abort(Utils.convParamString(__ENV__, arg0), Utils.convParamMap(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory disconnect(Environment __ENV__) {
        this.getWrappedObject().disconnect();
        return toMemory();
    }/*4*/

    @Signature
    public Memory disconnect(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().disconnect(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0)) {
            this.getWrappedObject().disconnect(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory disconnect(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().disconnect(Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory ack(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().ack(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory ack(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().ack(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().ack(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory ack(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().ack(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory nack(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().nack(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory nack(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().nack(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().nack(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory nack(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().nack(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory receivedFrameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().receivedFrameHandler(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writingFrameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().writingFrameHandler(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isConnected(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isConnected());
    }/*1*/

}
