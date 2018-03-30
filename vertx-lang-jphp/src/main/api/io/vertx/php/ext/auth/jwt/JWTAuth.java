package io.vertx.php.ext.auth.jwt;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.jwt.JWTOptions;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("JWTAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt")
@SuppressWarnings("ALL")
public class JWTAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.jwt.JWTAuth>{
    
    private JWTAuth(Environment env, io.vertx.ext.auth.jwt.JWTAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  JWTAuth __create(Environment env, io.vertx.ext.auth.jwt.JWTAuth wrappedObject){
        return new JWTAuth(env, wrappedObject);
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
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.auth.jwt.JWTAuthOptions.class, arg1)) {
            return Utils.<io.vertx.ext.auth.jwt.JWTAuth, JWTAuth>convReturnVertxGenVariable0(__ENV__, JWTAuth.class, JWTAuth::__create, io.vertx.ext.auth.jwt.JWTAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.auth.jwt.JWTAuthOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory generateToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().generateToken(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory generateToken(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.jwt.JWTOptions.class, arg1)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().generateToken(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.jwt.JWTOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
