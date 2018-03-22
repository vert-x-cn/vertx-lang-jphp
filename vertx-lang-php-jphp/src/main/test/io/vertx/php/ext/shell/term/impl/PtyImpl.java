package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.Pty;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("PtyImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class PtyImpl extends VertxGenWrapper<io.vertx.ext.shell.term.Pty> implements Pty<io.vertx.ext.shell.term.Pty>{
    
    public PtyImpl(Environment env, io.vertx.ext.shell.term.Pty wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PtyImpl::new, io.vertx.ext.shell.term.Pty.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PtyImpl::new, io.vertx.ext.shell.term.Pty.create()
    }

    @Signature
    public Memory stdoutHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdoutHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory setSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setSize(width, height)
    }

}
