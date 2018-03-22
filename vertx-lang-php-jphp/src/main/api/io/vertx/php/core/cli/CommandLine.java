package io.vertx.php.core.cli;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.cli.CLI;
@Name("CommandLine")
@Namespace("io\\vertx\\php\\core\\cli")
public interface CommandLine<S extends io.vertx.core.cli.CommandLine> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandLineImpl::new, io.vertx.core.cli.CommandLine.create(cli)
    }
    
    @Signature
    default Memory cli(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CLIImpl::new, this.getWrappedObject().cli()
    }
    
    @Signature
    default Memory allArguments(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().allArguments()
    }

    @Signature
    default Memory getOptionValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOptionValue(name)
    }

    @Signature
    default Memory getArgumentValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getArgumentValue(name)
    }

    @Signature
    default Memory isFlagEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isFlagEnabled(name)
    }

    @Signature
    default Memory isOptionAssigned(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isOptionAssigned(option)
    }

    @Signature
    default Memory getRawValues(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValues(option)
    }

    @Signature
    default Memory getRawValuesForOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValuesForOption(option)
    }

    @Signature
    default Memory getRawValuesForArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValuesForArgument(argument)
    }

    @Signature
    default Memory getRawValueForOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValueForOption(option)
    }

    @Signature
    default Memory acceptMoreValues(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptMoreValues(option)
    }

    @Signature
    default Memory getRawValueForArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawValueForArgument(arg)
    }

    @Signature
    default Memory isArgumentAssigned(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isArgumentAssigned(arg)
    }

    @Signature
    default Memory isSeenInCommandLine(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSeenInCommandLine(option)
    }
    
    @Signature
    default Memory isValid(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isValid()
    }
    
    @Signature
    default Memory isAskingForHelp(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isAskingForHelp()
    }

}
