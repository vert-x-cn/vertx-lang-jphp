package io.vertx.php.ext.mail;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MailResult")
@Namespace("io\\vertx\\php\\ext\\mail")
//false
public  class MailResult extends DataObjectWrapper<io.vertx.ext.mail.MailResult> { 
    public MailResult(Environment env, io.vertx.ext.mail.MailResult wrappedObject) {
        super(env, wrappedObject);
    }

    public MailResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mail.MailResult();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mail.MailResult(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getMessageID(){ 
        return this.getWrappedObject().getMessageID();
    }

    @Signature
    public MailResult setMessageID(String messageID){ 
        this.getWrappedObject().setMessageID(messageID);
        return this;
    }

    @Signature
    public List<String> getRecipients(){ 
        return this.getWrappedObject().getRecipients();
    }

    @Signature
    public MailResult setRecipients(List<String> recipients){ 
        this.getWrappedObject().setRecipients(recipients);
        return this;
    }
}
