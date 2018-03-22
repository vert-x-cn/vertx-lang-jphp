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

/**
 Helper class for processing Keycloak principal.

 * @class
 */
@Name("KeycloakHelper")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public class KeycloakHelper extends BaseWrapper<KeycloakHelper>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_keycloakHelper;
};

KeycloakHelper._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.KeycloakHelper");
KeycloakHelper._jtype = {
  accept: function(obj) {
    return KeycloakHelper._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KeycloakHelper.prototype, {});
    KeycloakHelper.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KeycloakHelper._create = function(jdel) {
  var obj = Object.create(KeycloakHelper.prototype, {});
  KeycloakHelper.apply(obj, arguments);
  return obj;
}
/**
 Get raw `id_token` string from the principal.

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} user principal 
 @return {string} the raw id token string
 */
KeycloakHelper.rawIdToken = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.rawIdToken(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Get decoded `id_token` from the principal.

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} user principal 
 @return {Object} the id token
 */
KeycloakHelper.idToken = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return utils.convReturnJson(JKeycloakHelper.idToken(utils.convParamJsonObject(principal)));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Get raw `access_token` string from the principal.

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} user principal 
 @return {string} the raw access token string
 */
KeycloakHelper.rawAccessToken = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.rawAccessToken(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Get decoded `access_token` from the principal.

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} user principal 
 @return {Object} the access token
 */
KeycloakHelper.accessToken = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return utils.convReturnJson(JKeycloakHelper.accessToken(utils.convParamJsonObject(principal)));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {number}
 */
KeycloakHelper.authTime = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.authTime(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.sessionState = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.sessionState(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.acr = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.acr(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.name = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.name(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.email = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.email(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.preferredUsername = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.preferredUsername(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {string}
 */
KeycloakHelper.nickName = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return JKeycloakHelper.nickName(utils.convParamJsonObject(principal));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param principal {Object} 
 @return {Array.<string>}
 */
KeycloakHelper.allowedOrigins = function(principal) {
  var __args = arguments;
  if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
    return utils.convReturnSet(JKeycloakHelper.allowedOrigins(utils.convParamJsonObject(principal)));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Parse the token string with base64 decoder.
 This will only obtain the "payload" part of the token.

 @memberof module:vertx-auth-oauth2-js/keycloak_helper
 @param token {string} token string 
 @return {Object} token payload json object
 */
KeycloakHelper.parseToken = function(token) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnJson(JKeycloakHelper.parseToken(token));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = KeycloakHelper;