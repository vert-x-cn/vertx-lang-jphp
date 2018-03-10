package io.vertx.php.core.dns;
import io.vertx.lang.php.wrapper.AsyncResult;
import java.lang.String;
import java.util.List;
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
@Name("DnsClient")
@Namespace("io\\vertx\\php\\core\\dns")
public class DnsClient extends BaseWrapper<io.vertx.core.dns.DnsClient> {
    
    public DnsClient(Environment env, io.vertx.core.dns.DnsClient wrappedObject) {
        super(env, wrappedObject);
    }
    
    public DnsClient(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.dns.DnsClient getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public DnsClient lookup(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient lookup4(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient lookup6(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveA(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveAAAA(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveCNAME(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveMX(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveNS(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolvePTR(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveSRV(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient resolveTXT(String name, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DnsClient reverseLookup(String ipaddress, Closure handler){
         return this;
    }

}
