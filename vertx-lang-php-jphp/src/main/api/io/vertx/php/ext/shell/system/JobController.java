package io.vertx.php.ext.shell.system;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.system.Job;
import io.vertx.php.ext.shell.system.Process;
@Name("JobController")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
public interface JobController<S extends io.vertx.ext.shell.system.JobController> extends IWrapper<S>{
    
    @Signature
    default Memory foregroundJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().foregroundJob()
    }
    
    @Signature
    default Memory jobs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().jobs()
    }

    @Signature
    default Memory getJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().getJob(id)
    }

    @Signature
    default Memory createJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().createJob(process, line)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
