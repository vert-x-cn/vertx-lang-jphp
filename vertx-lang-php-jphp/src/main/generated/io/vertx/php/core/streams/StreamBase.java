package io.vertx.php.core.streams;
import io.vertx.lang.php.wrapper.JavaThrowable;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.Closure;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("StreamBase")
@Namespace("io\\vertx\\php\\core\\streams")
public class StreamBase extends BaseWrapper<io.vertx.core.streams.StreamBase> {
    
    public StreamBase(Environment env, io.vertx.core.streams.StreamBase wrappedObject) {
        super(env, wrappedObject);
    }
    
    public StreamBase(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.streams.StreamBase getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public StreamBase exceptionHandler(Closure handler){
         return this;
    }

}
