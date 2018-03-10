package io.vertx.php.core;
import java.lang.String;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("MultiMap")
@Namespace("io\\vertx\\php\\core")
public class MultiMap extends BaseWrapper<io.vertx.core.MultiMap> {
    
    public MultiMap(Environment env, io.vertx.core.MultiMap wrappedObject) {
        super(env, wrappedObject);
    }
    
    public MultiMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.MultiMap getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public MultiMap add(String name, String value){
         return this;
    }
   
    @Signature
    //false
    public MultiMap addAll(MultiMap map){
         return this;
    }
   
    @Signature
    //false
    public static MultiMap caseInsensitiveMultiMap(Environment __env__){
        return new MultiMap(__env__, io.vertx.core.MultiMap.caseInsensitiveMultiMap());
    }
   
    @Signature
    //false
    public MultiMap clear(){
         return this;
    }
   
    @Signature
    //false
    public boolean contains(String name){
        return this.getWrappedObject().contains(name);
    }
   
    @Signature
    //false
    public String get(String name){
        return this.getWrappedObject().get(name);
    }
   
    @Signature
    //false
    public List getAll(String name){
        return this.getWrappedObject().getAll(name);
    }
   
    @Signature
    //false
    public boolean isEmpty(){
        return this.getWrappedObject().isEmpty();
    }
   
    @Signature
    //false
    public Set names(){
        return this.getWrappedObject().names();
    }
   
    @Signature
    //false
    public MultiMap remove(String name){
         return this;
    }
   
    @Signature
    //false
    public MultiMap set(String name, String value){
         return this;
    }
   
    @Signature
    //false
    public MultiMap setAll(MultiMap map){
         return this;
    }
   
    @Signature
    //false
    public int size(){
        return this.getWrappedObject().size();
    }

}
