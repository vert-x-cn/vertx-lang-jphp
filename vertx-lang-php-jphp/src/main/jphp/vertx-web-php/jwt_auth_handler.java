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

package io.vertx.php.ext.web.handler;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.handler.AuthHandler;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.jwt.JWTAuth;

/**
 An auth handler that provides JWT Authentication support.

 * @class
 */
@Name("JWTAuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class JWTAuthHandler extends BaseWrapper<JWTAuthHandler>{
  AuthHandler.call(this, j_val);

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_jWTAuthHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a required authority for this auth handler

   @public
   @param authority {string} the authority 
   @return {AuthHandler} a reference to this, so the API can be used fluently
   */
  this.addAuthority = function(authority) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jWTAuthHandler.addAuthority(authority);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a set of required authorities for this auth handler

   @public
   @param authorities {Array.<string>} the set of authorities 
   @return {AuthHandler} a reference to this, so the API can be used fluently
   */
  this.addAuthorities = function(authorities) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_jWTAuthHandler.addAuthorities(utils.convParamSetBasicOther(authorities));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Parses the credentials from the request into a JsonObject. The implementation should
   be able to extract the required info for the auth provider in the format the provider
   expects.

   @public
   @param context {RoutingContext} the routing context 
   @param handler {function} the handler to be called once the information is available. 
   */
  this.parseCredentials = function(context, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_jWTAuthHandler.parseCredentials(context._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Authorizes the given user against all added authorities.

   @public
   @param user {User} a user. 
   @param handler {function} the handler for the result. 
   */
  this.authorize = function(user, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_jWTAuthHandler.authorize(user._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the audience list

   @public
   @param audience {Array.<string>} the audience list 
   @return {JWTAuthHandler} a reference to this for fluency
   */
  this.setAudience = function(audience) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_jWTAuthHandler.setAudience(utils.convParamListBasicOther(audience));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the issuer

   @public
   @param issuer {string} the issuer 
   @return {JWTAuthHandler} a reference to this for fluency
   */
  this.setIssuer = function(issuer) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jWTAuthHandler.setIssuer(issuer);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether expiration is ignored

   @public
   @param ignoreExpiration {boolean} whether expiration is ignored 
   @return {JWTAuthHandler} a reference to this for fluency
   */
  this.setIgnoreExpiration = function(ignoreExpiration) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_jWTAuthHandler.setIgnoreExpiration(ignoreExpiration);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jWTAuthHandler;
};

JWTAuthHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.JWTAuthHandler");
JWTAuthHandler._jtype = {
  accept: function(obj) {
    return JWTAuthHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JWTAuthHandler.prototype, {});
    JWTAuthHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JWTAuthHandler._create = function(jdel) {
  var obj = Object.create(JWTAuthHandler.prototype, {});
  JWTAuthHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a JWT auth handler

 @memberof module:vertx-web-js/jwt_auth_handler
 @param authProvider {JWTAuth} the auth provider to use. 
 @param skip {string} 
 @return {JWTAuthHandler} the auth handler
 */
JWTAuthHandler.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(JWTAuthHandler, JJWTAuthHandler.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(JWTAuthHandler, JJWTAuthHandler.create(__args[0]._jdel, __args[1]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JWTAuthHandler;