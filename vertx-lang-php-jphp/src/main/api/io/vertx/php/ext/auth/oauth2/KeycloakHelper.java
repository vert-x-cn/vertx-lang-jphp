package io.vertx.php.ext.auth.oauth2;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("KeycloakHelper")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public interface KeycloakHelper<S extends io.vertx.ext.auth.oauth2.KeycloakHelper> extends IWrapper<S>{

    @Signature
    static Memory rawIdToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawIdToken(principal)
    }

    @Signature
    static Memory idToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.idToken(principal)
    }

    @Signature
    static Memory rawAccessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.rawAccessToken(principal)
    }

    @Signature
    static Memory accessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.accessToken(principal)
    }

    @Signature
    static Memory authTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.authTime(principal)
    }

    @Signature
    static Memory sessionState(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.sessionState(principal)
    }

    @Signature
    static Memory acr(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.acr(principal)
    }

    @Signature
    static Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.name(principal)
    }

    @Signature
    static Memory email(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.email(principal)
    }

    @Signature
    static Memory preferredUsername(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.preferredUsername(principal)
    }

    @Signature
    static Memory nickName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.nickName(principal)
    }

    @Signature
    static Memory allowedOrigins(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.allowedOrigins(principal)
    }

    @Signature
    static Memory parseToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.oauth2.KeycloakHelper.parseToken(token)
    }

}
