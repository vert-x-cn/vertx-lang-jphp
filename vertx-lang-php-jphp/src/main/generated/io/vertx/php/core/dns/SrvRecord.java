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
@Name("SrvRecord")
@Namespace("io\\vertx\\php\\core\\dns")
public class SrvRecord extends BaseWrapper<io.vertx.core.dns.SrvRecord> {
    
    public SrvRecord(Environment env, io.vertx.core.dns.SrvRecord wrappedObject) {
        super(env, wrappedObject);
    }
    
    public SrvRecord(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.dns.SrvRecord getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String name(){
        return this.getWrappedObject().name();
    }
   
    @Signature
    //false
    public int port(){
        return this.getWrappedObject().port();
    }
   
    @Signature
    //false
    public int priority(){
        return this.getWrappedObject().priority();
    }
   
    @Signature
    //false
    public String protocol(){
        return this.getWrappedObject().protocol();
    }
   
    @Signature
    //false
    public String service(){
        return this.getWrappedObject().service();
    }
   
    @Signature
    //false
    public String target(){
        return this.getWrappedObject().target();
    }
   
    @Signature
    //false
    public int weight(){
        return this.getWrappedObject().weight();
    }

}
