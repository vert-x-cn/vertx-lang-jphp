package io.vertx.php.core.http;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.MultiMap;
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
@Name("HttpServerResponse")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpServerResponse extends BaseWrapper<io.vertx.core.http.HttpServerResponse> {
    
    public HttpServerResponse(Environment env, io.vertx.core.http.HttpServerResponse wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpServerResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpServerResponse getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public HttpServerResponse bodyEndHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public long bytesWritten(){
        return this.getWrappedObject().bytesWritten();
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public HttpServerResponse closeHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean closed(){
        return this.getWrappedObject().closed();
    }
   
    @Signature
    //false
    public HttpServerResponse drainHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void end(Memory memory0){
            }
   
    @Signature
    //false
    public void end(String chunk, String enc){
            }
   
    @Signature
    //false
    public void end(){
            }
   
    @Signature
    //false
    public HttpServerResponse endHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean ended(){
        return this.getWrappedObject().ended();
    }
   
    @Signature
    //false
    public HttpServerResponse exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public int getStatusCode(){
        return this.getWrappedObject().getStatusCode();
    }
   
    @Signature
    //false
    public String getStatusMessage(){
        return this.getWrappedObject().getStatusMessage();
    }
   
    @Signature
    //false
    public boolean headWritten(){
        return this.getWrappedObject().headWritten();
    }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
    }
   
    @Signature
    //false
    public HttpServerResponse headersEndHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isChunked(){
        return this.getWrappedObject().isChunked();
    }
   
    @Signature
    //false
    public HttpServerResponse push(HttpMethod method, String host, Memory memory0, Closure handler){
        return new HttpServerResponse(__env__, this.getWrappedObject().push(method,host,/*paramSize:2*/null,e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpServerResponse push(HttpMethod method, String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse push(HttpMethod method, String host, String path, MultiMap headers, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse putHeader(String name, String value){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse putTrailer(String name, String value){
         return this;
    }
   
    @Signature
    //true
    public void reset(){
            }
   
    @Signature
    //false
    public void reset(long code){
            }
   
    @Signature
    //true
    public HttpServerResponse sendFile(String filename){
         return this;
    }
   
    @Signature
    //true
    public HttpServerResponse sendFile(String filename, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse sendFile(String filename, long offset, Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse sendFile(String filename, long offset, long length, Closure resultHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse setChunked(boolean chunked){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse setStatusCode(int statusCode){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse setStatusMessage(String statusMessage){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public int streamId(){
        return this.getWrappedObject().streamId();
    }
   
    @Signature
    //false
    public MultiMap trailers(){
        return new MultiMap(__env__, this.getWrappedObject().trailers());
    }
   
    @Signature
    //false
    public HttpServerResponse write(Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse write(String chunk, String enc){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse writeContinue(){
         return this;
    }
   
    @Signature
    //false
    public HttpServerResponse writeCustomFrame(int type, int flags, Buffer payload){
         return this;
    }
   
    @Signature
    //true
    public HttpServerResponse writeCustomFrame(HttpFrame frame){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
