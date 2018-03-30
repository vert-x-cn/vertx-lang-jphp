package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.core.net.ProxyType;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ProxyOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class ProxyOptions extends DataObjectWrapper<io.vertx.core.net.ProxyOptions> { 
    public ProxyOptions(Environment env, io.vertx.core.net.ProxyOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ProxyOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.ProxyOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.ProxyOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public ProxyOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public ProxyOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public ProxyOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public ProxyType getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public ProxyOptions setType(ProxyType type){ 
        this.getWrappedObject().setType(type);
        return this;
    }

    @Signature
    public String getUsername(){ 
        return this.getWrappedObject().getUsername();
    }

    @Signature
    public ProxyOptions setUsername(String username){ 
        this.getWrappedObject().setUsername(username);
        return this;
    }
}
