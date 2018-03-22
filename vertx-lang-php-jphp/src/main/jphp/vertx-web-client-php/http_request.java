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

package io.vertx.php.ext.web.client;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.client.HttpResponse;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.codec.BodyCodec;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;

/**
 A client-side HTTP request.
 <p>
 * @class
 */
@Name("HttpRequest")
@Namespace("io\\vertx\\php\\ext\\web\\client")
public class HttpRequest extends BaseWrapper<HttpRequest>{

  /**
   Configure the request to use a new method <code>value</code>.

   @public
   @param value {Object} 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.method = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_httpRequest.method(io.vertx.core.http.HttpMethod.valueOf(value));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to use a new port <code>value</code>.

   @public
   @param value {number} 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.port = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_httpRequest.port(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to decode the response with the <code>responseCodec</code>.

   @public
   @param responseCodec {BodyCodec} the response codec 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.as = function(responseCodec) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnVertxGen(HttpRequest, j_httpRequest.as(responseCodec._jdel), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to use a new host <code>value</code>.

   @public
   @param value {string} 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.host = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_httpRequest.host(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to use a virtual host <code>value</code>.
   <p/>
   Usually the header <i>host</i> (<i>:authority</i> pseudo header for HTTP/2) is set from the request host value
   since this host value resolves to the server IP address.
   <p/>
   Sometimes you need to set a host header for an address that does not resolve to the server IP address.
   The virtual host value overrides the value of the actual <i>host</i> header (<i>:authority</i> pseudo header
   for HTTP/2).
   <p/>
   The virtual host is also be used for SNI.

   @public
   @param value {string} 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.virtualHost = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_httpRequest.virtualHost(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to use a new request URI <code>value</code>.
   <p>
   When the uri has query parameters, they are set in the {@link HttpRequest#queryParams} multimap, overwritting
   any parameters previously set.

   @public
   @param value {string} 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.uri = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_httpRequest.uri(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configure the request to add a new HTTP header.

   @public
   @param name {string} the header name 
   @param value {string} the header value 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.putHeader = function(name, value) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_httpRequest.putHeader(name, value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {MultiMap} The HTTP headers
   */
  this.headers = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedheaders == null) {
        that.cachedheaders = utils.convReturnVertxGen(MultiMap, j_httpRequest.headers());
      }
      return that.cachedheaders;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param value {boolean} 
   @return {HttpRequest}
   */
  this.ssl = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_httpRequest.ssl(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the amount of time in milliseconds after which if the request does not return any data within the timeout
   period an TimeoutException fails the request.
   <p>
   Setting zero or a negative <code>value</code> disables the timeout.

   @public
   @param value {number} The quantity of time in milliseconds. 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.timeout = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_httpRequest.timeout(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a query parameter to the request.

   @public
   @param paramName {string} the param name 
   @param paramValue {string} the param value 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.addQueryParam = function(paramName, paramValue) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_httpRequest.addQueryParam(paramName, paramValue);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a query parameter to the request.

   @public
   @param paramName {string} the param name 
   @param paramValue {string} the param value 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.setQueryParam = function(paramName, paramValue) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_httpRequest.setQueryParam(paramName, paramValue);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set wether or not to follow the directs for the request.

   @public
   @param value {boolean} true if redirections should be followed 
   @return {HttpRequest} a reference to this, so the API can be used fluently
   */
  this.followRedirects = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_httpRequest.followRedirects(value);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the current query parameters.

   @public

   @return {MultiMap} the current query parameters
   */
  this.queryParams = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(MultiMap, j_httpRequest.queryParams());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Copy this request

   @public

   @return {HttpRequest} a copy of this request
   */
  this.copy = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(HttpRequest, j_httpRequest.copy(), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link HttpRequest#send} but with an HTTP request <code>body</code> stream.

   @public
   @param body {ReadStream} the body 
   @param handler {function} 
   */
  this.sendStream = function(body, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_httpRequest.sendStream(body._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link HttpRequest#send} but with an HTTP request <code>body</code> buffer.

   @public
   @param body {Buffer} the body 
   @param handler {function} 
   */
  this.sendBuffer = function(body, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_httpRequest.sendBuffer(body._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link HttpRequest#send} but with an HTTP request <code>body</code> object encoded as json and the content type
   set to <code>application/json</code>.

   @public
   @param body {Object} the body 
   @param handler {function} 
   */
  this.sendJsonObject = function(body, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_httpRequest.sendJsonObject(utils.convParamJsonObject(body), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link HttpRequest#send} but with an HTTP request <code>body</code> object encoded as json and the content type
   set to <code>application/json</code>.

   @public
   @param body {Object} the body 
   @param handler {function} 
   */
  this.sendJson = function(body, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && typeof __args[1] === 'function') {
      j_httpRequest.sendJson(utils.convParamTypeUnknown(body), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link HttpRequest#send} but with an HTTP request <code>body</code> multimap encoded as form and the content type
   set to <code>application/x-www-form-urlencoded</code>.
   <p>
   When the content type header is previously set to <code>multipart/form-data</code> it will be used instead.

   @public
   @param body {MultiMap} the body 
   @param handler {function} 
   */
  this.sendForm = function(body, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_httpRequest.sendForm(body._jdel, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Send a request, the <code>handler</code> will receive the response as an {@link HttpResponse}.

   @public
   @param handler {function} 
   */
  this.send = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_httpRequest.send(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(HttpResponse, ar.result(), undefined), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_httpRequest;
};

HttpRequest._jclass = utils.getJavaClass("io.vertx.ext.web.client.HttpRequest");
HttpRequest._jtype = {
  accept: function(obj) {
    return HttpRequest._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HttpRequest.prototype, {});
    HttpRequest.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HttpRequest._create = function(jdel) {
  var obj = Object.create(HttpRequest.prototype, {});
  HttpRequest.apply(obj, arguments);
  return obj;
}
module.exports = HttpRequest;