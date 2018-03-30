package io.vertx.php.ext.auth.htpasswd;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.User;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HtpasswdAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\htpasswd")
@SuppressWarnings("ALL")
public class HtpasswdAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.htpasswd.HtpasswdAuth>{
    
    private HtpasswdAuth(Environment env, io.vertx.ext.auth.htpasswd.HtpasswdAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  HtpasswdAuth __create(Environment env, io.vertx.ext.auth.htpasswd.HtpasswdAuth wrappedObject){
        return new HtpasswdAuth(env, wrappedObject);
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
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.auth.htpasswd.HtpasswdAuth, HtpasswdAuth>convReturnVertxGenVariable0(__ENV__, HtpasswdAuth.class, HtpasswdAuth::__create, io.vertx.ext.auth.htpasswd.HtpasswdAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions.class, arg1)) {
            return Utils.<io.vertx.ext.auth.htpasswd.HtpasswdAuth, HtpasswdAuth>convReturnVertxGenVariable0(__ENV__, HtpasswdAuth.class, HtpasswdAuth::__create, io.vertx.ext.auth.htpasswd.HtpasswdAuth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
