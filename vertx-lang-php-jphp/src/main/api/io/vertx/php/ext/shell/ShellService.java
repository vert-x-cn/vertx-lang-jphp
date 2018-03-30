package io.vertx.php.ext.shell;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.ShellServer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ShellService")
@Namespace("io\\vertx\\php\\ext\\shell")
@SuppressWarnings("ALL")
public class ShellService extends VertxGenVariable0Wrapper<io.vertx.ext.shell.ShellService>{
    
    private ShellService(Environment env, io.vertx.ext.shell.ShellService wrappedObject){
        super(env, wrappedObject);
    }
    public static  ShellService __create(Environment env, io.vertx.ext.shell.ShellService wrappedObject){
        return new ShellService(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.ShellService, ShellService>convReturnVertxGenVariable0(__ENV__, ShellService.class, ShellService::__create, io.vertx.ext.shell.ShellService.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.shell.ShellServiceOptions.class, arg1)) {
            return Utils.<io.vertx.ext.shell.ShellService, ShellService>convReturnVertxGenVariable0(__ENV__, ShellService.class, ShellService::__create, io.vertx.ext.shell.ShellService.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.shell.ShellServiceOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void start(Environment __ENV__) {
        this.getWrappedObject().start();
    }/*4*/

    @Signature
    public void start(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().start(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory server(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.ShellServer, ShellServer>convReturnVertxGenVariable0(__ENV__, ShellServer.class, ShellServer::__create, this.getWrappedObject().server());
    }/*1*/

    @Signature
    public void stop(Environment __ENV__) {
        this.getWrappedObject().stop();
    }/*4*/

    @Signature
    public void stop(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().stop(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
