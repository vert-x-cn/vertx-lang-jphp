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

package io.vertx.php.ext.web;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.Cookie;
import io.vertx.php.ext.web.Route;
import io.vertx.php.ext.web.Locale;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.ext.web.Session;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.LanguageHeader;
import io.vertx.php.ext.web.FileUpload;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.php.ext.web.ParsedHeaderValues;

/**
 Represents the context for the handling of a request in Vert.x-Web.
 <p>
 A new instance is created for each HTTP request that is received in the
 * @class
 */
@Name("RoutingContext")
@Namespace("io\\vertx\\php\\ext\\web")
public class RoutingContext extends BaseWrapper<RoutingContext>{

  /**

   @public

   @return {HttpServerRequest} the HTTP request object
   */
  this.request = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedrequest == null) {
        that.cachedrequest = utils.convReturnVertxGen(HttpServerRequest, j_routingContext.request());
      }
      return that.cachedrequest;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {HttpServerResponse} the HTTP response object
   */
  this.response = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedresponse == null) {
        that.cachedresponse = utils.convReturnVertxGen(HttpServerResponse, j_routingContext.response());
      }
      return that.cachedresponse;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Tell the router to route this context to the next matching route (if any).
   This method, if called, does not need to be called during the execution of the handler, it can be called
   some arbitrary time later, if required.
   <p>
   If next is not called for a handler then the handler should make sure it ends the response or no response
   will be sent.

   @public

   */
  this.next = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_routingContext.next();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Fail the context with the specified throwable.
   <p>
   This will cause the router to route the context to any matching failure handlers for the request. If no failure handlers
   match a default failure response with status code 500 will be sent.

   @public
   @param throwable {todo} a throwable representing the failure 
   */
  this.fail = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_routingContext.fail(__args[0]);
    }  else if (__args.length === 1 && typeof __args[0] === 'object') {
      j_routingContext.fail(utils.convParamThrowable(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Put some arbitrary data in the context. This will be available in any handlers that receive the context.

   @public
   @param key {string} the key for the data 
   @param obj {Object} the data 
   @return {RoutingContext} a reference to this, so the API can be used fluently
   */
  this.put = function(key, obj) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
      j_routingContext.put(key, utils.convParamTypeUnknown(obj));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get some data from the context. The data is available in any handlers that receive the context.

   @public
   @param key {string} the key for the data 
   @return {Object} the data
   */
  this.get = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_routingContext.get(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove some data from the context. The data is available in any handlers that receive the context.

   @public
   @param key {string} the key for the data 
   @return {Object} the previous data associated with the key
   */
  this.remove = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnTypeUnknown(j_routingContext.remove(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Vertx} the Vert.x instance associated to the initiating {@link Router} for this context
   */
  this.vertx = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedvertx == null) {
        that.cachedvertx = utils.convReturnVertxGen(Vertx, j_routingContext.vertx());
      }
      return that.cachedvertx;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the mount point for this router. It will be null for a top level router. For a sub-router it will be the path at which the subrouter was mounted.
   */
  this.mountPoint = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.mountPoint();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Route} the current route this context is being routed through.
   */
  this.currentRoute = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Route, j_routingContext.currentRoute());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the normalised path for the request.
   <p>
   The normalised path is where the URI path has been decoded, i.e. any unicode or other illegal URL characters that
   were encoded in the original URL with `%` will be returned to their original form. E.g. `%20` will revert to a space.
   Also `+` reverts to a space in a query.
   <p>
   The normalised path will also not contain any `..` character sequences to prevent resources being accessed outside
   of the permitted area.
   <p>
   It's recommended to always use the normalised path as opposed to 
   if accessing server resources requested by a client.

   @public

   @return {string} the normalised path
   */
  this.normalisedPath = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.normalisedPath();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the cookie with the specified name. The context must have first been routed to a {@link CookieHandler}
   for this to work.

   @public
   @param name {string} the cookie name 
   @return {Cookie} the cookie
   */
  this.getCookie = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Cookie, j_routingContext.getCookie(name));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a cookie. This will be sent back to the client in the response. The context must have first been routed
   to a {@link CookieHandler} for this to work.

   @public
   @param cookie {Cookie} the cookie 
   @return {RoutingContext} a reference to this, so the API can be used fluently
   */
  this.addCookie = function(cookie) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_routingContext.addCookie(cookie._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Expire a cookie, notifying a User Agent to remove it from its cookie jar. The context must have first been routed
   to a {@link CookieHandler} for this to work.

   @public
   @param name {string} the name of the cookie 
   @return {Cookie} the cookie, if it existed, or null
   */
  this.removeCookie = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Cookie, j_routingContext.removeCookie(name));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the number of cookies. The context must have first been routed to a {@link CookieHandler} for this to work.
   */
  this.cookieCount = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.cookieCount();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<Cookie>} a set of all the cookies. The context must have first been routed to a {@link CookieHandler} for this to be populated.
   */
  this.cookies = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_routingContext.cookies(), Cookie);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the entire HTTP request body as a string, assuming the specified encoding. The context must have first been routed to a
   {@link BodyHandler} for this to be populated.

   @public
   @param encoding {string} the encoding, e.g. "UTF-16" 
   @return {string} the body
   */
  this.getBodyAsString = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.getBodyAsString();
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_routingContext.getBodyAsString(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} Get the entire HTTP request body as a . The context must have first been routed to a {@link BodyHandler} for this to be populated.
   */
  this.getBodyAsJson = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_routingContext.getBodyAsJson());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {todo} Get the entire HTTP request body as a . The context must have first been routed to a {@link BodyHandler} for this to be populated.
   */
  this.getBodyAsJsonArray = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_routingContext.getBodyAsJsonArray());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Buffer} Get the entire HTTP request body as a . The context must have first been routed to a {@link BodyHandler} for this to be populated.
   */
  this.getBody = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Buffer, j_routingContext.getBody());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<FileUpload>} a set of fileuploads (if any) for the request. The context must have first been routed to a {@link BodyHandler} for this to work.
   */
  this.fileUploads = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_routingContext.fileUploads(), FileUpload);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the session. The context must have first been routed to a {@link SessionHandler}
   for this to be populated.
   Sessions live for a browser session, and are maintained by session cookies.

   @public

   @return {Session} the session.
   */
  this.session = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Session, j_routingContext.session());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the authenticated user (if any). This will usually be injected by an auth handler if authentication if successful.

   @public

   @return {User} the user, or null if the current user is not authenticated.
   */
  this.user = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(User, j_routingContext.user());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   If the context is being routed to failure handlers after a failure has been triggered by calling
   {@link RoutingContext#fail} then this will return that throwable. It can be used by failure handlers to render a response,
   e.g. create a failure response page.

   @public

   @return {todo} the throwable used when signalling failure
   */
  this.failure = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedfailure == null) {
        that.cachedfailure = utils.convReturnThrowable(j_routingContext.failure());
      }
      return that.cachedfailure;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   If the context is being routed to failure handlers after a failure has been triggered by calling
   {@link RoutingContext#fail}  then this will return that status code.  It can be used by failure handlers to render a response,
   e.g. create a failure response page.
  
   When the status code has not been set yet (it is undefined) its value will be -1.

   @public

   @return {number} the status code used when signalling failure
   */
  this.statusCode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedstatusCode == null) {
        that.cachedstatusCode = j_routingContext.statusCode();
      }
      return that.cachedstatusCode;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   If the route specifies produces matches, e.g. produces `text/html` and `text/plain`, and the `accept` header
   matches one or more of these then this returns the most acceptable match.

   @public

   @return {string} the most acceptable content type.
   */
  this.getAcceptableContentType = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.getAcceptableContentType();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The headers:
   <ol>
   <li>Accept</li>
   <li>Accept-Charset</li>
   <li>Accept-Encoding</li>
   <li>Accept-Language</li>
   <li>Content-Type</li>
   </ol>
   Parsed into {@link ParsedHeaderValue}

   @public

   @return {ParsedHeaderValues} A container with the parsed headers.
   */
  this.parsedHeaders = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedparsedHeaders == null) {
        that.cachedparsedHeaders = utils.convReturnVertxGen(ParsedHeaderValues, j_routingContext.parsedHeaders());
      }
      return that.cachedparsedHeaders;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a handler that will be called just before headers are written to the response. This gives you a hook where
   you can write any extra headers before the response has been written when it will be too late.

   @public
   @param handler {function} the handler 
   @return {number} the id of the handler. This can be used if you later want to remove the handler.
   */
  this.addHeadersEndHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return j_routingContext.addHeadersEndHandler(handler);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove a headers end handler

   @public
   @param handlerID {number} the id as returned from {@link RoutingContext#addHeadersEndHandler}. 
   @return {boolean} true if the handler existed and was removed, false otherwise
   */
  this.removeHeadersEndHandler = function(handlerID) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_routingContext.removeHeadersEndHandler(handlerID);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Provides a handler that will be called after the last part of the body is written to the wire.
   The handler is called asynchronously of when the response has been received by the client.
   This provides a hook allowing you to do more operations once the request has been sent over the wire.
   Do not use this for resource cleanup as this handler might never get called (e.g. if the connection is reset).

   @public
   @param handler {function} the handler 
   @return {number} the id of the handler. This can be used if you later want to remove the handler.
   */
  this.addBodyEndHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return j_routingContext.addBodyEndHandler(handler);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove a body end handler

   @public
   @param handlerID {number} the id as returned from {@link RoutingContext#addBodyEndHandler}. 
   @return {boolean} true if the handler existed and was removed, false otherwise
   */
  this.removeBodyEndHandler = function(handlerID) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_routingContext.removeBodyEndHandler(handlerID);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true if the context is being routed to failure handlers.
   */
  this.failed = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_routingContext.failed();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the body. Used by the {@link BodyHandler}. You will not normally call this method.

   @public
   @param body {Buffer} the body 
   */
  this.setBody = function(body) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_routingContext.setBody(body._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the session. Used by the {@link SessionHandler}. You will not normally call this method.

   @public
   @param session {Session} the session 
   */
  this.setSession = function(session) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_routingContext.setSession(session._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the user. Usually used by auth handlers to inject a User. You will not normally call this method.

   @public
   @param user {User} the user 
   */
  this.setUser = function(user) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_routingContext.setUser(user._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Clear the current user object in the context. This usually is used for implementing a log out feature, since the
   current user is unbounded from the routing context.

   @public

   */
  this.clearUser = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_routingContext.clearUser();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the acceptable content type. Used by

   @public
   @param contentType {string} the content type 
   */
  this.setAcceptableContentType = function(contentType) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'string' || __args[0] == null)) {
      j_routingContext.setAcceptableContentType(contentType);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Restarts the current router with a new method and path. All path parameters are then parsed and available on the
   params list.

   @public
   @param method {Object} the new http request 
   @param path {string} the new http path. 
   */
  this.reroute = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_routingContext.reroute(__args[0]);
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
      j_routingContext.reroute(io.vertx.core.http.HttpMethod.valueOf(__args[0]), __args[1]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the locales for the current request. The locales are determined from the `accept-languages` header and
   sorted on quality.
  
   When 2 or more entries have the same quality then the order used to return the best match is based on the lowest
   index on the original list. For example if a user has en-US and en-GB with same quality and this order the best
   match will be en-US because it was declared as first entry by the client.

   @public

   @return {Array.<Locale>} the best matched locale for the request
   */
  this.acceptableLocales = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedacceptableLocales == null) {
        that.cachedacceptableLocales = utils.convReturnListSetVertxGen(j_routingContext.acceptableLocales(), Locale);
      }
      return that.cachedacceptableLocales;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the languages for the current request. The languages are determined from the <code>Accept-Language</code>
   header and sorted on quality.
  
   When 2 or more entries have the same quality then the order used to return the best match is based on the lowest
   index on the original list. For example if a user has en-US and en-GB with same quality and this order the best
   match will be en-US because it was declared as first entry by the client.

   @public

   @return {Array.<LanguageHeader>} The best matched language for the request
   */
  this.acceptableLanguages = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedacceptableLanguages == null) {
        that.cachedacceptableLanguages = utils.convReturnListSetVertxGen(j_routingContext.acceptableLanguages(), LanguageHeader);
      }
      return that.cachedacceptableLanguages;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Helper to return the user preferred locale. It is the same action as returning the first element of the acceptable
   locales.

   @public

   @return {Locale} the users preferred locale.
   */
  this.preferredLocale = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedpreferredLocale == null) {
        that.cachedpreferredLocale = utils.convReturnVertxGen(Locale, j_routingContext.preferredLocale());
      }
      return that.cachedpreferredLocale;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Helper to return the user preferred language.
   It is the same action as returning the first element of the acceptable languages.

   @public

   @return {LanguageHeader} the users preferred locale.
   */
  this.preferredLanguage = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedpreferredLanguage == null) {
        that.cachedpreferredLanguage = utils.convReturnVertxGen(LanguageHeader, j_routingContext.preferredLanguage());
      }
      return that.cachedpreferredLanguage;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a map of named parameters as defined in path declaration with their actual values

   @public

   @return {Array.<string>} the map of named parameters
   */
  this.pathParams = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnMap(j_routingContext.pathParams());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets the value of a single path parameter

   @public
   @param name {string} the name of parameter as defined in path declaration 
   @return {string} the actual value of the parameter or null if it doesn't exist
   */
  this.pathParam = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_routingContext.pathParam(name);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a map of all query parameters inside the <a href="https://en.wikipedia.org/wiki/Query_string">query string</a>

   @public

   @return {MultiMap} the multimap of query parameters
   */
  this.queryParams = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(MultiMap, j_routingContext.queryParams());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets the value of a single query parameter

   @public
   @param query {string} The name of query parameter 
   @return {Array.<string>} The list of all elements inside query parameter
   */
  this.queryParam = function(query) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_routingContext.queryParam(query);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_routingContext;
};

RoutingContext._jclass = utils.getJavaClass("io.vertx.ext.web.RoutingContext");
RoutingContext._jtype = {
  accept: function(obj) {
    return RoutingContext._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(RoutingContext.prototype, {});
    RoutingContext.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RoutingContext._create = function(jdel) {
  var obj = Object.create(RoutingContext.prototype, {});
  RoutingContext.apply(obj, arguments);
  return obj;
}
module.exports = RoutingContext;