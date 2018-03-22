package io.vertx.php.ext.shell.system.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.system.Process;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ProcessImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\system\\impl")
public class ProcessImpl extends VertxGenWrapper<io.vertx.ext.shell.system.Process> implements Process<io.vertx.ext.shell.system.Process>{
    
    public ProcessImpl(Environment env, io.vertx.ext.shell.system.Process wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory setTty(Environment __env__, Memory... args) {
        this.getWrappedObject().setTty(tty)
    }

    @Signature
    public Memory setSession(Environment __env__, Memory... args) {
        this.getWrappedObject().setSession(session)
    }

    @Signature
    public Memory terminatedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().terminatedHandler(handler)
    }

    @Signature
    public void run(Environment __env__, Memory... args) {
        this.getWrappedObject().run()
    }

    @Signature
    public Memory interrupt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().interrupt()
    }

    @Signature
    public void resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    public void suspend(Environment __env__, Memory... args) {
        this.getWrappedObject().suspend()
    }

    @Signature
    public void terminate(Environment __env__, Memory... args) {
        this.getWrappedObject().terminate()
    }

    @Signature
    public void toBackground(Environment __env__, Memory... args) {
        this.getWrappedObject().toBackground()
    }

    @Signature
    public void toForeground(Environment __env__, Memory... args) {
        this.getWrappedObject().toForeground()
    }

}
