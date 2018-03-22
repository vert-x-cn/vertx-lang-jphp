package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.Destination;
import io.vertx.php.core.Vertx;
@Name("DestinationFactory")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface DestinationFactory<S extends io.vertx.ext.stomp.DestinationFactory> extends IWrapper<S>{

    @Signature
    default Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DestinationImpl::new, this.getWrappedObject().create(vertx, name)
    }

}
