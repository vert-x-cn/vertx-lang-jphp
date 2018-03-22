package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.ParsedHeaderValue;
import io.vertx.php.ext.web.Locale;
@Name("LanguageHeader")
@Namespace("io\\vertx\\php\\ext\\web")
public interface LanguageHeader<S extends io.vertx.ext.web.LanguageHeader> extends IWrapper<S>{
    
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
    
    @Signature
    default Memory language(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().language()
    }
    
    @Signature
    default Memory country(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().country()
    }
    
    @Signature
    default Memory variant(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().variant()
    }
    
    @Signature
    default Memory tag(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tag()
    }
    
    @Signature
    default Memory subtag(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subtag()
    }

    @Signature
    default Memory subtag(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subtag()
    }
    
    @Signature
    default Memory subtagCount(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subtagCount()
    }

}
