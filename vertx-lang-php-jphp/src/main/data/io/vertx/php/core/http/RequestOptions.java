package io.vertx.php.core.http;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("RequestOptions")
@Namespace("io\\vertx\\php\\core\\http")
//false
public  class RequestOptions extends DataObjectWrapper<io.vertx.core.http.RequestOptions> { 
    public RequestOptions(Environment env, io.vertx.core.http.RequestOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public RequestOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.http.RequestOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.http.RequestOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
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
