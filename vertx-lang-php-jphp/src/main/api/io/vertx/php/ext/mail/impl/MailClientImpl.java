package io.vertx.php.ext.mail.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.mail.MailClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MailClientImpl")
@Namespace("io\\vertx\\php\\ext\\mail\\impl")
public class MailClientImpl extends VertxGenWrapper<io.vertx.ext.mail.MailClient> implements MailClient<io.vertx.ext.mail.MailClient>{
    
    public MailClientImpl(Environment env, io.vertx.ext.mail.MailClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createNonShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MailClientImpl::new, io.vertx.ext.mail.MailClient.createNonShared(vertx, config)
    }

    @Signature
    public static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MailClientImpl::new, io.vertx.ext.mail.MailClient.createShared(vertx, config)
    }

    @Signature
    public Memory sendMail(Environment __env__, Memory... args) {
        this.getWrappedObject().sendMail(email, resultHandler)
    }

}
