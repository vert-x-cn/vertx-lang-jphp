package io.vertx.php.ext.auth.oauth2;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.auth.oauth2.OAuth2Response;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AccessToken")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
@SuppressWarnings("ALL")
public class AccessToken extends VertxGenVariable0Wrapper<io.vertx.ext.auth.oauth2.AccessToken>{
    
    private AccessToken(Environment env, io.vertx.ext.auth.oauth2.AccessToken wrappedObject){
        super(env, wrappedObject);
    }
    public static  AccessToken __create(Environment env, io.vertx.ext.auth.oauth2.AccessToken wrappedObject){
        return new AccessToken(env, wrappedObject);
    }

    @Signature
    public Memory isAuthorized(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().isAuthorized(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isAuthorised(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().isAuthorised(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clearCache(Environment __ENV__) {
        this.getWrappedObject().clearCache();
        return toMemory();
    }/*1*/

    @Signature
    public Memory principal(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().principal());
    }/*1*/

    @Signature
    public void setAuthProvider(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            this.getWrappedObject().setAuthProvider(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory expired(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().expired());
    }/*1*/

    @Signature
    public Memory accessToken(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().accessToken());
    }/*1*/

    @Signature
    public Memory refreshToken(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().refreshToken());
    }/*1*/

    @Signature
    public Memory idToken(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().idToken());
    }/*1*/

    @Signature
    public Memory opaqueAccessToken(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().opaqueAccessToken());
    }/*1*/

    @Signature
    public Memory opaqueRefreshToken(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().opaqueRefreshToken());
    }/*1*/

    @Signature
    public Memory opaqueIdToken(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().opaqueIdToken());
    }/*1*/

    @Signature
    public Memory tokenType(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().tokenType());
    }/*1*/

    @Signature
    public Memory setTrustJWT(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setTrustJWT(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory refresh(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().refresh(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory revoke(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().revoke(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory logout(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().logout(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory introspect(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().introspect(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory introspect(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().introspect(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory userInfo(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().userInfo(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory fetch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().fetch(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response>create0(OAuth2Response.class, OAuth2Response::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory fetch(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().fetch(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg3), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.OAuth2Response, OAuth2Response>create0(OAuth2Response.class, OAuth2Response::__create), arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
