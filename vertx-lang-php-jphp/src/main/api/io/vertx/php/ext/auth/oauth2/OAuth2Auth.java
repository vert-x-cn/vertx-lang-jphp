package io.vertx.php.ext.auth.oauth2;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.oauth2.AccessToken;
@Name("OAuth2Auth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public interface OAuth2Auth<S extends io.vertx.ext.auth.oauth2.OAuth2Auth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }
    
    @Signature
    default void verifyIsUsingPassword(Environment __env__, Memory... args) {
        this.getWrappedObject().verifyIsUsingPassword()
    }

    @Signature
    static Memory createKeycloak(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.OAuth2Auth.createKeycloak(vertx, flow, config)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.OAuth2Auth.create(vertx, flow)
    }

    @Signature
    default Memory authorizeURL(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().authorizeURL(params)
    }

    @Signature
    default void getToken(Environment __env__, Memory... args) {
        this.getWrappedObject().getToken(params, handler)
    }
    
    @Signature
    default Memory hasJWTToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().hasJWTToken()
    }

    @Signature
    default Memory decodeToken(Environment __env__, Memory... args) {
        this.getWrappedObject().decodeToken(token, handler)
    }

    @Signature
    default Memory introspectToken(Environment __env__, Memory... args) {
        this.getWrappedObject().introspectToken(token, handler)
    }
    
    @Signature
    default Memory getScopeSeparator(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getScopeSeparator()
    }
    
    @Signature
    default Memory getFlowType(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getFlowType()
    }

    @Signature
    default Memory loadJWK(Environment __env__, Memory... args) {
        this.getWrappedObject().loadJWK(handler)
    }

}
