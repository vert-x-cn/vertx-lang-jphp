package io.vertx.php.ext.auth.oauth2.providers;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;
@Name("MailchimpAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers")
public interface MailchimpAuth<S extends io.vertx.ext.auth.oauth2.providers.MailchimpAuth> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.providers.MailchimpAuth.create(vertx, clientId, clientSecret)
    }

}
