package io.vertx.php.ext.web.handler.sockjs;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.Set;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("SockJSHandlerOptions")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
//false
public  class SockJSHandlerOptions extends DataObjectWrapper<io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions> { 
    public SockJSHandlerOptions(Environment env, io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SockJSHandlerOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public SockJSHandlerOptions addDisabledTransport(String disabledTransports){ 
        this.getWrappedObject().addDisabledTransport(disabledTransports);
        return this;
    }

    @Signature
    public Set<String> getDisabledTransports(){ 
        return this.getWrappedObject().getDisabledTransports();
    }

    @Signature
    public long getHeartbeatInterval(){ 
        return this.getWrappedObject().getHeartbeatInterval();
    }

    @Signature
    public SockJSHandlerOptions setHeartbeatInterval(long heartbeatInterval){ 
        this.getWrappedObject().setHeartbeatInterval(heartbeatInterval);
        return this;
    }

    @Signature
    public boolean isInsertJSESSIONID(){ 
        return this.getWrappedObject().isInsertJSESSIONID();
    }

    @Signature
    public SockJSHandlerOptions setInsertJSESSIONID(boolean insertJSESSIONID){ 
        this.getWrappedObject().setInsertJSESSIONID(insertJSESSIONID);
        return this;
    }

    @Signature
    public String getLibraryURL(){ 
        return this.getWrappedObject().getLibraryURL();
    }

    @Signature
    public SockJSHandlerOptions setLibraryURL(String libraryURL){ 
        this.getWrappedObject().setLibraryURL(libraryURL);
        return this;
    }

    @Signature
    public int getMaxBytesStreaming(){ 
        return this.getWrappedObject().getMaxBytesStreaming();
    }

    @Signature
    public SockJSHandlerOptions setMaxBytesStreaming(int maxBytesStreaming){ 
        this.getWrappedObject().setMaxBytesStreaming(maxBytesStreaming);
        return this;
    }

    @Signature
    public long getSessionTimeout(){ 
        return this.getWrappedObject().getSessionTimeout();
    }

    @Signature
    public SockJSHandlerOptions setSessionTimeout(long sessionTimeout){ 
        this.getWrappedObject().setSessionTimeout(sessionTimeout);
        return this;
    }
}
