package io.vertx.php.ext.auth;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.AuthProvider;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("User")
@Namespace("io\\vertx\\php\\ext\\auth")
@SuppressWarnings("ALL")
public class User extends VertxGenVariable0Wrapper<io.vertx.ext.auth.User>{
    
    private User(Environment env, io.vertx.ext.auth.User wrappedObject){
        super(env, wrappedObject);
    }
    public static  User __create(Environment env, io.vertx.ext.auth.User wrappedObject){
        return new User(env, wrappedObject);
    }

    @Signature
    public Memory isAuthorized(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().isAuthorized(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isAuthorised(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().isAuthorised(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clearCache(Environment __ENV__) {
        this.getWrappedObject().clearCache();
        return toMemory();
    }/*1*/

    @Signature
    public Memory principal(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().principal());
    }/*1*/

    @Signature
    public void setAuthProvider(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            this.getWrappedObject().setAuthProvider(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
