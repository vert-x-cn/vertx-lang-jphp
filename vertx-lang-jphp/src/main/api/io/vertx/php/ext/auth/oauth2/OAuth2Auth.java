package io.vertx.php.ext.auth.oauth2;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.User;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("OAuth2Auth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
@SuppressWarnings("ALL")
public class OAuth2Auth extends VertxGenVariable0Wrapper<io.vertx.ext.auth.oauth2.OAuth2Auth>{
    
    private OAuth2Auth(Environment env, io.vertx.ext.auth.oauth2.OAuth2Auth wrappedObject){
        super(env, wrappedObject);
    }
    public static  OAuth2Auth __create(Environment env, io.vertx.ext.auth.oauth2.OAuth2Auth wrappedObject){
        return new OAuth2Auth(env, wrappedObject);
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
    public void verifyIsUsingPassword(Environment __ENV__) {
        this.getWrappedObject().verifyIsUsingPassword();
    }/*1*/

    @Signature
    public static Memory createKeycloak(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, OAuth2FlowType.class, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>convReturnVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, io.vertx.ext.auth.oauth2.OAuth2Auth.createKeycloak(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamEnum(__ENV__, OAuth2FlowType.class, arg1), Utils.convParamJsonObject(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, OAuth2FlowType.class, arg1)) {
            return Utils.<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>convReturnVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, io.vertx.ext.auth.oauth2.OAuth2Auth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamEnum(__ENV__, OAuth2FlowType.class, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, OAuth2FlowType.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.auth.oauth2.OAuth2ClientOptions.class, arg2)) {
            return Utils.<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>convReturnVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, io.vertx.ext.auth.oauth2.OAuth2Auth.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamEnum(__ENV__, OAuth2FlowType.class, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.auth.oauth2.OAuth2ClientOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory authorizeURL(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().authorizeURL(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getToken(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getToken(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>create0(AccessToken.class, AccessToken::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory hasJWTToken(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().hasJWTToken());
    }/*1*/

    @Signature
    public Memory decodeToken(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().decodeToken(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>create0(AccessToken.class, AccessToken::__create), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory introspectToken(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().introspectToken(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>create0(AccessToken.class, AccessToken::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory introspectToken(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().introspectToken(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>create0(AccessToken.class, AccessToken::__create), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getScopeSeparator(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getScopeSeparator());
    }/*1*/

    @Signature
    public Memory getFlowType(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().getFlowType());
    }/*1*/

    @Signature
    public Memory loadJWK(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().loadJWK(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
