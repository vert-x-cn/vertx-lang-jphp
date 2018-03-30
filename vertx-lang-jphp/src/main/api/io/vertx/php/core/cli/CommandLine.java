package io.vertx.php.core.cli;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CommandLine")
@Namespace("io\\vertx\\php\\core\\cli")
@SuppressWarnings("ALL")
public class CommandLine extends VertxGenVariable0Wrapper<io.vertx.core.cli.CommandLine>{
    
    private CommandLine(Environment env, io.vertx.core.cli.CommandLine wrappedObject){
        super(env, wrappedObject);
    }
    public static  CommandLine __create(Environment env, io.vertx.core.cli.CommandLine wrappedObject){
        return new CommandLine(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.cli.CLI.class, CLI.class, arg0)) {
            return Utils.<io.vertx.core.cli.CommandLine, CommandLine>convReturnVertxGenVariable0(__ENV__, CommandLine.class, CommandLine::__create, io.vertx.core.cli.CommandLine.create(Utils.  <io.vertx.core.cli.CLI, CLI  >convParamVertxGenVariable0(__ENV__, CLI.class, CLI::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cli(Environment __ENV__) {
        return Utils.<io.vertx.core.cli.CLI, CLI>convReturnVertxGenVariable0(__ENV__, CLI.class, CLI::__create, this.getWrappedObject().cli());
    }/*1*/

    @Signature
    public Memory allArguments(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().allArguments());
    }/*1*/

    @Signature
    public Memory getOptionValue(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().getOptionValue(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getArgumentValue(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().getArgumentValue(Utils.convParamString(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().getArgumentValue(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isFlagEnabled(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isFlagEnabled(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isOptionAssigned(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isOptionAssigned(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRawValues(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().getRawValues(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRawValuesForOption(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().getRawValuesForOption(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRawValuesForArgument(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().getRawValuesForArgument(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRawValueForOption(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getRawValueForOption(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory acceptMoreValues(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().acceptMoreValues(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRawValueForArgument(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getRawValueForArgument(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isArgumentAssigned(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isArgumentAssigned(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Argument.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isSeenInCommandLine(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSeenInCommandLine(Utils.convParamDataObject(__ENV__, io.vertx.core.cli.Option.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isValid(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isValid());
    }/*1*/

    @Signature
    public Memory isAskingForHelp(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isAskingForHelp());
    }/*1*/

}
