package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.web.templ.TemplateEngine;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TemplateHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class TemplateHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.TemplateHandler>{
    
    private TemplateHandler(Environment env, io.vertx.ext.web.handler.TemplateHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  TemplateHandler __create(Environment env, io.vertx.ext.web.handler.TemplateHandler wrappedObject){
        return new TemplateHandler(env, wrappedObject);
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
    public Memory setIndexTemplate(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setIndexTemplate(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.templ.TemplateEngine.class, TemplateEngine.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler>convReturnVertxGenVariable0(__ENV__, TemplateHandler.class, TemplateHandler::__create, io.vertx.ext.web.handler.TemplateHandler.create(Utils.  <io.vertx.ext.web.templ.TemplateEngine, TemplateEngine  >convParamVertxGenVariable0(__ENV__, TemplateEngine.class, TemplateEngine::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.templ.TemplateEngine.class, TemplateEngine.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.handler.TemplateHandler, TemplateHandler>convReturnVertxGenVariable0(__ENV__, TemplateHandler.class, TemplateHandler::__create, io.vertx.ext.web.handler.TemplateHandler.create(Utils.  <io.vertx.ext.web.templ.TemplateEngine, TemplateEngine  >convParamVertxGenVariable0(__ENV__, TemplateEngine.class, TemplateEngine::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
