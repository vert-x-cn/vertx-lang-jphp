package io.vertx.php.ext.shell.cli.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CliTokenImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\cli\\impl")
public class CliTokenImpl extends VertxGenWrapper<io.vertx.ext.shell.cli.CliToken> implements CliToken<io.vertx.ext.shell.cli.CliToken>{
    
    public CliTokenImpl(Environment env, io.vertx.ext.shell.cli.CliToken wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createText(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CliTokenImpl::new, io.vertx.ext.shell.cli.CliToken.createText(text)
    }

    @Signature
    public static Memory createBlank(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CliTokenImpl::new, io.vertx.ext.shell.cli.CliToken.createBlank(blank)
    }

    @Signature
    public static Memory tokenize(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.shell.cli.CliToken.tokenize(s)
    }

}
