package io.vertx.php.core.streams;
import io.vertx.lang.php.wrapper.JavaThrowable;
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
@Name("ReadStream")
@Namespace("io\\vertx\\php\\core\\streams")
public class ReadStream extends BaseWrapper<io.vertx.core.streams.ReadStream<Memory>> {
    
    public ReadStream(Environment env, io.vertx.core.streams.ReadStream<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public ReadStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.streams.ReadStream<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public ReadStream endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream pause(){
         return this;
    }
   
    @Signature
    //false
    public ReadStream resume(){
         return this;
    }

}
