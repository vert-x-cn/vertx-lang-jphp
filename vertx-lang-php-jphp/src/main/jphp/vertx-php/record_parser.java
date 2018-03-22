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

package io.vertx.php.core.parsetools;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;

/**
 A helper class which allows you to easily parse protocols which are delimited by a sequence of bytes, or fixed
 size records.
 <p>
 * @class
 */
@Name("RecordParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class RecordParser extends BaseWrapper<RecordParser>{
  ReadStream.call(this, j_val);

  /**

   @public
   @param output {function} 
   */
  this.setOutput = function(output) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_recordParser.setOutput(function(jVal) {
      output(utils.convReturnVertxGen(Buffer, jVal));
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser into delimited mode, and where the delimiter can be represented
   by the delimiter <code>delim</code>.
   <p>
   This method can be called multiple times with different values of delim while data is being parsed.

   @public
   @param delim {Buffer} the new delimiter 
   */
  this.delimitedMode = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_recordParser.delimitedMode(__args[0]);
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_recordParser.delimitedMode(__args[0]._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser into fixed size mode, where the record size is specified by <code>size</code> in bytes.
   <p>
   This method can be called multiple times with different values of size while data is being parsed.

   @public
   @param size {number} the new record size 
   */
  this.fixedSizeMode = function(size) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_recordParser.fixedSizeMode(size);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   This method is called to provide the parser with data.

   @public
   @param buffer {Buffer} a chunk of data 
   */
  this.handle = function(buffer) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_recordParser.handle(buffer._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {RecordParser}
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_recordParser.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {RecordParser}
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_recordParser.handler(handler == null ? null : function(jVal) {
      handler(utils.convReturnVertxGen(Buffer, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {RecordParser}
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_recordParser.pause();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {RecordParser}
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_recordParser.resume();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param endHandler {function} 
   @return {RecordParser}
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_recordParser.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_recordParser;
};

RecordParser._jclass = utils.getJavaClass("io.vertx.core.parsetools.RecordParser");
RecordParser._jtype = {
  accept: function(obj) {
    return RecordParser._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(RecordParser.prototype, {});
    RecordParser.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RecordParser._create = function(jdel) {
  var obj = Object.create(RecordParser.prototype, {});
  RecordParser.apply(obj, arguments);
  return obj;
}
/**
 Like {@link RecordParser#newDelimited} but wraps the <code>stream</code>. The <code>stream</code> handlers will be set/unset
 when the {@link RecordParser#handler} is set.
 <p/>
 The <code>pause()</code>/<code>resume()</code> operations are propagated to the <code>stream</code>.

 @memberof module:vertx-js/record_parser
 @param delim {Buffer} the initial delimiter buffer 
 @param stream {ReadStream} the wrapped stream 
 @return {RecordParser}
 */
RecordParser.newDelimited = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0]));
  }else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0], function(jVal) {
    __args[1](utils.convReturnVertxGen(Buffer, jVal));
  }));
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0], __args[1]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0]._jdel, function(jVal) {
    __args[1](utils.convReturnVertxGen(Buffer, jVal));
  }));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newDelimited(__args[0]._jdel, __args[1]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Like {@link RecordParser#newFixed} but wraps the <code>stream</code>. The <code>stream</code> handlers will be set/unset
 when the {@link RecordParser#handler} is set.
 <p/>
 The <code>pause()</code>/<code>resume()</code> operations are propagated to the <code>stream</code>.

 @memberof module:vertx-js/record_parser
 @param size {number} the initial record size 
 @param stream {ReadStream} the wrapped stream 
 @return {RecordParser}
 */
RecordParser.newFixed = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] ==='number') {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newFixed(__args[0]));
  }else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newFixed(__args[0], function(jVal) {
    __args[1](utils.convReturnVertxGen(Buffer, jVal));
  }));
  }else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(RecordParser, JRecordParser.newFixed(__args[0], __args[1]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = RecordParser;