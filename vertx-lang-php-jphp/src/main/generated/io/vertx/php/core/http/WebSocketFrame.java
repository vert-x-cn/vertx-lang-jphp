package io.vertx.php.core.http;
import io.vertx.php.core.buffer.Buffer;
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
@Name("WebSocketFrame")
@Namespace("io\\vertx\\php\\core\\http")
public class WebSocketFrame extends BaseWrapper<io.vertx.core.http.WebSocketFrame> {
    
    public WebSocketFrame(Environment env, io.vertx.core.http.WebSocketFrame wrappedObject) {
        super(env, wrappedObject);
    }
    
    public WebSocketFrame(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.WebSocketFrame getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public Buffer binaryData(){
        return new Buffer(__env__, this.getWrappedObject().binaryData());
    }
   
    @Signature
    //false
    public static WebSocketFrame binaryFrame(Environment __env__, Buffer data, boolean isFinal){
        return new WebSocketFrame(__env__, io.vertx.core.http.WebSocketFrame.binaryFrame(data.getWrappedObject(),isFinal));
    }
   
    @Signature
    //false
    public static WebSocketFrame continuationFrame(Environment __env__, Buffer data, boolean isFinal){
        return new WebSocketFrame(__env__, io.vertx.core.http.WebSocketFrame.continuationFrame(data.getWrappedObject(),isFinal));
    }
   
    @Signature
    //false
    public boolean isBinary(){
        return this.getWrappedObject().isBinary();
    }
   
    @Signature
    //false
    public boolean isContinuation(){
        return this.getWrappedObject().isContinuation();
    }
   
    @Signature
    //false
    public boolean isFinal(){
        return this.getWrappedObject().isFinal();
    }
   
    @Signature
    //false
    public boolean isText(){
        return this.getWrappedObject().isText();
    }
   
    @Signature
    //false
    public static WebSocketFrame pingFrame(Environment __env__, Buffer data){
        return new WebSocketFrame(__env__, io.vertx.core.http.WebSocketFrame.pingFrame(data.getWrappedObject()));
    }
   
    @Signature
    //false
    public static WebSocketFrame pongFrame(Environment __env__, Buffer data){
        return new WebSocketFrame(__env__, io.vertx.core.http.WebSocketFrame.pongFrame(data.getWrappedObject()));
    }
   
    @Signature
    //false
    public String textData(){
        return this.getWrappedObject().textData();
    }
   
    @Signature
    //false
    public static WebSocketFrame textFrame(Environment __env__, String str, boolean isFinal){
        return new WebSocketFrame(__env__, io.vertx.core.http.WebSocketFrame.textFrame(str,isFinal));
    }

}
