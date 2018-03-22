package io.vertx.php.core.net;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("SelfSignedCertificate")
@Namespace("io\\vertx\\php\\core\\net")
public interface SelfSignedCertificate<S extends io.vertx.core.net.SelfSignedCertificate> extends IWrapper<S>{
    
    @Signature
    default Memory keyCertOptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().keyCertOptions()
    }
    
    @Signature
    default Memory trustOptions(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().trustOptions()
    }
    
    @Signature
    default Memory privateKeyPath(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().privateKeyPath()
    }
    
    @Signature
    default Memory certificatePath(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().certificatePath()
    }
    
    @Signature
    default void delete(Environment __env__, Memory... args) {
        this.getWrappedObject().delete()
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SelfSignedCertificateImpl::new, io.vertx.core.net.SelfSignedCertificate.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SelfSignedCertificateImpl::new, io.vertx.core.net.SelfSignedCertificate.create()
    }

}
