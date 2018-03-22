package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("SignalHandler")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface SignalHandler<S extends io.vertx.ext.shell.term.SignalHandler> extends IWrapper<S>{

    @Signature
    default Memory deliver(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().deliver(key)
    }

}
