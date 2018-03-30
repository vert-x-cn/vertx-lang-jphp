package io.vertx.php.ext.auth;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("VertxContextPRNG")
@Namespace("io\\vertx\\php\\ext\\auth")
@SuppressWarnings("ALL")
public class VertxContextPRNG extends VertxGenVariable0Wrapper<io.vertx.ext.auth.VertxContextPRNG>{
    
    private VertxContextPRNG(Environment env, io.vertx.ext.auth.VertxContextPRNG wrappedObject){
        super(env, wrappedObject);
    }
    public static  VertxContextPRNG __create(Environment env, io.vertx.ext.auth.VertxContextPRNG wrappedObject){
        return new VertxContextPRNG(env, wrappedObject);
    }

    @Signature
    public static Memory current(Environment __ENV__) {
        return Utils.<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG>convReturnVertxGenVariable0(__ENV__, VertxContextPRNG.class, VertxContextPRNG::__create, io.vertx.ext.auth.VertxContextPRNG.current());
    }/*4*/

    @Signature
    public static Memory current(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.auth.VertxContextPRNG, VertxContextPRNG>convReturnVertxGenVariable0(__ENV__, VertxContextPRNG.class, VertxContextPRNG::__create, io.vertx.ext.auth.VertxContextPRNG.current(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory nextString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().nextString(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory nextInt(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().nextInt());
    }/*4*/

    @Signature
    public Memory nextInt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, this.getWrappedObject().nextInt(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
