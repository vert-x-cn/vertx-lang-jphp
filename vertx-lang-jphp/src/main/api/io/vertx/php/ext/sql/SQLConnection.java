package io.vertx.php.ext.sql;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.sql.TransactionIsolation;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.EnumConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("SQLConnection")
@Namespace("io\\vertx\\php\\ext\\sql")
@SuppressWarnings("ALL")
public class SQLConnection extends VertxGenVariable0Wrapper<io.vertx.ext.sql.SQLConnection>{
    
    private SQLConnection(Environment env, io.vertx.ext.sql.SQLConnection wrappedObject){
        super(env, wrappedObject);
    }
    public static  SQLConnection __create(Environment env, io.vertx.ext.sql.SQLConnection wrappedObject){
        return new SQLConnection(env, wrappedObject);
    }

    @Signature
    public Memory querySingle(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().querySingle(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory querySingleWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonArray(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().querySingleWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonArray(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.sql.SQLOptions.class, arg0)) {
            this.getWrappedObject().setOptions(Utils.convParamDataObject(__ENV__, io.vertx.ext.sql.SQLOptions.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setAutoCommit(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().setAutoCommit(Utils.convParamBoolean(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory execute(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().execute(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory query(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().query(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.ResultSet.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory queryStream(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().queryStream(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.sql.SQLRowStream, SQLRowStream>create0(SQLRowStream.class, SQLRowStream::__create), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory queryWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonArray(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().queryWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonArray(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.ResultSet.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory queryStreamWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonArray(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().queryStreamWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonArray(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.sql.SQLRowStream, SQLRowStream>create0(SQLRowStream.class, SQLRowStream::__create), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory update(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().update(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.UpdateResult.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory updateWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonArray(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().updateWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonArray(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.UpdateResult.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory call(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().call(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.ResultSet.class), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory callWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonArray(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonArray(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().callWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonArray(__ENV__, arg1), Utils.convParamJsonArray(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.sql.ResultSet.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory commit(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().commit(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory rollback(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().rollback(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setQueryTimeout(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setQueryTimeout(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory batch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().batch(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory batchWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.JSON_ARRAY, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().batchWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.JSON_ARRAY, arg1), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory batchCallableWithParams(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, TypeConverter.JSON_ARRAY, arg1) && Utils.isNotNull(arg2) && Utils.isList(__ENV__, TypeConverter.JSON_ARRAY, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().batchCallableWithParams(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, TypeConverter.JSON_ARRAY, arg1), Utils.convParamList(__ENV__, TypeConverter.JSON_ARRAY, arg2), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setTransactionIsolation(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, TransactionIsolation.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().setTransactionIsolation(Utils.convParamEnum(__ENV__, TransactionIsolation.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getTransactionIsolation(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().getTransactionIsolation(Utils.convParamHandlerAsyncResult(__ENV__, EnumConverter.create(TransactionIsolation.class), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
