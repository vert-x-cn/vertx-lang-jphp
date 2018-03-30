package io.vertx.php.ext.auth.mongo;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.mongo.HashAlgorithm;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.mongo.MongoClient;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MongoAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
@SuppressWarnings("ALL")
public class MongoAuth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.mongo.MongoAuth>{
    
    private MongoAuth(Environment env, io.vertx.ext.auth.mongo.MongoAuth wrappedObject){
        super(env, wrappedObject);
    }
    public static  MongoAuth __create(Environment env, io.vertx.ext.auth.mongo.MongoAuth wrappedObject){
        return new MongoAuth(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.mongo.MongoClient.class, MongoClient.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.auth.mongo.MongoAuth, MongoAuth>convReturnVertxGenVariable0(__ENV__, MongoAuth.class, MongoAuth::__create, io.vertx.ext.auth.mongo.MongoAuth.create(Utils.  <io.vertx.ext.mongo.MongoClient, MongoClient  >convParamVertxGenVariable0(__ENV__, MongoClient.class, MongoClient::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setCollectionName(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setCollectionName(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setUsernameField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setUsernameField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setPasswordField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setPasswordField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setRoleField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setRoleField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setPermissionField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setPermissionField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setUsernameCredentialField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setUsernameCredentialField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setPasswordCredentialField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setPasswordCredentialField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSaltField(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setSaltField(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getCollectionName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getCollectionName());
    }/*1*/

    @Signature
    public Memory getUsernameField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getUsernameField());
    }/*1*/

    @Signature
    public Memory getPasswordField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getPasswordField());
    }/*1*/

    @Signature
    public Memory getRoleField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getRoleField());
    }/*1*/

    @Signature
    public Memory getPermissionField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getPermissionField());
    }/*1*/

    @Signature
    public Memory getUsernameCredentialField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getUsernameCredentialField());
    }/*1*/

    @Signature
    public Memory getPasswordCredentialField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getPasswordCredentialField());
    }/*1*/

    @Signature
    public Memory getSaltField(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getSaltField());
    }/*1*/

    @Signature
    public Memory setHashStrategy(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.mongo.HashStrategy.class, HashStrategy.class, arg0)) {
            this.getWrappedObject().setHashStrategy(Utils.  <io.vertx.ext.auth.mongo.HashStrategy, HashStrategy  >convParamVertxGenVariable0(__ENV__, HashStrategy.class, HashStrategy::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getHashStrategy(Environment __ENV__) {
        return Utils.<io.vertx.ext.auth.mongo.HashStrategy, HashStrategy>convReturnVertxGenVariable0(__ENV__, HashStrategy.class, HashStrategy::__create, this.getWrappedObject().getHashStrategy());
    }/*1*/

    @Signature
    public Memory setHashAlgorithm(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HashAlgorithm.class, arg0)) {
            this.getWrappedObject().setHashAlgorithm(Utils.convParamEnum(__ENV__, HashAlgorithm.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void insertUser(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.STRING, arg2) && Utils.isNotNull(arg3) && Utils.isList(__ENV__, TypeConverter.STRING, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().insertUser(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamList(__ENV__, TypeConverter.STRING, arg2), Utils.convParamList(__ENV__, TypeConverter.STRING, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg4));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
