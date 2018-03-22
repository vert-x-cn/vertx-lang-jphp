package io.vertx.php.core.parsetools;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
@Name("JsonEvent")
@Namespace("io\\vertx\\php\\core\\parsetools")
public interface JsonEvent<S extends io.vertx.core.parsetools.JsonEvent> extends IWrapper<S>{
    
    @Signature
    default Memory type(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().type()
    }
    
    @Signature
    default Memory fieldName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().fieldName()
    }
    
    @Signature
    default Memory value(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().value()
    }
    
    @Signature
    default Memory isNumber(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isNumber()
    }
    
    @Signature
    default Memory integerValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().integerValue()
    }
    
    @Signature
    default Memory longValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().longValue()
    }
    
    @Signature
    default Memory floatValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().floatValue()
    }
    
    @Signature
    default Memory doubleValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().doubleValue()
    }
    
    @Signature
    default Memory isBoolean(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isBoolean()
    }
    
    @Signature
    default Memory booleanValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().booleanValue()
    }
    
    @Signature
    default Memory isString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isString()
    }
    
    @Signature
    default Memory stringValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().stringValue()
    }
    
    @Signature
    default Memory binaryValue(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().binaryValue()
    }
    
    @Signature
    default Memory isNull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isNull()
    }
    
    @Signature
    default Memory isObject(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isObject()
    }
    
    @Signature
    default Memory objectValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().objectValue()
    }
    
    @Signature
    default Memory isArray(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isArray()
    }
    
    @Signature
    default Memory arrayValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().arrayValue()
    }

    @Signature
    default Memory mapTo(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().mapTo(type)
    }

}
