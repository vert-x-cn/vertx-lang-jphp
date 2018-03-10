package io.vertx.php.core.datagram;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.php.core.streams.WriteStream;
import java.lang.String;
import java.lang.Void;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.Closure;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("DatagramSocket")
@Namespace("io\\vertx\\php\\core\\datagram")
public class DatagramSocket extends BaseWrapper<io.vertx.core.datagram.DatagramSocket> {
    
    public DatagramSocket(Environment env, io.vertx.core.datagram.DatagramSocket wrappedObject) {
        super(env, wrappedObject);
    }
    
    public DatagramSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.datagram.DatagramSocket getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public DatagramSocket blockMulticastGroup(String multicastAddress, String sourceToBlock, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket blockMulticastGroup(String multicastAddress, String networkInterface, String sourceToBlock, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void close(Closure handler){
            }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public DatagramSocket endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public DatagramSocket listen(int port, String host, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket listenMulticastGroup(String multicastAddress, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket listenMulticastGroup(String multicastAddress, String networkInterface, String source, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public SocketAddress localAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().localAddress());
    }
   
    @Signature
    //false
    public DatagramSocket pause(){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket resume(){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket send(Memory memory0, int port, String host, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket send(String str, String enc, int port, String host, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WriteStream sender(int port, String host){
        return new WriteStream(__env__, this.getWrappedObject().sender(port,host));
    }
   
    @Signature
    //false
    public DatagramSocket unlistenMulticastGroup(String multicastAddress, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public DatagramSocket unlistenMulticastGroup(String multicastAddress, String networkInterface, String source, Closure handler){
         return this;
    }

}
