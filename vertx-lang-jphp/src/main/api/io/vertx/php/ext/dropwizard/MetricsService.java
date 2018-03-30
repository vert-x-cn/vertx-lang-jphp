package io.vertx.php.ext.dropwizard;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.metrics.Measured;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MetricsService")
@Namespace("io\\vertx\\php\\ext\\dropwizard")
@SuppressWarnings("ALL")
public class MetricsService extends VertxGenVariable0Wrapper<io.vertx.ext.dropwizard.MetricsService>{
    
    private MetricsService(Environment env, io.vertx.ext.dropwizard.MetricsService wrappedObject){
        super(env, wrappedObject);
    }
    public static  MetricsService __create(Environment env, io.vertx.ext.dropwizard.MetricsService wrappedObject){
        return new MetricsService(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.dropwizard.MetricsService, MetricsService>convReturnVertxGenVariable0(__ENV__, MetricsService.class, MetricsService::__create, io.vertx.ext.dropwizard.MetricsService.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getBaseName(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.metrics.Measured.class, Measured.class, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getBaseName(Utils.  <io.vertx.core.metrics.Measured, Measured  >convParamVertxGenVariable0(__ENV__, Measured.class, Measured::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory metricsNames(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, TypeConverter.STRING,this.getWrappedObject().metricsNames());
    }/*1*/

    @Signature
    public Memory getMetricsSnapshot(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.metrics.Measured.class, Measured.class, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().getMetricsSnapshot(Utils.  <io.vertx.core.metrics.Measured, Measured  >convParamVertxGenVariable0(__ENV__, Measured.class, Measured::__create, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().getMetricsSnapshot(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
