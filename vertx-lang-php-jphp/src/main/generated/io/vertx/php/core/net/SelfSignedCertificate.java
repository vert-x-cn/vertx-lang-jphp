package io.vertx.php.core.net;
import java.lang.String;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("SelfSignedCertificate")
@Namespace("io\\vertx\\php\\core\\net")
public class SelfSignedCertificate extends BaseWrapper<io.vertx.core.net.SelfSignedCertificate> {
    
    public SelfSignedCertificate(Environment env, io.vertx.core.net.SelfSignedCertificate wrappedObject) {
        super(env, wrappedObject);
    }
    
    public SelfSignedCertificate(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.net.SelfSignedCertificate getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public String certificatePath(){
        return this.getWrappedObject().certificatePath();
    }
   
    @Signature
    //false
    public static SelfSignedCertificate create(Environment __env__){
        return new SelfSignedCertificate(__env__, io.vertx.core.net.SelfSignedCertificate.create());
    }
   
    @Signature
    //false
    public static SelfSignedCertificate create(Environment __env__, String fqdn){
        return new SelfSignedCertificate(__env__, io.vertx.core.net.SelfSignedCertificate.create(fqdn));
    }
   
    @Signature
    //false
    public void delete(){
            }
   
    @Signature
    //false
    public PemKeyCertOptions keyCertOptions(){
        return new PemKeyCertOptions(__env__, this.getWrappedObject().keyCertOptions());
    }
   
    @Signature
    //false
    public String privateKeyPath(){
        return this.getWrappedObject().privateKeyPath();
    }
   
    @Signature
    //false
    public PemTrustOptions trustOptions(){
        return new PemTrustOptions(__env__, this.getWrappedObject().trustOptions());
    }

}
