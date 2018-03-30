package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class Session extends VertxGenVariable0Wrapper<io.vertx.ext.web.Session>{
    
    private Session(Environment env, io.vertx.ext.web.Session wrappedObject){
        super(env, wrappedObject);
    }
    public static  Session __create(Environment env, io.vertx.ext.web.Session wrappedObject){
        return new Session(env, wrappedObject);
    }

    @Signature
    public Memory regenerateId(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().regenerateId());
    }/*1*/

    @Signature
    public Memory id(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().id());
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
    public Memory lastAccessed(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().lastAccessed());
    }/*1*/

    @Signature
    public void destroy(Environment __ENV__) {
        this.getWrappedObject().destroy();
    }/*1*/

    @Signature
    public Memory isDestroyed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isDestroyed());
    }/*1*/

    @Signature
    public Memory isRegenerated(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isRegenerated());
    }/*1*/

    @Signature
    public Memory oldId(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().oldId());
    }/*1*/

    @Signature
    public Memory timeout(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().timeout());
    }/*1*/

    @Signature
    public void setAccessed(Environment __ENV__) {
        this.getWrappedObject().setAccessed();
    }/*1*/

}
