package io.vertx.php.ext.web.handler.sockjs;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PermittedOptions")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
//false
public  class PermittedOptions extends DataObjectWrapper<io.vertx.ext.web.handler.sockjs.PermittedOptions> { 
    public PermittedOptions(Environment env, io.vertx.ext.web.handler.sockjs.PermittedOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PermittedOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.PermittedOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.PermittedOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAddress(){ 
        return this.getWrappedObject().getAddress();
    }

    @Signature
    public PermittedOptions setAddress(String address){ 
        this.getWrappedObject().setAddress(address);
        return this;
    }

    @Signature
    public String getAddressRegex(){ 
        return this.getWrappedObject().getAddressRegex();
    }

    @Signature
    public PermittedOptions setAddressRegex(String addressRegex){ 
        this.getWrappedObject().setAddressRegex(addressRegex);
        return this;
    }

    @Signature
    public Memory getMatch(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getMatch().encode());
    }

    @Signature
    public PermittedOptions setMatch(Memory match){ 
        this.getWrappedObject().setMatch(new JsonObject(JsonFunctions.json_encode(match)));
        return this;
    }

    @Signature
    public String getRequiredAuthority(){ 
        return this.getWrappedObject().getRequiredAuthority();
    }

    @Signature
    public PermittedOptions setRequiredAuthority(String requiredAuthority){ 
        this.getWrappedObject().setRequiredAuthority(requiredAuthority);
        return this;
    }
}
