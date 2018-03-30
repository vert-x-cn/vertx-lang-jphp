package io.vertx.php.ext.shell.cli;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CliToken")
@Namespace("io\\vertx\\php\\ext\\shell\\cli")
@SuppressWarnings("ALL")
public class CliToken extends VertxGenVariable0Wrapper<io.vertx.ext.shell.cli.CliToken>{
    
    private CliToken(Environment env, io.vertx.ext.shell.cli.CliToken wrappedObject){
        super(env, wrappedObject);
    }
    public static  CliToken __create(Environment env, io.vertx.ext.shell.cli.CliToken wrappedObject){
        return new CliToken(env, wrappedObject);
    }

    @Signature
    public static Memory createText(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.cli.CliToken, CliToken>convReturnVertxGenVariable0(__ENV__, CliToken.class, CliToken::__create, io.vertx.ext.shell.cli.CliToken.createText(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createBlank(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.shell.cli.CliToken, CliToken>convReturnVertxGenVariable0(__ENV__, CliToken.class, CliToken::__create, io.vertx.ext.shell.cli.CliToken.createBlank(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory value(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().value());
    }/*1*/

    @Signature
    public Memory raw(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().raw());
    }/*1*/

    @Signature
    public Memory isText(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isText());
    }/*1*/

    @Signature
    public Memory isBlank(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isBlank());
    }/*1*/

    @Signature
    public static Memory tokenize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.shell.cli.CliToken, CliToken>create0(CliToken.class, CliToken::__create),io.vertx.ext.shell.cli.CliToken.tokenize(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
