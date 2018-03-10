package io.vertx.php.core.http;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
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
@Name("WebSocketBase")
@Namespace("io\\vertx\\php\\core\\http")
public class WebSocketBase extends BaseWrapper<io.vertx.core.http.WebSocketBase> {
    
    public WebSocketBase(Environment env, io.vertx.core.http.WebSocketBase wrappedObject) {
        super(env, wrappedObject);
    }
    
    public WebSocketBase(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.WebSocketBase getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String binaryHandlerID(){
        return this.getWrappedObject().binaryHandlerID();
    }
   
    @Signature
    //false
    public WebSocketBase binaryMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public WebSocketBase closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase drainHandler(Closure handler){
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
    public WebSocketBase endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase frameHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase handler(Closure handler){
         return this;
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
    public WebSocketBase pause(){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase pongHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public WebSocketBase resume(){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public String subProtocol(){
        return this.getWrappedObject().subProtocol();
    }
   
    @Signature
    //false
    public String textHandlerID(){
        return this.getWrappedObject().textHandlerID();
    }
   
    @Signature
    //false
    public WebSocketBase textMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase write(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writeBinaryMessage(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writeFinalBinaryFrame(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writeFinalTextFrame(String text){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writeFrame(WebSocketFrame frame){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writePing(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocketBase writePong(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }
   
    @Signature
    //false
    public WebSocketBase writeTextMessage(String text){
         return this;
    }

}
