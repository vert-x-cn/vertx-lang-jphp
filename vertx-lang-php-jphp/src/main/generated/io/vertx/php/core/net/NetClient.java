package io.vertx.php.core.net;
import io.vertx.lang.php.wrapper.AsyncResult;
import java.lang.String;
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
@Name("NetClient")
@Namespace("io\\vertx\\php\\core\\net")
public class NetClient extends BaseWrapper<io.vertx.core.net.NetClient> {
    
    public NetClient(Environment env, io.vertx.core.net.NetClient wrappedObject) {
        super(env, wrappedObject);
    }
    
    public NetClient(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.net.NetClient getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public NetClient connect(Memory memory0, String host, Closure connectHandler){
         return this;
    }
   
    @Signature
    //false
    public NetClient connect(int port, String host, String serverName, Closure connectHandler){
         return this;
    }
   
    @Signature
    //false
    public NetClient connect(SocketAddress remoteAddress, Closure connectHandler){
         return this;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }

}
