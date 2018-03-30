package io.vertx.php.ext.auth;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.User;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AuthProvider")
@Namespace("io\\vertx\\php\\ext\\auth")
@SuppressWarnings("ALL")
public class AuthProvider extends VertxGenVariable0Wrapper<io.vertx.ext.auth.AuthProvider>{
    
    private AuthProvider(Environment env, io.vertx.ext.auth.AuthProvider wrappedObject){
        super(env, wrappedObject);
    }
    public static  AuthProvider __create(Environment env, io.vertx.ext.auth.AuthProvider wrappedObject){
        return new AuthProvider(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().authenticate(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.User, User>create0(User.class, User::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
