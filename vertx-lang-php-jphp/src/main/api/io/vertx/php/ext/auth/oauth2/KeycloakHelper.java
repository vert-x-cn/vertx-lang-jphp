package io.vertx.php.ext.auth.oauth2;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KeycloakHelper")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
@SuppressWarnings("ALL")
public class KeycloakHelper extends VertxGenVariable0Wrapper<io.vertx.ext.auth.oauth2.KeycloakHelper>{
    
    private KeycloakHelper(Environment env, io.vertx.ext.auth.oauth2.KeycloakHelper wrappedObject){
        super(env, wrappedObject);
    }
    public static  KeycloakHelper __create(Environment env, io.vertx.ext.auth.oauth2.KeycloakHelper wrappedObject){
        return new KeycloakHelper(env, wrappedObject);
    }

    @Signature
    public static Memory rawIdToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawIdToken(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory idToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.idToken(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory rawAccessToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawAccessToken(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory accessToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.accessToken(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory authTime(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.authTime(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory sessionState(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.sessionState(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory acr(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.acr(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory name(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.name(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory email(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.email(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory preferredUsername(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.preferredUsername(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory nickName(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.nickName(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory allowedOrigins(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnSet(__ENV__, TypeConverter.STRING,io.vertx.ext.auth.oauth2.KeycloakHelper.allowedOrigins(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory parseToken(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, io.vertx.ext.auth.oauth2.KeycloakHelper.parseToken(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
