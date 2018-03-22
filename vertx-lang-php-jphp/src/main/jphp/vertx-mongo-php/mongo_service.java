/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.php.ext.mongo;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.mongo.MongoClient;

/**

 * @class
 */
@Name("MongoService")
@Namespace("io\\vertx\\php\\ext\\mongo")
public class MongoService extends BaseWrapper<MongoService>{
  MongoClient.call(this, j_val);

  /**

   @public
   @param collection {string} 
   @param document {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.save = function(collection, document, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.save(collection, utils.convParamJsonObject(document), function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param document {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.saveWithOptions = function(collection, document, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'string' || __args[2] == null) && typeof __args[3] === 'function') {
      j_mongoService.saveWithOptions(collection, utils.convParamJsonObject(document), writeOption == null ? null : io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param document {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.insert = function(collection, document, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.insert(collection, utils.convParamJsonObject(document), function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param document {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.insertWithOptions = function(collection, document, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'string' || __args[2] == null) && typeof __args[3] === 'function') {
      j_mongoService.insertWithOptions(collection, utils.convParamJsonObject(document), writeOption == null ? null : io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.update = function(collection, query, update, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.update(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.updateCollection = function(collection, query, update, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.updateCollection(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.updateWithOptions = function(collection, query, update, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_mongoService.updateWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), options != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.updateCollectionWithOptions = function(collection, query, update, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_mongoService.updateCollectionWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), options != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param replace {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.replace = function(collection, query, replace, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.replace(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(replace), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param replace {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.replaceDocuments = function(collection, query, replace, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.replaceDocuments(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(replace), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param replace {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.replaceWithOptions = function(collection, query, replace, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_mongoService.replaceWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(replace), options != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param replace {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.replaceDocumentsWithOptions = function(collection, query, replace, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_mongoService.replaceDocumentsWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(replace), options != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param operations {Array.<Object>} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.bulkWrite = function(collection, operations, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_mongoService.bulkWrite(collection, utils.convParamListDataObject(operations, function(json) { return new BulkOperation(json); }), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param operations {Array.<Object>} 
   @param bulkWriteOptions {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.bulkWriteWithOptions = function(collection, operations, bulkWriteOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.bulkWriteWithOptions(collection, utils.convParamListDataObject(operations, function(json) { return new BulkOperation(json); }), bulkWriteOptions != null ? new BulkWriteOptions(new JsonObject(Java.asJSONCompatible(bulkWriteOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.find = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.find(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findWithOptions = function(collection, query, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.findWithOptions(collection, utils.convParamJsonObject(query), options != null ? new FindOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param fields {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOne = function(collection, query, fields, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'object' && typeof __args[3] === 'function') {
      j_mongoService.findOne(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(fields), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndUpdate = function(collection, query, update, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.findOneAndUpdate(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param findOptions {Object} 
   @param updateOptions {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndUpdateWithOptions = function(collection, query, update, findOptions, updateOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 6 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && (typeof __args[4] === 'object' && __args[4] != null) && typeof __args[5] === 'function') {
      j_mongoService.findOneAndUpdateWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), findOptions != null ? new FindOptions(new JsonObject(Java.asJSONCompatible(findOptions))) : null, updateOptions != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(updateOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param replace {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndReplace = function(collection, query, replace, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.findOneAndReplace(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(replace), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param update {Object} 
   @param findOptions {Object} 
   @param updateOptions {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndReplaceWithOptions = function(collection, query, update, findOptions, updateOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 6 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null) && (typeof __args[4] === 'object' && __args[4] != null) && typeof __args[5] === 'function') {
      j_mongoService.findOneAndReplaceWithOptions(collection, utils.convParamJsonObject(query), utils.convParamJsonObject(update), findOptions != null ? new FindOptions(new JsonObject(Java.asJSONCompatible(findOptions))) : null, updateOptions != null ? new UpdateOptions(new JsonObject(Java.asJSONCompatible(updateOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndDelete = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.findOneAndDelete(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param findOptions {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.findOneAndDeleteWithOptions = function(collection, query, findOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.findOneAndDeleteWithOptions(collection, utils.convParamJsonObject(query), findOptions != null ? new FindOptions(new JsonObject(Java.asJSONCompatible(findOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.count = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.count(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnLong(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.remove = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.remove(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeDocuments = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.removeDocuments(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeWithOptions = function(collection, query, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_mongoService.removeWithOptions(collection, utils.convParamJsonObject(query), io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeDocumentsWithOptions = function(collection, query, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'string' || __args[2] == null) && typeof __args[3] === 'function') {
      j_mongoService.removeDocumentsWithOptions(collection, utils.convParamJsonObject(query), writeOption == null ? null : io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeOne = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.removeOne(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeDocument = function(collection, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.removeDocument(collection, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeOneWithOptions = function(collection, query, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_mongoService.removeOneWithOptions(collection, utils.convParamJsonObject(query), io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param query {Object} 
   @param writeOption {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.removeDocumentWithOptions = function(collection, query, writeOption, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'string' || __args[2] == null) && typeof __args[3] === 'function') {
      j_mongoService.removeDocumentWithOptions(collection, utils.convParamJsonObject(query), writeOption == null ? null : io.vertx.ext.mongo.WriteOption.valueOf(writeOption), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collectionName {string} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.createCollection = function(collectionName, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_mongoService.createCollection(collectionName, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.getCollections = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mongoService.getCollections(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.dropCollection = function(collection, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_mongoService.dropCollection(collection, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param key {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.createIndex = function(collection, key, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.createIndex(collection, utils.convParamJsonObject(key), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param key {Object} 
   @param options {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.createIndexWithOptions = function(collection, key, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_mongoService.createIndexWithOptions(collection, utils.convParamJsonObject(key), options != null ? new IndexOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.listIndexes = function(collection, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_mongoService.listIndexes(collection, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param indexName {string} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.dropIndex = function(collection, indexName, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_mongoService.dropIndex(collection, indexName, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param commandName {string} 
   @param command {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.runCommand = function(commandName, command, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_mongoService.runCommand(commandName, utils.convParamJsonObject(command), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param fieldName {string} 
   @param resultClassname {string} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.distinct = function(collection, fieldName, resultClassname, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_mongoService.distinct(collection, fieldName, resultClassname, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param collection {string} 
   @param fieldName {string} 
   @param resultClassname {string} 
   @param query {Object} 
   @param resultHandler {function} 
   @return {MongoService}
   */
  this.distinctWithQuery = function(collection, fieldName, resultClassname, query, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_mongoService.distinctWithQuery(collection, fieldName, resultClassname, utils.convParamJsonObject(query), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mongoService.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mongoService;
};

MongoService._jclass = utils.getJavaClass("io.vertx.ext.mongo.MongoService");
MongoService._jtype = {
  accept: function(obj) {
    return MongoService._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MongoService.prototype, {});
    MongoService.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MongoService._create = function(jdel) {
  var obj = Object.create(MongoService.prototype, {});
  MongoService.apply(obj, arguments);
  return obj;
}
/**
 Create a proxy to a service that is deployed somewhere on the event bus

 @memberof module:vertx-mongo-js/mongo_service
 @param vertx {Vertx} the Vert.x instance 
 @param address {string} the address the service is listening on on the event bus 
 @return {MongoService} the service
 */
MongoService.createEventBusProxy = function(vertx, address) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(MongoService, JMongoService.createEventBusProxy(vertx._jdel, address));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MongoService;