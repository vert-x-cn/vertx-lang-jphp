package io.vertx.php.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.WriteOption;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("UpdateOptions")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class UpdateOptions extends DataObjectWrapper<io.vertx.ext.mongo.UpdateOptions> { 
    public UpdateOptions(Environment env, io.vertx.ext.mongo.UpdateOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public UpdateOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.UpdateOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.UpdateOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isMulti(){ 
        return this.getWrappedObject().isMulti();
    }

    @Signature
    public UpdateOptions setMulti(boolean multi){ 
        this.getWrappedObject().setMulti(multi);
        return this;
    }

    @Signature
    public boolean isReturningNewDocument(){ 
        return this.getWrappedObject().isReturningNewDocument();
    }

    @Signature
    public UpdateOptions setReturningNewDocument(boolean returningNewDocument){ 
        this.getWrappedObject().setReturningNewDocument(returningNewDocument);
        return this;
    }

    @Signature
    public boolean isUpsert(){ 
        return this.getWrappedObject().isUpsert();
    }

    @Signature
    public UpdateOptions setUpsert(boolean upsert){ 
        this.getWrappedObject().setUpsert(upsert);
        return this;
    }

    @Signature
    public WriteOption getWriteOption(){ 
        return this.getWrappedObject().getWriteOption();
    }

    @Signature
    public UpdateOptions setWriteOption(WriteOption writeOption){ 
        this.getWrappedObject().setWriteOption(writeOption);
        return this;
    }
}
