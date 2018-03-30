package io.vertx.php.core.datagram;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DatagramPacket")
@Namespace("io\\vertx\\php\\core\\datagram")
@SuppressWarnings("ALL")
public class DatagramPacket extends VertxGenVariable0Wrapper<io.vertx.core.datagram.DatagramPacket>{
    
    private DatagramPacket(Environment env, io.vertx.core.datagram.DatagramPacket wrappedObject){
        super(env, wrappedObject);
    }
    public static  DatagramPacket __create(Environment env, io.vertx.core.datagram.DatagramPacket wrappedObject){
        return new DatagramPacket(env, wrappedObject);
    }

    @Signature
    public Memory sender(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().sender());
    }/*1*/

    @Signature
    public Memory data(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().data());
    }/*1*/

}
