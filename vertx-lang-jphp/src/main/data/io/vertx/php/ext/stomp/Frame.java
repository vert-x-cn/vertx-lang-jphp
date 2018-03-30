package io.vertx.php.ext.stomp;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.stomp.Frame.Command;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import java.util.Map;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Frame")
@Namespace("io\\vertx\\php\\ext\\stomp")
//false
public  class Frame extends DataObjectWrapper<io.vertx.ext.stomp.Frame> { 
    public Frame(Environment env, io.vertx.ext.stomp.Frame wrappedObject) {
        super(env, wrappedObject);
    }

    public Frame(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.stomp.Frame();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.stomp.Frame(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAck(){ 
        return this.getWrappedObject().getAck();
    }

    @Signature
    public Buffer getBody(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getBody());
    }

    @Signature
    public Frame setBody(Buffer body){ 
        this.getWrappedObject().setBody(body.getWrappedObject());
        return this;
    }

    @Signature
    public String getBodyAsString(){ 
        return this.getWrappedObject().getBodyAsString();
    }

    @Signature
    public Command getCommand(){ 
        return this.getWrappedObject().getCommand();
    }

    @Signature
    public Frame setCommand(Command command){ 
        this.getWrappedObject().setCommand(command);
        return this;
    }

    @Signature
    public String getDestination(){ 
        return this.getWrappedObject().getDestination();
    }

    @Signature
    public Frame setDestination(String destination){ 
        this.getWrappedObject().setDestination(destination);
        return this;
    }

    @Signature
    public Frame addHeader(String key, String value){ 
        this.getWrappedObject().addHeader(key, value);
        return this;
    }

    @Signature
    public Map<String, String> getHeaders(){ 
        return this.getWrappedObject().getHeaders();
    }

    @Signature
    public Frame setHeaders(Map<String, String> headers){ 
        this.getWrappedObject().setHeaders(headers);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Frame setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getReceipt(){ 
        return this.getWrappedObject().getReceipt();
    }

    @Signature
    public String getTransaction(){ 
        return this.getWrappedObject().getTransaction();
    }

    @Signature
    public Frame setTransaction(String transaction){ 
        this.getWrappedObject().setTransaction(transaction);
        return this;
    }
}
