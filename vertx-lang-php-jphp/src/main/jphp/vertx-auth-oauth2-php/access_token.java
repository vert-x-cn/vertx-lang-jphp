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

package io.vertx.php.ext.auth.oauth2;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.auth.oauth2.OAuth2Response;
import io.vertx.php.ext.auth.AuthProvider;

/**
 AccessToken extension to the User interface

 * @class
 */
@Name("AccessToken")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public class AccessToken extends BaseWrapper<AccessToken>{
  User.call(this, j_val);

  /**
   Is the user authorised to

   @public
   @param authority {string} the authority - what this really means is determined by the specific implementation. It might represent a permission to access a resource e.g. `printers:printer34` or it might represent authority to a role in a roles based model, e.g. `role:admin`. 
   @param resultHandler {function} handler that will be called with an {@link AsyncResult} containing the value `true` if the they has the authority or `false` otherwise. 
   @return {User} the User to enable fluent use
   */
  this.isAuthorized = function(authority, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_accessToken.isAuthorized(authority, function(ar) {
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
   @param authority {string} 
   @param resultHandler {function} 
   @return {User}
   */
  this.isAuthorised = function(authority, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_accessToken.isAuthorised(authority, function(ar) {
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
   The User object will cache any authorities that it knows it has to avoid hitting the
   underlying auth provider each time.  Use this method if you want to clear this cache.

   @public

   @return {User} the User to enable fluent use
   */
  this.clearCache = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_accessToken.clearCache();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the underlying principal for the User. What this actually returns depends on the implementation.
   For a simple user/password based auth, it's likely to contain a JSON object with the following structure:
   <pre>
     {
       "username", "tim"
     }
   </pre>

   @public

   @return {Object} JSON representation of the Principal
   */
  this.principal = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_accessToken.principal());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the auth provider for the User. This is typically used to reattach a detached User with an AuthProvider, e.g.
   after it has been deserialized.

   @public
   @param authProvider {AuthProvider} the AuthProvider - this must be the same type of AuthProvider that originally created the User 
   */
  this.setAuthProvider = function(authProvider) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_accessToken.setAuthProvider(authProvider._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Check if the access token is expired or not.

   @public

   @return {boolean}
   */
  this.expired = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_accessToken.expired();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The Access Token if present parsed as a JsonObject

   @public

   @return {Object} JSON
   */
  this.accessToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_accessToken.accessToken());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The Refresh Token if present parsed as a JsonObject

   @public

   @return {Object} JSON
   */
  this.refreshToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_accessToken.refreshToken());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The Id Token if present parsed as a JsonObject

   @public

   @return {Object} JSON
   */
  this.idToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_accessToken.idToken());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string}
   */
  this.opaqueAccessToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_accessToken.opaqueAccessToken();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string}
   */
  this.opaqueRefreshToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_accessToken.opaqueRefreshToken();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string}
   */
  this.opaqueIdToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_accessToken.opaqueIdToken();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string}
   */
  this.tokenType = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_accessToken.tokenType();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param trust {boolean} 
   @return {AccessToken}
   */
  this.setTrustJWT = function(trust) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_accessToken.setTrustJWT(trust);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Refresh the access token

   @public
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.refresh = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_accessToken.refresh(function(ar) {
      if (ar.succeeded()) {
        callback(null, null);
      } else {
        callback(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Revoke access or refresh token

   @public
   @param token_type {string} - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token". 
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.revoke = function(token_type, callback) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_accessToken.revoke(token_type, function(ar) {
      if (ar.succeeded()) {
        callback(null, null);
      } else {
        callback(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Revoke refresh token and calls the logout endpoint. This is a openid-connect extension and might not be
   available on all providers.

   @public
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.logout = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_accessToken.logout(function(ar) {
      if (ar.succeeded()) {
        callback(null, null);
      } else {
        callback(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.

   @public
   @param tokenType {string} - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token". 
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.introspect = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_accessToken.introspect(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_accessToken.introspect(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Load the user info as per OIDC spec.

   @public
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.userInfo = function(callback) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_accessToken.userInfo(function(ar) {
      if (ar.succeeded()) {
        callback(utils.convReturnJson(ar.result()), null);
      } else {
        callback(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Fetches a JSON resource using this Access Token.

   @public
   @param method {Object} - the HTTP method to user. 
   @param resource {string} - the resource to fetch. 
   @param headers {Object} - extra headers to pass to the request. 
   @param payload {Buffer} - payload to send to the server. 
   @param callback {function} - The callback function returning the results. 
   @return {AccessToken}
   */
  this.fetch = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_accessToken.fetch(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnVertxGen(OAuth2Response, ar.result()), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'function') {
      j_accessToken.fetch(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1], utils.convParamJsonObject(__args[2]), __args[3]._jdel, function(ar) {
      if (ar.succeeded()) {
        __args[4](utils.convReturnVertxGen(OAuth2Response, ar.result()), null);
      } else {
        __args[4](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_accessToken;
};

AccessToken._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.AccessToken");
AccessToken._jtype = {
  accept: function(obj) {
    return AccessToken._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(AccessToken.prototype, {});
    AccessToken.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AccessToken._create = function(jdel) {
  var obj = Object.create(AccessToken.prototype, {});
  AccessToken.apply(obj, arguments);
  return obj;
}
module.exports = AccessToken;