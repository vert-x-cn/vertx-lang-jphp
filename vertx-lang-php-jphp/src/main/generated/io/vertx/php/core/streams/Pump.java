package io.vertx.php.core.streams;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("Pump")
@Namespace("io\\vertx\\php\\core\\streams")
public class Pump extends BaseWrapper<io.vertx.core.streams.Pump> {
    
    public Pump(Environment env, io.vertx.core.streams.Pump wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Pump(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.streams.Pump getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public int numberPumped(){
        return this.getWrappedObject().numberPumped();
    }
   
    @Signature
    //false
    public static Pump pump(Environment __env__, ReadStream rs, WriteStream ws){
        return new Pump(__env__, io.vertx.core.streams.Pump.pump(rs.getWrappedObject(),ws.getWrappedObject()));
    }
   
    @Signature
    //false
    public static Pump pump(Environment __env__, ReadStream rs, WriteStream ws, int writeQueueMaxSize){
        return new Pump(__env__, io.vertx.core.streams.Pump.pump(rs.getWrappedObject(),ws.getWrappedObject(),writeQueueMaxSize));
    }
   
    @Signature
    //false
    public Pump setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public Pump start(){
         return this;
    }
   
    @Signature
    //false
    public Pump stop(){
         return this;
    }

}
