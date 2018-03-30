package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("SockJSTermHandler")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class SockJSTermHandler extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.SockJSTermHandler>{
    
    private SockJSTermHandler(Environment env, io.vertx.ext.shell.term.SockJSTermHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  SockJSTermHandler __create(Environment env, io.vertx.ext.shell.term.SockJSTermHandler wrappedObject){
        return new SockJSTermHandler(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.handler.sockjs.SockJSSocket.class, SockJSSocket.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket  >convParamVertxGenVariable0(__ENV__, SockJSSocket.class, SockJSSocket::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.shell.term.SockJSTermHandler, SockJSTermHandler>convReturnVertxGenVariable0(__ENV__, SockJSTermHandler.class, SockJSTermHandler::__create, io.vertx.ext.shell.term.SockJSTermHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory termHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().termHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.term.Term, Term>create0(Term.class, Term::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
