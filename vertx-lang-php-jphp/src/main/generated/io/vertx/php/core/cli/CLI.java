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
@Name("CLI")
@Namespace("io\\vertx\\php\\core\\cli")
public class CLI extends BaseWrapper<io.vertx.core.cli.CLI> {
    
    public CLI(Environment env, io.vertx.core.cli.CLI wrappedObject) {
        super(env, wrappedObject);
    }
    
    public CLI(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.cli.CLI getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public CLI addArgument(Argument arg){
         return this;
    }
   
    @Signature
    //false
    public CLI addArguments(List<Argument> args){
         return this;
    }
   
    @Signature
    //false
    public CLI addOption(Option option){
         return this;
    }
   
    @Signature
    //false
    public CLI addOptions(List<Option> options){
         return this;
    }
   
    @Signature
    //false
    public static CLI create(Environment __env__, String name){
        return new CLI(__env__, io.vertx.core.cli.CLI.create(name));
    }
   
    @Signature
    //false
    public Argument getArgument(Memory memory0){
        return new Argument(__env__, this.getWrappedObject().getArgument(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public List getArguments(){
        return this.getWrappedObject().getArguments();
    }
   
    @Signature
    //false
    public String getDescription(){
        return this.getWrappedObject().getDescription();
    }
   
    @Signature
    //false
    public String getName(){
        return this.getWrappedObject().getName();
    }
   
    @Signature
    //false
    public Option getOption(String name){
        return new Option(__env__, this.getWrappedObject().getOption(name));
    }
   
    @Signature
    //false
    public List getOptions(){
        return this.getWrappedObject().getOptions();
    }
   
    @Signature
    //false
    public String getSummary(){
        return this.getWrappedObject().getSummary();
    }
   
    @Signature
    //false
    public boolean isHidden(){
        return this.getWrappedObject().isHidden();
    }
   
    @Signature
    //false
    public CommandLine parse(List<String> arguments){
        return new CommandLine(__env__, this.getWrappedObject().parse(arguments));
    }
   
    @Signature
    //false
    public CommandLine parse(List<String> arguments, boolean validate){
        return new CommandLine(__env__, this.getWrappedObject().parse(arguments,validate));
    }
   
    @Signature
    //false
    public CLI removeArgument(int index){
         return this;
    }
   
    @Signature
    //false
    public CLI removeOption(String name){
         return this;
    }
   
    @Signature
    //false
    public CLI setArguments(List<Argument> args){
         return this;
    }
   
    @Signature
    //false
    public CLI setDescription(String desc){
         return this;
    }
   
    @Signature
    //false
    public CLI setHidden(boolean hidden){
         return this;
    }
   
    @Signature
    //false
    public CLI setName(String name){
         return this;
    }
   
    @Signature
    //false
    public CLI setOptions(List<Option> options){
         return this;
    }
   
    @Signature
    //false
    public CLI setSummary(String summary){
         return this;
    }

}
