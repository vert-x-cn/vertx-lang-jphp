package io.vertx.php.core.shareddata;
import io.vertx.lang.php.wrapper.AsyncResult;
import java.lang.Boolean;
import java.lang.Long;
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
@Name("Counter")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class Counter extends BaseWrapper<io.vertx.core.shareddata.Counter> {
    
    public Counter(Environment env, io.vertx.core.shareddata.Counter wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Counter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.shareddata.Counter getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void addAndGet(long value, Closure resultHandler){
            }
   
    @Signature
    //false
    public void compareAndSet(long expected, long value, Closure resultHandler){
            }
   
    @Signature
    //false
    public void decrementAndGet(Closure resultHandler){
            }
   
    @Signature
    //false
    public void get(Closure resultHandler){
            }
   
    @Signature
    //false
    public void getAndAdd(long value, Closure resultHandler){
            }
   
    @Signature
    //false
    public void getAndIncrement(Closure resultHandler){
            }
   
    @Signature
    //false
    public void incrementAndGet(Closure resultHandler){
            }

}
