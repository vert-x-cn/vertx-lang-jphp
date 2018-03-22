package io.vertx.php.ext.sql.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.sql.SQLOperations;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SQLOperationsImpl")
@Namespace("io\\vertx\\php\\ext\\sql\\impl")
public class SQLOperationsImpl extends VertxGenWrapper<io.vertx.ext.sql.SQLOperations> implements SQLOperations<io.vertx.ext.sql.SQLOperations>{
    
    public SQLOperationsImpl(Environment env, io.vertx.ext.sql.SQLOperations wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, resultHandler)
    }

    @Signature
    public Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, params, resultHandler)
    }

    @Signature
    public Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    public Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
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

}
