package io.vertx.php.ext.shell.command;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CommandRegistry")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
@SuppressWarnings("ALL")
public class CommandRegistry extends VertxGenVariable0Wrapper<io.vertx.ext.shell.command.CommandRegistry>{
    
    private CommandRegistry(Environment env, io.vertx.ext.shell.command.CommandRegistry wrappedObject){
        super(env, wrappedObject);
    }
    public static  CommandRegistry __create(Environment env, io.vertx.ext.shell.command.CommandRegistry wrappedObject){
        return new CommandRegistry(env, wrappedObject);
    }

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

    @Signature
    public static Memory getShared(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.command.CommandRegistry, CommandRegistry>convReturnVertxGenVariable0(__ENV__, CommandRegistry.class, CommandRegistry::__create, io.vertx.ext.shell.command.CommandRegistry.getShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.shell.command.CommandRegistry, CommandRegistry>convReturnVertxGenVariable0(__ENV__, CommandRegistry.class, CommandRegistry::__create, io.vertx.ext.shell.command.CommandRegistry.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerCommand(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.command.Command.class, Command.class, arg0)) {
            this.getWrappedObject().registerCommand(Utils.  <io.vertx.ext.shell.command.Command, Command  >convParamVertxGenVariable0(__ENV__, Command.class, Command::__create, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory registerCommand(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.command.Command.class, Command.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().registerCommand(Utils.  <io.vertx.ext.shell.command.Command, Command  >convParamVertxGenVariable0(__ENV__, Command.class, Command::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerCommands(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create), arg0)) {
            this.getWrappedObject().registerCommands(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory registerCommands(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create), arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().registerCommands(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create), arg0), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.ext.shell.command.Command, Command>create0(Command.class, Command::__create)), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unregisterCommand(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().unregisterCommand(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory unregisterCommand(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unregisterCommand(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
