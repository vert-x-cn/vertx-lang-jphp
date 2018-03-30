package io.vertx.php.ext.shell.system;
import io.vertx.ext.shell.system.ExecStatus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.shell.session.Session;
import io.vertx.php.ext.shell.term.Tty;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Process")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
@SuppressWarnings("ALL")
public class Process extends VertxGenVariable0Wrapper<io.vertx.ext.shell.system.Process>{
    
    private Process(Environment env, io.vertx.ext.shell.system.Process wrappedObject){
        super(env, wrappedObject);
    }
    public static  Process __create(Environment env, io.vertx.ext.shell.system.Process wrappedObject){
        return new Process(env, wrappedObject);
    }

    @Signature
    public Memory status(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().status());
    }/*1*/

    @Signature
    public Memory exitCode(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().exitCode());
    }/*1*/

    @Signature
    public Memory setTty(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.Tty.class, Tty.class, arg0)) {
            this.getWrappedObject().setTty(Utils.  <io.vertx.ext.shell.term.Tty, Tty  >convParamVertxGenVariable0(__ENV__, Tty.class, Tty::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getTty(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.term.Tty, Tty>convReturnVertxGenVariable0(__ENV__, Tty.class, Tty::__create, this.getWrappedObject().getTty());
    }/*1*/

    @Signature
    public Memory setSession(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.session.Session.class, Session.class, arg0)) {
            this.getWrappedObject().setSession(Utils.  <io.vertx.ext.shell.session.Session, Session  >convParamVertxGenVariable0(__ENV__, Session.class, Session::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSession(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.session.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().getSession());
    }/*1*/

    @Signature
    public Memory terminatedHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().terminatedHandler(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void run(Environment __ENV__) {
        this.getWrappedObject().run();
    }/*4*/

    @Signature
    public void run(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().run(Utils.convParamBoolean(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory interrupt(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().interrupt());
    }/*4*/

    @Signature
    public Memory interrupt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().interrupt(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void resume(Environment __ENV__) {
        this.getWrappedObject().resume();
    }/*4*/

    @Signature
    public void resume(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().resume(Utils.convParamBoolean(__ENV__, arg0));
        } else if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().resume(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void resume(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().resume(Utils.convParamBoolean(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void suspend(Environment __ENV__) {
        this.getWrappedObject().suspend();
    }/*4*/

    @Signature
    public void suspend(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().suspend(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void terminate(Environment __ENV__) {
        this.getWrappedObject().terminate();
    }/*4*/

    @Signature
    public void terminate(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().terminate(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void toBackground(Environment __ENV__) {
        this.getWrappedObject().toBackground();
    }/*4*/

    @Signature
    public void toBackground(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().toBackground(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void toForeground(Environment __ENV__) {
        this.getWrappedObject().toForeground();
    }/*4*/

    @Signature
    public void toForeground(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().toForeground(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
