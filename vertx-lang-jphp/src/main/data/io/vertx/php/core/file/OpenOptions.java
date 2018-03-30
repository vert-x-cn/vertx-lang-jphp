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
@Name("OpenOptions")
@Namespace("io\\vertx\\php\\core\\file")
//false
public  class OpenOptions extends DataObjectWrapper<io.vertx.core.file.OpenOptions> { 
    public OpenOptions(Environment env, io.vertx.core.file.OpenOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public OpenOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.file.OpenOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.file.OpenOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isAppend(){ 
        return this.getWrappedObject().isAppend();
    }

    @Signature
    public OpenOptions setAppend(boolean append){ 
        this.getWrappedObject().setAppend(append);
        return this;
    }

    @Signature
    public boolean isCreate(){ 
        return this.getWrappedObject().isCreate();
    }

    @Signature
    public OpenOptions setCreate(boolean create){ 
        this.getWrappedObject().setCreate(create);
        return this;
    }

    @Signature
    public boolean isCreateNew(){ 
        return this.getWrappedObject().isCreateNew();
    }

    @Signature
    public OpenOptions setCreateNew(boolean createNew){ 
        this.getWrappedObject().setCreateNew(createNew);
        return this;
    }

    @Signature
    public boolean isDeleteOnClose(){ 
        return this.getWrappedObject().isDeleteOnClose();
    }

    @Signature
    public OpenOptions setDeleteOnClose(boolean deleteOnClose){ 
        this.getWrappedObject().setDeleteOnClose(deleteOnClose);
        return this;
    }

    @Signature
    public boolean isDsync(){ 
        return this.getWrappedObject().isDsync();
    }

    @Signature
    public OpenOptions setDsync(boolean dsync){ 
        this.getWrappedObject().setDsync(dsync);
        return this;
    }

    @Signature
    public String getPerms(){ 
        return this.getWrappedObject().getPerms();
    }

    @Signature
    public OpenOptions setPerms(String perms){ 
        this.getWrappedObject().setPerms(perms);
        return this;
    }

    @Signature
    public boolean isRead(){ 
        return this.getWrappedObject().isRead();
    }

    @Signature
    public OpenOptions setRead(boolean read){ 
        this.getWrappedObject().setRead(read);
        return this;
    }

    @Signature
    public boolean isSparse(){ 
        return this.getWrappedObject().isSparse();
    }

    @Signature
    public OpenOptions setSparse(boolean sparse){ 
        this.getWrappedObject().setSparse(sparse);
        return this;
    }

    @Signature
    public boolean isSync(){ 
        return this.getWrappedObject().isSync();
    }

    @Signature
    public OpenOptions setSync(boolean sync){ 
        this.getWrappedObject().setSync(sync);
        return this;
    }

    @Signature
    public boolean isTruncateExisting(){ 
        return this.getWrappedObject().isTruncateExisting();
    }

    @Signature
    public OpenOptions setTruncateExisting(boolean truncateExisting){ 
        this.getWrappedObject().setTruncateExisting(truncateExisting);
        return this;
    }

    @Signature
    public boolean isWrite(){ 
        return this.getWrappedObject().isWrite();
    }

    @Signature
    public OpenOptions setWrite(boolean write){ 
        this.getWrappedObject().setWrite(write);
        return this;
    }
}
