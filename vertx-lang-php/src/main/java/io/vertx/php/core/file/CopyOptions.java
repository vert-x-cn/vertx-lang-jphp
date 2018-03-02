package io.vertx.php.core.file;

//6
import com.google.gson.JsonElement;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.core.json.JsonObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\file\\CopyOptions")
public class CopyOptions extends BaseWrapper<io.vertx.core.file.CopyOptions> { 
    public CopyOptions(Environment env, io.vertx.core.file.CopyOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public CopyOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof CopyOptions) {
            io.vertx.core.file.CopyOptions value = ((CopyOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.file.CopyOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.file.CopyOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.file.CopyOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public boolean isAtomicMove(){ 
        return this.getWrappedObject().isAtomicMove();
    }
    
    @Signature
    public CopyOptions setAtomicMove(boolean atomicMove){ 
        this.getWrappedObject().setAtomicMove(atomicMove);
        return this;
    }
    
    @Signature
    public boolean isCopyAttributes(){ 
        return this.getWrappedObject().isCopyAttributes();
    }
    
    @Signature
    public CopyOptions setCopyAttributes(boolean copyAttributes){ 
        this.getWrappedObject().setCopyAttributes(copyAttributes);
        return this;
    }
    
    @Signature
    public boolean isNofollowLinks(){ 
        return this.getWrappedObject().isNofollowLinks();
    }
    
    @Signature
    public CopyOptions setNofollowLinks(boolean nofollowLinks){ 
        this.getWrappedObject().setNofollowLinks(nofollowLinks);
        return this;
    }
    
    @Signature
    public boolean isReplaceExisting(){ 
        return this.getWrappedObject().isReplaceExisting();
    }
    
    @Signature
    public CopyOptions setReplaceExisting(boolean replaceExisting){ 
        this.getWrappedObject().setReplaceExisting(replaceExisting);
        return this;
    }
    
}
