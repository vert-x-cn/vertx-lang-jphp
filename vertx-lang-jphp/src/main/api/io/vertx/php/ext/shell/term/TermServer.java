package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.web.Router;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("TermServer")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class TermServer extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.TermServer>{
    
    private TermServer(Environment env, io.vertx.ext.shell.term.TermServer wrappedObject){
        super(env, wrappedObject);
    }
    public static  TermServer __create(Environment env, io.vertx.ext.shell.term.TermServer wrappedObject){
        return new TermServer(env, wrappedObject);
    }

    @Signature
    public static Memory createSSHTermServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createSSHTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createSSHTermServer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.term.SSHTermOptions.class, arg1)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createSSHTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.term.SSHTermOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createTelnetTermServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createTelnetTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createTelnetTermServer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.term.TelnetTermOptions.class, arg1)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createTelnetTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.term.TelnetTermOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createHttpTermServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createHttpTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createHttpTermServer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.term.HttpTermOptions.class, arg1)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createHttpTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.term.HttpTermOptions.class, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.web.Router.class, Router.class, arg1)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createHttpTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.ext.web.Router, Router  >convParamVertxGenVariable0(__ENV__, Router.class, Router::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createHttpTermServer(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.web.Router.class, Router.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.term.HttpTermOptions.class, arg2)) {
            return Utils.<io.vertx.ext.shell.term.TermServer, TermServer>convReturnVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, io.vertx.ext.shell.term.TermServer.createHttpTermServer(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.ext.web.Router, Router  >convParamVertxGenVariable0(__ENV__, Router.class, Router::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.term.HttpTermOptions.class, arg2)));
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
    public Memory listen(Environment __ENV__) {
        this.getWrappedObject().listen();
        return toMemory();
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.term.TermServer, TermServer>create0(TermServer.class, TermServer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory actualPort(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().actualPort());
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

}
