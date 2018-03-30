package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PemTrustOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class PemTrustOptions extends DataObjectWrapper<io.vertx.core.net.PemTrustOptions> { 
    public PemTrustOptions(Environment env, io.vertx.core.net.PemTrustOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PemTrustOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.PemTrustOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.PemTrustOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public PemTrustOptions addCertPath(String certPaths){ 
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
        return this.getWrappedObject().getCertValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }
}
