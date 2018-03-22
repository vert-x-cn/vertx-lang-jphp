package io.vertx.php.ext.sql;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.sql.SQLRowStream;
@Name("SQLOperations")
@Namespace("io\\vertx\\php\\ext\\sql")
public interface SQLOperations<S extends io.vertx.ext.sql.SQLOperations> extends IWrapper<S>{

    @Signature
    default Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, resultHandler)
    }

    @Signature
    default Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, params, resultHandler)
    }

    @Signature
    default Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    default Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
    }

    @Signature
    default Memory querySingle(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingle(sql, handler)
    }

    @Signature
    default Memory querySingleWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingleWithParams(sql, arguments, handler)
    }

    @Signature
    default Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(sql, resultHandler)
    }

    @Signature
    default Memory updateWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithParams(sql, params, resultHandler)
    }

    @Signature
    default Memory call(Environment __env__, Memory... args) {
        this.getWrappedObject().call(sql, resultHandler)
    }

    @Signature
    default Memory callWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().callWithParams(sql, params, outputs, resultHandler)
    }

}
