package io.vertx.php.core.http;
import io.vertx.core.http.HttpVersion;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.NetSocket;
import java.lang.String;
import java.lang.Void;
import java.util.List;
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
@Name("HttpClientResponse")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpClientResponse extends BaseWrapper<io.vertx.core.http.HttpClientResponse> {
    
    public HttpClientResponse(Environment env, io.vertx.core.http.HttpClientResponse wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpClientResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpClientResponse getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public HttpClientResponse bodyHandler(Closure bodyHandler){
         return this;
    }
   
    @Signature
    //false
    public List cookies(){
        return this.getWrappedObject().cookies();
    }
   
    @Signature
    //false
    public HttpClientResponse customFrameHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientResponse endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientResponse exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String getHeader(String headerName){
        return this.getWrappedObject().getHeader(headerName);
    }
   
    @Signature
    //false
    public String getTrailer(String trailerName){
        return this.getWrappedObject().getTrailer(trailerName);
    }
   
    @Signature
    //false
    public HttpClientResponse handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
    }
   
    @Signature
    //false
    public NetSocket netSocket(){
        return new NetSocket(__env__, this.getWrappedObject().netSocket());
    }
   
    @Signature
    //false
    public HttpClientResponse pause(){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest request(){
        return new HttpClientRequest(__env__, this.getWrappedObject().request());
    }
   
    @Signature
    //false
    public HttpClientResponse resume(){
         return this;
    }
   
    @Signature
    //false
    public int statusCode(){
        return this.getWrappedObject().statusCode();
    }
   
    @Signature
    //false
    public String statusMessage(){
        return this.getWrappedObject().statusMessage();
    }
   
    @Signature
    //false
    public MultiMap trailers(){
        return new MultiMap(__env__, this.getWrappedObject().trailers());
    }
   
    @Signature
    //false
    public HttpVersion version(){
        return this.getWrappedObject().version();
    }

}
