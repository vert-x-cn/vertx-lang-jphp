package io.vertx.php.core.net;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("NetSocket")
@Namespace("io\\vertx\\php\\core\\net")
@SuppressWarnings("ALL")
public class NetSocket extends VertxGenVariable0Wrapper<io.vertx.core.net.NetSocket>{
    
    private NetSocket(Environment env, io.vertx.core.net.NetSocket wrappedObject){
        super(env, wrappedObject);
    }
    public static  NetSocket __create(Environment env, io.vertx.core.net.NetSocket wrappedObject){
        return new NetSocket(env, wrappedObject);
    }

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().end(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeQueueFull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().writeQueueFull());
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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
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
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().write(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().write(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().write(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
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
    public Memory writeHandlerID(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().writeHandlerID());
    }/*1*/

    @Signature
    public Memory sendFile(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory sendFile(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory sendFile(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory sendFile(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().sendFile(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remoteAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().remoteAddress());
    }/*1*/

    @Signature
    public Memory localAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().localAddress());
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory upgradeToSsl(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().upgradeToSsl(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory upgradeToSsl(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().upgradeToSsl(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isSsl(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSsl());
    }/*1*/

    @Signature
    public Memory indicatedServerName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().indicatedServerName());
    }/*1*/

}
