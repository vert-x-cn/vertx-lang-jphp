package io.vertx.php.ext.mongo;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.mongo.MongoClient;
@Name("MongoService")
@Namespace("io\\vertx\\php\\ext\\mongo")
public interface MongoService<S extends io.vertx.ext.mongo.MongoService> extends IWrapper<S>{

    @Signature
    static Memory createEventBusProxy(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MongoServiceImpl::new, io.vertx.ext.mongo.MongoService.createEventBusProxy(vertx, address)
    }

    @Signature
    default Memory save(Environment __env__, Memory... args) {
        this.getWrappedObject().save(collection, document, resultHandler)
    }

    @Signature
    default Memory saveWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().saveWithOptions(collection, document, writeOption, resultHandler)
    }

    @Signature
    default Memory insert(Environment __env__, Memory... args) {
        this.getWrappedObject().insert(collection, document, resultHandler)
    }

    @Signature
    default Memory insertWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().insertWithOptions(collection, document, writeOption, resultHandler)
    }

    @Signature
    default Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(collection, query, update, resultHandler)
    }

    @Signature
    default Memory updateCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCollection(collection, query, update, resultHandler)
    }

    @Signature
    default Memory updateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithOptions(collection, query, update, options, resultHandler)
    }

    @Signature
    default Memory updateCollectionWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().updateCollectionWithOptions(collection, query, update, options, resultHandler)
    }

    @Signature
    default Memory replace(Environment __env__, Memory... args) {
        this.getWrappedObject().replace(collection, query, replace, resultHandler)
    }

    @Signature
    default Memory replaceDocuments(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceDocuments(collection, query, replace, resultHandler)
    }

    @Signature
    default Memory replaceWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceWithOptions(collection, query, replace, options, resultHandler)
    }

    @Signature
    default Memory replaceDocumentsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceDocumentsWithOptions(collection, query, replace, options, resultHandler)
    }

    @Signature
    default Memory bulkWrite(Environment __env__, Memory... args) {
        this.getWrappedObject().bulkWrite(collection, operations, resultHandler)
    }

    @Signature
    default Memory bulkWriteWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().bulkWriteWithOptions(collection, operations, bulkWriteOptions, resultHandler)
    }

    @Signature
    default Memory find(Environment __env__, Memory... args) {
        this.getWrappedObject().find(collection, query, resultHandler)
    }

    @Signature
    default Memory findWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findWithOptions(collection, query, options, resultHandler)
    }

    @Signature
    default Memory findOne(Environment __env__, Memory... args) {
        this.getWrappedObject().findOne(collection, query, fields, resultHandler)
    }

    @Signature
    default Memory findOneAndUpdate(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndUpdate(collection, query, update, resultHandler)
    }

    @Signature
    default Memory findOneAndUpdateWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, resultHandler)
    }

    @Signature
    default Memory findOneAndReplace(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndReplace(collection, query, replace, resultHandler)
    }

    @Signature
    default Memory findOneAndReplaceWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, resultHandler)
    }

    @Signature
    default Memory findOneAndDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndDelete(collection, query, resultHandler)
    }

    @Signature
    default Memory findOneAndDeleteWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().findOneAndDeleteWithOptions(collection, query, findOptions, resultHandler)
    }

    @Signature
    default Memory count(Environment __env__, Memory... args) {
        this.getWrappedObject().count(collection, query, resultHandler)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(collection, query, resultHandler)
    }

    @Signature
    default Memory removeDocuments(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocuments(collection, query, resultHandler)
    }

    @Signature
    default Memory removeWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    default Memory removeDocumentsWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocumentsWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    default Memory removeOne(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOne(collection, query, resultHandler)
    }

    @Signature
    default Memory removeDocument(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocument(collection, query, resultHandler)
    }

    @Signature
    default Memory removeOneWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeOneWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    default Memory removeDocumentWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().removeDocumentWithOptions(collection, query, writeOption, resultHandler)
    }

    @Signature
    default Memory createCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().createCollection(collectionName, resultHandler)
    }

    @Signature
    default Memory getCollections(Environment __env__, Memory... args) {
        this.getWrappedObject().getCollections(resultHandler)
    }

    @Signature
    default Memory dropCollection(Environment __env__, Memory... args) {
        this.getWrappedObject().dropCollection(collection, resultHandler)
    }

    @Signature
    default Memory createIndex(Environment __env__, Memory... args) {
        this.getWrappedObject().createIndex(collection, key, resultHandler)
    }

    @Signature
    default Memory createIndexWithOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().createIndexWithOptions(collection, key, options, resultHandler)
    }

    @Signature
    default Memory listIndexes(Environment __env__, Memory... args) {
        this.getWrappedObject().listIndexes(collection, resultHandler)
    }

    @Signature
    default Memory dropIndex(Environment __env__, Memory... args) {
        this.getWrappedObject().dropIndex(collection, indexName, resultHandler)
    }

    @Signature
    default Memory runCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().runCommand(commandName, command, resultHandler)
    }

    @Signature
    default Memory distinct(Environment __env__, Memory... args) {
        this.getWrappedObject().distinct(collection, fieldName, resultClassname, resultHandler)
    }

    @Signature
    default Memory distinctWithQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().distinctWithQuery(collection, fieldName, resultClassname, query, resultHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
