package io.vertx.php.core.cli;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.cli.CommandLine;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CLI")
@Namespace("io\\vertx\\php\\core\\cli")
@SuppressWarnings("ALL")
public class CLI extends VertxGenVariable0Wrapper<io.vertx.core.cli.CLI>{
    
    private CLI(Environment env, io.vertx.core.cli.CLI wrappedObject){
        super(env, wrappedObject);
    }
    public static  CLI __create(Environment env, io.vertx.core.cli.CLI wrappedObject){
        return new CLI(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.cli.CLI, CLI>convReturnVertxGenVariable0(__ENV__, CLI.class, CLI::__create, io.vertx.core.cli.CLI.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory parse(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0)) {
            return Utils.<io.vertx.core.cli.CommandLine, CommandLine>convReturnVertxGenVariable0(__ENV__, CommandLine.class, CommandLine::__create, this.getWrappedObject().parse(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory parse(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.core.cli.CommandLine, CommandLine>convReturnVertxGenVariable0(__ENV__, CommandLine.class, CommandLine::__create, this.getWrappedObject().parse(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getName());
    }/*1*/

    @Signature
    public Memory setName(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setName(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getDescription(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getDescription());
    }/*1*/

    @Signature
    public Memory setDescription(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setDescription(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getSummary(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getSummary());
    }/*1*/

    @Signature
    public Memory setSummary(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setSummary(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isHidden(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isHidden());
    }/*1*/

    @Signature
    public Memory setHidden(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setHidden(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getOptions(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Option.class),this.getWrappedObject().getOptions());
    }/*1*/

    @Signature
    public Memory addOption(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            this.getWrappedObject().addOption(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Option.class), arg0)) {
            this.getWrappedObject().addOptions(Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Option.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Option.class), arg0)) {
            this.getWrappedObject().setOptions(Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Option.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getArguments(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Argument.class),this.getWrappedObject().getArguments());
    }/*1*/

    @Signature
    public Memory addArgument(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)) {
            this.getWrappedObject().addArgument(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addArguments(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Argument.class), arg0)) {
            this.getWrappedObject().addArguments(Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Argument.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setArguments(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Argument.class), arg0)) {
            this.getWrappedObject().setArguments(Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.core.cli.Argument.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getOption(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.core.cli.Option.class, Option::new, this.getWrappedObject().getOption(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getArgument(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.core.cli.Argument.class, Argument::new, this.getWrappedObject().getArgument(Utils.convParamString(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.core.cli.Argument.class, Argument::new, this.getWrappedObject().getArgument(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeOption(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().removeOption(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeArgument(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().removeArgument(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
