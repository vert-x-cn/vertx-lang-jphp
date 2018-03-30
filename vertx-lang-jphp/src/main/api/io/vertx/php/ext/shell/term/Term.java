package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.ext.shell.session.Session;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Term")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class Term extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.Term>{
    
    private Term(Environment env, io.vertx.ext.shell.term.Term wrappedObject){
        super(env, wrappedObject);
    }
    public static  Term __create(Environment env, io.vertx.ext.shell.term.Term wrappedObject){
        return new Term(env, wrappedObject);
    }

    @Signature
    public Memory type(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().type());
    }/*1*/

    @Signature
    public Memory width(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().width());
    }/*1*/

    @Signature
    public Memory height(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().height());
    }/*1*/

    @Signature
    public Memory resizehandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().resizehandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory stdinHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().stdinHandler(Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().write(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory lastAccessedTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().lastAccessedTime());
    }/*1*/

    @Signature
    public Memory echo(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().echo(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSession(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.session.Session.class, Session.class, arg0)) {
            return Utils.<io.vertx.ext.shell.term.Term, Term>convReturnVertxGenVariable0(__ENV__, Term.class, Term::__create, this.getWrappedObject().setSession(Utils.  <io.vertx.ext.shell.session.Session, Session  >convParamVertxGenVariable0(__ENV__, Session.class, Session::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory interruptHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.SignalHandler.class, SignalHandler.class, arg0)) {
            this.getWrappedObject().interruptHandler(Utils.  <io.vertx.ext.shell.term.SignalHandler, SignalHandler  >convParamVertxGenVariable0(__ENV__, SignalHandler.class, SignalHandler::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory suspendHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.SignalHandler.class, SignalHandler.class, arg0)) {
            this.getWrappedObject().suspendHandler(Utils.  <io.vertx.ext.shell.term.SignalHandler, SignalHandler  >convParamVertxGenVariable0(__ENV__, SignalHandler.class, SignalHandler::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void readline(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().readline(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void readline(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().readline(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.Completion, Completion>create0(Completion.class, Completion::__create), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
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
