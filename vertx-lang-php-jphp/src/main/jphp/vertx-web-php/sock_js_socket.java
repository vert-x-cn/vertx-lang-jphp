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
import io.vertx.php.ext.web.Session;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.net.SocketAddress;

/**

 You interact with SockJS clients through instances of SockJS socket.
 <p>
 * @class
 */
@Name("SockJSSocket")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
public class SockJSSocket extends BaseWrapper<SockJSSocket>{
  ReadStream.call(this, j_val);
  WriteStream.call(this, j_val);

  /**
   Same as {@link SockJSSocket#end} but writes some data to the stream before ending.

   @public
   @param t {Buffer} 
   */
  this.end = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sockJSSocket.end();
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_sockJSSocket.end(__args[0]._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   This will return <code>true</code> if there are more bytes in the write queue than the value set using {@link SockJSSocket#setWriteQueueMaxSize}

   @public

   @return {boolean} true if write queue is full
   */
  this.writeQueueFull = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_sockJSSocket.writeQueueFull();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {SockJSSocket}
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_sockJSSocket.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {SockJSSocket}
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_sockJSSocket.handler(handler == null ? null : function(jVal) {
      handler(utils.convReturnVertxGen(Buffer, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {SockJSSocket}
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sockJSSocket.pause();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {SockJSSocket}
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sockJSSocket.resume();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param endHandler {function} 
   @return {SockJSSocket}
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_sockJSSocket.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Write a String to the socket, encoded in UTF-8.

   @public
   @param data {string} the string to write 
   @return {SockJSSocket} a reference to this, so the API can be used fluently
   */
  this.write = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_sockJSSocket.write(__args[0]._jdel);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      j_sockJSSocket.write(__args[0]);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param maxSize {number} 
   @return {SockJSSocket}
   */
  this.setWriteQueueMaxSize = function(maxSize) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_sockJSSocket.setWriteQueueMaxSize(maxSize);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {SockJSSocket}
   */
  this.drainHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_sockJSSocket.drainHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   When a <code>SockJSSocket</code> is created it automatically registers an event handler with the event bus, the ID of that
   handler is given by <code>writeHandlerID</code>.
   <p>
   Given this ID, a different event loop can send a buffer to that event handler using the event bus and
   that buffer will be received by this instance in its own event loop and written to the underlying socket. This
   allows you to write data to other sockets which are owned by different event loops.

   @public

   @return {string}
   */
  this.writeHandlerID = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_sockJSSocket.writeHandlerID();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close it

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sockJSSocket.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the remote address for this socket

   @public

   @return {SocketAddress}
   */
  this.remoteAddress = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(SocketAddress, j_sockJSSocket.remoteAddress());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the local address for this socket

   @public

   @return {SocketAddress}
   */
  this.localAddress = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(SocketAddress, j_sockJSSocket.localAddress());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the headers corresponding to the last request for this socket or the websocket handshake
   Any cookie headers will be removed for security reasons

   @public

   @return {MultiMap}
   */
  this.headers = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(MultiMap, j_sockJSSocket.headers());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the URI corresponding to the last request for this socket or the websocket handshake

   @public

   @return {string}
   */
  this.uri = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_sockJSSocket.uri();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Session} the Vert.x-Web session corresponding to this socket
   */
  this.webSession = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Session, j_sockJSSocket.webSession());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {User} the Vert.x-Web user corresponding to this socket
   */
  this.webUser = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(User, j_sockJSSocket.webUser());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sockJSSocket;
};

SockJSSocket._jclass = utils.getJavaClass("io.vertx.ext.web.handler.sockjs.SockJSSocket");
SockJSSocket._jtype = {
  accept: function(obj) {
    return SockJSSocket._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SockJSSocket.prototype, {});
    SockJSSocket.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SockJSSocket._create = function(jdel) {
  var obj = Object.create(SockJSSocket.prototype, {});
  SockJSSocket.apply(obj, arguments);
  return obj;
}
module.exports = SockJSSocket;