package io.vertx.php.ext.healthchecks;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Status")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
//false
public  class Status extends DataObjectWrapper<io.vertx.ext.healthchecks.Status> { 
    public Status(Environment env, io.vertx.ext.healthchecks.Status wrappedObject) {
        super(env, wrappedObject);
    }

    public Status(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.healthchecks.Status();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.healthchecks.Status(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getData(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getData().encode());
    }

    @Signature
    public Status setData(Memory data){ 
        this.getWrappedObject().setData(new JsonObject(JsonFunctions.json_encode(data)));
        return this;
    }

    @Signature
    public boolean isOk(){ 
        return this.getWrappedObject().isOk();
    }

    @Signature
    public Status setOk(boolean ok){ 
        this.getWrappedObject().setOk(ok);
        return this;
    }

    @Signature
    public boolean isProcedureInError(){ 
        return this.getWrappedObject().isProcedureInError();
    }

    @Signature
    public Status setProcedureInError(boolean procedureInError){ 
        this.getWrappedObject().setProcedureInError(procedureInError);
        return this;
    }
}
