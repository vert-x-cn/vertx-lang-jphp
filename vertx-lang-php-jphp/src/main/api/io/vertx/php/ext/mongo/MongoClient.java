package io.vertx.php.ext.mongo;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.WriteOption;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MongoClient")
@Namespace("io\\vertx\\php\\ext\\mongo")
@SuppressWarnings("ALL")
public class MongoClient extends VertxGenVariable0Wrapper<io.vertx.ext.mongo.MongoClient>{
    
    private MongoClient(Environment env, io.vertx.ext.mongo.MongoClient wrappedObject){
        super(env, wrappedObject);
    }
    public static  MongoClient __create(Environment env, io.vertx.ext.mongo.MongoClient wrappedObject){
        return new MongoClient(env, wrappedObject);
    }

    @Signature
    public static Memory createNonShared(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.mongo.MongoClient, MongoClient>convReturnVertxGenVariable0(__ENV__, MongoClient.class, MongoClient::__create, io.vertx.ext.mongo.MongoClient.createNonShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createShared(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.mongo.MongoClient, MongoClient>convReturnVertxGenVariable0(__ENV__, MongoClient.class, MongoClient::__create, io.vertx.ext.mongo.MongoClient.createShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createShared(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.mongo.MongoClient, MongoClient>convReturnVertxGenVariable0(__ENV__, MongoClient.class, MongoClient::__create, io.vertx.ext.mongo.MongoClient.createShared(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory save(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().save(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory saveWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().saveWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory insert(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().insert(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory insertWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().insertWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory update(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().update(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory updateCollection(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().updateCollection(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientUpdateResult.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory updateWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().updateWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory updateCollectionWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().updateCollectionWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientUpdateResult.class), arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replace(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().replace(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replaceDocuments(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().replaceDocuments(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientUpdateResult.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replaceWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().replaceWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replaceDocumentsWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().replaceDocumentsWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg3), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientUpdateResult.class), arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bulkWrite(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.BulkOperation.class), arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().bulkWrite(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.BulkOperation.class), arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientBulkWriteResult.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bulkWriteWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.BulkOperation.class), arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.BulkWriteOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().bulkWriteWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.BulkOperation.class), arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.BulkWriteOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientBulkWriteResult.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory find(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().find(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findBatch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().findBatch(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().findWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findBatchWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().findBatchWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOne(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().findOne(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndUpdate(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().findOneAndUpdate(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndUpdateWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().findOneAndUpdateWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg3), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg4), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndReplace(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().findOneAndReplace(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndReplaceWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg3) && Utils.isNotNull(arg4) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().findOneAndReplaceWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg3), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.UpdateOptions.class, arg4), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndDelete(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().findOneAndDelete(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory findOneAndDeleteWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().findOneAndDeleteWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.FindOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory count(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().count(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().remove(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeDocuments(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().removeDocuments(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientDeleteResult.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().removeWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeDocumentsWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().removeDocumentsWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientDeleteResult.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeOne(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().removeOne(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeDocument(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().removeDocument(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientDeleteResult.class), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeOneWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().removeOneWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeDocumentWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isEnum(__ENV__, WriteOption.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().removeDocumentWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamEnum(__ENV__, WriteOption.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.ext.mongo.MongoClientDeleteResult.class), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createCollection(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().createCollection(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getCollections(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().getCollections(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory dropCollection(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().dropCollection(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createIndex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().createIndex(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createIndexWithOptions(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.mongo.IndexOptions.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().createIndexWithOptions(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.mongo.IndexOptions.class, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory listIndexes(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().listIndexes(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory dropIndex(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().dropIndex(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory runCommand(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().runCommand(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory distinct(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().distinct(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory distinctWithQuery(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isJsonObject(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().distinctWithQuery(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamJsonObject(__ENV__, arg3), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg4));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory distinctBatch(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().distinctBatch(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory distinctBatchWithQuery(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isJsonObject(__ENV__, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().distinctBatchWithQuery(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamJsonObject(__ENV__, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory distinctBatchWithQuery(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isJsonObject(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isInteger(__ENV__, arg4)) {
            return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().distinctBatchWithQuery(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamJsonObject(__ENV__, arg3), Utils.convParamInteger(__ENV__, arg4)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
