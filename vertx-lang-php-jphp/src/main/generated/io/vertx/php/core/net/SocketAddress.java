package io.vertx.php.core.net;
import java.lang.String;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("SocketAddress")
@Namespace("io\\vertx\\php\\core\\net")
public class SocketAddress extends BaseWrapper<io.vertx.core.net.SocketAddress> {
    
    public SocketAddress(Environment env, io.vertx.core.net.SocketAddress wrappedObject) {
        super(env, wrappedObject);
    }
    
    public SocketAddress(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.net.SocketAddress getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public static SocketAddress domainSocketAddress(Environment __env__, String path){
        return new SocketAddress(__env__, io.vertx.core.net.SocketAddress.domainSocketAddress(path));
    }
   
    @Signature
    //false
    public String host(){
        return this.getWrappedObject().host();
    }
   
    @Signature
    //false
    public static SocketAddress inetSocketAddress(Environment __env__, int port, String host){
        return new SocketAddress(__env__, io.vertx.core.net.SocketAddress.inetSocketAddress(port,host));
    }
   
    @Signature
    //false
    public String path(){
        return this.getWrappedObject().path();
    }
   
    @Signature
    //false
    public int port(){
        return this.getWrappedObject().port();
    }

}
