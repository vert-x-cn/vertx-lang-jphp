package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Cookie")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class Cookie extends VertxGenVariable0Wrapper<io.vertx.ext.web.Cookie>{
    
    private Cookie(Environment env, io.vertx.ext.web.Cookie wrappedObject){
        super(env, wrappedObject);
    }
    public static  Cookie __create(Environment env, io.vertx.ext.web.Cookie wrappedObject){
        return new Cookie(env, wrappedObject);
    }

    @Signature
    public static Memory cookie(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.Cookie, Cookie>convReturnVertxGenVariable0(__ENV__, Cookie.class, Cookie::__create, io.vertx.ext.web.Cookie.cookie(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getName());
    }/*1*/

    @Signature
    public Memory getValue(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getValue());
    }/*1*/

    @Signature
    public Memory setValue(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setValue(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setDomain(Environment __ENV__, Memory arg0) {
        if(Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setDomain(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getDomain(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getDomain());
    }/*1*/

    @Signature
    public Memory setPath(Environment __ENV__, Memory arg0) {
        if(Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setPath(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getPath(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getPath());
    }/*1*/

    @Signature
    public Memory setMaxAge(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().setMaxAge(Utils.convParamLong(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSecure(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setSecure(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setHttpOnly(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setHttpOnly(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory encode(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().encode());
    }/*1*/

    @Signature
    public Memory isChanged(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isChanged());
    }/*1*/

    @Signature
    public void setChanged(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setChanged(Utils.convParamBoolean(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isFromUserAgent(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isFromUserAgent());
    }/*1*/

}
