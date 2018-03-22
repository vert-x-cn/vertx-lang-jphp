package io.vertx.php.core.dns;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("SrvRecord")
@Namespace("io\\vertx\\php\\core\\dns")
public interface SrvRecord<S extends io.vertx.core.dns.SrvRecord> extends IWrapper<S>{
    
    @Signature
    default Memory priority(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().priority()
    }
    
    @Signature
    default Memory weight(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().weight()
    }
    
    @Signature
    default Memory port(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().port()
    }
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }
    
    @Signature
    default Memory protocol(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().protocol()
    }
    
    @Signature
    default Memory service(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().service()
    }
    
    @Signature
    default Memory target(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().target()
    }

}
