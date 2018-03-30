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
@Name("Http2Settings")
@Namespace("io\\vertx\\php\\core\\http")
//false
public  class Http2Settings extends DataObjectWrapper<io.vertx.core.http.Http2Settings> { 
    public Http2Settings(Environment env, io.vertx.core.http.Http2Settings wrappedObject) {
        super(env, wrappedObject);
    }

    public Http2Settings(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.http.Http2Settings();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.http.Http2Settings(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getHeaderTableSize(){ 
        return this.getWrappedObject().getHeaderTableSize();
    }

    @Signature
    public Http2Settings setHeaderTableSize(long headerTableSize){ 
        this.getWrappedObject().setHeaderTableSize(headerTableSize);
        return this;
    }

    @Signature
    public int getInitialWindowSize(){ 
        return this.getWrappedObject().getInitialWindowSize();
    }

    @Signature
    public Http2Settings setInitialWindowSize(int initialWindowSize){ 
        this.getWrappedObject().setInitialWindowSize(initialWindowSize);
        return this;
    }

    @Signature
    public long getMaxConcurrentStreams(){ 
        return this.getWrappedObject().getMaxConcurrentStreams();
    }

    @Signature
    public Http2Settings setMaxConcurrentStreams(long maxConcurrentStreams){ 
        this.getWrappedObject().setMaxConcurrentStreams(maxConcurrentStreams);
        return this;
    }

    @Signature
    public int getMaxFrameSize(){ 
        return this.getWrappedObject().getMaxFrameSize();
    }

    @Signature
    public Http2Settings setMaxFrameSize(int maxFrameSize){ 
        this.getWrappedObject().setMaxFrameSize(maxFrameSize);
        return this;
    }

    @Signature
    public long getMaxHeaderListSize(){ 
        return this.getWrappedObject().getMaxHeaderListSize();
    }

    @Signature
    public Http2Settings setMaxHeaderListSize(long maxHeaderListSize){ 
        this.getWrappedObject().setMaxHeaderListSize(maxHeaderListSize);
        return this;
    }

    @Signature
    public boolean isPushEnabled(){ 
        return this.getWrappedObject().isPushEnabled();
    }

    @Signature
    public Http2Settings setPushEnabled(boolean pushEnabled){ 
        this.getWrappedObject().setPushEnabled(pushEnabled);
        return this;
    }
}
