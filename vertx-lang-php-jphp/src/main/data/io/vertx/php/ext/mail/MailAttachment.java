package io.vertx.php.ext.mail;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MailAttachment")
@Namespace("io\\vertx\\php\\ext\\mail")
//false
public  class MailAttachment extends DataObjectWrapper<io.vertx.ext.mail.MailAttachment> { 
    public MailAttachment(Environment env, io.vertx.ext.mail.MailAttachment wrappedObject) {
        super(env, wrappedObject);
    }

    public MailAttachment(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mail.MailAttachment();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mail.MailAttachment(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getContentId(){ 
        return this.getWrappedObject().getContentId();
    }

    @Signature
    public MailAttachment setContentId(String contentId){ 
        this.getWrappedObject().setContentId(contentId);
        return this;
    }

    @Signature
    public String getContentType(){ 
        return this.getWrappedObject().getContentType();
    }

    @Signature
    public MailAttachment setContentType(String contentType){ 
        this.getWrappedObject().setContentType(contentType);
        return this;
    }

    @Signature
    public Buffer getData(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getData());
    }

    @Signature
    public MailAttachment setData(Buffer data){ 
        this.getWrappedObject().setData(data.getWrappedObject());
        return this;
    }

    @Signature
    public String getDescription(){ 
        return this.getWrappedObject().getDescription();
    }

    @Signature
    public MailAttachment setDescription(String description){ 
        this.getWrappedObject().setDescription(description);
        return this;
    }

    @Signature
    public String getDisposition(){ 
        return this.getWrappedObject().getDisposition();
    }

    @Signature
    public MailAttachment setDisposition(String disposition){ 
        this.getWrappedObject().setDisposition(disposition);
        return this;
    }

    @Signature
    public MailAttachment addHeader(String key, String value){ 
        this.getWrappedObject().addHeader(key, value);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public MailAttachment setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }
}
