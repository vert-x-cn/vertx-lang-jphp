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

package io.vertx.php.ext.consul;
import io.vertx.lang.php.util.Wrapper;

/**
 * @class
 */
@Name("WatchResult")
@Namespace("io\\vertx\\php\\ext\\consul")
public class WatchResult extends BaseWrapper<WatchResult>{

  /**
   The previous result of the operation.

   @public

   @return {Object} the previous result.
   */
  this.prevResult = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_T.wrap(j_watchResult.prevResult());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The next result of the operation. This will be null if the operation failed.

   @public

   @return {Object} the next result or null if the operation failed.
   */
  this.nextResult = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_T.wrap(j_watchResult.nextResult());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   A Throwable describing failure. This will be null if the operation succeeded.

   @public

   @return {todo} the cause or null if the operation succeeded.
   */
  this.cause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnThrowable(j_watchResult.cause());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Did it succeed?

   @public

   @return {boolean} true if it succeded or false otherwise
   */
  this.succeeded = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_watchResult.succeeded();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Did it fail?

   @public

   @return {boolean} true if it failed or false otherwise
   */
  this.failed = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_watchResult.failed();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_watchResult;
};

WatchResult._jclass = utils.getJavaClass("io.vertx.ext.consul.WatchResult");
WatchResult._jtype = {
  accept: function(obj) {
    return WatchResult._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(WatchResult.prototype, {});
    WatchResult.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
WatchResult._create = function(jdel) {
  var obj = Object.create(WatchResult.prototype, {});
  WatchResult.apply(obj, arguments);
  return obj;
}
module.exports = WatchResult;