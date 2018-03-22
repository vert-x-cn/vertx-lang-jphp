package io.vertx.php.ext.sql;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.sql.SQLRowStream;
import io.vertx.php.ext.sql.SQLOperations;
@Name("SQLConnection")
@Namespace("io\\vertx\\php\\ext\\sql")
public interface SQLConnection<S extends io.vertx.ext.sql.SQLConnection> extends IWrapper<S>{

    @Signature
    default Memory querySingle(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingle(sql, handler)
    }

    @Signature
    default Memory querySingleWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingleWithParams(sql, arguments, handler)
    }

    @Signature
    default Memory setOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setOptions(options)
    }

    @Signature
    default Memory setAutoCommit(Environment __env__, Memory... args) {
        this.getWrappedObject().setAutoCommit(autoCommit, resultHandler)
    }

    @Signature
    default Memory execute(Environment __env__, Memory... args) {
        this.getWrappedObject().execute(sql, resultHandler)
    }

    @Signature
    default Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, resultHandler)
    }

    @Signature
    default Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    default Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, params, resultHandler)
    }

    @Signature
    default Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
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
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default Memory commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit(handler)
    }

    @Signature
    default Memory rollback(Environment __env__, Memory... args) {
        this.getWrappedObject().rollback(handler)
    }

    @Signature
    default Memory setQueryTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setQueryTimeout(timeoutInSeconds)
    }

    @Signature
    default Memory batch(Environment __env__, Memory... args) {
        this.getWrappedObject().batch(sqlStatements, handler)
    }

    @Signature
    default Memory batchWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().batchWithParams(sqlStatement, args, handler)
    }

    @Signature
    default Memory batchCallableWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().batchCallableWithParams(sqlStatement, inArgs, outArgs, handler)
    }

    @Signature
    default Memory setTransactionIsolation(Environment __env__, Memory... args) {
        this.getWrappedObject().setTransactionIsolation(isolation, handler)
    }

    @Signature
    default Memory getTransactionIsolation(Environment __env__, Memory... args) {
        this.getWrappedObject().getTransactionIsolation(handler)
    }

}
