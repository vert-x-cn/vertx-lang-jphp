package io.vertx.php.ext.shell.command.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.command.CommandProcess;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandProcessImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\command\\impl")
public class CommandProcessImpl extends VertxGenWrapper<io.vertx.ext.shell.command.CommandProcess> implements CommandProcess<io.vertx.ext.shell.command.CommandProcess>{
    
    public CommandProcessImpl(Environment env, io.vertx.ext.shell.command.CommandProcess wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory stdinHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdinHandler(handler)
    }

    @Signature
    public Memory interruptHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().interruptHandler(handler)
    }

    @Signature
    public Memory suspendHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().suspendHandler(handler)
    }

    @Signature
    public Memory resumeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resumeHandler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory backgroundHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().backgroundHandler(handler)
    }

    @Signature
    public Memory foregroundHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().foregroundHandler(handler)
    }

    @Signature
    public Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

}
