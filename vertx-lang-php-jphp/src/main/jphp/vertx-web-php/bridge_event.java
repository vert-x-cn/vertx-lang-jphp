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

package io.vertx.php.ext.web.handler.sockjs;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import io.vertx.php.ext.bridge.BaseBridgeEvent;
import io.vertx.php.core.Future;

/**
 Represents an event that occurs on the event bus bridge.
 <p>
 Please consult the documentation for a full explanation.

 * @class
 */
@Name("BridgeEvent")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
public class BridgeEvent extends BaseWrapper<BridgeEvent>{
  BaseBridgeEvent.call(this, j_val);

  /**
   Has the future completed?
   <p>
   It's completed if it's either succeeded or failed.

   @public

   @return {boolean} true if completed, false if not
   */
  this.isComplete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_bridgeEvent.isComplete();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a handler for the result.
   <p>
   If the future has already been completed it will be called immediately. Otherwise it will be called when the
   future is completed.

   @public
   @param handler {function} the Handler that will be called with the result 
   @return {Future} a reference to this, so it can be used fluently
   */
  this.setHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_bridgeEvent.setHandler(function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the result. Any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param result {boolean} the result 
   */
  this.complete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_bridgeEvent.complete();
    }  else if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_bridgeEvent.complete(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to set the failure. When it happens, any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param failureMessage {string} the failure message 
   */
  this.fail = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object') {
      j_bridgeEvent.fail(utils.convParamThrowable(__args[0]));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      j_bridgeEvent.fail(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param result {boolean} the result 
   @return {boolean} false when the future is already completed
   */
  this.tryComplete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_bridgeEvent.tryComplete();
    }  else if (__args.length === 1 && typeof __args[0] ==='boolean') {
      return j_bridgeEvent.tryComplete(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to set the failure. When it happens, any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param failureMessage {string} the failure message 
   @return {boolean} false when the future is already completed
   */
  this.tryFail = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object') {
      return j_bridgeEvent.tryFail(utils.convParamThrowable(__args[0]));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_bridgeEvent.tryFail(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The result of the operation. This will be null if the operation failed.

   @public

   @return {boolean} the result or null if the operation failed.
   */
  this.result = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_bridgeEvent.result();
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
      return utils.convReturnThrowable(j_bridgeEvent.cause());
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
      return j_bridgeEvent.succeeded();
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
      return j_bridgeEvent.failed();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Compose this future with a provided <code>next</code> future.<p>
  
   When this (the one on which <code>compose</code> is called) future succeeds, the <code>handler</code> will be called with
   the completed value, this handler should complete the next future.<p>
  
   If the <code>handler</code> throws an exception, the returned future will be failed with this exception.<p>
  
   When this future fails, the failure will be propagated to the <code>next</code> future and the <code>handler</code>
   will not be called.

   @public
   @param handler {function} the handler 
   @param next {Future} the next future 
   @return {Future} the next future, used for chaining
   */
  this.compose = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.compose(function(jVal) {
      var jRet = __args[0](jVal);
      return jRet._jdel;
    }), undefined);
    }  else if (__args.length === 2 && typeof __args[0] === 'function' && typeof __args[1] === 'object' && __args[1]._jdel) {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.compose(function(jVal) {
      __args[0](jVal);
    }, __args[1]._jdel), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the result of a future to a specific <code>value</code>.<p>
  
   When this future succeeds, this <code>value</code> will complete the future returned by this method call.<p>
  
   When this future fails, the failure will be propagated to the returned future.

   @public
   @param value {Object} the value that eventually completes the mapped future 
   @return {Future} the mapped future
   */
  this.map = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.map(function(jVal) {
      var jRet = __args[0](jVal);
      return utils.convParamTypeUnknown(jRet);
    }), undefined);
    }  else if (__args.length === 1 && typeof __args[0] !== 'function') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.map(utils.convParamTypeUnknown(__args[0])), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the result of a future to <code>null</code>.<p>
  
   This is a conveniency for <code>future.map((T) null)</code> or <code>future.map((Void) null)</code>.<p>
  
   When this future succeeds, <code>null</code> will complete the future returned by this method call.<p>
  
   When this future fails, the failure will be propagated to the returned future.

   @public

   @return {Future} the mapped future
   */
  this.mapEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.mapEmpty(), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {function} an handler completing this future
   */
  this.completer = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedcompleter == null) {
        that.cachedcompleter = utils.convReturnHandlerAsyncResult(j_bridgeEvent.completer(), function(result) { return result; });
      }
      return that.cachedcompleter;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a failure of this Future by returning the result of another Future.
   If the mapper fails, then the returned future will be failed with this failure.

   @public
   @param mapper {todo} A function which takes the exception of a failure and returns a new future. 
   @return {Future} A recovered future
   */
  this.recover = function(mapper) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.recover(function(jVal) {
      var jRet = mapper(utils.convReturnThrowable(jVal));
      return jRet._jdel;
    }), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the failure of a future to a specific <code>value</code>.<p>
  
   When this future fails, this <code>value</code> will complete the future returned by this method call.<p>
  
   When this future succeeds, the result will be propagated to the returned future.

   @public
   @param value {boolean} the value that eventually completes the mapped future 
   @return {Future} the mapped future
   */
  this.otherwise = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.otherwise(function(jVal) {
      var jRet = __args[0](utils.convReturnThrowable(jVal));
      return jRet;
    }), undefined);
    }  else if (__args.length === 1 && typeof __args[0] ==='boolean') {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.otherwise(__args[0]), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the failure of a future to <code>null</code>.<p>
  
   This is a convenience for <code>future.otherwise((T) null)</code>.<p>
  
   When this future fails, the <code>null</code> value will complete the future returned by this method call.<p>
  
   When this future succeeds, the result will be propagated to the returned future.

   @public

   @return {Future} the mapped future
   */
  this.otherwiseEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Future, j_bridgeEvent.otherwiseEmpty(), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the type of the event
   */
  this.type = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedtype == null) {
        that.cachedtype = utils.convReturnEnum(j_bridgeEvent.type());
      }
      return that.cachedtype;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is
   no message involved. If the returned message is modified, {@link BridgeEvent#setRawMessage} should be called with the
   new message.

   @public

   @return {Object} the raw JSON message for the event
   */
  this.getRawMessage = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_bridgeEvent.getRawMessage());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is
   no message involved.

   @public
   @param message {Object} the raw message 
   @return {BridgeEvent} this reference, so it can be used fluently
   */
  this.setRawMessage = function(message) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_bridgeEvent.setRawMessage(utils.convParamJsonObject(message));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the SockJSSocket instance corresponding to the event

   @public

   @return {SockJSSocket} the SockJSSocket instance
   */
  this.socket = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedsocket == null) {
        that.cachedsocket = utils.convReturnVertxGen(SockJSSocket, j_bridgeEvent.socket());
      }
      return that.cachedsocket;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_bridgeEvent;
};

BridgeEvent._jclass = utils.getJavaClass("io.vertx.ext.web.handler.sockjs.BridgeEvent");
BridgeEvent._jtype = {
  accept: function(obj) {
    return BridgeEvent._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(BridgeEvent.prototype, {});
    BridgeEvent.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
BridgeEvent._create = function(jdel) {
  var obj = Object.create(BridgeEvent.prototype, {});
  BridgeEvent.apply(obj, arguments);
  return obj;
}
module.exports = BridgeEvent;