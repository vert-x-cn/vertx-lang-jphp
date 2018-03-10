package io.vertx.php.core;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.Handler;
import io.vertx.lang.php.wrapper.JavaThrowable;
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
import php.runtime.memory.support.MemoryOperation;
import php.runtime.reflection.ClassEntity;
@Name("Future")
@Namespace("io\\vertx\\php\\core")
public class Future extends BaseWrapper<io.vertx.core.Future<Memory>> {
    
    public Future(Environment env, io.vertx.core.Future<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Future(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.Future<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public JavaThrowable cause(){
        return new JavaThrowable(__env__, this.getWrappedObject().cause());
    }
   
    @Signature
    //false
    public void complete(Memory result){
            }
   
    @Signature
    //false
    public void complete(){
            }
   
    @Signature
    //true
    public Handler completer(){
        return new Handler(__env__, Future.this::handle);
    }
   
    @Signature
    //true
    public Future compose(Closure handler, Future next){
        return new Future(__env__, this.getWrappedObject().compose(e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        },next.getWrappedObject()));
    }
   
    @Signature
    //true
    public Future compose(Closure mapper){
        return new Future(__env__, this.getWrappedObject().compose(e -> {
            return null;
        }));
    }
   
    @Signature
    //false
    public void fail(Memory memory0){
            }
   
    @Signature
    //false
    public boolean failed(){
        return this.getWrappedObject().failed();
    }
   
    @Signature
    //false
    public static Future failedFuture(Environment __env__, Memory memory0){
        return new Future(__env__, io.vertx.core.Future.failedFuture(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public static Future future(Environment __env__, Closure handler){
        return new Future(__env__, io.vertx.core.Future.future(e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public static Future future(Environment __env__){
        return new Future(__env__, io.vertx.core.Future.future());
    }
   
    @Signature
    //false
    public boolean isComplete(){
        return this.getWrappedObject().isComplete();
    }
   
    @Signature
    //true
    public Future map(Memory memory0){
        return new Future(__env__, this.getWrappedObject().map(/*paramSize:2*/null));
    }
   
    @Signature
    //true
    public Future mapEmpty(){
        return new Future(__env__, this.getWrappedObject().mapEmpty());
    }
   
    @Signature
    //true
    public Future otherwise(Memory memory0){
        return new Future(__env__, this.getWrappedObject().otherwise(/*paramSize:2*/null));
    }
   
    @Signature
    //true
    public Future otherwiseEmpty(){
        return new Future(__env__, this.getWrappedObject().otherwiseEmpty());
    }
   
    @Signature
    //true
    public Future recover(Closure mapper){
        return new Future(__env__, this.getWrappedObject().recover(e -> {
            return null;
        }));
    }
   
    @Signature
    //false
    public Memory result(){
        return this.getWrappedObject().result();
    }
   
    @Signature
    //false
    public Future setHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean succeeded(){
        return this.getWrappedObject().succeeded();
    }
   
    @Signature
    //false
    public static Future succeededFuture(Environment __env__){
        return new Future(__env__, io.vertx.core.Future.succeededFuture());
    }
   
    @Signature
    //false
    public static Future succeededFuture(Environment __env__, Memory result){
        return new Future(__env__, io.vertx.core.Future.succeededFuture(result));
    }
   
    @Signature
    //false
    public boolean tryComplete(Memory result){
        return this.getWrappedObject().tryComplete(result);
    }
   
    @Signature
    //false
    public boolean tryComplete(){
        return this.getWrappedObject().tryComplete();
    }
   
    @Signature
    //false
    public boolean tryFail(Memory memory0){
        return this.getWrappedObject().tryFail(/*paramSize:2*/null);
    }
    public void handle(Memory event) {
        Future future = null;
        io.vertx.core.AsyncResult<Memory> e = null;
        try {
            future = (Future) MemoryOperation.get(Future.class, Future.class).convert(__env__, null, event);
        } catch (Throwable t) {

        }
        if (future == null) {
            AsyncResult asyncResult = null;
            try {
                asyncResult = (AsyncResult) MemoryOperation.get(Future.class, Future.class).convert(__env__, null, event);
            } catch (Throwable t) {

            }
            if (asyncResult != null) {
                e = asyncResult.getWrappedObject();
            }
        } else {
            e = future.getWrappedObject();
        }
        if (e != null) {
            this.getWrappedObject().handle(e);
        } else {
            __env__.forwardThrow(new RuntimeException("event is not a async result"));
        }
    }
}
