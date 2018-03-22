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

package io.vertx.php.ext.auth.jdbc;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.jdbc.JDBCClient;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;

/**

 * @class
 */
@Name("JDBCAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
public class JDBCAuth extends BaseWrapper<JDBCAuth>{
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
      j_jDBCAuth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the authentication query to use. Use this if you want to override the default authentication query.

   @public
   @param authenticationQuery {string} the authentication query 
   @return {JDBCAuth} a reference to this for fluency
   */
  this.setAuthenticationQuery = function(authenticationQuery) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jDBCAuth.setAuthenticationQuery(authenticationQuery);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the roles query to use. Use this if you want to override the default roles query.

   @public
   @param rolesQuery {string} the roles query 
   @return {JDBCAuth} a reference to this for fluency
   */
  this.setRolesQuery = function(rolesQuery) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jDBCAuth.setRolesQuery(rolesQuery);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the permissions query to use. Use this if you want to override the default permissions query.

   @public
   @param permissionsQuery {string} the permissions query 
   @return {JDBCAuth} a reference to this for fluency
   */
  this.setPermissionsQuery = function(permissionsQuery) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jDBCAuth.setPermissionsQuery(permissionsQuery);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the role prefix to distinguish from permissions when checking for isPermitted requests.

   @public
   @param rolePrefix {string} a Prefix e.g.: "role:" 
   @return {JDBCAuth} a reference to this for fluency
   */
  this.setRolePrefix = function(rolePrefix) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jDBCAuth.setRolePrefix(rolePrefix);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Compute the hashed password given the unhashed password and the salt
  
   The implementation relays to the JDBCHashStrategy provided.

   @public
   @param password {string} the unhashed password 
   @param salt {string} the salt 
   @param version {number} the nonce version to use 
   @return {string} the hashed password
   */
  this.computeHash = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      return j_jDBCAuth.computeHash(__args[0], __args[1]);
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number') {
      return j_jDBCAuth.computeHash(__args[0], __args[1], __args[2]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Compute a salt string.
  
   The implementation relays to the JDBCHashStrategy provided.

   @public

   @return {string} a non null salt value
   */
  this.generateSalt = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jDBCAuth.generateSalt();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Provide a application configuration level on hash nonce's as a ordered list of
   nonces where each position corresponds to a version.
  
   The nonces are supposed not to be stored in the underlying jdbc storage but to
   be provided as a application configuration. The idea is to add one extra variable
   to the hash function in order to make breaking the passwords using rainbow tables
   or precomputed hashes harder. Leaving the attacker only with the brute force
   approach.
  
   The implementation relays to the JDBCHashStrategy provided.

   @public
   @param nonces {todo} a List of non null Strings. 
   @return {JDBCAuth} a reference to this for fluency
   */
  this.setNonces = function(nonces) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_jDBCAuth.setNonces(utils.convParamJsonArray(nonces));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jDBCAuth;
};

JDBCAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.jdbc.JDBCAuth");
JDBCAuth._jtype = {
  accept: function(obj) {
    return JDBCAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JDBCAuth.prototype, {});
    JDBCAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JDBCAuth._create = function(jdel) {
  var obj = Object.create(JDBCAuth.prototype, {});
  JDBCAuth.apply(obj, arguments);
  return obj;
}
/**
 Create a JDBC auth provider implementation

 @memberof module:vertx-auth-jdbc-js/jdbc_auth
 @param vertx {Vertx} 
 @param client {JDBCClient} the JDBC client instance 
 @return {JDBCAuth} the auth provider
 */
JDBCAuth.create = function(vertx, client) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(JDBCAuth, JJDBCAuth.create(vertx._jdel, client._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JDBCAuth;