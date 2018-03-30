package io.vertx.php.ext.web.templ.pebble;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("PebbleTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\pebble")
@SuppressWarnings("ALL")
public class PebbleTemplateEngine extends VertxGenVariable0Wrapper<io.vertx.ext.web.templ.pebble.PebbleTemplateEngine>{
    
    private PebbleTemplateEngine(Environment env, io.vertx.ext.web.templ.pebble.PebbleTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }
    public static  PebbleTemplateEngine __create(Environment env, io.vertx.ext.web.templ.pebble.PebbleTemplateEngine wrappedObject){
        return new PebbleTemplateEngine(env, wrappedObject);
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
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.web.templ.pebble.PebbleTemplateEngine, PebbleTemplateEngine>convReturnVertxGenVariable0(__ENV__, PebbleTemplateEngine.class, PebbleTemplateEngine::__create, io.vertx.ext.web.templ.pebble.PebbleTemplateEngine.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setExtension(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setExtension(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setMaxCacheSize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setMaxCacheSize(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
