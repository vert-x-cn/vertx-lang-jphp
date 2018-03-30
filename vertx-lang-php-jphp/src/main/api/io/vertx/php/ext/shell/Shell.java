package io.vertx.php.ext.shell;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;
import io.vertx.php.ext.shell.system.Job;
import io.vertx.php.ext.shell.system.JobController;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Shell")
@Namespace("io\\vertx\\php\\ext\\shell")
@SuppressWarnings("ALL")
public class Shell extends VertxGenVariable0Wrapper<io.vertx.ext.shell.Shell>{
    
    private Shell(Environment env, io.vertx.ext.shell.Shell wrappedObject){
        super(env, wrappedObject);
    }
    public static  Shell __create(Environment env, io.vertx.ext.shell.Shell wrappedObject){
        return new Shell(env, wrappedObject);
    }

    @Signature
    public Memory createJob(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create), arg0)) {
            return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().createJob(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create), arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().createJob(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory jobController(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.system.JobController, JobController>convReturnVertxGenVariable0(__ENV__, JobController.class, JobController::__create, this.getWrappedObject().jobController());
    }/*1*/

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.session.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
