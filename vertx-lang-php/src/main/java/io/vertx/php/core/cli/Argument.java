package io.vertx.php.core.cli;

//6
import com.google.gson.JsonElement;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\cli\\Argument")
public class Argument extends BaseWrapper<io.vertx.core.cli.Argument> { 
    public Argument(Environment env, io.vertx.core.cli.Argument wrappedObject) {
        super(env, wrappedObject);
    }

    public Argument(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof Argument) {
            io.vertx.core.cli.Argument value = ((Argument) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.cli.Argument(value);
        } else {
            this.__wrappedObject = new io.vertx.core.cli.Argument(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.cli.Argument getWrappedObject(){
        return __wrappedObject;
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
