package io.vertx.php.core.net;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.net.NetSocket;
import io.vertx.php.core.net.SocketAddress;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("NetClient")
@Namespace("io\\vertx\\php\\core\\net")
@SuppressWarnings("ALL")
public class NetClient extends VertxGenVariable0Wrapper<io.vertx.core.net.NetClient>{
    
    private NetClient(Environment env, io.vertx.core.net.NetClient wrappedObject){
        super(env, wrappedObject);
    }
    public static  NetClient __create(Environment env, io.vertx.core.net.NetClient wrappedObject){
        return new NetClient(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.net.SocketAddress.class, SocketAddress.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().connect(Utils.  <io.vertx.core.net.SocketAddress, SocketAddress  >convParamVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().connect(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.net.SocketAddress.class, SocketAddress.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().connect(Utils.  <io.vertx.core.net.SocketAddress, SocketAddress  >convParamVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().connect(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
