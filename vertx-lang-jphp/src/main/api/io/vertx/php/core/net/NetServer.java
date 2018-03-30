package io.vertx.php.core.net;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.streams.ReadStream;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("NetServer")
@Namespace("io\\vertx\\php\\core\\net")
@SuppressWarnings("ALL")
public class NetServer extends VertxGenVariable0Wrapper<io.vertx.core.net.NetServer>{
    
    private NetServer(Environment env, io.vertx.core.net.NetServer wrappedObject){
        super(env, wrappedObject);
    }
    public static  NetServer __create(Environment env, io.vertx.core.net.NetServer wrappedObject){
        return new NetServer(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory connectStream(Environment __ENV__) {
        return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.net.NetSocket>, ReadStream<io.vertx.core.net.NetSocket>, io.vertx.core.net.NetSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), this.getWrappedObject().connectStream());
    }/*1*/

    @Signature
    public Memory connectHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            return Utils.<io.vertx.core.net.NetServer, NetServer>convReturnVertxGenVariable0(__ENV__, NetServer.class, NetServer::__create, this.getWrappedObject().connectHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetSocket, NetSocket>create0(NetSocket.class, NetSocket::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory listen(Environment __ENV__) {
        this.getWrappedObject().listen();
        return toMemory();
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetServer, NetServer>create0(NetServer.class, NetServer::__create), arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.net.SocketAddress.class, SocketAddress.class, arg0)) {
            this.getWrappedObject().listen(Utils.  <io.vertx.core.net.SocketAddress, SocketAddress  >convParamVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetServer, NetServer>create0(NetServer.class, NetServer::__create), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.net.SocketAddress.class, SocketAddress.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().listen(Utils.  <io.vertx.core.net.SocketAddress, SocketAddress  >convParamVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetServer, NetServer>create0(NetServer.class, NetServer::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.net.NetServer, NetServer>create0(NetServer.class, NetServer::__create), arg2));
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
    public Memory actualPort(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().actualPort());
    }/*1*/

}
