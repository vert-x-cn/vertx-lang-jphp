package io.vertx.php.core.datagram;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.datagram.DatagramPacket;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.streams.WriteStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DatagramSocket")
@Namespace("io\\vertx\\php\\core\\datagram")
@SuppressWarnings("ALL")
public class DatagramSocket extends VertxGenVariable0Wrapper<io.vertx.core.datagram.DatagramSocket>{
    
    private DatagramSocket(Environment env, io.vertx.core.datagram.DatagramSocket wrappedObject){
        super(env, wrappedObject);
    }
    public static  DatagramSocket __create(Environment env, io.vertx.core.datagram.DatagramSocket wrappedObject){
        return new DatagramSocket(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().send(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg3));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory send(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().send(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sender(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.streams.WriteStream<io.vertx.core.buffer.Buffer>, WriteStream<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, WriteStream.class, WriteStream::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().sender(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory localAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().localAddress());
    }/*1*/

    @Signature
    public Memory listenMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().listenMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listenMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().listenMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unlistenMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unlistenMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory unlistenMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().unlistenMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory blockMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().blockMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory blockMulticastGroup(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().blockMulticastGroup(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>create0(DatagramSocket.class, DatagramSocket::__create), arg2));
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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.datagram.DatagramPacket, DatagramPacket>create0(DatagramPacket.class, DatagramPacket::__create), arg0));
            return toMemory();
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

}
