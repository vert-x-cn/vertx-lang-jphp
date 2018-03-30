package io.vertx.php.config;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ConfigRetrieverOptions")
@Namespace("io\\vertx\\php\\config")
//false
public  class ConfigRetrieverOptions extends DataObjectWrapper<io.vertx.config.ConfigRetrieverOptions> { 
    public ConfigRetrieverOptions(Environment env, io.vertx.config.ConfigRetrieverOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ConfigRetrieverOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.config.ConfigRetrieverOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.config.ConfigRetrieverOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isIncludeDefaultStores(){ 
        return this.getWrappedObject().isIncludeDefaultStores();
    }

    @Signature
    public ConfigRetrieverOptions setIncludeDefaultStores(boolean includeDefaultStores){ 
        this.getWrappedObject().setIncludeDefaultStores(includeDefaultStores);
        return this;
    }

    @Signature
    public long getScanPeriod(){ 
        return this.getWrappedObject().getScanPeriod();
    }

    @Signature
    public ConfigRetrieverOptions setScanPeriod(long scanPeriod){ 
        this.getWrappedObject().setScanPeriod(scanPeriod);
        return this;
    }

    @Signature
    public ConfigRetrieverOptions addStore(io.vertx.config.ConfigStoreOptions stores){ 
        this.getWrappedObject().addStore(stores);
        return this;
    }

    @Signature
    public List<ConfigStoreOptions> getStores(){ 
        return this.getWrappedObject().getStores().stream().map(v -> new ConfigStoreOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public ConfigRetrieverOptions setStores(List<ConfigStoreOptions> stores){ 
        this.getWrappedObject().setStores((stores.stream().map(ConfigStoreOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
