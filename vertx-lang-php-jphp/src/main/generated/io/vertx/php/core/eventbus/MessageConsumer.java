package io.vertx.php.core.eventbus;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.streams.ReadStream;
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
@Name("MessageConsumer")
@Namespace("io\\vertx\\php\\core\\eventbus")
public class MessageConsumer extends BaseWrapper<io.vertx.core.eventbus.MessageConsumer<Memory>> {
    
    public MessageConsumer(Environment env, io.vertx.core.eventbus.MessageConsumer<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public MessageConsumer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.eventbus.MessageConsumer<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String address(){
        return this.getWrappedObject().address();
    }
   
    @Signature
    //false
    public ReadStream bodyStream(){
        return new ReadStream(__env__, this.getWrappedObject().bodyStream());
    }
   
    @Signature
    //false
    public void completionHandler(Closure completionHandler){
            }
   
    @Signature
    //false
    public MessageConsumer endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public MessageConsumer exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public int getMaxBufferedMessages(){
        return this.getWrappedObject().getMaxBufferedMessages();
    }
   
    @Signature
    //false
    public MessageConsumer handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isRegistered(){
        return this.getWrappedObject().isRegistered();
    }
   
    @Signature
    //false
    public MessageConsumer pause(){
         return this;
    }
   
    @Signature
    //false
    public MessageConsumer resume(){
         return this;
    }
   
    @Signature
    //false
    public MessageConsumer setMaxBufferedMessages(int maxBufferedMessages){
        return new MessageConsumer(__env__, this.getWrappedObject().setMaxBufferedMessages(maxBufferedMessages));
    }
   
    @Signature
    //false
    public void unregister(){
            }
   
    @Signature
    //false
    public void unregister(Closure completionHandler){
            }

}
