package io.vertx.php.ext.shell.command;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.cli.CLI;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.ext.shell.system.Process;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Command")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
@SuppressWarnings("ALL")
public class Command extends VertxGenVariable0Wrapper<io.vertx.ext.shell.command.Command>{
    
    private Command(Environment env, io.vertx.ext.shell.command.Command wrappedObject){
        super(env, wrappedObject);
    }
    public static  Command __create(Environment env, io.vertx.ext.shell.command.Command wrappedObject){
        return new Command(env, wrappedObject);
    }

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

    @Signature
    public Memory cli(Environment __ENV__) {
        return Utils.<io.vertx.core.cli.CLI, CLI>convReturnVertxGenVariable0(__ENV__, CLI.class, CLI::__create, this.getWrappedObject().cli());
    }/*1*/

    @Signature
    public Memory createProcess(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.system.Process, Process>convReturnVertxGenVariable0(__ENV__, Process.class, Process::__create, this.getWrappedObject().createProcess());
    }/*4*/

    @Signature
    public Memory createProcess(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create), arg0)) {
            return Utils.<io.vertx.ext.shell.system.Process, Process>convReturnVertxGenVariable0(__ENV__, Process.class, Process::__create, this.getWrappedObject().createProcess(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void complete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.shell.cli.Completion.class, Completion.class, arg0)) {
            this.getWrappedObject().complete(Utils.  <io.vertx.ext.shell.cli.Completion, Completion  >convParamVertxGenVariable0(__ENV__, Completion.class, Completion::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
