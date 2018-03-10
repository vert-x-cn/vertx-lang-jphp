package io.vertx.php.core.metrics;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("Measured")
@Namespace("io\\vertx\\php\\core\\metrics")
public class Measured extends BaseWrapper<io.vertx.core.metrics.Measured> {
    
    public Measured(Environment env, io.vertx.core.metrics.Measured wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Measured(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.metrics.Measured getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }

}
