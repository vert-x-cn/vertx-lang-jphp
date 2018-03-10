package io.vertx.php.core.http;
import io.vertx.lang.php.wrapper.AsyncResult;
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
@Name("HttpConnection")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpConnection extends BaseWrapper<io.vertx.core.http.HttpConnection> {
    
    public HttpConnection(Environment env, io.vertx.core.http.HttpConnection wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpConnection(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpConnection getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public HttpConnection closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //true
    public int getWindowSize(){
        return this.getWrappedObject().getWindowSize();
    }
   
    @Signature
    //true
    public HttpConnection goAway(long errorCode){
         return this;
    }
   
    @Signature
    //true
    public HttpConnection goAway(long errorCode, int lastStreamId){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection goAway(long errorCode, int lastStreamId, Buffer debugData){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection goAwayHandler(Closure handler){
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
    public HttpConnection ping(Buffer data, Closure pongHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection pingHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public Http2Settings remoteSettings(){
        return new Http2Settings(__env__, this.getWrappedObject().remoteSettings());
    }
   
    @Signature
    //false
    public HttpConnection remoteSettingsHandler(Closure handler){
         return this;
    }
   
    @Signature
    //true
    public HttpConnection setWindowSize(int windowSize){
         return this;
    }
   
    @Signature
    //false
    public Http2Settings settings(){
        return new Http2Settings(__env__, this.getWrappedObject().settings());
    }
   
    @Signature
    //false
    public HttpConnection shutdown(){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection shutdown(long timeoutMs){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection shutdownHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection updateSettings(Http2Settings settings){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection updateSettings(Http2Settings settings, Closure completionHandler){
         return this;
    }

}
