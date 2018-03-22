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
 A handler for serving static resources from the file system or classpath.

 * @class
 */
@Name("StaticHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class StaticHandler extends BaseWrapper<StaticHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_staticHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Enable/Disable access to the root of the filesystem

   @public
   @param allowRootFileSystemAccess {boolean} whether root access is allowed 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setAllowRootFileSystemAccess = function(allowRootFileSystemAccess) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setAllowRootFileSystemAccess(allowRootFileSystemAccess);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the web root

   @public
   @param webRoot {string} the web root 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setWebRoot = function(webRoot) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_staticHandler.setWebRoot(webRoot);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether files are read-only and will never change

   @public
   @param readOnly {boolean} whether files are read-only 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setFilesReadOnly = function(readOnly) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setFilesReadOnly(readOnly);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set value for max age in caching headers

   @public
   @param maxAgeSeconds {number} maximum time for browser to cache, in seconds 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setMaxAgeSeconds = function(maxAgeSeconds) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_staticHandler.setMaxAgeSeconds(maxAgeSeconds);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether cache header handling is enabled

   @public
   @param enabled {boolean} true if enabled 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setCachingEnabled = function(enabled) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setCachingEnabled(enabled);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether directory listing is enabled

   @public
   @param directoryListing {boolean} true if enabled 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setDirectoryListing = function(directoryListing) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setDirectoryListing(directoryListing);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether hidden files should be served

   @public
   @param includeHidden {boolean} true if hidden files should be served 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setIncludeHidden = function(includeHidden) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setIncludeHidden(includeHidden);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the server cache entry timeout when caching is enabled

   @public
   @param timeout {number} the timeout, in ms 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setCacheEntryTimeout = function(timeout) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_staticHandler.setCacheEntryTimeout(timeout);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the index page

   @public
   @param indexPage {string} the index page 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setIndexPage = function(indexPage) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_staticHandler.setIndexPage(indexPage);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the max cache size, when caching is enabled

   @public
   @param maxCacheSize {number} the max cache size 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setMaxCacheSize = function(maxCacheSize) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_staticHandler.setMaxCacheSize(maxCacheSize);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the file mapping for http2push and link preload

   @public
   @param http2PushMappings {Array.<Object>} the mapping for http2 push 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setHttp2PushMapping = function(http2PushMappings) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_staticHandler.setHttp2PushMapping(utils.convParamListDataObject(http2PushMappings, function(json) { return new Http2PushMapping(json); }));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether async filesystem access should always be used

   @public
   @param alwaysAsyncFS {boolean} true for always async FS access 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setAlwaysAsyncFS = function(alwaysAsyncFS) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setAlwaysAsyncFS(alwaysAsyncFS);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether async/sync filesystem tuning should enabled

   @public
   @param enableFSTuning {boolean} true to enabled FS tuning 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setEnableFSTuning = function(enableFSTuning) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setEnableFSTuning(enableFSTuning);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the max serve time in ns, above which serves are considered slow

   @public
   @param maxAvgServeTimeNanoSeconds {number} max serve time, in ns 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setMaxAvgServeTimeNs = function(maxAvgServeTimeNanoSeconds) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_staticHandler.setMaxAvgServeTimeNs(maxAvgServeTimeNanoSeconds);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the directory template to be used when directory listing

   @public
   @param directoryTemplate {string} the directory template 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setDirectoryTemplate = function(directoryTemplate) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_staticHandler.setDirectoryTemplate(directoryTemplate);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether range requests (resumable downloads; media streaming) should be enabled.

   @public
   @param enableRangeSupport {boolean} true to enable range support 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setEnableRangeSupport = function(enableRangeSupport) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setEnableRangeSupport(enableRangeSupport);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set whether vary header should be sent with response.

   @public
   @param varyHeader {boolean} true to sent vary header 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setSendVaryHeader = function(varyHeader) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_staticHandler.setSendVaryHeader(varyHeader);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the default content encoding for text related files. This allows overriding the system settings default value.

   @public
   @param contentEncoding {string} the desired content encoding e.g.: "UTF-8" 
   @return {StaticHandler} a reference to this, so the API can be used fluently
   */
  this.setDefaultContentEncoding = function(contentEncoding) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_staticHandler.setDefaultContentEncoding(contentEncoding);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_staticHandler;
};

StaticHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.StaticHandler");
StaticHandler._jtype = {
  accept: function(obj) {
    return StaticHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(StaticHandler.prototype, {});
    StaticHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
StaticHandler._create = function(jdel) {
  var obj = Object.create(StaticHandler.prototype, {});
  StaticHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a handler, specifying web-root

 @memberof module:vertx-web-js/static_handler
 @param root {string} the web-root 
 @return {StaticHandler} the handler
 */
StaticHandler.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(StaticHandler, JStaticHandler.create());
  }else if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(StaticHandler, JStaticHandler.create(__args[0]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = StaticHandler;