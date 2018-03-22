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
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.MultiMap;

/**
 A response from a fetch request.

 This class represents a secure response from a Oauth2 fetch call.

 A fetch is a simplified HTTP response from a protected resource.

 * @class
 */
@Name("OAuth2Response")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public class OAuth2Response extends BaseWrapper<OAuth2Response>{

  /**
   the returned status code from the HTTP layer.

   @public

   @return {number} HTTP status code
   */
  this.statusCode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_oAuth2Response.statusCode();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HTTP response headers from the HTTP layer.

   @public

   @return {MultiMap} the HTTP headers
   */
  this.headers = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(MultiMap, j_oAuth2Response.headers());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Looks up a HTTP response header by name, in case where the response is a list of headers,
   the first one is returned.

   @public
   @param name {string} of the header to look up 
   @return {string} the single value for the header.
   */
  this.getHeader = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_oAuth2Response.getHeader(name);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HTTP response body as a buffer

   @public

   @return {Buffer} a buffer with the HTTP response body
   */
  this.body = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Buffer, j_oAuth2Response.body());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HTTP response body as a JsonObject

   @public

   @return {Object} a JsonObject from the HTTP response body
   */
  this.jsonObject = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_oAuth2Response.jsonObject());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The HTTP response body as a JsonArray

   @public

   @return {todo} a JsonArray from the HTTP response body
   */
  this.jsonArray = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_oAuth2Response.jsonArray());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Helper to analize the response body. The test is performed against the header Content-Type,
   the content of the body is not analyzed.

   @public
   @param contentType {string} a content type to test, e.g.: application/json 
   @return {boolean} true if the header matches
   */
  this.is = function(contentType) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_oAuth2Response.is(contentType);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_oAuth2Response;
};

OAuth2Response._jclass = utils.getJavaClass("io.vertx.ext.auth.oauth2.OAuth2Response");
OAuth2Response._jtype = {
  accept: function(obj) {
    return OAuth2Response._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(OAuth2Response.prototype, {});
    OAuth2Response.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
OAuth2Response._create = function(jdel) {
  var obj = Object.create(OAuth2Response.prototype, {});
  OAuth2Response.apply(obj, arguments);
  return obj;
}
module.exports = OAuth2Response;