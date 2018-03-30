package io.vertx.php.ext.auth.oauth2.providers;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.http.HttpClientOptions;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("StripeAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers")
@SuppressWarnings("ALL")
public class StripeAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.oauth2.providers.StripeAuth>{
    
    private StripeAuth(Environment env, io.vertx.ext.auth.oauth2.providers.StripeAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  StripeAuth __create(Environment env, io.vertx.ext.auth.oauth2.providers.StripeAuth wrappedObject){
        return new StripeAuth(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>convReturnVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, io.vertx.ext.auth.oauth2.providers.StripeAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.core.http.HttpClientOptions.class, arg3)) {
            return Utils.<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>convReturnVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, io.vertx.ext.auth.oauth2.providers.StripeAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.core.http.HttpClientOptions.class, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
