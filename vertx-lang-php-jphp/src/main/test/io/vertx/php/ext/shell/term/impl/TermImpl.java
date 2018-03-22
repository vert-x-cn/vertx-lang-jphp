package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.Term;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TermImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class TermImpl extends VertxGenWrapper<io.vertx.ext.shell.term.Term> implements Term<io.vertx.ext.shell.term.Term>{
    
    public TermImpl(Environment env, io.vertx.ext.shell.term.Term wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
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
    public Memory echo(Environment __env__, Memory... args) {
        this.getWrappedObject().echo(text)
    }

    @Signature
    public Memory setSession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermImpl::new, this.getWrappedObject().setSession(session)
    }

    @Signature
    public Memory interruptHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().interruptHandler(handler)
    }

    @Signature
    public Memory suspendHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().suspendHandler(handler)
    }

    @Signature
    public void readline(Environment __env__, Memory... args) {
        this.getWrappedObject().readline(prompt, lineHandler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

}
