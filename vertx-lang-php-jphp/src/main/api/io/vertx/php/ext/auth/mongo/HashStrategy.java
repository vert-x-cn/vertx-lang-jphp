package io.vertx.php.ext.auth.mongo;
import io.vertx.ext.auth.mongo.HashAlgorithm;
import io.vertx.ext.auth.mongo.HashSaltStyle;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
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
@Name("HashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
@SuppressWarnings("ALL")
public class HashStrategy extends VertxGenVariable0Wrapper<io.vertx.ext.auth.mongo.HashStrategy>{
    
    private HashStrategy(Environment env, io.vertx.ext.auth.mongo.HashStrategy wrappedObject){
        super(env, wrappedObject);
    }
    public static  HashStrategy __create(Environment env, io.vertx.ext.auth.mongo.HashStrategy wrappedObject){
        return new HashStrategy(env, wrappedObject);
    }

    @Signature
    public Memory computeHash(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.auth.User.class, User.class, arg1)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().computeHash(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.ext.auth.User, User  >convParamVertxGenVariable0(__ENV__, User.class, User::__create, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getStoredPwd(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.User.class, User.class, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getStoredPwd(Utils.  <io.vertx.ext.auth.User, User  >convParamVertxGenVariable0(__ENV__, User.class, User::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSalt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.User.class, User.class, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getSalt(Utils.  <io.vertx.ext.auth.User, User  >convParamVertxGenVariable0(__ENV__, User.class, User::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void setExternalSalt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setExternalSalt(Utils.convParamString(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void setSaltStyle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HashSaltStyle.class, arg0)) {
            this.getWrappedObject().setSaltStyle(Utils.convParamEnum(__ENV__, HashSaltStyle.class, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSaltStyle(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().getSaltStyle());
    }/*1*/

    @Signature
    public void setAlgorithm(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HashAlgorithm.class, arg0)) {
            this.getWrappedObject().setAlgorithm(Utils.convParamEnum(__ENV__, HashAlgorithm.class, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
