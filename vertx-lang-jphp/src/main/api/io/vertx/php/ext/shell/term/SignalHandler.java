package io.vertx.php.ext.shell.term;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("SignalHandler")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
@SuppressWarnings("ALL")
public class SignalHandler extends VertxGenVariable0Wrapper<io.vertx.ext.shell.term.SignalHandler>{
    
    private SignalHandler(Environment env, io.vertx.ext.shell.term.SignalHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  SignalHandler __create(Environment env, io.vertx.ext.shell.term.SignalHandler wrappedObject){
        return new SignalHandler(env, wrappedObject);
    }

    @Signature
    public Memory deliver(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().deliver(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
