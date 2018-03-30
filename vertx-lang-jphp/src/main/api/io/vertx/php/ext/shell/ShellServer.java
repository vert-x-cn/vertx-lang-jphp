package io.vertx.php.ext.shell;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.command.CommandResolver;
import io.vertx.php.ext.shell.term.Term;
import io.vertx.php.ext.shell.term.TermServer;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ShellServer")
@Namespace("io\\vertx\\php\\ext\\shell")
@SuppressWarnings("ALL")
public class ShellServer extends VertxGenVariable0Wrapper<io.vertx.ext.shell.ShellServer>{
    
    private ShellServer(Environment env, io.vertx.ext.shell.ShellServer wrappedObject){
        super(env, wrappedObject);
    }
    public static  ShellServer __create(Environment env, io.vertx.ext.shell.ShellServer wrappedObject){
        return new ShellServer(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.ShellServer, ShellServer>convReturnVertxGenVariable0(__ENV__, ShellServer.class, ShellServer::__create, io.vertx.ext.shell.ShellServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.ShellServerOptions.class, arg1)) {
            return Utils.<io.vertx.ext.shell.ShellServer, ShellServer>convReturnVertxGenVariable0(__ENV__, ShellServer.class, ShellServer::__create, io.vertx.ext.shell.ShellServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.ShellServerOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerCommandResolver(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.command.CommandResolver.class, CommandResolver.class, arg0)) {
            this.getWrappedObject().registerCommandResolver(Utils.  <io.vertx.ext.shell.command.CommandResolver, CommandResolver  >convParamVertxGenVariable0(__ENV__, CommandResolver.class, CommandResolver::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerTermServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.TermServer.class, TermServer.class, arg0)) {
            this.getWrappedObject().registerTermServer(Utils.  <io.vertx.ext.shell.term.TermServer, TermServer  >convParamVertxGenVariable0(__ENV__, TermServer.class, TermServer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createShell(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.Shell, Shell>convReturnVertxGenVariable0(__ENV__, Shell.class, Shell::__create, this.getWrappedObject().createShell());
    }/*4*/

    @Signature
    public Memory createShell(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.Term.class, Term.class, arg0)) {
            return Utils.<io.vertx.ext.shell.Shell, Shell>convReturnVertxGenVariable0(__ENV__, Shell.class, Shell::__create, this.getWrappedObject().createShell(Utils.  <io.vertx.ext.shell.term.Term, Term  >convParamVertxGenVariable0(__ENV__, Term.class, Term::__create, arg0)));
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
            this.getWrappedObject().listen(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
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

}
