package io.vertx.php.core.file;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("CopyOptions")
@Namespace("io\\vertx\\php\\core\\file")
//false
public  class CopyOptions extends DataObjectWrapper<io.vertx.core.file.CopyOptions> { 
    public CopyOptions(Environment env, io.vertx.core.file.CopyOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public CopyOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.file.CopyOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.file.CopyOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
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
