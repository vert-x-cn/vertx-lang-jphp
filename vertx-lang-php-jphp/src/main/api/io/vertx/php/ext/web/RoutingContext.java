package io.vertx.php.ext.web;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.Cookie;
import io.vertx.php.ext.web.FileUpload;
import io.vertx.php.ext.web.LanguageHeader;
import io.vertx.php.ext.web.Locale;
import io.vertx.php.ext.web.ParsedHeaderValues;
import io.vertx.php.ext.web.Route;
import io.vertx.php.ext.web.Session;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RoutingContext")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class RoutingContext extends VertxGenVariable0Wrapper<io.vertx.ext.web.RoutingContext>{
    
    private RoutingContext(Environment env, io.vertx.ext.web.RoutingContext wrappedObject){
        super(env, wrappedObject);
    }
    public static  RoutingContext __create(Environment env, io.vertx.ext.web.RoutingContext wrappedObject){
        return new RoutingContext(env, wrappedObject);
    }

    @Signature
    public Memory request(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpServerRequest, HttpServerRequest>convReturnVertxGenVariable0(__ENV__, HttpServerRequest.class, HttpServerRequest::__create, this.getWrappedObject().request());
    }/*1*/

    @Signature
    public Memory response(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpServerResponse, HttpServerResponse>convReturnVertxGenVariable0(__ENV__, HttpServerResponse.class, HttpServerResponse::__create, this.getWrappedObject().response());
    }/*1*/

    @Signature
    public void next(Environment __ENV__) {
        this.getWrappedObject().next();
    }/*1*/

    @Signature
    public void fail(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamInteger(__ENV__, arg0));
        } else if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamThrowable(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().remove(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory vertx(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, this.getWrappedObject().vertx());
    }/*1*/

    @Signature
    public Memory mountPoint(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().mountPoint());
    }/*1*/

    @Signature
    public Memory currentRoute(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().currentRoute());
    }/*1*/

    @Signature
    public Memory normalisedPath(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().normalisedPath());
    }/*1*/

    @Signature
    public Memory getCookie(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Cookie, Cookie>convReturnVertxGenVariable0(__ENV__, Cookie.class, Cookie::__create, this.getWrappedObject().getCookie(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addCookie(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.Cookie.class, Cookie.class, arg0)) {
            this.getWrappedObject().addCookie(Utils.  <io.vertx.ext.web.Cookie, Cookie  >convParamVertxGenVariable0(__ENV__, Cookie.class, Cookie::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeCookie(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Cookie, Cookie>convReturnVertxGenVariable0(__ENV__, Cookie.class, Cookie::__create, this.getWrappedObject().removeCookie(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory removeCookie(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.Cookie, Cookie>convReturnVertxGenVariable0(__ENV__, Cookie.class, Cookie::__create, this.getWrappedObject().removeCookie(Utils.convParamString(__ENV__, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cookieCount(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().cookieCount());
    }/*1*/

    @Signature
    public Memory cookies(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.Cookie, Cookie>create0(Cookie.class, Cookie::__create),this.getWrappedObject().cookies());
    }/*1*/

    @Signature
    public Memory getBodyAsString(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getBodyAsString());
    }/*4*/

    @Signature
    public Memory getBodyAsString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getBodyAsString(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getBodyAsJson(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().getBodyAsJson());
    }/*1*/

    @Signature
    public Memory getBodyAsJsonArray(Environment __ENV__) {
        return Utils.convReturnJsonArray(__ENV__, this.getWrappedObject().getBodyAsJsonArray());
    }/*1*/

    @Signature
    public Memory getBody(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().getBody());
    }/*1*/

    @Signature
    public Memory fileUploads(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.FileUpload, FileUpload>create0(FileUpload.class, FileUpload::__create),this.getWrappedObject().fileUploads());
    }/*1*/

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public Memory user(Environment __ENV__) {
        return Utils.<io.vertx.ext.auth.User, User>convReturnVertxGenVariable0(__ENV__, User.class, User::__create, this.getWrappedObject().user());
    }/*1*/

    @Signature
    public Memory failure(Environment __ENV__) {
        return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().failure());
    }/*1*/

    @Signature
    public Memory statusCode(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().statusCode());
    }/*1*/

    @Signature
    public Memory getAcceptableContentType(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getAcceptableContentType());
    }/*1*/

    @Signature
    public Memory parsedHeaders(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.ParsedHeaderValues, ParsedHeaderValues>convReturnVertxGenVariable0(__ENV__, ParsedHeaderValues.class, ParsedHeaderValues::__create, this.getWrappedObject().parsedHeaders());
    }/*1*/

    @Signature
    public Memory addHeadersEndHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, this.getWrappedObject().addHeadersEndHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeHeadersEndHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().removeHeadersEndHandler(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addBodyEndHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, this.getWrappedObject().addBodyEndHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeBodyEndHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().removeBodyEndHandler(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory failed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed());
    }/*1*/

    @Signature
    public void setBody(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().setBody(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void setSession(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.Session.class, Session.class, arg0)) {
            this.getWrappedObject().setSession(Utils.  <io.vertx.ext.web.Session, Session  >convParamVertxGenVariable0(__ENV__, Session.class, Session::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void setUser(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.User.class, User.class, arg0)) {
            this.getWrappedObject().setUser(Utils.  <io.vertx.ext.auth.User, User  >convParamVertxGenVariable0(__ENV__, User.class, User::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void clearUser(Environment __ENV__) {
        this.getWrappedObject().clearUser();
    }/*1*/

    @Signature
    public void setAcceptableContentType(Environment __ENV__, Memory arg0) {
        if(Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setAcceptableContentType(Utils.convParamString(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void reroute(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().reroute(Utils.convParamString(__ENV__, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void reroute(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().reroute(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory acceptableLocales(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.Locale, Locale>create0(Locale.class, Locale::__create),this.getWrappedObject().acceptableLocales());
    }/*1*/

    @Signature
    public Memory acceptableLanguages(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.LanguageHeader, LanguageHeader>create0(LanguageHeader.class, LanguageHeader::__create),this.getWrappedObject().acceptableLanguages());
    }/*1*/

    @Signature
    public Memory preferredLocale(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Locale, Locale>convReturnVertxGenVariable0(__ENV__, Locale.class, Locale::__create, this.getWrappedObject().preferredLocale());
    }/*1*/

    @Signature
    public Memory preferredLanguage(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.LanguageHeader, LanguageHeader>convReturnVertxGenVariable0(__ENV__, LanguageHeader.class, LanguageHeader::__create, this.getWrappedObject().preferredLanguage());
    }/*1*/

    @Signature
    public Memory pathParams(Environment __ENV__) {
        return Utils.convReturnMap(__ENV__, TypeConverter.STRING,this.getWrappedObject().pathParams());
    }/*1*/

    @Signature
    public Memory pathParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().pathParam(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory queryParams(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().queryParams());
    }/*1*/

    @Signature
    public Memory queryParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().queryParam(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
