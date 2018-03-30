package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PfxOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class PfxOptions extends DataObjectWrapper<io.vertx.core.net.PfxOptions> { 
    public PfxOptions(Environment env, io.vertx.core.net.PfxOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PfxOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.PfxOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.PfxOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public PfxOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }

    @Signature
    public PfxOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }

    @Signature
    public Buffer getValue(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getValue());
    }

    @Signature
    public PfxOptions setValue(Buffer value){ 
        this.getWrappedObject().setValue(value.getWrappedObject());
        return this;
    }
}
