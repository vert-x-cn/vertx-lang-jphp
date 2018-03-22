package io.vertx.php.ext.shell.system.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.system.Job;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JobImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\system\\impl")
public class JobImpl extends VertxGenWrapper<io.vertx.ext.shell.system.Job> implements Job<io.vertx.ext.shell.system.Job>{
    
    public JobImpl(Environment env, io.vertx.ext.shell.system.Job wrappedObject){
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
    public Memory statusUpdateHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().statusUpdateHandler(handler)
    }

    @Signature
    public Memory resume(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().resume()
    }

}
