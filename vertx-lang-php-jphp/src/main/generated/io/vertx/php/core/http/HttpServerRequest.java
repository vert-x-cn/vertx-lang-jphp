package io.vertx.php.core.http;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpVersion;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.NetSocket;
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
@Name("HttpServerRequest")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpServerRequest extends BaseWrapper<io.vertx.core.http.HttpServerRequest> {
    
    public HttpServerRequest(Environment env, io.vertx.core.http.HttpServerRequest wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpServerRequest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpServerRequest getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String absoluteURI(){
        return this.getWrappedObject().absoluteURI();
    }
   
    @Signature
    //true
    public HttpServerRequest bodyHandler(Closure bodyHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpConnection connection(){
        return new HttpConnection(__env__, this.getWrappedObject().connection());
    }
   
    @Signature
    //false
    public HttpServerRequest customFrameHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerRequest endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerRequest exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MultiMap formAttributes(){
        return new MultiMap(__env__, this.getWrappedObject().formAttributes());
    }
   
    @Signature
    //false
    public String getFormAttribute(String attributeName){
        return this.getWrappedObject().getFormAttribute(attributeName);
    }
   
    @Signature
    //false
    public String getHeader(String headerName){
        return this.getWrappedObject().getHeader(headerName);
    }
   
    @Signature
    //false
    public String getParam(String paramName){
        return this.getWrappedObject().getParam(paramName);
    }
   
    @Signature
    //false
    public HttpServerRequest handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
    }
   
    @Signature
    //false
    public String host(){
        return this.getWrappedObject().host();
    }
   
    @Signature
    //false
    public boolean isEnded(){
        return this.getWrappedObject().isEnded();
    }
   
    @Signature
    //false
    public boolean isExpectMultipart(){
        return this.getWrappedObject().isExpectMultipart();
    }
   
    @Signature
    //false
    public boolean isSSL(){
        return this.getWrappedObject().isSSL();
    }
   
    @Signature
    //false
    public SocketAddress localAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().localAddress());
    }
   
    @Signature
    //false
    public HttpMethod method(){
        return this.getWrappedObject().method();
    }
   
    @Signature
    //false
    public NetSocket netSocket(){
        return new NetSocket(__env__, this.getWrappedObject().netSocket());
    }
   
    @Signature
    //false
    public MultiMap params(){
        return new MultiMap(__env__, this.getWrappedObject().params());
    }
   
    @Signature
    //false
    public String path(){
        return this.getWrappedObject().path();
    }
   
    @Signature
    //false
    public HttpServerRequest pause(){
         return this;
    }
   
    @Signature
    //false
    public String query(){
        return this.getWrappedObject().query();
    }
   
    @Signature
    //false
    public String rawMethod(){
        return this.getWrappedObject().rawMethod();
    }
   
    @Signature
    //false
    public SocketAddress remoteAddress(){
        return new SocketAddress(__env__, this.getWrappedObject().remoteAddress());
    }
   
    @Signature
    //false
    public HttpServerResponse response(){
        return new HttpServerResponse(__env__, this.getWrappedObject().response());
    }
   
    @Signature
    //false
    public HttpServerRequest resume(){
         return this;
    }
   
    @Signature
    //false
    public String scheme(){
        return this.getWrappedObject().scheme();
    }
   
    @Signature
    //false
    public HttpServerRequest setExpectMultipart(boolean expect){
         return this;
    }
   
    @Signature
    //false
    public ServerWebSocket upgrade(){
        return new ServerWebSocket(__env__, this.getWrappedObject().upgrade());
    }
   
    @Signature
    //false
    public HttpServerRequest uploadHandler(Closure uploadHandler){
         return this;
    }
   
    @Signature
    //false
    public String uri(){
        return this.getWrappedObject().uri();
    }
   
    @Signature
    //false
    public HttpVersion version(){
        return this.getWrappedObject().version();
    }

}
