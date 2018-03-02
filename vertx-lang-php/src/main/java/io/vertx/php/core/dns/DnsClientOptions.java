package io.vertx.php.core.dns;

//6
import com.google.gson.JsonElement;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\dns\\DnsClientOptions")
public class DnsClientOptions extends BaseWrapper<io.vertx.core.dns.DnsClientOptions> { 
    public DnsClientOptions(Environment env, io.vertx.core.dns.DnsClientOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DnsClientOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof DnsClientOptions) {
            io.vertx.core.dns.DnsClientOptions value = ((DnsClientOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.dns.DnsClientOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.dns.DnsClientOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.dns.DnsClientOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }
    
    @Signature
    public DnsClientOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }
    
    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }
    
    @Signature
    public DnsClientOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }
    
    @Signature
    public long getQueryTimeout(){ 
        return this.getWrappedObject().getQueryTimeout();
    }
    
    @Signature
    public DnsClientOptions setQueryTimeout(long queryTimeout){ 
        this.getWrappedObject().setQueryTimeout(queryTimeout);
        return this;
    }
    
}
