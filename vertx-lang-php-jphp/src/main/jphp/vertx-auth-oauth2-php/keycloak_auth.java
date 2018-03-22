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

package io.vertx.php.ext.auth.oauth2.providers;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;

/**

 * @class
 */
@Name("KeycloakAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers")
public class KeycloakAuth extends BaseWrapper<KeycloakAuth>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_keycloakAuth;
};

KeycloakAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.providers.KeycloakAuth");
KeycloakAuth._jtype = {
  accept: function(obj) {
    return KeycloakAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KeycloakAuth.prototype, {});
    KeycloakAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KeycloakAuth._create = function(jdel) {
  var obj = Object.create(KeycloakAuth.prototype, {});
  KeycloakAuth.apply(obj, arguments);
  return obj;
}
/**
 Create a OAuth2Auth provider for Keycloak

 @memberof module:vertx-auth-oauth2-js/keycloak_auth
 @param vertx {Vertx} 
 @param flow {Object} the oauth2 flow to use 
 @param config {Object} the json config file exported from Keycloak admin console 
 @param httpClientOptions {Object} custom http client options 
 @return {OAuth2Auth}
 */
KeycloakAuth.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JKeycloakAuth.create(__args[0]._jdel, utils.convParamJsonObject(__args[1])));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JKeycloakAuth.create(__args[0]._jdel, io.vertx.ext.auth.oauth2.OAuth2FlowType.valueOf(__args[1]), utils.convParamJsonObject(__args[2])));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JKeycloakAuth.create(__args[0]._jdel, utils.convParamJsonObject(__args[1]), __args[2] != null ? new HttpClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null));
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && (typeof __args[3] === 'object' && __args[3] != null)) {
    return utils.convReturnVertxGen(OAuth2Auth, JKeycloakAuth.create(__args[0]._jdel, io.vertx.ext.auth.oauth2.OAuth2FlowType.valueOf(__args[1]), utils.convParamJsonObject(__args[2]), __args[3] != null ? new HttpClientOptions(new JsonObject(Java.asJSONCompatible(__args[3]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = KeycloakAuth;