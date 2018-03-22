package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("ParsedHeaderValue")
@Namespace("io\\vertx\\php\\ext\\web")
public interface ParsedHeaderValue<S extends io.vertx.ext.web.ParsedHeaderValue> extends IWrapper<S>{
    
    @Signature
    default Memory rawValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().rawValue()
    }
    
    @Signature
    default Memory value(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().value()
    }
    
    @Signature
    default Memory weight(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().weight()
    }

    @Signature
    default Memory parameter(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().parameter(key)
    }
    
    @Signature
    default Memory parameters(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().parameters()
    }
    
    @Signature
    default Memory isPermitted(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isPermitted()
    }

    @Signature
    default Memory isMatchedBy(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMatchedBy(matchTry)
    }
    
    @Signature
    default Memory weightedOrder(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().weightedOrder()
    }

}
