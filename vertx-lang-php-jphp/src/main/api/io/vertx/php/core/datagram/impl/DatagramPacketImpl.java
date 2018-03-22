package io.vertx.php.core.datagram.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.datagram.DatagramPacket;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DatagramPacketImpl")
@Namespace("io\\vertx\\php\\core\\datagram\\impl")
public class DatagramPacketImpl extends VertxGenWrapper<io.vertx.core.datagram.DatagramPacket> implements DatagramPacket<io.vertx.core.datagram.DatagramPacket>{
    
    public DatagramPacketImpl(Environment env, io.vertx.core.datagram.DatagramPacket wrappedObject){
        super(env, wrappedObject);
    }

}
