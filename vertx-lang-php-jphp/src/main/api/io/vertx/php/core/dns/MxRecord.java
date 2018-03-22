package io.vertx.php.core.dns;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("MxRecord")
@Namespace("io\\vertx\\php\\core\\dns")
public interface MxRecord<S extends io.vertx.core.dns.MxRecord> extends IWrapper<S>{
    
    @Signature
    default Memory priority(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().priority()
    }
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }

}
