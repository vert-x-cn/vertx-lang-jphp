package io.vertx.php.ext.auth.oauth2;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("OAuth2Response")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
@SuppressWarnings("ALL")
public class OAuth2Response extends VertxGenVariable0Wrapper<io.vertx.ext.auth.oauth2.OAuth2Response>{
    
    private OAuth2Response(Environment env, io.vertx.ext.auth.oauth2.OAuth2Response wrappedObject){
        super(env, wrappedObject);
    }
    public static  OAuth2Response __create(Environment env, io.vertx.ext.auth.oauth2.OAuth2Response wrappedObject){
        return new OAuth2Response(env, wrappedObject);
    }

    @Signature
    public Memory statusCode(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().statusCode());
    }/*1*/

    @Signature
    public Memory headers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().headers());
    }/*1*/

    @Signature
    public Memory getHeader(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getHeader(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory body(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().body());
    }/*1*/

    @Signature
    public Memory jsonObject(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().jsonObject());
    }/*1*/

    @Signature
    public Memory jsonArray(Environment __ENV__) {
        return Utils.convReturnJsonArray(__ENV__, this.getWrappedObject().jsonArray());
    }/*1*/

    @Signature
    public Memory is(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().is(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
