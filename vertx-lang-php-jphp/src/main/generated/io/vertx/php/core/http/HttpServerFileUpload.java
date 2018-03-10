package io.vertx.php.core.http;
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
@Name("HttpServerFileUpload")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpServerFileUpload extends BaseWrapper<io.vertx.core.http.HttpServerFileUpload> {
    
    public HttpServerFileUpload(Environment env, io.vertx.core.http.HttpServerFileUpload wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpServerFileUpload(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpServerFileUpload getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String charset(){
        return this.getWrappedObject().charset();
    }
   
    @Signature
    //false
    public String contentTransferEncoding(){
        return this.getWrappedObject().contentTransferEncoding();
    }
   
    @Signature
    //false
    public String contentType(){
        return this.getWrappedObject().contentType();
    }
   
    @Signature
    //false
    public HttpServerFileUpload endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpServerFileUpload exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String filename(){
        return this.getWrappedObject().filename();
    }
   
    @Signature
    //false
    public HttpServerFileUpload handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean isSizeAvailable(){
        return this.getWrappedObject().isSizeAvailable();
    }
   
    @Signature
    //false
    public String name(){
        return this.getWrappedObject().name();
    }
   
    @Signature
    //false
    public HttpServerFileUpload pause(){
         return this;
    }
   
    @Signature
    //false
    public HttpServerFileUpload resume(){
         return this;
    }
   
    @Signature
    //false
    public long size(){
        return this.getWrappedObject().size();
    }
   
    @Signature
    //false
    public HttpServerFileUpload streamToFileSystem(String filename){
         return this;
    }

}
