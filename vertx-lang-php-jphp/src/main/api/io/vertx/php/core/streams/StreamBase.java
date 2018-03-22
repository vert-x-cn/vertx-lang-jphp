package io.vertx.php.core.streams;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("StreamBase")
@Namespace("io\\vertx\\php\\core\\streams")
public interface StreamBase<S extends io.vertx.core.streams.StreamBase> extends IWrapper<S>{

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
