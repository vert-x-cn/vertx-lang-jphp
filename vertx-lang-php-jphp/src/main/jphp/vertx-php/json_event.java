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

/**

 * @class
 */
@Name("JsonEvent")
@Namespace("io\\vertx\\php\\core\\parsetools")
public class JsonEvent extends BaseWrapper<JsonEvent>{

  /**

   @public

   @return {Object} the type of the event
   */
  this.type = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnEnum(j_jsonEvent.type());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the name of the field when the event is emitted as a JSON object member
   */
  this.fieldName = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.fieldName();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the json value for  events
   */
  this.value = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnTypeUnknown(j_jsonEvent.value());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is a number
   */
  this.isNumber = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isNumber();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the <code>Integer</code> value or <code>null</code> if the event has no JSON value
   */
  this.integerValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.integerValue();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the <code>Long</code> value or <code>null</code> if the event has no JSON value
   */
  this.longValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnLong(j_jsonEvent.longValue());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the <code>Float</code> value or <code>null</code> if the event has no JSON value
   */
  this.floatValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.floatValue();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the <code>Double</code> value or <code>null</code> if the event has no JSON value
   */
  this.doubleValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.doubleValue();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is a boolean
   */
  this.isBoolean = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isBoolean();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} the <code>Boolean</code> value or <code>null</code> if the event has no JSON value
   */
  this.booleanValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.booleanValue();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is a string
   */
  this.isString = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isString();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the string value or <code>null</code> if the event has no JSON value
   */
  this.stringValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.stringValue();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the binary value.
   <p>
   JSON itself has no notion of a binary, this extension complies to the RFC-7493, so this method assumes there is a
   String value with the key and it contains a Base64 encoded binary, which it decodes if found and returns.

   @public

   @return {Buffer} the binary value or <code>null</code> if the event has no JSON value
   */
  this.binaryValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Buffer, j_jsonEvent.binaryValue());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is null
   */
  this.isNull = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isNull();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is a JSON object
   */
  this.isObject = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isObject();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the JSON object value or <code>null</code> if the event has no JSON value
   */
  this.objectValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_jsonEvent.objectValue());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when the JSON value is a JSON array
   */
  this.isArray = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_jsonEvent.isArray();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {todo} the JSON array value or <code>null</code> if the event has no JSON value
   */
  this.arrayValue = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnJson(j_jsonEvent.arrayValue());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Decodes and returns the current value as the specified <code>type</code>.

   @public
   @param type {todo} the type to decode the value to 
   @return {Object} the decoded value
   */
  this.mapTo = function(type) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.get_jtype(__args[0]).wrap(j_jsonEvent.mapTo(utils.get_jclass(type)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jsonEvent;
};

JsonEvent._jclass = utils.getJavaClass("io.vertx.core.parsetools.JsonEvent");
JsonEvent._jtype = {
  accept: function(obj) {
    return JsonEvent._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JsonEvent.prototype, {});
    JsonEvent.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JsonEvent._create = function(jdel) {
  var obj = Object.create(JsonEvent.prototype, {});
  JsonEvent.apply(obj, arguments);
  return obj;
}
module.exports = JsonEvent;