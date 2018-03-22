package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.ParsedHeaderValue;
import io.vertx.php.ext.web.MIMEHeader;
import io.vertx.php.ext.web.LanguageHeader;
@Name("ParsedHeaderValues")
@Namespace("io\\vertx\\php\\ext\\web")
public interface ParsedHeaderValues<S extends io.vertx.ext.web.ParsedHeaderValues> extends IWrapper<S>{
    
    @Signature
    default Memory accept(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().accept()
    }
    
    @Signature
    default Memory acceptCharset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptCharset()
    }
    
    @Signature
    default Memory acceptEncoding(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptEncoding()
    }
    
    @Signature
    default Memory acceptLanguage(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().acceptLanguage()
    }
    
    @Signature
    default Memory contentType(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MIMEHeaderImpl::new, this.getWrappedObject().contentType()
    }

}
