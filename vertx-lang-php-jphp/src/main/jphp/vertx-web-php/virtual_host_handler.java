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
 Handler that will filter requests based on the request Host name.

 * @class
 */
@Name("VirtualHostHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class VirtualHostHandler extends BaseWrapper<VirtualHostHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_virtualHostHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_virtualHostHandler;
};

VirtualHostHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.VirtualHostHandler");
VirtualHostHandler._jtype = {
  accept: function(obj) {
    return VirtualHostHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(VirtualHostHandler.prototype, {});
    VirtualHostHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
VirtualHostHandler._create = function(jdel) {
  var obj = Object.create(VirtualHostHandler.prototype, {});
  VirtualHostHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a handler

 @memberof module:vertx-web-js/virtual_host_handler
 @param hostname {string} 
 @param handler {function} 
 @return {VirtualHostHandler} the handler
 */
VirtualHostHandler.create = function(hostname, handler) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
    return utils.convReturnVertxGen(VirtualHostHandler, JVirtualHostHandler.create(hostname, function(jVal) {
    handler(utils.convReturnVertxGen(RoutingContext, jVal));
  }));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = VirtualHostHandler;