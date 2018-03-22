package io.vertx.php.core.net.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.net.SelfSignedCertificate;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SelfSignedCertificateImpl")
@Namespace("io\\vertx\\php\\core\\net\\impl")
public class SelfSignedCertificateImpl extends VertxGenWrapper<io.vertx.core.net.SelfSignedCertificate> implements SelfSignedCertificate<io.vertx.core.net.SelfSignedCertificate>{
    
    public SelfSignedCertificateImpl(Environment env, io.vertx.core.net.SelfSignedCertificate wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SelfSignedCertificateImpl::new, io.vertx.core.net.SelfSignedCertificate.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SelfSignedCertificateImpl::new, io.vertx.core.net.SelfSignedCertificate.create()
    }

}
