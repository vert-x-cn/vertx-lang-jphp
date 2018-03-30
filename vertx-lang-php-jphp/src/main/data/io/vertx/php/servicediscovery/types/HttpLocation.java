package io.vertx.php.servicediscovery.types;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("HttpLocation")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
//false
public  class HttpLocation extends DataObjectWrapper<io.vertx.servicediscovery.types.HttpLocation> { 
    public HttpLocation(Environment env, io.vertx.servicediscovery.types.HttpLocation wrappedObject) {
        super(env, wrappedObject);
    }

    public HttpLocation(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.servicediscovery.types.HttpLocation();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.servicediscovery.types.HttpLocation(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getEndpoint(){ 
        return this.getWrappedObject().getEndpoint();
    }

    @Signature
    public HttpLocation setEndpoint(String endpoint){ 
        this.getWrappedObject().setEndpoint(endpoint);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public HttpLocation setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public HttpLocation setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public String getRoot(){ 
        return this.getWrappedObject().getRoot();
    }

    @Signature
    public HttpLocation setRoot(String root){ 
        this.getWrappedObject().setRoot(root);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public HttpLocation setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }
}
