package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Pty")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class Pty extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.Pty>{
    
    private Pty(Environment env, io.vertx.ext.shell.term.Pty wrappedObject){
        super(env, wrappedObject);
    }
    public static  Pty __create(Environment env, io.vertx.ext.shell.term.Pty wrappedObject){
        return new Pty(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.term.Pty, Pty>convReturnVertxGenVariable0(__ENV__, Pty.class, Pty::__create, io.vertx.ext.shell.term.Pty.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.term.Pty, Pty>convReturnVertxGenVariable0(__ENV__, Pty.class, Pty::__create, io.vertx.ext.shell.term.Pty.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory stdoutHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().stdoutHandler(Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg0));
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
    public Memory setSize(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1)) {
            this.getWrappedObject().setSize(Utils.convParamInteger(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory slave(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.term.Tty, Tty>convReturnVertxGenVariable0(__ENV__, Tty.class, Tty::__create, this.getWrappedObject().slave());
    }/*1*/

}
