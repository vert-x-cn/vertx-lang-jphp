package io.vertx.php.core.net.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.net.NetClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("NetClientImpl")
@Namespace("io\\vertx\\php\\core\\net\\impl")
public class NetClientImpl extends VertxGenWrapper<io.vertx.core.net.NetClient> implements NetClient<io.vertx.core.net.NetClient>{
    
    public NetClientImpl(Environment env, io.vertx.core.net.NetClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(remoteAddress, connectHandler)
    }

}
