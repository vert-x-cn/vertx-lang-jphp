package io.vertx.php.core.http;
import io.vertx.php.core.buffer.Buffer;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("HttpFrame")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpFrame extends BaseWrapper<io.vertx.core.http.HttpFrame> {
    
    public HttpFrame(Environment env, io.vertx.core.http.HttpFrame wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpFrame(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpFrame getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public int flags(){
        return this.getWrappedObject().flags();
    }
   
    @Signature
    //false
    public Buffer payload(){
        return new Buffer(__env__, this.getWrappedObject().payload());
    }
   
    @Signature
    //false
    public int type(){
        return this.getWrappedObject().type();
    }

}
