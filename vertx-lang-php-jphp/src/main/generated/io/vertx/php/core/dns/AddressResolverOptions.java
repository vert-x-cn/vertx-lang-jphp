package io.vertx.php.core.dns;

import io.vertx.core.json.JsonObject;
import io.vertx.php.core.buffer.Buffer;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("AddressResolverOptions")
@Namespace("io\\vertx\\php\\core\\dns")
public class AddressResolverOptions extends BaseWrapper<io.vertx.core.dns.AddressResolverOptions> { 
    public AddressResolverOptions(Environment env, io.vertx.core.dns.AddressResolverOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public AddressResolverOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof AddressResolverOptions) {
            io.vertx.core.dns.AddressResolverOptions value = ((AddressResolverOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.dns.AddressResolverOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.dns.AddressResolverOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.dns.AddressResolverOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public int getCacheMaxTimeToLive(){ 
        return this.getWrappedObject().getCacheMaxTimeToLive();
    }
    
    @Signature
    public AddressResolverOptions setCacheMaxTimeToLive(int cacheMaxTimeToLive){ 
        this.getWrappedObject().setCacheMaxTimeToLive(cacheMaxTimeToLive);
        return this;
    }
    
    @Signature
    public int getCacheMinTimeToLive(){ 
        return this.getWrappedObject().getCacheMinTimeToLive();
    }
    
    @Signature
    public AddressResolverOptions setCacheMinTimeToLive(int cacheMinTimeToLive){ 
        this.getWrappedObject().setCacheMinTimeToLive(cacheMinTimeToLive);
        return this;
    }
    
    @Signature
    public int getCacheNegativeTimeToLive(){ 
        return this.getWrappedObject().getCacheNegativeTimeToLive();
    }
    
    @Signature
    public AddressResolverOptions setCacheNegativeTimeToLive(int cacheNegativeTimeToLive){ 
        this.getWrappedObject().setCacheNegativeTimeToLive(cacheNegativeTimeToLive);
        return this;
    }
    
    @Signature
    public String getHostsPath(){ 
        return this.getWrappedObject().getHostsPath();
    }
    
    @Signature
    public AddressResolverOptions setHostsPath(String hostsPath){ 
        this.getWrappedObject().setHostsPath(hostsPath);
        return this;
    }
    
    @Signature
    public Buffer getHostsValue(){ 
        return new Buffer(__env__, this.getWrappedObject().getHostsValue());
    }
    
    @Signature
    public AddressResolverOptions setHostsValue(Buffer hostsValue){ 
        this.getWrappedObject().setHostsValue(hostsValue.getWrappedObject());
        return this;
    }
    
    @Signature
    public int getMaxQueries(){ 
        return this.getWrappedObject().getMaxQueries();
    }
    
    @Signature
    public AddressResolverOptions setMaxQueries(int maxQueries){ 
        this.getWrappedObject().setMaxQueries(maxQueries);
        return this;
    }
    
    @Signature
    public int getNdots(){ 
        return this.getWrappedObject().getNdots();
    }
    
    @Signature
    public AddressResolverOptions setNdots(int ndots){ 
        this.getWrappedObject().setNdots(ndots);
        return this;
    }
    
    @Signature
    public boolean isOptResourceEnabled(){ 
        return this.getWrappedObject().isOptResourceEnabled();
    }
    
    @Signature
    public AddressResolverOptions setOptResourceEnabled(boolean optResourceEnabled){ 
        this.getWrappedObject().setOptResourceEnabled(optResourceEnabled);
        return this;
    }
    
    @Signature
    public long getQueryTimeout(){ 
        return this.getWrappedObject().getQueryTimeout();
    }
    
    @Signature
    public AddressResolverOptions setQueryTimeout(long queryTimeout){ 
        this.getWrappedObject().setQueryTimeout(queryTimeout);
        return this;
    }
    
    @Signature
    public boolean getRdFlag(){ 
        return this.getWrappedObject().getRdFlag();
    }
    
    @Signature
    public AddressResolverOptions setRdFlag(boolean rdFlag){ 
        this.getWrappedObject().setRdFlag(rdFlag);
        return this;
    }
    
    @Signature
    public boolean isRotateServers(){ 
        return this.getWrappedObject().isRotateServers();
    }
    
    @Signature
    public AddressResolverOptions setRotateServers(boolean rotateServers){ 
        this.getWrappedObject().setRotateServers(rotateServers);
        return this;
    }
        
    @Signature
    public AddressResolverOptions addSearchDomain(String searchDomains){ 
        this.getWrappedObject().addSearchDomain(searchDomains);
        return this;
    }
        
    @Signature
    public List<String> getSearchDomains(){ 
        return this.getWrappedObject().getSearchDomains();
    }
    
    @Signature
    public AddressResolverOptions setSearchDomains(List<String> searchDomains){ 
        this.getWrappedObject().setSearchDomains(searchDomains);
        return this;
    }
        
    @Signature
    public AddressResolverOptions addServer(String servers){ 
        this.getWrappedObject().addServer(servers);
        return this;
    }
        
    @Signature
    public List<String> getServers(){ 
        return this.getWrappedObject().getServers();
    }
    
    @Signature
    public AddressResolverOptions setServers(List<String> servers){ 
        this.getWrappedObject().setServers(servers);
        return this;
    }
    
}
