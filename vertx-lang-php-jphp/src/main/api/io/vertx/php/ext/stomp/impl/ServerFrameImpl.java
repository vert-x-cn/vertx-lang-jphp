package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.ServerFrame;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServerFrameImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class ServerFrameImpl extends VertxGenWrapper<io.vertx.ext.stomp.ServerFrame> implements ServerFrame<io.vertx.ext.stomp.ServerFrame>{
    
    public ServerFrameImpl(Environment env, io.vertx.ext.stomp.ServerFrame wrappedObject){
        super(env, wrappedObject);
    }

}
