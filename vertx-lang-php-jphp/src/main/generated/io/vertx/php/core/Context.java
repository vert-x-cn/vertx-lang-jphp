package io.vertx.php.core;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import java.lang.String;
import java.lang.Void;
import java.util.List;
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
@Name("Context")
@Namespace("io\\vertx\\php\\core")
public class Context extends BaseWrapper<io.vertx.core.Context> {
    
    public Context(Environment env, io.vertx.core.Context wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Context(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.Context getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public JsonObject config(){
        return this.getWrappedObject().config();
    }
   
    @Signature
    //false
    public String deploymentID(){
        return this.getWrappedObject().deploymentID();
    }
   
    @Signature
    //false
    public Context exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void executeBlocking(Closure blockingCodeHandler, boolean ordered, Closure resultHandler){
            }
   
    @Signature
    //false
    public void executeBlocking(Closure blockingCodeHandler, Closure resultHandler){
            }
   
    @Signature
    //false
    public Memory get(String key){
        return this.getWrappedObject().get(key);
    }
   
    @Signature
    //false
    public int getInstanceCount(){
        return this.getWrappedObject().getInstanceCount();
    }
   
    @Signature
    //false
    public boolean isEventLoopContext(){
        return this.getWrappedObject().isEventLoopContext();
    }
   
    @Signature
    //false
    public boolean isMultiThreadedWorkerContext(){
        return this.getWrappedObject().isMultiThreadedWorkerContext();
    }
   
    @Signature
    //false
    public static boolean isOnEventLoopThread(Environment __env__){
        return io.vertx.core.Context.isOnEventLoopThread();
    }
   
    @Signature
    //false
    public static boolean isOnVertxThread(Environment __env__){
        return io.vertx.core.Context.isOnVertxThread();
    }
   
    @Signature
    //false
    public static boolean isOnWorkerThread(Environment __env__){
        return io.vertx.core.Context.isOnWorkerThread();
    }
   
    @Signature
    //false
    public boolean isWorkerContext(){
        return this.getWrappedObject().isWorkerContext();
    }
   
    @Signature
    //false
    public Vertx owner(){
        return new Vertx(__env__, this.getWrappedObject().owner());
    }
   
    @Signature
    //false
    public List processArgs(){
        return this.getWrappedObject().processArgs();
    }
   
    @Signature
    //false
    public void put(String key, Object value){
            }
   
    @Signature
    //false
    public boolean remove(String key){
        return this.getWrappedObject().remove(key);
    }
   
    @Signature
    //false
    public void runOnContext(Closure action){
            }

}
