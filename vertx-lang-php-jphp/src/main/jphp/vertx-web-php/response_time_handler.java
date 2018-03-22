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
 Handler which adds a header `x-response-time` in the response of matching requests containing the time taken
 in ms to process the request.

 * @class
 */
@Name("ResponseTimeHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class ResponseTimeHandler extends BaseWrapper<ResponseTimeHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_responseTimeHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_responseTimeHandler;
};

ResponseTimeHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.ResponseTimeHandler");
ResponseTimeHandler._jtype = {
  accept: function(obj) {
    return ResponseTimeHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ResponseTimeHandler.prototype, {});
    ResponseTimeHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ResponseTimeHandler._create = function(jdel) {
  var obj = Object.create(ResponseTimeHandler.prototype, {});
  ResponseTimeHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a handler

 @memberof module:vertx-web-js/response_time_handler

 @return {ResponseTimeHandler} the handler
 */
ResponseTimeHandler.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(ResponseTimeHandler, JResponseTimeHandler.create());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ResponseTimeHandler;