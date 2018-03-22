package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.StompServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServerImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class StompServerImpl extends VertxGenWrapper<io.vertx.ext.stomp.StompServer> implements StompServer<io.vertx.ext.stomp.StompServer>{
    
    public StompServerImpl(Environment env, io.vertx.ext.stomp.StompServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerImpl::new, io.vertx.ext.stomp.StompServer.create(vertx)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public Memory writingFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().writingFrameHandler(handler)
    }

}
