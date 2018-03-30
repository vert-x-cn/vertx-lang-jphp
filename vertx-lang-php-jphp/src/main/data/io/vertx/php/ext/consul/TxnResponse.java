package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("TxnResponse")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class TxnResponse extends DataObjectWrapper<io.vertx.ext.consul.TxnResponse> { 
    public TxnResponse(Environment env, io.vertx.ext.consul.TxnResponse wrappedObject) {
        super(env, wrappedObject);
    }

    public TxnResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.TxnResponse();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.TxnResponse(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public TxnResponse addError(io.vertx.ext.consul.TxnError errors){ 
        this.getWrappedObject().addError(errors);
        return this;
    }

    @Signature
    public List<TxnError> getErrors(){ 
        return this.getWrappedObject().getErrors().stream().map(v -> new TxnError(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public int getErrorsSize(){ 
        return this.getWrappedObject().getErrorsSize();
    }

    @Signature
    public int getResultsSize(){ 
        return this.getWrappedObject().getResultsSize();
    }
}
