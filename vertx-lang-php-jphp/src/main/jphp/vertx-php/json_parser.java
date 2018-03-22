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
import io.vertx.php.core.parsetools.JsonEvent;

/**
 A parser class which allows to incrementally parse json elements and emit json parse events instead of parsing a json
 element fully. This parser is convenient for parsing large json structures.
 <p/>
 The parser also parses concatenated json streams or line delimited json streams.
 <p/>
 The parser can also parse entire object or array when it is convenient, for instance a very large array
 of small objects can be parsed efficiently by handling array <i>start</i>/<i>end</i> and <i>object</i>
 events.
 <p/>
 * @class
 */
@Name("JsonParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class JsonParser extends BaseWrapper<JsonParser>{
  ReadStream.call(this, j_val);

  /**
   Something has happened, so handle it.

   @public
   @param event {Buffer} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_jsonParser.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handle a <code>Buffer</code>, pretty much like calling {@link Handler#handle}.

   @public
   @param buffer {Buffer} 
   @return {JsonParser} a reference to this, so the API can be used fluently
   */
  this.write = function(buffer) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_jsonParser.write(buffer._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   End the stream, this must be called after all the json stream has been processed.

   @public

   */
  this.end = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.end();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser to emit a stream of events for each new json object.

   @public

   @return {JsonParser} a reference to this, so the API can be used fluently
   */
  this.objectEventMode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.objectEventMode();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser to emit a single value event for each new json object.
   </p>
   Json object currently streamed won't be affected.

   @public

   @return {JsonParser} a reference to this, so the API can be used fluently
   */
  this.objectValueMode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.objectValueMode();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser to emit a stream of events for each new json array.

   @public

   @return {JsonParser} a reference to this, so the API can be used fluently
   */
  this.arrayEventMode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.arrayEventMode();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Flip the parser to emit a single value event for each new json array.
   </p>
   Json array currently streamed won't be affected.

   @public

   @return {JsonParser} a reference to this, so the API can be used fluently
   */
  this.arrayValueMode = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.arrayValueMode();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {JsonParser}
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.pause();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {JsonParser}
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_jsonParser.resume();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param endHandler {function} 
   @return {JsonParser}
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_jsonParser.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {JsonParser}
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_jsonParser.handler(handler == null ? null : function(jVal) {
      handler(utils.convReturnVertxGen(JsonEvent, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {JsonParser}
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_jsonParser.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jsonParser;
};

JsonParser._jclass = utils.getJavaClass("io.vertx.core.parsetools.JsonParser");
JsonParser._jtype = {
  accept: function(obj) {
    return JsonParser._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JsonParser.prototype, {});
    JsonParser.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JsonParser._create = function(jdel) {
  var obj = Object.create(JsonParser.prototype, {});
  JsonParser.apply(obj, arguments);
  return obj;
}
/**
 Create a new <code>JsonParser</code> instance.

 @memberof module:vertx-js/json_parser
 @param stream {ReadStream} 
 @return {JsonParser}
 */
JsonParser.newParser = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(JsonParser, JJsonParser.newParser());
  }else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(JsonParser, JJsonParser.newParser(__args[0]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JsonParser;