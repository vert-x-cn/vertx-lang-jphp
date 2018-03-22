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

package io.vertx.php.ext.shell.term;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.term.Term;

/**

 * @class
 */
@Name("SockJSTermHandler")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public class SockJSTermHandler extends BaseWrapper<SockJSTermHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {SockJSSocket} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_sockJSTermHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {SockJSTermHandler}
   */
  this.termHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sockJSTermHandler.termHandler(function(jVal) {
      handler(utils.convReturnVertxGen(Term, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sockJSTermHandler;
};

SockJSTermHandler._jclass = utils.getJavaClass("io.vertx.ext.shell.term.SockJSTermHandler");
SockJSTermHandler._jtype = {
  accept: function(obj) {
    return SockJSTermHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SockJSTermHandler.prototype, {});
    SockJSTermHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SockJSTermHandler._create = function(jdel) {
  var obj = Object.create(SockJSTermHandler.prototype, {});
  SockJSTermHandler.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-shell-js/sock_js_term_handler
 @param vertx {Vertx} 
 @param charset {string} 
 @return {SockJSTermHandler}
 */
SockJSTermHandler.create = function(vertx, charset) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(SockJSTermHandler, JSockJSTermHandler.create(vertx._jdel, charset));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = SockJSTermHandler;