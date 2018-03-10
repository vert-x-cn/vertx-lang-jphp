package io.vertx.php.core.eventbus;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.php.core.MultiMap;
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
@Name("Message")
@Namespace("io\\vertx\\php\\core\\eventbus")
public class Message extends BaseWrapper<io.vertx.core.eventbus.Message<Memory>> {
    
    public Message(Environment env, io.vertx.core.eventbus.Message<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Message(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.eventbus.Message<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String address(){
        return this.getWrappedObject().address();
    }
   
    @Signature
    //false
    public Memory body(){
        return this.getWrappedObject().body();
    }
   
    @Signature
    //false
    public void fail(int failureCode, String message){
            }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
    }
   
    @Signature
    //false
    public boolean isSend(){
        return this.getWrappedObject().isSend();
    }
   
    @Signature
    //false
    public void reply(Object message){
            }
   
    @Signature
    //false
    public void reply(Object message, Memory memory0){
            }
   
    @Signature
    //false
    public void reply(Object message, DeliveryOptions options, Closure replyHandler){
            }
   
    @Signature
    //false
    public String replyAddress(){
        return this.getWrappedObject().replyAddress();
    }

}
