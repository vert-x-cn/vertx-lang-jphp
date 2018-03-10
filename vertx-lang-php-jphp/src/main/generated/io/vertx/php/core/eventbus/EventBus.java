package io.vertx.php.core.eventbus;
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
@Name("EventBus")
@Namespace("io\\vertx\\php\\core\\eventbus")
public class EventBus extends BaseWrapper<io.vertx.core.eventbus.EventBus> {
    
    public EventBus(Environment env, io.vertx.core.eventbus.EventBus wrappedObject) {
        super(env, wrappedObject);
    }
    
    public EventBus(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.eventbus.EventBus getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public EventBus addInterceptor(Closure interceptor){
        return new EventBus(__env__, this.getWrappedObject().addInterceptor(e -> {
            try{
                interceptor.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public MessageConsumer consumer(String address){
        return new MessageConsumer(__env__, this.getWrappedObject().consumer(address));
    }
   
    @Signature
    //false
    public MessageConsumer consumer(String address, Closure handler){
        return new MessageConsumer(__env__, this.getWrappedObject().consumer(address,e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public MessageConsumer localConsumer(String address){
        return new MessageConsumer(__env__, this.getWrappedObject().localConsumer(address));
    }
   
    @Signature
    //false
    public MessageConsumer localConsumer(String address, Closure handler){
        return new MessageConsumer(__env__, this.getWrappedObject().localConsumer(address,e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public EventBus publish(String address, Object message){
         return this;
    }
   
    @Signature
    //false
    public EventBus publish(String address, Object message, DeliveryOptions options){
         return this;
    }
   
    @Signature
    //false
    public MessageProducer publisher(String address){
        return new MessageProducer(__env__, this.getWrappedObject().publisher(address));
    }
   
    @Signature
    //false
    public MessageProducer publisher(String address, DeliveryOptions options){
        return new MessageProducer(__env__, this.getWrappedObject().publisher(address,options.getWrappedObject()));
    }
   
    @Signature
    //false
    public EventBus removeInterceptor(Closure interceptor){
        return new EventBus(__env__, this.getWrappedObject().removeInterceptor(e -> {
            try{
                interceptor.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public EventBus send(String address, Object message){
         return this;
    }
   
    @Signature
    //false
    public EventBus send(String address, Object message, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public EventBus send(String address, Object message, DeliveryOptions options, Closure replyHandler){
         return this;
    }
   
    @Signature
    //false
    public MessageProducer sender(String address){
        return new MessageProducer(__env__, this.getWrappedObject().sender(address));
    }
   
    @Signature
    //false
    public MessageProducer sender(String address, DeliveryOptions options){
        return new MessageProducer(__env__, this.getWrappedObject().sender(address,options.getWrappedObject()));
    }

}
