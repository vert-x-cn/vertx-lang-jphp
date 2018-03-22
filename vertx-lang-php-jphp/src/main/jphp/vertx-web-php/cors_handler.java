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
import io.vertx.php.ext.web.RoutingContext;

/**
 A handler which implements server side http://www.w3.org/TR/cors/[CORS] support for Vert.x-Web.

 * @class
 */
@Name("CorsHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class CorsHandler extends BaseWrapper<CorsHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_corsHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add an allowed method

   @public
   @param method {Object} the method to add 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.allowedMethod = function(method) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_corsHandler.allowedMethod(io.vertx.core.http.HttpMethod.valueOf(method));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add an allowed header

   @public
   @param headerName {string} the allowed header name 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.allowedHeader = function(headerName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_corsHandler.allowedHeader(headerName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a set of allowed headers

   @public
   @param headerNames {Array.<string>} the allowed header names 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.allowedHeaders = function(headerNames) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_corsHandler.allowedHeaders(utils.convParamSetBasicOther(headerNames));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add an exposed header

   @public
   @param headerName {string} the exposed header name 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.exposedHeader = function(headerName) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_corsHandler.exposedHeader(headerName);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a set of exposed headers

   @public
   @param headerNames {Array.<string>} the exposed header names 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.exposedHeaders = function(headerNames) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_corsHandler.exposedHeaders(utils.convParamSetBasicOther(headerNames));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether credentials are allowed. Note that user agents will block
   requests that use a wildcard as origin and include credentials.
  
   From the MDN documentation you can read:
  
   <blockquote>
   Important note: when responding to a credentialed request,
   server must specify a domain, and cannot use wild carding.
   </blockquote>

   @public
   @param allow {boolean} true if allowed 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.allowCredentials = function(allow) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_corsHandler.allowCredentials(allow);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set how long the browser should cache the information

   @public
   @param maxAgeSeconds {number} max age in seconds 
   @return {CorsHandler} a reference to this, so the API can be used fluently
   */
  this.maxAgeSeconds = function(maxAgeSeconds) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_corsHandler.maxAgeSeconds(maxAgeSeconds);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_corsHandler;
};

CorsHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.CorsHandler");
CorsHandler._jtype = {
  accept: function(obj) {
    return CorsHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CorsHandler.prototype, {});
    CorsHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CorsHandler._create = function(jdel) {
  var obj = Object.create(CorsHandler.prototype, {});
  CorsHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a CORS handler

 @memberof module:vertx-web-js/cors_handler
 @param allowedOriginPattern {string} the allowed origin pattern 
 @return {CorsHandler} the handler
 */
CorsHandler.create = function(allowedOriginPattern) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(CorsHandler, JCorsHandler.create(allowedOriginPattern));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CorsHandler;