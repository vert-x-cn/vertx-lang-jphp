package io.vertx.php.core.shareddata;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("Lock")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class Lock extends BaseWrapper<io.vertx.core.shareddata.Lock> {
    
    public Lock(Environment env, io.vertx.core.shareddata.Lock wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Lock(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.shareddata.Lock getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void release(){
            }

}
