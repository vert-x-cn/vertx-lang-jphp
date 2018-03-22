package io.vertx.php.ext.shell.system.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.system.JobController;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JobControllerImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\system\\impl")
public class JobControllerImpl extends VertxGenWrapper<io.vertx.ext.shell.system.JobController> implements JobController<io.vertx.ext.shell.system.JobController>{
    
    public JobControllerImpl(Environment env, io.vertx.ext.shell.system.JobController wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory getJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().getJob(id)
    }

    @Signature
    public Memory createJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().createJob(process, line)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
