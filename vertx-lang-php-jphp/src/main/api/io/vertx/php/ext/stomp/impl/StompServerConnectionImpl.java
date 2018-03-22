package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.StompServerConnection;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServerConnectionImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class StompServerConnectionImpl extends VertxGenWrapper<io.vertx.ext.stomp.StompServerConnection> implements StompServerConnection<io.vertx.ext.stomp.StompServerConnection>{
    
    public StompServerConnectionImpl(Environment env, io.vertx.ext.stomp.StompServerConnection wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(frame)
    }

    @Signature
    public void configureHeartbeat(Environment __env__, Memory... args) {
        this.getWrappedObject().configureHeartbeat(ping, pong, pingHandler)
    }

}
