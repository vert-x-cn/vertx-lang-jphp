package io.vertx.php.core.http;

import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\http\\RequestOptions")
public class RequestOptions extends BaseWrapper<io.vertx.core.http.RequestOptions> { 
    public RequestOptions(Environment env, io.vertx.core.http.RequestOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public RequestOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof RequestOptions) {
            io.vertx.core.http.RequestOptions value = ((RequestOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.http.RequestOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.http.RequestOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.http.RequestOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }
    
    @Signature
    public RequestOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }
    
    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }
    
    @Signature
    public RequestOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }
    
    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }
    
    @Signature
    public RequestOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }
    
    @Signature
    public String getURI(){ 
        return this.getWrappedObject().getURI();
    }
    
    @Signature
    public RequestOptions setURI(String uri){ 
        this.getWrappedObject().setURI(uri);
        return this;
    }
    
}
