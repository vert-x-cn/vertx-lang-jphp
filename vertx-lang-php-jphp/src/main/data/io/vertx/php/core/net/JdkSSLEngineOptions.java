package io.vertx.php.core.net;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JdkSSLEngineOptions")
@Namespace("io\\vertx\\php\\core\\net")
//false
public  class JdkSSLEngineOptions extends DataObjectWrapper<io.vertx.core.net.JdkSSLEngineOptions> { 
    public JdkSSLEngineOptions(Environment env, io.vertx.core.net.JdkSSLEngineOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JdkSSLEngineOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.net.JdkSSLEngineOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.net.JdkSSLEngineOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }
}
