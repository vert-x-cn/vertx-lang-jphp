package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.TermServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TermServerImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class TermServerImpl extends VertxGenWrapper<io.vertx.ext.shell.term.TermServer> implements TermServer<io.vertx.ext.shell.term.TermServer>{
    
    public TermServerImpl(Environment env, io.vertx.ext.shell.term.TermServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createSSHTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createSSHTermServer(vertx)
    }

    @Signature
    public static Memory createTelnetTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createTelnetTermServer(vertx)
    }

    @Signature
    public static Memory createHttpTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createHttpTermServer(vertx)
    }

    @Signature
    public Memory termHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().termHandler(handler)
    }

    @Signature
    public Memory authProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().authProvider(provider)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
