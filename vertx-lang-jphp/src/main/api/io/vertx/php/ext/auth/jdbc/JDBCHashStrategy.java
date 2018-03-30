package io.vertx.php.ext.auth.jdbc;
import io.vertx.core.json.JsonArray;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("JDBCHashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
@SuppressWarnings("ALL")
public class JDBCHashStrategy extends VertxGenVariable0Wrapper<io.vertx.ext.auth.jdbc.JDBCHashStrategy>{
    
    private JDBCHashStrategy(Environment env, io.vertx.ext.auth.jdbc.JDBCHashStrategy wrappedObject){
        super(env, wrappedObject);
    }
    public static  JDBCHashStrategy __create(Environment env, io.vertx.ext.auth.jdbc.JDBCHashStrategy wrappedObject){
        return new JDBCHashStrategy(env, wrappedObject);
    }

    @Signature
    public static Memory createSHA512(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy>convReturnVertxGenVariable0(__ENV__, JDBCHashStrategy.class, JDBCHashStrategy::__create, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createSHA512(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createPBKDF2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy>convReturnVertxGenVariable0(__ENV__, JDBCHashStrategy.class, JDBCHashStrategy::__create, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createPBKDF2(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory generateSalt(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().generateSalt());
    }/*1*/

    @Signature
    public Memory computeHash(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().computeHash(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getHashedStoredPwd(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonArray(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getHashedStoredPwd(Utils.convParamJsonArray(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSalt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonArray(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getSalt(Utils.convParamJsonArray(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void setNonces(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonArray(__ENV__, arg0)) {
            this.getWrappedObject().setNonces(Utils.convParamJsonArray(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory isEqual(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.convReturnBoolean(__ENV__, io.vertx.ext.auth.jdbc.JDBCHashStrategy.isEqual(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
