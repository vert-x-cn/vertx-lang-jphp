package io.vertx.php.ext.shell.command;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CommandResolver")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
@SuppressWarnings("ALL")
public class CommandResolver extends VertxGenVariable0Wrapper<io.vertx.ext.shell.command.CommandResolver>{
    
    private CommandResolver(Environment env, io.vertx.ext.shell.command.CommandResolver wrappedObject){
        super(env, wrappedObject);
    }
    public static  CommandResolver __create(Environment env, io.vertx.ext.shell.command.CommandResolver wrappedObject){
        return new CommandResolver(env, wrappedObject);
    }

    @Signature
    public static Memory baseCommands(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.command.CommandResolver, CommandResolver>convReturnVertxGenVariable0(__ENV__, CommandResolver.class, CommandResolver::__create, io.vertx.ext.shell.command.CommandResolver.baseCommands(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commands(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create),this.getWrappedObject().commands());
    }/*1*/

    @Signature
    public Memory getCommand(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.command.Command, Command>convReturnVertxGenVariable0(__ENV__, Command.class, Command::__create, this.getWrappedObject().getCommand(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
