package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("BodyHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class BodyHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.BodyHandler>{
    
    private BodyHandler(Environment env, io.vertx.ext.web.handler.BodyHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  BodyHandler __create(Environment env, io.vertx.ext.web.handler.BodyHandler wrappedObject){
        return new BodyHandler(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.handler.BodyHandler, BodyHandler>convReturnVertxGenVariable0(__ENV__, BodyHandler.class, BodyHandler::__create, io.vertx.ext.web.handler.BodyHandler.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.handler.BodyHandler, BodyHandler>convReturnVertxGenVariable0(__ENV__, BodyHandler.class, BodyHandler::__create, io.vertx.ext.web.handler.BodyHandler.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setBodyLimit(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().setBodyLimit(Utils.convParamLong(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setUploadsDirectory(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setUploadsDirectory(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setMergeFormAttributes(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setMergeFormAttributes(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setDeleteUploadedFilesOnEnd(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setDeleteUploadedFilesOnEnd(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
