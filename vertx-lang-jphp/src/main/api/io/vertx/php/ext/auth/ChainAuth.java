package io.vertx.php.ext.auth;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ChainAuth")
@Namespace("io\\vertx\\php\\ext\\auth")
@SuppressWarnings("ALL")
public class ChainAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.ChainAuth>{
    
    private ChainAuth(Environment env, io.vertx.ext.auth.ChainAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  ChainAuth __create(Environment env, io.vertx.ext.auth.ChainAuth wrappedObject){
        return new ChainAuth(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().authenticate(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.User, User>create0(User.class, User::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.auth.ChainAuth, ChainAuth>convReturnVertxGenVariable0(__ENV__, ChainAuth.class, ChainAuth::__create, io.vertx.ext.auth.ChainAuth.create());
    }/*1*/

    @Signature
    public Memory append(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            this.getWrappedObject().append(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().remove(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void clear(Environment __ENV__) {
        this.getWrappedObject().clear();
    }/*1*/

}
