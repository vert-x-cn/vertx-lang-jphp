package io.vertx.php.core.metrics;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Measured")
@Namespace("io\\vertx\\php\\core\\metrics")
@SuppressWarnings("ALL")
public class Measured extends VertxGenVariable0Wrapper<io.vertx.core.metrics.Measured>{
    
    private Measured(Environment env, io.vertx.core.metrics.Measured wrappedObject){
        super(env, wrappedObject);
    }
    public static  Measured __create(Environment env, io.vertx.core.metrics.Measured wrappedObject){
        return new Measured(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

}
