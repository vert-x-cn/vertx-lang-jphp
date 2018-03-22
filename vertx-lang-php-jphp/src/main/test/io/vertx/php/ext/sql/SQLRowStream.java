package io.vertx.php.ext.sql;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.streams.ReadStream;
@Name("SQLRowStream")
@Namespace("io\\vertx\\php\\ext\\sql")
public interface SQLRowStream<S extends io.vertx.ext.sql.SQLRowStream> extends IWrapper<S>{

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    default Memory column(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().column(name)
    }
    
    @Signature
    default Memory columns(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().columns()
    }

    @Signature
    default Memory resultSetClosedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resultSetClosedHandler(handler)
    }
    
    @Signature
    default void moreResults(Environment __env__, Memory... args) {
        this.getWrappedObject().moreResults()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
