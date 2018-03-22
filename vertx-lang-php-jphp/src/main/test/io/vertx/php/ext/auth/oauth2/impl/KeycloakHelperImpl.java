package io.vertx.php.ext.auth.oauth2.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.KeycloakHelper;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KeycloakHelperImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\impl")
public class KeycloakHelperImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.KeycloakHelper> implements KeycloakHelper<io.vertx.ext.auth.oauth2.KeycloakHelper>{
    
    public KeycloakHelperImpl(Environment env, io.vertx.ext.auth.oauth2.KeycloakHelper wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory rawIdToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawIdToken(principal)
    }

    @Signature
    public static Memory idToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.idToken(principal)
    }

    @Signature
    public static Memory rawAccessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawAccessToken(principal)
    }

    @Signature
    public static Memory accessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.accessToken(principal)
    }

    @Signature
    public static Memory authTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.authTime(principal)
    }

    @Signature
    public static Memory sessionState(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.sessionState(principal)
    }

    @Signature
    public static Memory acr(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.acr(principal)
    }

    @Signature
    public static Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.name(principal)
    }

    @Signature
    public static Memory email(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.email(principal)
    }

    @Signature
    public static Memory preferredUsername(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.preferredUsername(principal)
    }

    @Signature
    public static Memory nickName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.nickName(principal)
    }

    @Signature
    public static Memory allowedOrigins(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.allowedOrigins(principal)
    }

    @Signature
    public static Memory parseToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.parseToken(token)
    }

}
