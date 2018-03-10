package io.vertx.php.core.http;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpVersion;
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
@Name("HttpClientRequest")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpClientRequest extends BaseWrapper<io.vertx.core.http.HttpClientRequest> {
    
    public HttpClientRequest(Environment env, io.vertx.core.http.HttpClientRequest wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpClientRequest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpClientRequest getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String absoluteURI(){
        return this.getWrappedObject().absoluteURI();
    }
   
    @Signature
    //false
    public HttpConnection connection(){
        return new HttpConnection(__env__, this.getWrappedObject().connection());
    }
   
    @Signature
    //false
    public HttpClientRequest connectionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest continueHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest drainHandler(Closure handler){
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
    public HttpClientRequest endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String getHost(){
        return this.getWrappedObject().getHost();
    }
   
    @Signature
    //false
    public String getRawMethod(){
        return this.getWrappedObject().getRawMethod();
    }
   
    @Signature
    //false
    public HttpClientRequest handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public MultiMap headers(){
        return new MultiMap(__env__, this.getWrappedObject().headers());
    }
   
    @Signature
    //false
    public boolean isChunked(){
        return this.getWrappedObject().isChunked();
    }
   
    @Signature
    //false
    public HttpMethod method(){
        return this.getWrappedObject().method();
    }
   
    @Signature
    //false
    public String path(){
        return this.getWrappedObject().path();
    }
   
    @Signature
    //false
    public HttpClientRequest pause(){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest pushHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest putHeader(String name, String value){
         return this;
    }
   
    @Signature
    //false
    public String query(){
        return this.getWrappedObject().query();
    }
   
    @Signature
    //true
    public boolean reset(){
        return this.getWrappedObject().reset();
    }
   
    @Signature
    //false
    public boolean reset(long code){
        return this.getWrappedObject().reset(code);
    }
   
    @Signature
    //false
    public HttpClientRequest resume(){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest sendHead(){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest sendHead(Closure completionHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setChunked(boolean chunked){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setFollowRedirects(boolean followRedirects){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setHost(String host){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setRawMethod(String method){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setTimeout(long timeoutMs){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest setWriteQueueMaxSize(int maxSize){
         return this;
    }
   
    @Signature
    //true
    public int streamId(){
        return this.getWrappedObject().streamId();
    }
   
    @Signature
    //false
    public String uri(){
        return this.getWrappedObject().uri();
    }
   
    @Signature
    //false
    public HttpClientRequest write(Memory memory0){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest write(String chunk, String enc){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest writeCustomFrame(int type, int flags, Buffer payload){
         return this;
    }
   
    @Signature
    //true
    public HttpClientRequest writeCustomFrame(HttpFrame frame){
         return this;
    }
   
    @Signature
    //false
    public boolean writeQueueFull(){
        return this.getWrappedObject().writeQueueFull();
    }

}
