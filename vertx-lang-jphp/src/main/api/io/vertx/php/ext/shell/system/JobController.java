package io.vertx.php.ext.shell.system;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("JobController")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
@SuppressWarnings("ALL")
public class JobController extends VertxGenVariable0Wrapper<io.vertx.ext.shell.system.JobController>{
    
    private JobController(Environment env, io.vertx.ext.shell.system.JobController wrappedObject){
        super(env, wrappedObject);
    }
    public static  JobController __create(Environment env, io.vertx.ext.shell.system.JobController wrappedObject){
        return new JobController(env, wrappedObject);
    }

    @Signature
    public Memory foregroundJob(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().foregroundJob());
    }/*1*/

    @Signature
    public Memory jobs(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.system.Job, Job>create0(Job.class, Job::__create),this.getWrappedObject().jobs());
    }/*1*/

    @Signature
    public Memory getJob(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().getJob(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createJob(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.system.Process.class, Process.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().createJob(Utils.  <io.vertx.ext.shell.system.Process, Process  >convParamVertxGenVariable0(__ENV__, Process.class, Process::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
