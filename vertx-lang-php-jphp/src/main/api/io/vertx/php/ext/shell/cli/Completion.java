package io.vertx.php.ext.shell.cli;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Completion")
@Namespace("io\\vertx\\php\\ext\\shell\\cli")
@SuppressWarnings("ALL")
public class Completion extends VertxGenVariable0Wrapper<io.vertx.ext.shell.cli.Completion>{
    
    private Completion(Environment env, io.vertx.ext.shell.cli.Completion wrappedObject){
        super(env, wrappedObject);
    }
    public static  Completion __create(Environment env, io.vertx.ext.shell.cli.Completion wrappedObject){
        return new Completion(env, wrappedObject);
    }

    @Signature
    public Memory vertx(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, this.getWrappedObject().vertx());
    }/*1*/

    @Signature
    public Memory session(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.session.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, this.getWrappedObject().session());
    }/*1*/

    @Signature
    public Memory rawLine(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().rawLine());
    }/*1*/

    @Signature
    public Memory lineTokens(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create),this.getWrappedObject().lineTokens());
    }/*1*/

    @Signature
    public void complete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().complete(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void complete(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            this.getWrappedObject().complete(Utils.convParamString(__ENV__, arg0), Utils.convParamBoolean(__ENV__, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
