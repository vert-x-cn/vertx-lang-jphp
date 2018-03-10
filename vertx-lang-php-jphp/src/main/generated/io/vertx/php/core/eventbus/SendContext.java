package io.vertx.php.core.eventbus;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("SendContext")
@Namespace("io\\vertx\\php\\core\\eventbus")
public class SendContext extends BaseWrapper<io.vertx.core.eventbus.SendContext<Memory>> {
    
    public SendContext(Environment env, io.vertx.core.eventbus.SendContext<Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public SendContext(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.eventbus.SendContext<Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public Message message(){
        return new Message(__env__, this.getWrappedObject().message());
    }
   
    @Signature
    //false
    public void next(){
            }
   
    @Signature
    //false
    public boolean send(){
        return this.getWrappedObject().send();
    }
   
    @Signature
    //false
    public Object sentBody(){
        return this.getWrappedObject().sentBody();
    }

}
