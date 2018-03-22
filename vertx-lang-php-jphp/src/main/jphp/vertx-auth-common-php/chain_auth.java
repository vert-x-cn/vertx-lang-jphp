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

package io.vertx.php.ext.auth;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.auth.AuthProvider;

/**
 Chain several auth providers as if they were one. This is useful for cases where one want to authenticate across
 several providers, for example, database and fallback to passwd file.

 * @class
 */
@Name("ChainAuth")
@Namespace("io\\vertx\\php\\ext\\auth")
public class ChainAuth extends BaseWrapper<ChainAuth>{
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
   If the user is successfully authenticated a {@link User} object is passed to the handler in an {@link AsyncResult}.
   The user object can then be used for authorisation.

   @public
   @param authInfo {Object} The auth information 
   @param resultHandler {function} The result handler 
   */
  this.authenticate = function(authInfo, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_chainAuth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Appends a auth provider to the chain.

   @public
   @param other {AuthProvider} auth provider 
   @return {ChainAuth} self
   */
  this.append = function(other) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_chainAuth.append(other._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Removes a provider from the chain.

   @public
   @param other {AuthProvider} provider to remove 
   @return {boolean} true if provider was removed, false if non existent in the chain.
   */
  this.remove = function(other) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_chainAuth.remove(other._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Clears the chain.

   @public

   */
  this.clear = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_chainAuth.clear();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_chainAuth;
};

ChainAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.ChainAuth");
ChainAuth._jtype = {
  accept: function(obj) {
    return ChainAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ChainAuth.prototype, {});
    ChainAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ChainAuth._create = function(jdel) {
  var obj = Object.create(ChainAuth.prototype, {});
  ChainAuth.apply(obj, arguments);
  return obj;
}
/**
 Create a Chainable Auth Provider auth provider

 @memberof module:vertx-auth-common-js/chain_auth

 @return {ChainAuth} the auth provider
 */
ChainAuth.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(ChainAuth, JChainAuth.create());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ChainAuth;