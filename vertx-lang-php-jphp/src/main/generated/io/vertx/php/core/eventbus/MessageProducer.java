package io.vertx.php.core.eventbus;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import java.lang.String;
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
@Name("MessageProducer")
@Namespace("io\\vertx\\php\\core\\eventbus")
public class MessageProducer extends BaseWrapper<io.vertx.core.eventbus.MessageProducer<Memory>> {
    
    public MessageProducer(Environment env, io.vertx.core.eventbus.MessageProducer<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public MessageProducer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.eventbus.MessageProducer<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String address(){
        return this.getWrappedObject().address();
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public MessageProducer deliveryOptions(DeliveryOptions options){
         return this;
    }
   
    @Signature
    //false
    public MessageProducer drainHandler(Closure handler){
         return this;
    }
   
    @Signature
    //true
    public void end(Memory t){
            }
   
    @Signature
    //false
    public void end(){
            }
   
    @Signature
    //false
    public MessageProducer exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MessageProducer send(Memory message){
        return new MessageProducer(__env__, this.getWrappedObject().send(message));
    }
   
    @Signature
    //false
    public MessageProducer send(Memory message, Closure replyHandler){
        return new MessageProducer(__env__, this.getWrappedObject().send(message,e -> {
            try{
                replyHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public MessageProducer setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public MessageProducer write(Memory data){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
