package io.vertx.php.core.file;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("FileSystemProps")
@Namespace("io\\vertx\\php\\core\\file")
public class FileSystemProps extends BaseWrapper<io.vertx.core.file.FileSystemProps> {
    
    public FileSystemProps(Environment env, io.vertx.core.file.FileSystemProps wrappedObject) {
        super(env, wrappedObject);
    }
    
    public FileSystemProps(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.file.FileSystemProps getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public long totalSpace(){
        return this.getWrappedObject().totalSpace();
    }
   
    @Signature
    //false
    public long unallocatedSpace(){
        return this.getWrappedObject().unallocatedSpace();
    }
   
    @Signature
    //false
    public long usableSpace(){
        return this.getWrappedObject().usableSpace();
    }

}
