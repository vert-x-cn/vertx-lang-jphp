package io.vertx.php.core.net;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("SocketAddress")
@Namespace("io\\vertx\\php\\core\\net")
@SuppressWarnings("ALL")
public class SocketAddress extends VertxGenVariable0Wrapper<io.vertx.core.net.SocketAddress>{
    
    private SocketAddress(Environment env, io.vertx.core.net.SocketAddress wrappedObject){
        super(env, wrappedObject);
    }
    public static  SocketAddress __create(Environment env, io.vertx.core.net.SocketAddress wrappedObject){
        return new SocketAddress(env, wrappedObject);
    }

    @Signature
    public static Memory inetSocketAddress(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, io.vertx.core.net.SocketAddress.inetSocketAddress(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory domainSocketAddress(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, io.vertx.core.net.SocketAddress.domainSocketAddress(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory host(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().host());
    }/*1*/

    @Signature
    public Memory port(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().port());
    }/*1*/

    @Signature
    public Memory path(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().path());
    }/*1*/

}
