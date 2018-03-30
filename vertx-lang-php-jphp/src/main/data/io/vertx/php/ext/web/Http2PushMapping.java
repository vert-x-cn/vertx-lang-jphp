package io.vertx.php.ext.web;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Http2PushMapping")
@Namespace("io\\vertx\\php\\ext\\web")
//false
public  class Http2PushMapping extends DataObjectWrapper<io.vertx.ext.web.Http2PushMapping> { 
    public Http2PushMapping(Environment env, io.vertx.ext.web.Http2PushMapping wrappedObject) {
        super(env, wrappedObject);
    }

    public Http2PushMapping(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.web.Http2PushMapping();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.web.Http2PushMapping(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getExtensionTarget(){ 
        return this.getWrappedObject().getExtensionTarget();
    }

    @Signature
    public Http2PushMapping setExtensionTarget(String extensionTarget){ 
        this.getWrappedObject().setExtensionTarget(extensionTarget);
        return this;
    }

    @Signature
    public String getFilePath(){ 
        return this.getWrappedObject().getFilePath();
    }

    @Signature
    public Http2PushMapping setFilePath(String filePath){ 
        this.getWrappedObject().setFilePath(filePath);
        return this;
    }

    @Signature
    public boolean isNoPush(){ 
        return this.getWrappedObject().isNoPush();
    }

    @Signature
    public Http2PushMapping setNoPush(boolean noPush){ 
        this.getWrappedObject().setNoPush(noPush);
        return this;
    }
}
