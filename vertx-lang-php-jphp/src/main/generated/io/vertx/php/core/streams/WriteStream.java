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
@Name("WriteStream")
@Namespace("io\\vertx\\php\\core\\streams")
public class WriteStream extends BaseWrapper<io.vertx.core.streams.WriteStream<Memory>> {
    
    public WriteStream(Environment env, io.vertx.core.streams.WriteStream<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public WriteStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.streams.WriteStream<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public WriteStream drainHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void end(){
            }
   
    @Signature
    //true
    public void end(Memory t){
            }
   
    @Signature
    //false
    public WriteStream exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WriteStream setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public WriteStream write(Memory data){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
