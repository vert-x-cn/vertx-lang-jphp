package io.vertx.php.core.cli.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.cli.CommandLine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandLineImpl")
@Namespace("io\\vertx\\php\\core\\cli\\impl")
public class CommandLineImpl extends VertxGenWrapper<io.vertx.core.cli.CommandLine> implements CommandLine<io.vertx.core.cli.CommandLine>{
    
    public CommandLineImpl(Environment env, io.vertx.core.cli.CommandLine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandLineImpl::new, io.vertx.core.cli.CommandLine.create(cli)
    }

    @Signature
    public Memory getOptionValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOptionValue(name)
    }

    @Signature
    public Memory getArgumentValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getArgumentValue(name)
    }

    @Signature
    public Memory isFlagEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isFlagEnabled(name)
    }

    @Signature
    public Memory isOptionAssigned(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isOptionAssigned(option)
    }

    @Signature
    public Memory getRawValues(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValues(option)
    }

    @Signature
    public Memory getRawValuesForOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValuesForOption(option)
    }

    @Signature
    public Memory getRawValuesForArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValuesForArgument(argument)
    }

    @Signature
    public Memory getRawValueForOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValueForOption(option)
    }

    @Signature
    public Memory acceptMoreValues(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptMoreValues(option)
    }

    @Signature
    public Memory getRawValueForArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValueForArgument(arg)
    }

    @Signature
    public Memory isArgumentAssigned(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isArgumentAssigned(arg)
    }

    @Signature
    public Memory isSeenInCommandLine(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSeenInCommandLine(option)
    }

}
