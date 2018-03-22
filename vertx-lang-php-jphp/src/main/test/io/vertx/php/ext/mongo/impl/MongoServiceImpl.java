package io.vertx.php.ext.mongo.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.mongo.MongoService;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MongoServiceImpl")
@Namespace("io\\vertx\\php\\ext\\mongo\\impl")
public class MongoServiceImpl extends VertxGenWrapper<io.vertx.ext.mongo.MongoService> implements MongoService<io.vertx.ext.mongo.MongoService>{
    
    public MongoServiceImpl(Environment env, io.vertx.ext.mongo.MongoService wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createEventBusProxy(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MongoServiceImpl::new, io.vertx.ext.mongo.MongoService.createEventBusProxy(vertx, address)
    }

    @Signature
    public Memory save(Environment __env__, Memory... args) {
        this.getWrappedObject().save(collection, document, resultHandler)
    }

    @Signature
    public Memory saveWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().saveWithOptions(collection, document, writeOption, resultHandler)
    }

    @Signature
    public Memory insert(Environment __env__, Memory... args) {
        this.getWrappedObject().insert(collection, document, resultHandler)
    }

    @Signature
    public Memory insertWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().insertWithOptions(collection, document, writeOption, resultHandler)
    }

    @Signature
    public Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(collection, query, update, resultHandler)
    }

    @Signature
    public Memory updateCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCollection(collection, query, update, resultHandler)
    }

    @Signature
    public Memory updateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithOptions(collection, query, update, options, resultHandler)
    }

    @Signature
    public Memory updateCollectionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCollectionWithOptions(collection, query, update, options, resultHandler)
    }

    @Signature
    public Memory replace(Environment __env__, Memory... args) {
        this.getWrappedObject().replace(collection, query, replace, resultHandler)
    }

    @Signature
    public Memory replaceDocuments(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceDocuments(collection, query, replace, resultHandler)
    }

    @Signature
    public Memory replaceWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceWithOptions(collection, query, replace, options, resultHandler)
    }

    @Signature
    public Memory replaceDocumentsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceDocumentsWithOptions(collection, query, replace, options, resultHandler)
    }

    @Signature
    public Memory bulkWrite(Environment __env__, Memory... args) {
        this.getWrappedObject().bulkWrite(collection, operations, resultHandler)
    }

    @Signature
    public Memory bulkWriteWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().bulkWriteWithOptions(collection, operations, bulkWriteOptions, resultHandler)
    }

    @Signature
    public Memory find(Environment __env__, Memory... args) {
        this.getWrappedObject().find(collection, query, resultHandler)
    }

    @Signature
    public Memory findWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findWithOptions(collection, query, options, resultHandler)
    }

    @Signature
    public Memory findOne(Environment __env__, Memory... args) {
        this.getWrappedObject().findOne(collection, query, fields, resultHandler)
    }

    @Signature
    public Memory findOneAndUpdate(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndUpdate(collection, query, update, resultHandler)
    }

    @Signature
    public Memory findOneAndUpdateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, resultHandler)
    }

    @Signature
    public Memory findOneAndReplace(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndReplace(collection, query, replace, resultHandler)
    }

    @Signature
    public Memory findOneAndReplaceWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, resultHandler)
    }

    @Signature
    public Memory findOneAndDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndDelete(collection, query, resultHandler)
    }

    @Signature
    public Memory findOneAndDeleteWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndDeleteWithOptions(collection, query, findOptions, resultHandler)
    }

    @Signature
    public Memory count(Environment __env__, Memory... args) {
        this.getWrappedObject().count(collection, query, resultHandler)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(collection, query, resultHandler)
    }

    @Signature
    public Memory removeDocuments(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocuments(collection, query, resultHandler)
    }

    @Signature
    public Memory removeWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    public Memory removeDocumentsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocumentsWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    public Memory removeOne(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOne(collection, query, resultHandler)
    }

    @Signature
    public Memory removeDocument(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocument(collection, query, resultHandler)
    }

    @Signature
    public Memory removeOneWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOneWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    public Memory removeDocumentWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocumentWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    public Memory createCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().createCollection(collectionName, resultHandler)
    }

    @Signature
    public Memory getCollections(Environment __env__, Memory... args) {
        this.getWrappedObject().getCollections(resultHandler)
    }

    @Signature
    public Memory dropCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().dropCollection(collection, resultHandler)
    }

    @Signature
    public Memory createIndex(Environment __env__, Memory... args) {
        this.getWrappedObject().createIndex(collection, key, resultHandler)
    }

    @Signature
    public Memory createIndexWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().createIndexWithOptions(collection, key, options, resultHandler)
    }

    @Signature
    public Memory listIndexes(Environment __env__, Memory... args) {
        this.getWrappedObject().listIndexes(collection, resultHandler)
    }

    @Signature
    public Memory dropIndex(Environment __env__, Memory... args) {
        this.getWrappedObject().dropIndex(collection, indexName, resultHandler)
    }

    @Signature
    public Memory runCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().runCommand(commandName, command, resultHandler)
    }

    @Signature
    public Memory distinct(Environment __env__, Memory... args) {
        this.getWrappedObject().distinct(collection, fieldName, resultClassname, resultHandler)
    }

    @Signature
    public Memory distinctWithQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().distinctWithQuery(collection, fieldName, resultClassname, query, resultHandler)
    }

}
