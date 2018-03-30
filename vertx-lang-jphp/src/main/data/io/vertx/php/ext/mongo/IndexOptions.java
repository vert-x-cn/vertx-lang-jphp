package io.vertx.php.ext.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("IndexOptions")
@Namespace("io\\vertx\\php\\ext\\mongo")
//false
public  class IndexOptions extends DataObjectWrapper<io.vertx.ext.mongo.IndexOptions> { 
    public IndexOptions(Environment env, io.vertx.ext.mongo.IndexOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public IndexOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mongo.IndexOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mongo.IndexOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isBackground(){ 
        return this.getWrappedObject().isBackground();
    }

    @Signature
    public Integer getBits(){ 
        return this.getWrappedObject().getBits();
    }

    @Signature
    public Double getBucketSize(){ 
        return this.getWrappedObject().getBucketSize();
    }

    @Signature
    public String getDefaultLanguage(){ 
        return this.getWrappedObject().getDefaultLanguage();
    }

    @Signature
    public String getLanguageOverride(){ 
        return this.getWrappedObject().getLanguageOverride();
    }

    @Signature
    public Double getMax(){ 
        return this.getWrappedObject().getMax();
    }

    @Signature
    public Double getMin(){ 
        return this.getWrappedObject().getMin();
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Memory getPartialFilterExpression(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getPartialFilterExpression().encode());
    }

    @Signature
    public boolean isSparse(){ 
        return this.getWrappedObject().isSparse();
    }

    @Signature
    public Integer getSphereVersion(){ 
        return this.getWrappedObject().getSphereVersion();
    }

    @Signature
    public Memory getStorageEngine(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getStorageEngine().encode());
    }

    @Signature
    public Integer getTextVersion(){ 
        return this.getWrappedObject().getTextVersion();
    }

    @Signature
    public boolean isUnique(){ 
        return this.getWrappedObject().isUnique();
    }

    @Signature
    public Integer getVersion(){ 
        return this.getWrappedObject().getVersion();
    }

    @Signature
    public Memory getWeights(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getWeights().encode());
    }
}
