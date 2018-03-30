package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.consul.AclTokenType;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("AclToken")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class AclToken extends DataObjectWrapper<io.vertx.ext.consul.AclToken> { 
    public AclToken(Environment env, io.vertx.ext.consul.AclToken wrappedObject) {
        super(env, wrappedObject);
    }

    public AclToken(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.AclToken();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.AclToken(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public AclToken setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public AclToken setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getRules(){ 
        return this.getWrappedObject().getRules();
    }

    @Signature
    public AclToken setRules(String rules){ 
        this.getWrappedObject().setRules(rules);
        return this;
    }

    @Signature
    public AclTokenType getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public AclToken setType(AclTokenType type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
