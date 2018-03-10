package io.vertx.php.core;
import io.vertx.lang.php.wrapper.AsyncResult;
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
@Name("WorkerExecutor")
@Namespace("io\\vertx\\php\\core")
public class WorkerExecutor extends BaseWrapper<io.vertx.core.WorkerExecutor> {
    
    public WorkerExecutor(Environment env, io.vertx.core.WorkerExecutor wrappedObject) {
        super(env, wrappedObject);
    }
    
    public WorkerExecutor(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.WorkerExecutor getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //true
    public void close(){
            }
   
    @Signature
    //false
    public void executeBlocking(Closure blockingCodeHandler, boolean ordered, Closure resultHandler){
            }
   
    @Signature
    //true
    public void executeBlocking(Closure blockingCodeHandler, Closure resultHandler){
            }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }

}
