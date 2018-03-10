package io.vertx.php.core.parsetools;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.buffer.Buffer;
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
@Name("RecordParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class RecordParser extends BaseWrapper<io.vertx.core.parsetools.RecordParser> {
    
    public RecordParser(Environment env, io.vertx.core.parsetools.RecordParser wrappedObject) {
        super(env, wrappedObject);
    }
    
    public RecordParser(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.parsetools.RecordParser getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void delimitedMode(Memory memory0){
            }
   
    @Signature
    //false
    public RecordParser endHandler(Closure endHandler){
         return this;
    }
   
    @Signature
    //false
    public RecordParser exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void fixedSizeMode(int size){
            }
   
    @Signature
    //false
    public void handle(Buffer buffer){
            }
   
    @Signature
    //false
    public RecordParser handler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public static RecordParser newDelimited(Environment __env__, Memory memory0, Memory memory1){
        return new RecordParser(__env__, io.vertx.core.parsetools.RecordParser.newDelimited(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public static RecordParser newDelimited(Environment __env__, Memory memory0){
        return new RecordParser(__env__, io.vertx.core.parsetools.RecordParser.newDelimited(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public static RecordParser newFixed(Environment __env__, int size){
        return new RecordParser(__env__, io.vertx.core.parsetools.RecordParser.newFixed(size));
    }
   
    @Signature
    //false
    public static RecordParser newFixed(Environment __env__, int size, Memory memory0){
        return new RecordParser(__env__, io.vertx.core.parsetools.RecordParser.newFixed(size,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public RecordParser pause(){
         return this;
    }
   
    @Signature
    //false
    public RecordParser resume(){
         return this;
    }
   
    @Signature
    //false
    public void setOutput(Closure output){
            }

}
