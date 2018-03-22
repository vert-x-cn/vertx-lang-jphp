package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.Cookie;
import io.vertx.php.ext.web.Route;
import io.vertx.php.ext.web.Locale;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.ext.web.Session;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.LanguageHeader;
import io.vertx.php.ext.web.FileUpload;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.php.ext.web.ParsedHeaderValues;
@Name("RoutingContext")
@Namespace("io\\vertx\\php\\ext\\web")
public interface RoutingContext<S extends io.vertx.ext.web.RoutingContext> extends IWrapper<S>{
    
    @Signature
    default Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerRequestImpl::new, this.getWrappedObject().request()
    }
    
    @Signature
    default Memory response(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerResponseImpl::new, this.getWrappedObject().response()
    }
    
    @Signature
    default void next(Environment __env__, Memory... args) {
        this.getWrappedObject().next()
    }

    @Signature
    default void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(statusCode)
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, obj)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }
    
    @Signature
    default Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, this.getWrappedObject().vertx()
    }
    
    @Signature
    default Memory mountPoint(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().mountPoint()
    }
    
    @Signature
    default Memory currentRoute(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().currentRoute()
    }
    
    @Signature
    default Memory normalisedPath(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().normalisedPath()
    }

    @Signature
    default Memory getCookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, this.getWrappedObject().getCookie(name)
    }

    @Signature
    default Memory addCookie(Environment __env__, Memory... args) {
        this.getWrappedObject().addCookie(cookie)
    }

    @Signature
    default Memory removeCookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, this.getWrappedObject().removeCookie(name)
    }
    
    @Signature
    default Memory cookieCount(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cookieCount()
    }
    
    @Signature
    default Memory cookies(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cookies()
    }
    
    @Signature
    default Memory getBodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBodyAsString()
    }

    @Signature
    default Memory getBodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBodyAsString()
    }
    
    @Signature
    default Memory getBodyAsJson(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBodyAsJson()
    }
    
    @Signature
    default Memory getBodyAsJsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBodyAsJsonArray()
    }
    
    @Signature
    default Memory getBody(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().getBody()
    }
    
    @Signature
    default Memory fileUploads(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().fileUploads()
    }
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().session()
    }
    
    @Signature
    default Memory user(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, UserImpl::new, this.getWrappedObject().user()
    }
    
    @Signature
    default Memory failure(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failure()
    }
    
    @Signature
    default Memory statusCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().statusCode()
    }
    
    @Signature
    default Memory getAcceptableContentType(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getAcceptableContentType()
    }
    
    @Signature
    default Memory parsedHeaders(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ParsedHeaderValuesImpl::new, this.getWrappedObject().parsedHeaders()
    }

    @Signature
    default Memory addHeadersEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().addHeadersEndHandler(handler)
    }

    @Signature
    default Memory removeHeadersEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeHeadersEndHandler(handlerID)
    }

    @Signature
    default Memory addBodyEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().addBodyEndHandler(handler)
    }

    @Signature
    default Memory removeBodyEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeBodyEndHandler(handlerID)
    }
    
    @Signature
    default Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
    }

    @Signature
    default void setBody(Environment __env__, Memory... args) {
        this.getWrappedObject().setBody(body)
    }

    @Signature
    default void setSession(Environment __env__, Memory... args) {
        this.getWrappedObject().setSession(session)
    }

    @Signature
    default void setUser(Environment __env__, Memory... args) {
        this.getWrappedObject().setUser(user)
    }
    
    @Signature
    default void clearUser(Environment __env__, Memory... args) {
        this.getWrappedObject().clearUser()
    }

    @Signature
    default void setAcceptableContentType(Environment __env__, Memory... args) {
        this.getWrappedObject().setAcceptableContentType(contentType)
    }

    @Signature
    default void reroute(Environment __env__, Memory... args) {
        this.getWrappedObject().reroute(path)
    }
    
    @Signature
    default Memory acceptableLocales(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptableLocales()
    }
    
    @Signature
    default Memory acceptableLanguages(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptableLanguages()
    }
    
    @Signature
    default Memory preferredLocale(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocaleImpl::new, this.getWrappedObject().preferredLocale()
    }
    
    @Signature
    default Memory preferredLanguage(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LanguageHeaderImpl::new, this.getWrappedObject().preferredLanguage()
    }
    
    @Signature
    default Memory pathParams(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().pathParams()
    }

    @Signature
    default Memory pathParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().pathParam(name)
    }
    
    @Signature
    default Memory queryParams(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().queryParams()
    }

    @Signature
    default Memory queryParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().queryParam(query)
    }

}
