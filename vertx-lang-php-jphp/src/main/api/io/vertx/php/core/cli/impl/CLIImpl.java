package io.vertx.php.core.cli.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.cli.CLI;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CLIImpl")
@Namespace("io\\vertx\\php\\core\\cli\\impl")
public class CLIImpl extends VertxGenWrapper<io.vertx.core.cli.CLI> implements CLI<io.vertx.core.cli.CLI>{
    
    public CLIImpl(Environment env, io.vertx.core.cli.CLI wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CLIImpl::new, io.vertx.core.cli.CLI.create(name)
    }

    @Signature
    public Memory parse(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandLineImpl::new, this.getWrappedObject().parse(arguments)
    }

    @Signature
    public Memory setName(Environment __env__, Memory... args) {
        this.getWrappedObject().setName(name)
    }

    @Signature
    public Memory setDescription(Environment __env__, Memory... args) {
        this.getWrappedObject().setDescription(desc)
    }

    @Signature
    public Memory setSummary(Environment __env__, Memory... args) {
        this.getWrappedObject().setSummary(summary)
    }

    @Signature
    public Memory setHidden(Environment __env__, Memory... args) {
        this.getWrappedObject().setHidden(hidden)
    }

    @Signature
    public Memory addOption(Environment __env__, Memory... args) {
        this.getWrappedObject().addOption(option)
    }

    @Signature
    public Memory addOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().addOptions(options)
    }

    @Signature
    public Memory setOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setOptions(options)
    }

    @Signature
    public Memory addArgument(Environment __env__, Memory... args) {
        this.getWrappedObject().addArgument(arg)
    }

    @Signature
    public Memory addArguments(Environment __env__, Memory... args) {
        this.getWrappedObject().addArguments(args)
    }

    @Signature
    public Memory setArguments(Environment __env__, Memory... args) {
        this.getWrappedObject().setArguments(args)
    }

    @Signature
    public Memory getOption(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOption(name)
    }

    @Signature
    public Memory getArgument(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getArgument(name)
    }

    @Signature
    public Memory removeOption(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOption(name)
    }

    @Signature
    public Memory removeArgument(Environment __env__, Memory... args) {
        this.getWrappedObject().removeArgument(index)
    }

}
