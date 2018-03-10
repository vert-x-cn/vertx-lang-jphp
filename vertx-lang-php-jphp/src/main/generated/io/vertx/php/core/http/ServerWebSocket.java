package io.vertx.php.core.http;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.MultiMap;
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
@Name("ServerWebSocket")
@Namespace("io\\vertx\\php\\core\\http")
public class ServerWebSocket extends BaseWrapper<io.vertx.core.http.ServerWebSocket> {
    
    public ServerWebSocket(Environment env, io.vertx.core.http.ServerWebSocket wrappedObject) {
        super(env, wrappedObject);
    }
    
    public ServerWebSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.ServerWebSocket getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void accept(){
            }
   
    @Signature
    //false
    public String binaryHandlerID(){
        return this.getWrappedObject().binaryHandlerID();
    }
   
    @Signature
    //false
    public ServerWebSocket binaryMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public ServerWebSocket closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket drainHandler(Closure handler){
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
    public ServerWebSocket endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket frameHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
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
    public String path(){
        return this.getWrappedObject().path();
    }
   
    @Signature
    //false
    public ServerWebSocket pause(){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket pongHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String query(){
        return this.getWrappedObject().query();
    }
   
    @Signature
    //false
    public void reject(){
            }
   
    @Signature
    //false
    public void reject(int status){
            }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public ServerWebSocket resume(){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket setWriteQueueMaxSize(int maxSize){
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
    public ServerWebSocket textMessageHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String uri(){
        return this.getWrappedObject().uri();
    }
   
    @Signature
    //false
    public ServerWebSocket write(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writeBinaryMessage(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writeFinalBinaryFrame(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writeFinalTextFrame(String text){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writeFrame(WebSocketFrame frame){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writePing(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket writePong(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }
   
    @Signature
    //false
    public ServerWebSocket writeTextMessage(String text){
         return this;
    }

}
