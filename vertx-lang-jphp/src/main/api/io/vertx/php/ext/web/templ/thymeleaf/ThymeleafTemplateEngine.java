package io.vertx.php.ext.web.templ.thymeleaf;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.RoutingContext;
import org.thymeleaf.templatemode.TemplateMode;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ThymeleafTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\thymeleaf")
@SuppressWarnings("ALL")
public class ThymeleafTemplateEngine extends VertxGenVariable0Wrapper<io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine>{
    
    private ThymeleafTemplateEngine(Environment env, io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }
    public static  ThymeleafTemplateEngine __create(Environment env, io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine wrappedObject){
        return new ThymeleafTemplateEngine(env, wrappedObject);
    }

    @Signature
    public void render(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().render(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void render(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().render(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isCachingEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isCachingEnabled());
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine, ThymeleafTemplateEngine>convReturnVertxGenVariable0(__ENV__, ThymeleafTemplateEngine.class, ThymeleafTemplateEngine::__create, io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine.create());
    }/*1*/

    @Signature
    public Memory setMode(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, TemplateMode.class, arg0)) {
            this.getWrappedObject().setMode(Utils.convParamEnum(__ENV__, TemplateMode.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
