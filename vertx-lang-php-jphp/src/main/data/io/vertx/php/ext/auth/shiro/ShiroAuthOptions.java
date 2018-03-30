package io.vertx.php.ext.auth.shiro;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.shiro.ShiroAuthRealmType;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ShiroAuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\shiro")
//false
public  class ShiroAuthOptions extends DataObjectWrapper<io.vertx.ext.auth.shiro.ShiroAuthOptions> { 
    public ShiroAuthOptions(Environment env, io.vertx.ext.auth.shiro.ShiroAuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ShiroAuthOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.shiro.ShiroAuthOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.shiro.ShiroAuthOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getConfig(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getConfig().encode());
    }

    @Signature
    public ShiroAuthOptions setConfig(Memory config){ 
        this.getWrappedObject().setConfig(new JsonObject(JsonFunctions.json_encode(config)));
        return this;
    }

    @Signature
    public ShiroAuthRealmType getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public ShiroAuthOptions setType(ShiroAuthRealmType type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
