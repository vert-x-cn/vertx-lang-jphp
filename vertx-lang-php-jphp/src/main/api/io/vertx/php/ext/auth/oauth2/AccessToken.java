package io.vertx.php.ext.auth.oauth2;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.auth.oauth2.OAuth2Response;
import io.vertx.php.ext.auth.AuthProvider;
@Name("AccessToken")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public interface AccessToken<S extends io.vertx.ext.auth.oauth2.AccessToken> extends IWrapper<S>{

    @Signature
    default Memory isAuthorized(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorized(authority, resultHandler)
    }

    @Signature
    default Memory isAuthorised(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorised(authority, resultHandler)
    }
    
    @Signature
    default Memory clearCache(Environment __env__, Memory... args) {
        this.getWrappedObject().clearCache()
    }
    
    @Signature
    default Memory principal(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().principal()
    }

    @Signature
    default void setAuthProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthProvider(authProvider)
    }
    
    @Signature
    default Memory expired(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().expired()
    }
    
    @Signature
    default Memory accessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().accessToken()
    }
    
    @Signature
    default Memory refreshToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().refreshToken()
    }
    
    @Signature
    default Memory idToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().idToken()
    }
    
    @Signature
    default Memory opaqueAccessToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().opaqueAccessToken()
    }
    
    @Signature
    default Memory opaqueRefreshToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().opaqueRefreshToken()
    }
    
    @Signature
    default Memory opaqueIdToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().opaqueIdToken()
    }
    
    @Signature
    default Memory tokenType(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tokenType()
    }

    @Signature
    default Memory setTrustJWT(Environment __env__, Memory... args) {
        this.getWrappedObject().setTrustJWT(trust)
    }

    @Signature
    default Memory refresh(Environment __env__, Memory... args) {
        this.getWrappedObject().refresh(callback)
    }

    @Signature
    default Memory revoke(Environment __env__, Memory... args) {
        this.getWrappedObject().revoke(token_type, callback)
    }

    @Signature
    default Memory logout(Environment __env__, Memory... args) {
        this.getWrappedObject().logout(callback)
    }

    @Signature
    default Memory introspect(Environment __env__, Memory... args) {
        this.getWrappedObject().introspect(callback)
    }

    @Signature
    default Memory userInfo(Environment __env__, Memory... args) {
        this.getWrappedObject().userInfo(callback)
    }

    @Signature
    default Memory fetch(Environment __env__, Memory... args) {
        this.getWrappedObject().fetch(resource, callback)
    }

}
