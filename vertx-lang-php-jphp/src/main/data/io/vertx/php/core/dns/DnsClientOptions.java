package io.vertx.php.core.dns;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("DnsClientOptions")
@Namespace("io\\vertx\\php\\core\\dns")
//false
public  class DnsClientOptions extends DataObjectWrapper<io.vertx.core.dns.DnsClientOptions> { 
    public DnsClientOptions(Environment env, io.vertx.core.dns.DnsClientOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DnsClientOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.dns.DnsClientOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.dns.DnsClientOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
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
