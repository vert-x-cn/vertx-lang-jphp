package io.vertx.php.core.datagram;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("DatagramPacket")
@Namespace("io\\vertx\\php\\core\\datagram")
public class DatagramPacket extends BaseWrapper<io.vertx.core.datagram.DatagramPacket> {
    
    public DatagramPacket(Environment env, io.vertx.core.datagram.DatagramPacket wrappedObject) {
        super(env, wrappedObject);
    }
    
    public DatagramPacket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.datagram.DatagramPacket getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public Buffer data(){
        return new Buffer(__env__, this.getWrappedObject().data());
    }
   
    @Signature
    //false
    public SocketAddress sender(){
        return new SocketAddress(__env__, this.getWrappedObject().sender());
    }

}
