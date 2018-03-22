package io.vertx.php.ext.shell;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.system.Job;
import io.vertx.php.ext.shell.system.JobController;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;
@Name("Shell")
@Namespace("io\\vertx\\php\\ext\\shell")
public interface Shell<S extends io.vertx.ext.shell.Shell> extends IWrapper<S>{

    @Signature
    default Memory createJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().createJob(line)
    }
    
    @Signature
    default Memory jobController(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobControllerImpl::new, this.getWrappedObject().jobController()
    }
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().session()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
