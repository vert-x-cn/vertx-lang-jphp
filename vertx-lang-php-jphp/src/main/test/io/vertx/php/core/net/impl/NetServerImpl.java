package io.vertx.php.core.net.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.net.NetServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("NetServerImpl")
@Namespace("io\\vertx\\php\\core\\net\\impl")
public class NetServerImpl extends VertxGenWrapper<io.vertx.core.net.NetServer> implements NetServer<io.vertx.core.net.NetServer>{
    
    public NetServerImpl(Environment env, io.vertx.core.net.NetServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory connectHandler(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetServerImpl::new, this.getWrappedObject().connectHandler(handler)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
