package io.vertx.php.core.parsetools;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
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
@Name("JsonParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class JsonParser extends BaseWrapper<io.vertx.core.parsetools.JsonParser> {
    
    public JsonParser(Environment env, io.vertx.core.parsetools.JsonParser wrappedObject) {
        super(env, wrappedObject);
    }
    
    public JsonParser(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.parsetools.JsonParser getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public JsonParser arrayEventMode(){
         return this;
    }
   
    @Signature
    //false
    public JsonParser arrayValueMode(){
         return this;
    }
   
    @Signature
    //false
    public void end(){
            }
   
    @Signature
    //false
    public JsonParser endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public JsonParser exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void handle(Buffer event){
            }
   
    @Signature
    //false
    public JsonParser handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public static JsonParser newParser(Environment __env__){
        return new JsonParser(__env__, io.vertx.core.parsetools.JsonParser.newParser());
    }
   
    @Signature
    //false
    public static JsonParser newParser(Environment __env__, ReadStream stream){
        return new JsonParser(__env__, io.vertx.core.parsetools.JsonParser.newParser(stream.getWrappedObject()));
    }
   
    @Signature
    //false
    public JsonParser objectEventMode(){
         return this;
    }
   
    @Signature
    //false
    public JsonParser objectValueMode(){
         return this;
    }
   
    @Signature
    //false
    public JsonParser pause(){
         return this;
    }
   
    @Signature
    //false
    public JsonParser resume(){
         return this;
    }
   
    @Signature
    //false
    public JsonParser write(Buffer buffer){
         return this;
    }

}
