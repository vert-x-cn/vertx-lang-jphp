package io.vertx.php.core.cli;

import io.vertx.core.json.JsonObject;
import java.util.Set;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Option")
@Namespace("io\\vertx\\php\\core\\cli")
public class Option extends BaseWrapper<io.vertx.core.cli.Option> { 
    public Option(Environment env, io.vertx.core.cli.Option wrappedObject) {
        super(env, wrappedObject);
    }

    public Option(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof Option) {
            io.vertx.core.cli.Option value = ((Option) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.cli.Option(value);
        } else {
            this.__wrappedObject = new io.vertx.core.cli.Option(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.cli.Option getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public String getArgName(){ 
        return this.getWrappedObject().getArgName();
    }
    
    @Signature
    public Option setArgName(String argName){ 
        this.getWrappedObject().setArgName(argName);
        return this;
    }
        
    @Signature
    public Option addChoice(String choices){ 
        this.getWrappedObject().addChoice(choices);
        return this;
    }
        
    @Signature
    public Set<String> getChoices(){ 
        return this.getWrappedObject().getChoices();
    }
    
    @Signature
    public Option setChoices(Set<String> choices){ 
        this.getWrappedObject().setChoices(choices);
        return this;
    }
    
    @Signature
    public String getDefaultValue(){ 
        return this.getWrappedObject().getDefaultValue();
    }
    
    @Signature
    public Option setDefaultValue(String defaultValue){ 
        this.getWrappedObject().setDefaultValue(defaultValue);
        return this;
    }
    
    @Signature
    public String getDescription(){ 
        return this.getWrappedObject().getDescription();
    }
    
    @Signature
    public Option setDescription(String description){ 
        this.getWrappedObject().setDescription(description);
        return this;
    }
    
    @Signature
    public boolean isFlag(){ 
        return this.getWrappedObject().isFlag();
    }
    
    @Signature
    public Option setFlag(boolean flag){ 
        this.getWrappedObject().setFlag(flag);
        return this;
    }
    
    @Signature
    public boolean isHelp(){ 
        return this.getWrappedObject().isHelp();
    }
    
    @Signature
    public Option setHelp(boolean help){ 
        this.getWrappedObject().setHelp(help);
        return this;
    }
    
    @Signature
    public boolean isHidden(){ 
        return this.getWrappedObject().isHidden();
    }
    
    @Signature
    public Option setHidden(boolean hidden){ 
        this.getWrappedObject().setHidden(hidden);
        return this;
    }
    
    @Signature
    public String getLongName(){ 
        return this.getWrappedObject().getLongName();
    }
    
    @Signature
    public Option setLongName(String longName){ 
        this.getWrappedObject().setLongName(longName);
        return this;
    }
    
    @Signature
    public boolean isMultiValued(){ 
        return this.getWrappedObject().isMultiValued();
    }
    
    @Signature
    public Option setMultiValued(boolean multiValued){ 
        this.getWrappedObject().setMultiValued(multiValued);
        return this;
    }
    
    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }
    
    @Signature
    public boolean isRequired(){ 
        return this.getWrappedObject().isRequired();
    }
    
    @Signature
    public Option setRequired(boolean required){ 
        this.getWrappedObject().setRequired(required);
        return this;
    }
    
    @Signature
    public String getShortName(){ 
        return this.getWrappedObject().getShortName();
    }
    
    @Signature
    public Option setShortName(String shortName){ 
        this.getWrappedObject().setShortName(shortName);
        return this;
    }
    
    @Signature
    public boolean isSingleValued(){ 
        return this.getWrappedObject().isSingleValued();
    }
    
    @Signature
    public Option setSingleValued(boolean singleValued){ 
        this.getWrappedObject().setSingleValued(singleValued);
        return this;
    }
    
}
