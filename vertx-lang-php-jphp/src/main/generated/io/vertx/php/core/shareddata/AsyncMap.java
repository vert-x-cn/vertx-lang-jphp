package io.vertx.php.core.shareddata;
import io.vertx.lang.php.wrapper.AsyncResult;
import java.lang.Boolean;
import java.lang.Integer;
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
@Name("AsyncMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class AsyncMap extends BaseWrapper<io.vertx.core.shareddata.AsyncMap<Memory, Memory>> {
    
    public AsyncMap(Environment env, io.vertx.core.shareddata.AsyncMap<Memory, Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public AsyncMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.shareddata.AsyncMap<Memory, Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void clear(Closure resultHandler){
            }
   
    @Signature
    //false
    public void get(Memory k, Closure resultHandler){
            }
   
    @Signature
    //false
    public void put(Memory k, Memory v, Closure completionHandler){
            }
   
    @Signature
    //false
    public void put(Memory k, Memory v, long ttl, Closure completionHandler){
            }
   
    @Signature
    //false
    public void putIfAbsent(Memory k, Memory v, Closure completionHandler){
            }
   
    @Signature
    //false
    public void putIfAbsent(Memory k, Memory v, long ttl, Closure completionHandler){
            }
   
    @Signature
    //false
    public void remove(Memory k, Closure resultHandler){
            }
   
    @Signature
    //false
    public void removeIfPresent(Memory k, Memory v, Closure resultHandler){
            }
   
    @Signature
    //false
    public void replace(Memory k, Memory v, Closure resultHandler){
            }
   
    @Signature
    //false
    public void replaceIfPresent(Memory k, Memory oldValue, Memory newValue, Closure resultHandler){
            }
   
    @Signature
    //false
    public void size(Closure resultHandler){
            }

}
