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
@Name("PemKeyCertOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class PemKeyCertOptions extends DataObjectWrapper<io.vertx.core.net.PemKeyCertOptions> { 
    public PemKeyCertOptions(Environment env, io.vertx.core.net.PemKeyCertOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PemKeyCertOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.PemKeyCertOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.PemKeyCertOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public PemKeyCertOptions setCertPath(String certPath){ 
        this.getWrappedObject().setCertPath(certPath);
        return this;
    }

    @Signature
    public List<String> getCertPaths(){ 
        return this.getWrappedObject().getCertPaths();
    }

    @Signature
    public PemKeyCertOptions setCertPaths(List<String> certPaths){ 
        this.getWrappedObject().setCertPaths(certPaths);
        return this;
    }

    @Signature
    public PemKeyCertOptions setCertValue(Buffer certValue){ 
        this.getWrappedObject().setCertValue(certValue.getWrappedObject());
        return this;
    }

    @Signature
    public List<Buffer> getCertValues(){ 
        return this.getWrappedObject().getCertValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public PemKeyCertOptions setCertValues(List<Buffer> certValues){ 
        this.getWrappedObject().setCertValues((certValues.stream().map(Buffer::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public PemKeyCertOptions setKeyPath(String keyPath){ 
        this.getWrappedObject().setKeyPath(keyPath);
        return this;
    }

    @Signature
    public List<String> getKeyPaths(){ 
        return this.getWrappedObject().getKeyPaths();
    }

    @Signature
    public PemKeyCertOptions setKeyPaths(List<String> keyPaths){ 
        this.getWrappedObject().setKeyPaths(keyPaths);
        return this;
    }

    @Signature
    public PemKeyCertOptions setKeyValue(Buffer keyValue){ 
        this.getWrappedObject().setKeyValue(keyValue.getWrappedObject());
        return this;
    }

    @Signature
    public List<Buffer> getKeyValues(){ 
        return this.getWrappedObject().getKeyValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public PemKeyCertOptions setKeyValues(List<Buffer> keyValues){ 
        this.getWrappedObject().setKeyValues((keyValues.stream().map(Buffer::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
