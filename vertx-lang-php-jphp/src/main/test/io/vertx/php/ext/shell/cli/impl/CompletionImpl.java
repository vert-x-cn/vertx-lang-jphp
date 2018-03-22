package io.vertx.php.ext.shell.cli.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CompletionImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\cli\\impl")
public class CompletionImpl extends VertxGenWrapper<io.vertx.ext.shell.cli.Completion> implements Completion<io.vertx.ext.shell.cli.Completion>{
    
    public CompletionImpl(Environment env, io.vertx.ext.shell.cli.Completion wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete(candidates)
    }

}
