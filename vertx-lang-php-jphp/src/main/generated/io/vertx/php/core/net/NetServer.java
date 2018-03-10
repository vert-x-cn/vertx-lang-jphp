package io.vertx.php.core.net;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.streams.ReadStream;
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
@Name("NetServer")
@Namespace("io\\vertx\\php\\core\\net")
public class NetServer extends BaseWrapper<io.vertx.core.net.NetServer> {
    
    public NetServer(Environment env, io.vertx.core.net.NetServer wrappedObject) {
        super(env, wrappedObject);
    }
    
    public NetServer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.net.NetServer getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public int actualPort(){
        return this.getWrappedObject().actualPort();
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public void close(Closure completionHandler){
            }
   
    @Signature
    //false
    public NetServer connectHandler(Closure handler){
        return new NetServer(__env__, this.getWrappedObject().connectHandler(e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public ReadStream connectStream(){
        return new ReadStream(__env__, this.getWrappedObject().connectStream());
    }
   
    @Signature
    //false
    public NetServer exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public NetServer listen(){
         return this;
    }
   
    @Signature
    //false
    public NetServer listen(Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public NetServer listen(Memory memory0, Memory memory1){
         return this;
    }
   
    @Signature
    //false
    public NetServer listen(int port, String host, Closure listenHandler){
         return this;
    }

}
