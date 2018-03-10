package io.vertx.php.core.net;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
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
@Name("NetSocket")
@Namespace("io\\vertx\\php\\core\\net")
public class NetSocket extends BaseWrapper<io.vertx.core.net.NetSocket> {
    
    public NetSocket(Environment env, io.vertx.core.net.NetSocket wrappedObject) {
        super(env, wrappedObject);
    }
    
    public NetSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.net.NetSocket getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public NetSocket closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket drainHandler(Closure handler){
         return this;
    }
   
    @Signature
    //true
    public void end(Buffer t){
            }
   
    @Signature
    //false
    public void end(){
            }
   
    @Signature
    //false
    public NetSocket endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String indicatedServerName(){
        return this.getWrappedObject().indicatedServerName();
    }
   
    @Signature
    //false
    public boolean isSsl(){
        return this.getWrappedObject().isSsl();
    }
   
    @Signature
    //false
    public SocketAddress localAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().localAddress());
    }
   
    @Signature
    //false
    public NetSocket pause(){
         return this;
    }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public NetSocket resume(){
         return this;
    }
   
    @Signature
    //true
    public NetSocket sendFile(String filename){
         return this;
    }
   
    @Signature
    //true
    public NetSocket sendFile(String filename, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public NetSocket sendFile(String filename, long offset, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public NetSocket sendFile(String filename, long offset, long length, Closure resultHandler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public NetSocket upgradeToSsl(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket upgradeToSsl(String serverName, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public NetSocket write(Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public NetSocket write(String str, String enc){
         return this;
    }
   
    @Signature
    //false
    public String writeHandlerID(){
        return this.getWrappedObject().writeHandlerID();
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
