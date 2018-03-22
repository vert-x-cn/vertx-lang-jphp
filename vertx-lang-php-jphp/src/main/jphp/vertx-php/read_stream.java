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

package io.vertx.php.core.streams;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.streams.StreamBase;

/**
 Represents a stream of items that can be read from.
 <p>
 * @class
 */
@Name("ReadStream")
@Namespace("io\\vertx\\php\\core\\streams")
public class ReadStream extends BaseWrapper<ReadStream>{
  StreamBase.call(this, j_val);

  /**
   Set an exception handler on the read stream.

   @public
   @param handler {function} the exception handler 
   @return {ReadStream} a reference to this, so the API can be used fluently
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_readStream.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a data handler. As data is read, the handler will be called with the data.

   @public
   @param handler {function} 
   @return {ReadStream} a reference to this, so the API can be used fluently
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_readStream.handler(handler == null ? null : function(jVal) {
      handler(j_T.wrap(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Pause the <code>ReadSupport</code>. While it's paused, no data will be sent to the <code>dataHandler</code>

   @public

   @return {ReadStream} a reference to this, so the API can be used fluently
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_readStream.pause();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Resume reading. If the <code>ReadSupport</code> has been paused, reading will recommence on it.

   @public

   @return {ReadStream} a reference to this, so the API can be used fluently
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_readStream.resume();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.

   @public
   @param endHandler {function} 
   @return {ReadStream} a reference to this, so the API can be used fluently
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_readStream.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_readStream;
};

ReadStream._jclass = utils.getJavaClass("io.vertx.core.streams.ReadStream");
ReadStream._jtype = {
  accept: function(obj) {
    return ReadStream._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ReadStream.prototype, {});
    ReadStream.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ReadStream._create = function(jdel) {
  var obj = Object.create(ReadStream.prototype, {});
  ReadStream.apply(obj, arguments);
  return obj;
}
module.exports = ReadStream;