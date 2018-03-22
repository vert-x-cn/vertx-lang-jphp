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

package io.vertx.php.ext.auth.mongo;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.mongo.MongoClient;
import io.vertx.php.ext.auth.mongo.HashStrategy;
import io.vertx.php.ext.auth.AuthProvider;

/**

 * @class
 */
@Name("MongoAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
public class MongoAuth extends BaseWrapper<MongoAuth>{
  AuthProvider.call(this, j_val);

  /**
   Authenticate a user.
   <p>
   The first argument is a JSON object containing information for authenticating the user. What this actually contains
   depends on the specific implementation. In the case of a simple username/password based
   authentication it is likely to contain a JSON object with the following structure:
   <pre>
     {
       "username": "tim",
       "password": "mypassword"
     }
   </pre>
   For other types of authentication it contain different information - for example a JWT token or OAuth bearer token.
   <p>
   If the user is successfully authenticated a  object is passed to the handler in an {@link AsyncResult}.
   The user object can then be used for authorisation.

   @public
   @param authInfo {Object} The auth information 
   @param resultHandler {function} The result handler 
   */
  this.authenticate = function(authInfo, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_mongoAuth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the collection to be used. Defaults to DEFAULT_COLLECTION_NAME

   @public
   @param collectionName {string} the name of the collection to be used for storing and reading user data 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setCollectionName = function(collectionName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setCollectionName(collectionName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used for the username. Defaults to DEFAULT_USERNAME_FIELD

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setUsernameField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setUsernameField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used for the password Defaults to DEFAULT_PASSWORD_FIELD

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setPasswordField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setPasswordField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used for the roles. Defaults to DEFAULT_ROLE_FIELD. Roles are expected to
   be saved as JsonArray

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setRoleField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setRoleField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used for the permissions. Defaults to DEFAULT_PERMISSION_FIELD.
   Permissions are expected to be saved as JsonArray

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setPermissionField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setPermissionField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used as property for the username in the method
   {@link AuthProvider#authenticate}. Defaults to DEFAULT_CREDENTIAL_USERNAME_FIELD

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setUsernameCredentialField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setUsernameCredentialField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used as property for the password of credentials in the method
   {@link AuthProvider#authenticate}. Defaults to DEFAULT_CREDENTIAL_PASSWORD_FIELD

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setPasswordCredentialField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setPasswordCredentialField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the field to be used for the salt. Only used when {@link HashStrategy#setSaltStyle} is
   set to 

   @public
   @param fieldName {string} the name of the field to be used 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setSaltField = function(fieldName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setSaltField(fieldName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The name of the collection used to store User objects inside. Defaults to DEFAULT_COLLECTION_NAME

   @public

   @return {string} the collectionName
   */
  this.getCollectionName = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getCollectionName();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used for the username. Defaults to DEFAULT_USERNAME_FIELD

   @public

   @return {string} the usernameField
   */
  this.getUsernameField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getUsernameField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used for the password Defaults to DEFAULT_PASSWORD_FIELD

   @public

   @return {string} the passwordField
   */
  this.getPasswordField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getPasswordField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used for the roles. Defaults to DEFAULT_ROLE_FIELD. Roles are expected to
   be saved as JsonArray

   @public

   @return {string} the roleField
   */
  this.getRoleField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getRoleField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used for the permissions. Defaults to DEFAULT_PERMISSION_FIELD.
   Permissions are expected to be saved as JsonArray

   @public

   @return {string} the permissionField
   */
  this.getPermissionField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getPermissionField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used as property for the username in the method
   {@link AuthProvider#authenticate}. Defaults to DEFAULT_CREDENTIAL_USERNAME_FIELD

   @public

   @return {string} the usernameCredentialField
   */
  this.getUsernameCredentialField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getUsernameCredentialField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used as property for the password of credentials in the method
   {@link AuthProvider#authenticate}. Defaults to DEFAULT_CREDENTIAL_PASSWORD_FIELD

   @public

   @return {string} the passwordCredentialField
   */
  this.getPasswordCredentialField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getPasswordCredentialField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the name of the field to be used for the salt. Only used when {@link HashStrategy#setSaltStyle} is
   set to 

   @public

   @return {string} the saltField
   */
  this.getSaltField = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mongoAuth.getSaltField();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HashStrategy which is used by the current instance

   @public
   @param hashStrategy {HashStrategy} the {@link HashStrategy} to be set 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setHashStrategy = function(hashStrategy) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_mongoAuth.setHashStrategy(hashStrategy._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HashStrategy which is used by the current instance

   @public

   @return {HashStrategy} the defined instance of {@link HashStrategy}
   */
  this.getHashStrategy = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(HashStrategy, j_mongoAuth.getHashStrategy());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The Hash Algorithm which is used by the current instance

   @public
   @param hashAlgorithm {Object} the <a href="../../enums.html#HashAlgorithm">HashAlgorithm</a> to be set 
   @return {MongoAuth} the current instance itself for fluent calls
   */
  this.setHashAlgorithm = function(hashAlgorithm) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mongoAuth.setHashAlgorithm(io.vertx.ext.auth.mongo.HashAlgorithm.valueOf(hashAlgorithm));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Insert a new user into mongo in the convenient way

   @public
   @param username {string} the username to be set 
   @param password {string} the passsword in clear text, will be adapted following the definitions of the defined {@link HashStrategy} 
   @param roles {Array.<string>} a list of roles to be set 
   @param permissions {Array.<string>} a list of permissions to be set 
   @param resultHandler {function} the ResultHandler will be provided with the id of the generated record 
   */
  this.insertUser = function(username, password, roles, permissions, resultHandler) {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'object' && __args[3] instanceof Array && typeof __args[4] === 'function') {
      j_mongoAuth.insertUser(username, password, utils.convParamListBasicOther(roles), utils.convParamListBasicOther(permissions), function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mongoAuth;
};

MongoAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.mongo.MongoAuth");
MongoAuth._jtype = {
  accept: function(obj) {
    return MongoAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MongoAuth.prototype, {});
    MongoAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MongoAuth._create = function(jdel) {
  var obj = Object.create(MongoAuth.prototype, {});
  MongoAuth.apply(obj, arguments);
  return obj;
}
/**
 Creates an instance of MongoAuth by using the given  and configuration object. An example for a
 configuration object:

 <pre>
 JsonObject js = new JsonObject();
 js.put(MongoAuth.PROPERTY_COLLECTION_NAME, createCollectionName(MongoAuth.DEFAULT_COLLECTION_NAME));
 </pre>

 @memberof module:vertx-auth-mongo-js/mongo_auth
 @param mongoClient {MongoClient} an instance of  to be used for data storage and retrival 
 @param config {Object} the configuration object for the current instance. By this 
 @return {MongoAuth} the created instance of {@link MongoAuth}s
 */
MongoAuth.create = function(mongoClient, config) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(MongoAuth, JMongoAuth.create(mongoClient._jdel, utils.convParamJsonObject(config)));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MongoAuth;