package io.vertx.php.core.shareddata;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("LocalMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class LocalMap extends BaseWrapper<io.vertx.core.shareddata.LocalMap<Memory, Memory>> {
    
    public LocalMap(Environment env, io.vertx.core.shareddata.LocalMap<Memory, Memory> wrappedObject) {
        super(env, wrappedObject);
    }
    
    public LocalMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.shareddata.LocalMap<Memory, Memory> getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void clear(){
            }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public boolean containsKey(Object key){
        return this.getWrappedObject().containsKey(key);
    }
   
    @Signature
    //false
    public boolean containsValue(Object value){
        return this.getWrappedObject().containsValue(value);
    }
   
    @Signature
    //false
    public Memory get(Object key){
        return this.getWrappedObject().get(key);
    }
   
    @Signature
    //false
    public Memory getOrDefault(Object key, Memory defaultValue){
        return this.getWrappedObject().getOrDefault(key,defaultValue);
    }
   
    @Signature
    //false
    public boolean isEmpty(){
        return this.getWrappedObject().isEmpty();
    }
   
    @Signature
    //false
    public Memory put(Memory key, Memory value){
        return this.getWrappedObject().put(key,value);
    }
   
    @Signature
    //false
    public Memory putIfAbsent(Memory key, Memory value){
        return this.getWrappedObject().putIfAbsent(key,value);
    }
   
    @Signature
    //false
    public Memory remove(Object key){
        return this.getWrappedObject().remove(key);
    }
   
    @Signature
    //false
    public boolean removeIfPresent(Memory key, Memory value){
        return this.getWrappedObject().removeIfPresent(key,value);
    }
   
    @Signature
    //false
    public Memory replace(Memory key, Memory value){
        return this.getWrappedObject().replace(key,value);
    }
   
    @Signature
    //false
    public boolean replaceIfPresent(Memory key, Memory oldValue, Memory newValue){
        return this.getWrappedObject().replaceIfPresent(key,oldValue,newValue);
    }
   
    @Signature
    //false
    public int size(){
        return this.getWrappedObject().size();
    }

}
