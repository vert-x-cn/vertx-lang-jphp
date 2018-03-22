package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Tty")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface Tty<S extends io.vertx.ext.shell.term.Tty> extends IWrapper<S>{
    
    @Signature
    default Memory type(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().type()
    }
    
    @Signature
    default Memory width(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().width()
    }
    
    @Signature
    default Memory height(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().height()
    }

    @Signature
    default Memory stdinHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdinHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
    }

}
