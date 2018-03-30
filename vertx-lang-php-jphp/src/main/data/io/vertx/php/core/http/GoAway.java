package io.vertx.php.core.http;

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
@Name("GoAway")
@Namespace("io\\vertx\\php\\core\\http")
//false
public  class GoAway extends DataObjectWrapper<io.vertx.core.http.GoAway> { 
    public GoAway(Environment env, io.vertx.core.http.GoAway wrappedObject) {
        super(env, wrappedObject);
    }

    public GoAway(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.http.GoAway();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.http.GoAway(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Buffer getDebugData(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getDebugData());
    }

    @Signature
    public GoAway setDebugData(Buffer debugData){ 
        this.getWrappedObject().setDebugData(debugData.getWrappedObject());
        return this;
    }

    @Signature
    public long getErrorCode(){ 
        return this.getWrappedObject().getErrorCode();
    }

    @Signature
    public GoAway setErrorCode(long errorCode){ 
        this.getWrappedObject().setErrorCode(errorCode);
        return this;
    }

    @Signature
    public int getLastStreamId(){ 
        return this.getWrappedObject().getLastStreamId();
    }

    @Signature
    public GoAway setLastStreamId(int lastStreamId){ 
        this.getWrappedObject().setLastStreamId(lastStreamId);
        return this;
    }
}
