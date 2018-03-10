package io.vertx.php.core.dns;
import java.lang.String;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("MxRecord")
@Namespace("io\\vertx\\php\\core\\dns")
public class MxRecord extends BaseWrapper<io.vertx.core.dns.MxRecord> {
    
    public MxRecord(Environment env, io.vertx.core.dns.MxRecord wrappedObject) {
        super(env, wrappedObject);
    }
    
    public MxRecord(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.dns.MxRecord getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String name(){
        return this.getWrappedObject().name();
    }
   
    @Signature
    //false
    public int priority(){
        return this.getWrappedObject().priority();
    }

}
