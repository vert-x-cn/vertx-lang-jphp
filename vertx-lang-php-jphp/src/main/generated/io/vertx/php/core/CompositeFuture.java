package io.vertx.php.core;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.Handler;
import io.vertx.lang.php.wrapper.JavaThrowable;
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
@Name("CompositeFuture")
@Namespace("io\\vertx\\php\\core")
public class CompositeFuture extends BaseWrapper<io.vertx.core.CompositeFuture> {
    
    public CompositeFuture(Environment env, io.vertx.core.CompositeFuture wrappedObject) {
        super(env, wrappedObject);
    }
    
    public CompositeFuture(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.CompositeFuture getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, Future f1, Future f2){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(f1.getWrappedObject(),f2.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, Future f1, Future f2, Future f3){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, Future f1, Future f2, Future f3, Future f4){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5, Future f6){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject(),f6.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture all(Environment __env__, List<Future> futures){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.all(futures.stream().map(Future::getWrappedObject).collect(Collectors.toList())));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, Future f1, Future f2){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(f1.getWrappedObject(),f2.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, Future f1, Future f2, Future f3){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, Future f1, Future f2, Future f3, Future f4){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5, Future f6){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject(),f6.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture any(Environment __env__, List<Future> futures){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.any(futures.stream().map(Future::getWrappedObject).collect(Collectors.toList())));
    }
   
    @Signature
    //false
    public JavaThrowable cause(int index){
        return new JavaThrowable(__env__, this.getWrappedObject().cause(index));
    }
   
    @Signature
    //false
    public void complete(CompositeFuture result){
            }
   
    @Signature
    //false
    public void complete(){
            }
   
    @Signature
    //true
    public Handler completer(){
        return null;
    }
   
    @Signature
    //true
    public Future compose(Closure handler, Future next){
        return null;
    }
   
    @Signature
    //true
    public Future compose(Closure mapper){
        return null;
    }
   
    @Signature
    //false
    public boolean failed(int index){
        return this.getWrappedObject().failed(index);
    }
   
    @Signature
    //false
    public boolean isComplete(int index){
        return this.getWrappedObject().isComplete(index);
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, Future f1, Future f2){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(f1.getWrappedObject(),f2.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, Future f1, Future f2, Future f3){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, Future f1, Future f2, Future f3, Future f4){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, Future f1, Future f2, Future f3, Future f4, Future f5, Future f6){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(f1.getWrappedObject(),f2.getWrappedObject(),f3.getWrappedObject(),f4.getWrappedObject(),f5.getWrappedObject(),f6.getWrappedObject()));
    }
   
    @Signature
    //false
    public static CompositeFuture join(Environment __env__, List<Future> futures){
        return new CompositeFuture(__env__, io.vertx.core.CompositeFuture.join(futures.stream().map(Future::getWrappedObject).collect(Collectors.toList())));
    }
   
    @Signature
    //true
    public Future map(Closure mapper){
        return null;
    }
   
    @Signature
    //true
    public Future otherwise(Memory memory0){
        return null;
    }
   
    @Signature
    //true
    public Future otherwiseEmpty(){
        return null;
    }
   
    @Signature
    //true
    public Future recover(Closure mapper){
        return null;
    }
   
    @Signature
    //false
    public CompositeFuture result(){
        return new CompositeFuture(__env__, this.getWrappedObject().result());
    }
   
    @Signature
    //false
    public Memory resultAt(int index){
        return this.getWrappedObject().resultAt(index);
    }
   
    @Signature
    //false
    public CompositeFuture setHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public int size(){
        return this.getWrappedObject().size();
    }
   
    @Signature
    //false
    public boolean succeeded(int index){
        return this.getWrappedObject().succeeded(index);
    }
   
    @Signature
    //false
    public boolean tryComplete(CompositeFuture result){
        return this.getWrappedObject().tryComplete(result.getWrappedObject());
    }
   
    @Signature
    //false
    public boolean tryComplete(){
        return this.getWrappedObject().tryComplete();
    }

}
