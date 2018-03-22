package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TtyImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class TtyImpl extends VertxGenWrapper<io.vertx.ext.shell.term.Tty> implements Tty<io.vertx.ext.shell.term.Tty>{
    
    public TtyImpl(Environment env, io.vertx.ext.shell.term.Tty wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory stdinHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdinHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
    }

}
