package io.vertx.php.core.file;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
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
@Name("AsyncFile")
@Namespace("io\\vertx\\php\\core\\file")
public class AsyncFile extends BaseWrapper<io.vertx.core.file.AsyncFile> {
    
    public AsyncFile(Environment env, io.vertx.core.file.AsyncFile wrappedObject) {
        super(env, wrappedObject);
    }
    
    public AsyncFile(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.file.AsyncFile getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public void close(Closure handler){
            }
   
    @Signature
    //false
    public AsyncFile drainHandler(Closure handler){
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
    public AsyncFile endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile flush(){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile flush(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile pause(){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile read(Buffer buffer, int offset, long position, int length, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile resume(){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile setReadBufferSize(int readBufferSize){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile setReadPos(long readPos){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile setWritePos(long writePos){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile write(Buffer data){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile write(Buffer buffer, long position, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
