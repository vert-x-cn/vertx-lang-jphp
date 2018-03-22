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
import io.vertx.php.core.Vertx;

/**
 Determines how the hashing is computed in the implementation

 You can implement this to provide a different hashing strategy to the default.

 * @class
 */
@Name("JDBCHashStrategy")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
public class JDBCHashStrategy extends BaseWrapper<JDBCHashStrategy>{

  /**
   Compute a random salt.

   @public

   @return {string} a non null salt value
   */
  this.generateSalt = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jDBCHashStrategy.generateSalt();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Compute the hashed password given the unhashed password and the salt

   @public
   @param password {string} the unhashed password 
   @param salt {string} the salt 
   @param version {number} the nonce version to use 
   @return {string} the hashed password
   */
  this.computeHash = function(password, salt, version) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='number') {
      return j_jDBCHashStrategy.computeHash(password, salt, version);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the hashed password from the result of the authentication query

   @public
   @param row {todo} the row 
   @return {string} the hashed password
   */
  this.getHashedStoredPwd = function(row) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      return j_jDBCHashStrategy.getHashedStoredPwd(utils.convParamJsonArray(row));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve the salt from the result of the authentication query

   @public
   @param row {todo} the row 
   @return {string} the salt
   */
  this.getSalt = function(row) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      return j_jDBCHashStrategy.getSalt(utils.convParamJsonArray(row));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a ordered list of nonces where each position corresponds to a version.
  
   The nonces are supposed not to be stored in the underlying jdbc storage but to
   be provided as a application configuration. The idea is to add one extra variable
   to the hash function in order to make breaking the passwords using rainbow tables
   or precomputed hashes harder. Leaving the attacker only with the brute force
   approach.
  
   Nonces are dependent on the implementation. E.g.: for the SHA512 they are extra salt
   used during the hashing, for the PBKDF2 they map the number of iterations the algorithm
   should take

   @public
   @param nonces {todo} a json array. 
   */
  this.setNonces = function(nonces) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_jDBCHashStrategy.setNonces(utils.convParamJsonArray(nonces));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jDBCHashStrategy;
};

JDBCHashStrategy._jclass = utils.getJavaClass("io.vertx.ext.auth.jdbc.JDBCHashStrategy");
JDBCHashStrategy._jtype = {
  accept: function(obj) {
    return JDBCHashStrategy._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JDBCHashStrategy.prototype, {});
    JDBCHashStrategy.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JDBCHashStrategy._create = function(jdel) {
  var obj = Object.create(JDBCHashStrategy.prototype, {});
  JDBCHashStrategy.apply(obj, arguments);
  return obj;
}
/**
 This is the current backwards compatible hashing implementation, new applications should prefer the
 PBKDF2 implementation, unless the tradeoff between security and CPU usage is an option.

 @memberof module:vertx-auth-jdbc-js/jdbc_hash_strategy
 @param vertx {Vertx} the vert.x instance 
 @return {JDBCHashStrategy} the implementation.
 */
JDBCHashStrategy.createSHA512 = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(JDBCHashStrategy, JJDBCHashStrategy.createSHA512(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Implements a Hashing Strategy as per https://www.owasp.org/index.php/Password_Storage_Cheat_Sheet (2018-01-17).

 New deployments should use this strategy instead of the default one (which was the previous OWASP recommendation).

 The work factor can be updated by using the nonces json array.

 @memberof module:vertx-auth-jdbc-js/jdbc_hash_strategy
 @param vertx {Vertx} the vert.x instance 
 @return {JDBCHashStrategy} the implementation.
 */
JDBCHashStrategy.createPBKDF2 = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(JDBCHashStrategy, JJDBCHashStrategy.createPBKDF2(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Time constant string comparision to avoid timming attacks.

 @memberof module:vertx-auth-jdbc-js/jdbc_hash_strategy
 @param hasha {string} hash a to compare 
 @param hashb {string} hash b to compare 
 @return {boolean} true if equal
 */
JDBCHashStrategy.isEqual = function(hasha, hashb) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
    return JJDBCHashStrategy.isEqual(hasha, hashb);
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JDBCHashStrategy;