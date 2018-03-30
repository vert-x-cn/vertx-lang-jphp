package io.vertx.php.core.cli;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Argument")
@Namespace("io\\vertx\\php\\core\\cli")
//false
public  class Argument extends DataObjectWrapper<io.vertx.core.cli.Argument> { 
    public Argument(Environment env, io.vertx.core.cli.Argument wrappedObject) {
        super(env, wrappedObject);
    }

    public Argument(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.cli.Argument();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.cli.Argument(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getArgName(){ 
        return this.getWrappedObject().getArgName();
    }

    @Signature
    public Argument setArgName(String argName){ 
        this.getWrappedObject().setArgName(argName);
        return this;
    }

    @Signature
    public String getDefaultValue(){ 
        return this.getWrappedObject().getDefaultValue();
    }

    @Signature
    public Argument setDefaultValue(String defaultValue){ 
        this.getWrappedObject().setDefaultValue(defaultValue);
        return this;
    }

    @Signature
    public String getDescription(){ 
        return this.getWrappedObject().getDescription();
    }

    @Signature
    public Argument setDescription(String description){ 
        this.getWrappedObject().setDescription(description);
        return this;
    }

    @Signature
    public boolean isHidden(){ 
        return this.getWrappedObject().isHidden();
    }

    @Signature
    public Argument setHidden(boolean hidden){ 
        this.getWrappedObject().setHidden(hidden);
        return this;
    }

    @Signature
    public int getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public Argument setIndex(int index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public boolean isMultiValued(){ 
        return this.getWrappedObject().isMultiValued();
    }

    @Signature
    public Argument setMultiValued(boolean multiValued){ 
        this.getWrappedObject().setMultiValued(multiValued);
        return this;
    }

    @Signature
    public boolean isRequired(){ 
        return this.getWrappedObject().isRequired();
    }

    @Signature
    public Argument setRequired(boolean required){ 
        this.getWrappedObject().setRequired(required);
        return this;
    }
}
