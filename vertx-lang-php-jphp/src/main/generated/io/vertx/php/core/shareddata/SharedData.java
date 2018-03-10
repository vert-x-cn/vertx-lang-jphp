package io.vertx.php.core.shareddata;
import io.vertx.lang.php.wrapper.AsyncResult;
import java.lang.String;
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
@Name("SharedData")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class SharedData extends BaseWrapper<io.vertx.core.shareddata.SharedData> {
    
    public SharedData(Environment env, io.vertx.core.shareddata.SharedData wrappedObject) {
        super(env, wrappedObject);
    }
    
    public SharedData(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.shareddata.SharedData getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void getClusterWideMap(String name, Closure resultHandler){
            }
   
    @Signature
    //false
    public void getCounter(String name, Closure resultHandler){
            }
   
    @Signature
    //false
    public LocalMap getLocalMap(String name){
        return new LocalMap(__env__, this.getWrappedObject().getLocalMap(name));
    }
   
    @Signature
    //false
    public void getLock(String name, Closure resultHandler){
            }
   
    @Signature
    //false
    public void getLockWithTimeout(String name, long timeout, Closure resultHandler){
            }

}
