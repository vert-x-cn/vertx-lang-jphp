package io.vertx.php.ext.shell.command;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.cli.CommandLine;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CommandProcess")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
@SuppressWarnings("ALL")
public class CommandProcess extends VertxGenVariable0Wrapper<io.vertx.ext.shell.command.CommandProcess>{
    
    private CommandProcess(Environment env, io.vertx.ext.shell.command.CommandProcess wrappedObject){
        super(env, wrappedObject);
    }
    public static  CommandProcess __create(Environment env, io.vertx.ext.shell.command.CommandProcess wrappedObject){
        return new CommandProcess(env, wrappedObject);
    }

    @Signature
    public Memory type(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().type());
    }/*1*/

    @Signature
    public Memory width(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().width());
    }/*1*/

    @Signature
    public Memory height(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().height());
    }/*1*/

    @Signature
    public Memory vertx(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, this.getWrappedObject().vertx());
    }/*1*/

    @Signature
    public Memory argsTokens(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create),this.getWrappedObject().argsTokens());
    }/*1*/

    @Signature
    public Memory args(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().args());
    }/*1*/

    @Signature
    public Memory commandLine(Environment __ENV__) {
        return Utils.<io.vertx.core.cli.CommandLine, CommandLine>convReturnVertxGenVariable0(__ENV__, CommandLine.class, CommandLine::__create, this.getWrappedObject().commandLine());
    }/*1*/

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.session.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public Memory isForeground(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isForeground());
    }/*1*/

    @Signature
    public Memory stdinHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().stdinHandler(Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory interruptHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().interruptHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory suspendHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().suspendHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory resumeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().resumeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().write(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory backgroundHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().backgroundHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory foregroundHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().foregroundHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory resizehandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().resizehandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().end(Utils.convParamInteger(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
