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
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.oauth2.AccessToken;

/**

 * @class
 */
@Name("OAuth2Auth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public class OAuth2Auth extends BaseWrapper<OAuth2Auth>{

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
      j_oAuth2Auth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   */
  this.verifyIsUsingPassword = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_oAuth2Auth.verifyIsUsingPassword();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Generate a redirect URL to the authN/Z backend. It only applies to auth_code flow.

   @public
   @param params {Object} 
   @return {string}
   */
  this.authorizeURL = function(params) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      return j_oAuth2Auth.authorizeURL(utils.convParamJsonObject(params));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the Access Token object.

   @public
   @param params {Object} - JSON with the options, each flow requires different options. 
   @param handler {function} - The handler returning the results. 
   */
  this.getToken = function(params, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_oAuth2Auth.getToken(utils.convParamJsonObject(params), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(AccessToken, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns true if this provider supports JWT tokens as the access_token. This is typically true if the provider
   implements the `openid-connect` protocol. This is a plain return from the config option jwtToken, which is false
   by default.
  
   This information is important to validate grants. Since pure OAuth2 should be used for authorization and when a
   token is requested all grants should be declared, in case of openid-connect this is not true. OpenId will issue
   a token and all grants will be encoded on the token itself so the requester does not need to list the required
   grants.

   @public

   @return {boolean} true if openid-connect is used.
   */
  this.hasJWTToken = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_oAuth2Auth.hasJWTToken();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Decode a token to a {@link AccessToken} object. This is useful to handle bearer JWT tokens.

   @public
   @param token {string} the access token (base64 string) 
   @param handler {function} A handler to receive the event 
   @return {OAuth2Auth} self
   */
  this.decodeToken = function(token, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_oAuth2Auth.decodeToken(token, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(AccessToken, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
   meta-information about this token.

   @public
   @param token {string} the access token (base64 string) 
   @param tokenType {string} hint to the token type e.g.: `access_token` 
   @param handler {function} A handler to receive the event 
   @return {OAuth2Auth} self
   */
  this.introspectToken = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_oAuth2Auth.introspectToken(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnVertxGen(AccessToken, ar.result()), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_oAuth2Auth.introspectToken(__args[0], __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(AccessToken, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the scope separator.
  
   The RFC 6749 states that a scope is expressed as a set of case-sensitive and space-delimited strings, however
   vendors tend not to agree on this and we see the following cases being used: space, plus sign, comma.

   @public

   @return {string} what value was used in the configuration of the object, falling back to the default value which is a space.
   */
  this.getScopeSeparator = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_oAuth2Auth.getScopeSeparator();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the configured flow type for the Oauth2 provider.

   @public

   @return {Object} the flow type.
   */
  this.getFlowType = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnEnum(j_oAuth2Auth.getFlowType());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Loads a JWK Set from the remote provider.
  
   When calling this method several times, the loaded JWKs are updated in the underlying JWT object.

   @public
   @param handler {function} 
   @return {OAuth2Auth}
   */
  this.loadJWK = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_oAuth2Auth.loadJWK(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_oAuth2Auth;
};

OAuth2Auth._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.OAuth2Auth");
OAuth2Auth._jtype = {
  accept: function(obj) {
    return OAuth2Auth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(OAuth2Auth.prototype, {});
    OAuth2Auth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
OAuth2Auth._create = function(jdel) {
  var obj = Object.create(OAuth2Auth.prototype, {});
  OAuth2Auth.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-auth-oauth2-js/o_auth2_auth
 @param vertx {Vertx} the Vertx instance 
 @param flow {Object} 
 @param config {Object} the config as exported from the admin console 
 @return {OAuth2Auth} the auth provider
 */
OAuth2Auth.createKeycloak = function(vertx, flow, config) {
  var __args = arguments;
  if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JOAuth2Auth.createKeycloak(vertx._jdel, io.vertx.ext.auth.oauth2.OAuth2FlowType.valueOf(flow), utils.convParamJsonObject(config)));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create a OAuth2 auth provider

 @memberof module:vertx-auth-oauth2-js/o_auth2_auth
 @param vertx {Vertx} the Vertx instance 
 @param flow {Object} 
 @param config {Object} the config 
 @return {OAuth2Auth} the auth provider
 */
OAuth2Auth.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(OAuth2Auth, JOAuth2Auth.create(__args[0]._jdel, io.vertx.ext.auth.oauth2.OAuth2FlowType.valueOf(__args[1])));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JOAuth2Auth.create(__args[0]._jdel, io.vertx.ext.auth.oauth2.OAuth2FlowType.valueOf(__args[1]), __args[2] != null ? new OAuth2ClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = OAuth2Auth;