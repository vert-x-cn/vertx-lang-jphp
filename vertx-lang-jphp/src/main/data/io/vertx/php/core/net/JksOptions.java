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
@Name("JksOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class JksOptions extends DataObjectWrapper<io.vertx.core.net.JksOptions> { 
    public JksOptions(Environment env, io.vertx.core.net.JksOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JksOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.JksOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.JksOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public JksOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }

    @Signature
    public JksOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }

    @Signature
    public Buffer getValue(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getValue());
    }

    @Signature
    public JksOptions setValue(Buffer value){ 
        this.getWrappedObject().setValue(value.getWrappedObject());
        return this;
    }
}
