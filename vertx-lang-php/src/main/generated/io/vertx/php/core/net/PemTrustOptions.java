package io.vertx.php.core.net;

import java.util.List;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import io.vertx.php.core.buffer.Buffer;
import java.util.stream.Collectors;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\net\\PemTrustOptions")
public class PemTrustOptions extends BaseWrapper<io.vertx.core.net.PemTrustOptions> { 
    public PemTrustOptions(Environment env, io.vertx.core.net.PemTrustOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PemTrustOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof PemTrustOptions) {
            io.vertx.core.net.PemTrustOptions value = ((PemTrustOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.PemTrustOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.PemTrustOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.PemTrustOptions getWrappedObject(){
        return __wrappedObject;
    }
        
    @Signature
    public PemTrustOptions addCertPath(java.lang.String certPaths){ 
        this.getWrappedObject().addCertPath(certPaths);
        return this;
    }
        
    @Signature
    public List<String> getCertPaths(){ 
        return this.getWrappedObject().getCertPaths();
    }
        
    @Signature
    public PemTrustOptions addCertValue(io.vertx.core.buffer.Buffer certValues){ 
        this.getWrappedObject().addCertValue(certValues);
        return this;
    }
        
    @Signature
    public List<Buffer> getCertValues(){ 
        return this.getWrappedObject().getCertValues().stream().map(v -> new Buffer(__env__, v)).collect(Collectors.toList());
    }
    
}
