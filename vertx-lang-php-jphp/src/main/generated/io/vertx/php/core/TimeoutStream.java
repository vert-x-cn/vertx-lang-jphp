package io.vertx.php.core;
import io.vertx.lang.php.wrapper.JavaThrowable;
import java.lang.Long;
import java.lang.Void;
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
@Name("TimeoutStream")
@Namespace("io\\vertx\\php\\core")
public class TimeoutStream extends BaseWrapper<io.vertx.core.TimeoutStream> {
    
    public TimeoutStream(Environment env, io.vertx.core.TimeoutStream wrappedObject) {
        super(env, wrappedObject);
    }
    
    public TimeoutStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.TimeoutStream getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void cancel(){
            }
   
    @Signature
    //false
    public TimeoutStream endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public TimeoutStream exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public TimeoutStream handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public TimeoutStream pause(){
         return this;
    }
   
    @Signature
    //false
    public TimeoutStream resume(){
         return this;
    }

}
