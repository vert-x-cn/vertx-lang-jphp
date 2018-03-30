package io.vertx.php.ext.mail;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MailMessage")
@Namespace("io\\vertx\\php\\ext\\mail")
//false
public  class MailMessage extends DataObjectWrapper<io.vertx.ext.mail.MailMessage> { 
    public MailMessage(Environment env, io.vertx.ext.mail.MailMessage wrappedObject) {
        super(env, wrappedObject);
    }

    public MailMessage(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.mail.MailMessage();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.mail.MailMessage(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<MailAttachment> getAttachment(){ 
        return this.getWrappedObject().getAttachment().stream().map(v -> new MailAttachment(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public MailMessage setAttachment(List<MailAttachment> attachment){ 
        this.getWrappedObject().setAttachment((attachment.stream().map(MailAttachment::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public List<String> getBcc(){ 
        return this.getWrappedObject().getBcc();
    }

    @Signature
    public MailMessage setBcc(List<String> bcc){ 
        this.getWrappedObject().setBcc(bcc);
        return this;
    }

    @Signature
    public String getBounceAddress(){ 
        return this.getWrappedObject().getBounceAddress();
    }

    @Signature
    public MailMessage setBounceAddress(String bounceAddress){ 
        this.getWrappedObject().setBounceAddress(bounceAddress);
        return this;
    }

    @Signature
    public List<String> getCc(){ 
        return this.getWrappedObject().getCc();
    }

    @Signature
    public MailMessage setCc(List<String> cc){ 
        this.getWrappedObject().setCc(cc);
        return this;
    }

    @Signature
    public boolean isFixedHeaders(){ 
        return this.getWrappedObject().isFixedHeaders();
    }

    @Signature
    public MailMessage setFixedHeaders(boolean fixedHeaders){ 
        this.getWrappedObject().setFixedHeaders(fixedHeaders);
        return this;
    }

    @Signature
    public String getFrom(){ 
        return this.getWrappedObject().getFrom();
    }

    @Signature
    public MailMessage setFrom(String from){ 
        this.getWrappedObject().setFrom(from);
        return this;
    }

    @Signature
    public MailMessage addHeader(String key, String value){ 
        this.getWrappedObject().addHeader(key, value);
        return this;
    }

    @Signature
    public String getHtml(){ 
        return this.getWrappedObject().getHtml();
    }

    @Signature
    public MailMessage setHtml(String html){ 
        this.getWrappedObject().setHtml(html);
        return this;
    }

    @Signature
    public List<MailAttachment> getInlineAttachment(){ 
        return this.getWrappedObject().getInlineAttachment().stream().map(v -> new MailAttachment(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public MailMessage setInlineAttachment(List<MailAttachment> inlineAttachment){ 
        this.getWrappedObject().setInlineAttachment((inlineAttachment.stream().map(MailAttachment::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public String getSubject(){ 
        return this.getWrappedObject().getSubject();
    }

    @Signature
    public MailMessage setSubject(String subject){ 
        this.getWrappedObject().setSubject(subject);
        return this;
    }

    @Signature
    public String getText(){ 
        return this.getWrappedObject().getText();
    }

    @Signature
    public MailMessage setText(String text){ 
        this.getWrappedObject().setText(text);
        return this;
    }

    @Signature
    public List<String> getTo(){ 
        return this.getWrappedObject().getTo();
    }

    @Signature
    public MailMessage setTo(List<String> to){ 
        this.getWrappedObject().setTo(to);
        return this;
    }
}
