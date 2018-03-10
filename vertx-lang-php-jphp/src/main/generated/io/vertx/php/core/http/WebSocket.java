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
@Name("WebSocket")
@Namespace("io\\vertx\\php\\core\\http")
public class WebSocket extends BaseWrapper<io.vertx.core.http.WebSocket> {
    
    public WebSocket(Environment env, io.vertx.core.http.WebSocket wrappedObject) {
        super(env, wrappedObject);
    }
    
    public WebSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.WebSocket getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String binaryHandlerID(){
        return this.getWrappedObject().binaryHandlerID();
    }
   
    @Signature
    //false
    public WebSocket binaryMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public WebSocket closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocket drainHandler(Closure handler){
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
    public WebSocket endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public WebSocket exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocket frameHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocket handler(Closure handler){
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
    public WebSocket pause(){
         return this;
    }
   
    @Signature
    //false
    public WebSocket pongHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public WebSocket resume(){
         return this;
    }
   
    @Signature
    //false
    public WebSocket setWriteQueueMaxSize(int maxSize){
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
    public WebSocket textMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public WebSocket write(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writeBinaryMessage(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writeFinalBinaryFrame(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writeFinalTextFrame(String text){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writeFrame(WebSocketFrame frame){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writePing(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public WebSocket writePong(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }
   
    @Signature
    //false
    public WebSocket writeTextMessage(String text){
         return this;
    }

}
