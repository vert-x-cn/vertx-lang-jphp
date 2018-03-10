package io.vertx.php.core.cli;
import java.lang.String;
import java.util.List;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("CommandLine")
@Namespace("io\\vertx\\php\\core\\cli")
public class CommandLine extends BaseWrapper<io.vertx.core.cli.CommandLine> {
    
    public CommandLine(Environment env, io.vertx.core.cli.CommandLine wrappedObject) {
        super(env, wrappedObject);
    }
    
    public CommandLine(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.cli.CommandLine getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public boolean acceptMoreValues(Option option){
        return this.getWrappedObject().acceptMoreValues(option.getWrappedObject());
    }
   
    @Signature
    //false
    public List allArguments(){
        return this.getWrappedObject().allArguments();
    }
   
    @Signature
    //false
    public CLI cli(){
        return new CLI(__env__, this.getWrappedObject().cli());
    }
   
    @Signature
    //false
    public static CommandLine create(Environment __env__, CLI cli){
        return new CommandLine(__env__, io.vertx.core.cli.CommandLine.create(cli.getWrappedObject()));
    }
   
    @Signature
    //false
    public Memory getArgumentValue(Memory memory0){
        return this.getWrappedObject().getArgumentValue(/*paramSize:2*/null);
    }
   
    @Signature
    //false
    public Memory getOptionValue(String name){
        return this.getWrappedObject().getOptionValue(name);
    }
   
    @Signature
    //false
    public String getRawValueForArgument(Argument arg){
        return this.getWrappedObject().getRawValueForArgument(arg.getWrappedObject());
    }
   
    @Signature
    //false
    public String getRawValueForOption(Option option){
        return this.getWrappedObject().getRawValueForOption(option.getWrappedObject());
    }
   
    @Signature
    //true
    public List getRawValues(Option option){
        return this.getWrappedObject().getRawValues(option.getWrappedObject());
    }
   
    @Signature
    //false
    public List getRawValuesForArgument(Argument argument){
        return this.getWrappedObject().getRawValuesForArgument(argument.getWrappedObject());
    }
   
    @Signature
    //false
    public List getRawValuesForOption(Option option){
        return this.getWrappedObject().getRawValuesForOption(option.getWrappedObject());
    }
   
    @Signature
    //false
    public boolean isArgumentAssigned(Argument arg){
        return this.getWrappedObject().isArgumentAssigned(arg.getWrappedObject());
    }
   
    @Signature
    //false
    public boolean isAskingForHelp(){
        return this.getWrappedObject().isAskingForHelp();
    }
   
    @Signature
    //false
    public boolean isFlagEnabled(String name){
        return this.getWrappedObject().isFlagEnabled(name);
    }
   
    @Signature
    //false
    public boolean isOptionAssigned(Option option){
        return this.getWrappedObject().isOptionAssigned(option.getWrappedObject());
    }
   
    @Signature
    //false
    public boolean isSeenInCommandLine(Option option){
        return this.getWrappedObject().isSeenInCommandLine(option.getWrappedObject());
    }
   
    @Signature
    //false
    public boolean isValid(){
        return this.getWrappedObject().isValid();
    }

}
