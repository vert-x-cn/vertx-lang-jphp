package io.vertx.php.ext.shell.command;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.cli.CLI;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.php.ext.shell.command.CommandProcess;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandBuilder")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
@SuppressWarnings("ALL")
public class CommandBuilder extends VertxGenVariable0Wrapper<io.vertx.ext.shell.command.CommandBuilder>{
    
    private CommandBuilder(Environment env, io.vertx.ext.shell.command.CommandBuilder wrappedObject){
        super(env, wrappedObject);
    }
    public static  CommandBuilder __create(Environment env, io.vertx.ext.shell.command.CommandBuilder wrappedObject){
        return new CommandBuilder(env, wrappedObject);
    }

    @Signature
    public static Memory command(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.command.CommandBuilder, CommandBuilder>convReturnVertxGenVariable0(__ENV__, CommandBuilder.class, CommandBuilder::__create, io.vertx.ext.shell.command.CommandBuilder.command(Utils.convParamString(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.cli.CLI.class, CLI.class, arg0)) {
            return Utils.<io.vertx.ext.shell.command.CommandBuilder, CommandBuilder>convReturnVertxGenVariable0(__ENV__, CommandBuilder.class, CommandBuilder::__create, io.vertx.ext.shell.command.CommandBuilder.command(Utils.  <io.vertx.core.cli.CLI, CLI  >convParamVertxGenVariable0(__ENV__, CLI.class, CLI::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory processHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().processHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.CommandProcess, CommandProcess>create0(CommandProcess.class, CommandProcess::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory completionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().completionHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.Completion, Completion>create0(Completion.class, Completion::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory build(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.command.Command, Command>convReturnVertxGenVariable0(__ENV__, Command.class, Command::__create, this.getWrappedObject().build(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
