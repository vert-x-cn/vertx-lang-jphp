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

package io.vertx.php.ext.auth.jwt;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;

/**

 * @class
 */
@Name("JWTAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt")
public class JWTAuth extends BaseWrapper<JWTAuth>{
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
      j_jWTAuth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Generate a new JWT token.

   @public
   @param claims {Object} Json with user defined claims for a list of official claims 
   @param options {Object} extra options for the generation 
   @return {string} JWT encoded token
   */
  this.generateToken = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      return j_jWTAuth.generateToken(utils.convParamJsonObject(__args[0]));
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && (typeof __args[1] === 'object' && __args[1] != null)) {
      return j_jWTAuth.generateToken(utils.convParamJsonObject(__args[0]), __args[1] != null ? new JWTOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jWTAuth;
};

JWTAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.jwt.JWTAuth");
JWTAuth._jtype = {
  accept: function(obj) {
    return JWTAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JWTAuth.prototype, {});
    JWTAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JWTAuth._create = function(jdel) {
  var obj = Object.create(JWTAuth.prototype, {});
  JWTAuth.apply(obj, arguments);
  return obj;
}
/**
 Create a JWT auth provider

 @memberof module:vertx-auth-jwt-js/jwt_auth
 @param vertx {Vertx} the Vertx instance 
 @param config {Object} the config 
 @return {JWTAuth} the auth provider
 */
JWTAuth.create = function(vertx, config) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(JWTAuth, JJWTAuth.create(vertx._jdel, config != null ? new JWTAuthOptions(new JsonObject(Java.asJSONCompatible(config))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JWTAuth;