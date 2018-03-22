package io.vertx.php.ext.mail;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("MailClient")
@Namespace("io\\vertx\\php\\ext\\mail")
public interface MailClient<S extends io.vertx.ext.mail.MailClient> extends IWrapper<S>{

    @Signature
    static Memory createNonShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MailClientImpl::new, io.vertx.ext.mail.MailClient.createNonShared(vertx, config)
    }

    @Signature
    static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MailClientImpl::new, io.vertx.ext.mail.MailClient.createShared(vertx, config)
    }

    @Signature
    default Memory sendMail(Environment __env__, Memory... args) {
        this.getWrappedObject().sendMail(email, resultHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
