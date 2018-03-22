package io.vertx.php.core.cli;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.cli.CommandLine;
@Name("CLI")
@Namespace("io\\vertx\\php\\core\\cli")
public interface CLI<S extends io.vertx.core.cli.CLI> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CLIImpl::new, io.vertx.core.cli.CLI.create(name)
    }

    @Signature
    default Memory parse(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandLineImpl::new, this.getWrappedObject().parse(arguments)
    }
    
    @Signature
    default Memory getName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getName()
    }

    @Signature
    default Memory setName(Environment __env__, Memory... args) {
        this.getWrappedObject().setName(name)
    }
    
    @Signature
    default Memory getDescription(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getDescription()
    }

    @Signature
    default Memory setDescription(Environment __env__, Memory... args) {
        this.getWrappedObject().setDescription(desc)
    }
    
    @Signature
    default Memory getSummary(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSummary()
    }

    @Signature
    default Memory setSummary(Environment __env__, Memory... args) {
        this.getWrappedObject().setSummary(summary)
    }
    
    @Signature
    default Memory isHidden(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isHidden()
    }

    @Signature
    default Memory setHidden(Environment __env__, Memory... args) {
        this.getWrappedObject().setHidden(hidden)
    }
    
    @Signature
    default Memory getOptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOptions()
    }

    @Signature
    default Memory addOption(Environment __env__, Memory... args) {
        this.getWrappedObject().addOption(option)
    }

    @Signature
    default Memory addOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().addOptions(options)
    }

    @Signature
    default Memory setOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setOptions(options)
    }
    
    @Signature
    default Memory getArguments(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getArguments()
    }

    @Signature
    default Memory addArgument(Environment __env__, Memory... args) {
        this.getWrappedObject().addArgument(arg)
    }

    @Signature
    default Memory addArguments(Environment __env__, Memory... args) {
        this.getWrappedObject().addArguments(args)
    }

    @Signature
    default Memory setArguments(Environment __env__, Memory... args) {
        this.getWrappedObject().setArguments(args)
    }

    @Signature
    default Memory getOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOption(name)
    }

    @Signature
    default Memory getArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getArgument(name)
    }

    @Signature
    default Memory removeOption(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOption(name)
    }

    @Signature
    default Memory removeArgument(Environment __env__, Memory... args) {
        this.getWrappedObject().removeArgument(index)
    }

}
