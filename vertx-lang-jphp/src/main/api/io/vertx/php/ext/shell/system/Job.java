package io.vertx.php.ext.shell.system;
import io.vertx.ext.shell.system.ExecStatus;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.EnumConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.shell.session.Session;
import io.vertx.php.ext.shell.term.Tty;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Job")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
@SuppressWarnings("ALL")
public class Job extends VertxGenVariable0Wrapper<io.vertx.ext.shell.system.Job>{
    
    private Job(Environment env, io.vertx.ext.shell.system.Job wrappedObject){
        super(env, wrappedObject);
    }
    public static  Job __create(Environment env, io.vertx.ext.shell.system.Job wrappedObject){
        return new Job(env, wrappedObject);
    }

    @Signature
    public Memory id(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().id());
    }/*1*/

    @Signature
    public Memory status(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().status());
    }/*1*/

    @Signature
    public Memory lastStopped(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().lastStopped());
    }/*1*/

    @Signature
    public Memory line(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().line());
    }/*1*/

    @Signature
    public Memory setTty(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.term.Tty.class, Tty.class, arg0)) {
            this.getWrappedObject().setTty(Utils.  <io.vertx.ext.shell.term.Tty, Tty  >convParamVertxGenVariable0(__ENV__, Tty.class, Tty::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSession(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.session.Session.class, Session.class, arg0)) {
            this.getWrappedObject().setSession(Utils.  <io.vertx.ext.shell.session.Session, Session  >convParamVertxGenVariable0(__ENV__, Session.class, Session::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory statusUpdateHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().statusUpdateHandler(Utils.convParamHandler(__ENV__, EnumConverter.create(ExecStatus.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory run(Environment __ENV__) {
        this.getWrappedObject().run();
        return toMemory();
    }/*1*/

    @Signature
    public Memory interrupt(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().interrupt());
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().resume());
    }/*4*/

    @Signature
    public Memory resume(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.system.Job, Job>convReturnVertxGenVariable0(__ENV__, Job.class, Job::__create, this.getWrappedObject().resume(Utils.convParamBoolean(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory toBackground(Environment __ENV__) {
        this.getWrappedObject().toBackground();
        return toMemory();
    }/*1*/

    @Signature
    public Memory toForeground(Environment __ENV__) {
        this.getWrappedObject().toForeground();
        return toMemory();
    }/*1*/

    @Signature
    public Memory suspend(Environment __ENV__) {
        this.getWrappedObject().suspend();
        return toMemory();
    }/*1*/

    @Signature
    public void terminate(Environment __ENV__) {
        this.getWrappedObject().terminate();
    }/*1*/

    @Signature
    public Memory process(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.system.Process, Process>convReturnVertxGenVariable0(__ENV__, Process.class, Process::__create, this.getWrappedObject().process());
    }/*1*/

}
