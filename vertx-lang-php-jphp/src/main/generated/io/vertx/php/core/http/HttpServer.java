package io.vertx.php.core.http;
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
@Name("HttpServer")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpServer extends BaseWrapper<io.vertx.core.http.HttpServer> {
    
    public HttpServer(Environment env, io.vertx.core.http.HttpServer wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpServer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpServer getWrappedObject(){
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
    public HttpServer connectionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpServer exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public HttpServer listen(){
         return this;
    }
   
    @Signature
    //false
    public HttpServer listen(int port, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpServer listen(int port, String host, Closure listenHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpServer listen(Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpServer requestHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream requestStream(){
        return new ReadStream(__env__, this.getWrappedObject().requestStream());
    }
   
    @Signature
    //false
    public HttpServer websocketHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream websocketStream(){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream());
    }

}
