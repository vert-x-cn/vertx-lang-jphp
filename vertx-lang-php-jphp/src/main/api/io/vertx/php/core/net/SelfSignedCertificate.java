package io.vertx.php.core.net;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SelfSignedCertificate")
@Namespace("io\\vertx\\php\\core\\net")
@SuppressWarnings("ALL")
public class SelfSignedCertificate extends VertxGenVariable0Wrapper<io.vertx.core.net.SelfSignedCertificate>{
    
    private SelfSignedCertificate(Environment env, io.vertx.core.net.SelfSignedCertificate wrappedObject){
        super(env, wrappedObject);
    }
    public static  SelfSignedCertificate __create(Environment env, io.vertx.core.net.SelfSignedCertificate wrappedObject){
        return new SelfSignedCertificate(env, wrappedObject);
    }

    @Signature
    public Memory keyCertOptions(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.core.net.PemKeyCertOptions.class, PemKeyCertOptions::new, this.getWrappedObject().keyCertOptions());
    }/*1*/

    @Signature
    public Memory trustOptions(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.core.net.PemTrustOptions.class, PemTrustOptions::new, this.getWrappedObject().trustOptions());
    }/*1*/

    @Signature
    public Memory privateKeyPath(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().privateKeyPath());
    }/*1*/

    @Signature
    public Memory certificatePath(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().certificatePath());
    }/*1*/

    @Signature
    public void delete(Environment __ENV__) {
        this.getWrappedObject().delete();
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate>convReturnVertxGenVariable0(__ENV__, SelfSignedCertificate.class, SelfSignedCertificate::__create, io.vertx.core.net.SelfSignedCertificate.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.net.SelfSignedCertificate, SelfSignedCertificate>convReturnVertxGenVariable0(__ENV__, SelfSignedCertificate.class, SelfSignedCertificate::__create, io.vertx.core.net.SelfSignedCertificate.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
