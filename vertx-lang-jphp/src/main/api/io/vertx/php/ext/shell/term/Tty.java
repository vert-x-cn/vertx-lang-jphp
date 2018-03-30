package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Tty")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class Tty extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.Tty>{
    
    private Tty(Environment env, io.vertx.ext.shell.term.Tty wrappedObject){
        super(env, wrappedObject);
    }
    public static  Tty __create(Environment env, io.vertx.ext.shell.term.Tty wrappedObject){
        return new Tty(env, wrappedObject);
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
    public Memory resizehandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().resizehandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
