package io.vertx.php.ext.sql.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.sql.SQLConnection;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SQLConnectionImpl")
@Namespace("io\\vertx\\php\\ext\\sql\\impl")
public class SQLConnectionImpl extends VertxGenWrapper<io.vertx.ext.sql.SQLConnection> implements SQLConnection<io.vertx.ext.sql.SQLConnection>{
    
    public SQLConnectionImpl(Environment env, io.vertx.ext.sql.SQLConnection wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory querySingle(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingle(sql, handler)
    }

    @Signature
    public Memory querySingleWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingleWithParams(sql, arguments, handler)
    }

    @Signature
    public Memory setOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().setOptions(options)
    }

    @Signature
    public Memory setAutoCommit(Environment __env__, Memory... args) {
        this.getWrappedObject().setAutoCommit(autoCommit, resultHandler)
    }

    @Signature
    public Memory execute(Environment __env__, Memory... args) {
        this.getWrappedObject().execute(sql, resultHandler)
    }

    @Signature
    public Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, resultHandler)
    }

    @Signature
    public Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    public Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, params, resultHandler)
    }

    @Signature
    public Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
    }

    @Signature
    public Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(sql, resultHandler)
    }

    @Signature
    public Memory updateWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithParams(sql, params, resultHandler)
    }

    @Signature
    public Memory call(Environment __env__, Memory... args) {
        this.getWrappedObject().call(sql, resultHandler)
    }

    @Signature
    public Memory callWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().callWithParams(sql, params, outputs, resultHandler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public Memory commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit(handler)
    }

    @Signature
    public Memory rollback(Environment __env__, Memory... args) {
        this.getWrappedObject().rollback(handler)
    }

    @Signature
    public Memory setQueryTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setQueryTimeout(timeoutInSeconds)
    }

    @Signature
    public Memory batch(Environment __env__, Memory... args) {
        this.getWrappedObject().batch(sqlStatements, handler)
    }

    @Signature
    public Memory batchWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().batchWithParams(sqlStatement, args, handler)
    }

    @Signature
    public Memory batchCallableWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().batchCallableWithParams(sqlStatement, inArgs, outArgs, handler)
    }

    @Signature
    public Memory setTransactionIsolation(Environment __env__, Memory... args) {
        this.getWrappedObject().setTransactionIsolation(isolation, handler)
    }

    @Signature
    public Memory getTransactionIsolation(Environment __env__, Memory... args) {
        this.getWrappedObject().getTransactionIsolation(handler)
    }

}
