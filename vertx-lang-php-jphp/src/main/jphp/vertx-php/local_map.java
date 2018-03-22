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

package io.vertx.php.core.shareddata;
import io.vertx.lang.php.util.Wrapper;

/**
 Local maps can be used to share data safely in a single Vert.x instance.
 <p>
 * @class
 */
@Name("LocalMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class LocalMap extends BaseWrapper<LocalMap>{

  /**
   Get a value from the map

   @public
   @param key {Object} the key 
   @return {Object} the value, or null if none
   */
  this.get = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      return j_V.wrap(j_localMap.get(utils.convParamTypeUnknown(key)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Put an entry in the map

   @public
   @param key {Object} the key 
   @param value {Object} the value 
   @return {Object} return the old value, or null if none
   */
  this.put = function(key, value) {
    var __args = arguments;
    if (__args.length === 2 && j_K.accept(__args[0]) && j_V.accept(__args[1])) {
      return j_V.wrap(j_localMap.put(j_K.unwrap(key), j_V.unwrap(value)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove an entry from the map

   @public
   @param key {Object} the key 
   @return {Object} the old value
   */
  this.remove = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      return j_V.wrap(j_localMap.remove(utils.convParamTypeUnknown(key)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Clear all entries in the map

   @public

   */
  this.clear = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_localMap.clear();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the size of the map

   @public

   @return {number} the number of entries in the map
   */
  this.size = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_localMap.size();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true if there are zero entries in the map
   */
  this.isEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_localMap.isEmpty();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Put the entry only if there is no existing entry for that key

   @public
   @param key {Object} the key 
   @param value {Object} the value 
   @return {Object} the old value or null, if none
   */
  this.putIfAbsent = function(key, value) {
    var __args = arguments;
    if (__args.length === 2 && j_K.accept(__args[0]) && j_V.accept(__args[1])) {
      return j_V.wrap(j_localMap.putIfAbsent(j_K.unwrap(key), j_V.unwrap(value)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove the entry only if there is an entry with the specified key and value.
   <p>
   This method is the poyglot version of {@link LocalMap#remove}.

   @public
   @param key {Object} the key 
   @param value {Object} the value 
   @return {boolean} true if removed
   */
  this.removeIfPresent = function(key, value) {
    var __args = arguments;
    if (__args.length === 2 && j_K.accept(__args[0]) && j_V.accept(__args[1])) {
      return j_localMap.removeIfPresent(j_K.unwrap(key), j_V.unwrap(value));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Replace the entry only if there is an existing entry with the specified key and value.
   <p>
   This method is the polyglot version of {@link LocalMap#replace}.

   @public
   @param key {Object} the key 
   @param oldValue {Object} the old value 
   @param newValue {Object} the new value 
   @return {boolean} true if removed
   */
  this.replaceIfPresent = function(key, oldValue, newValue) {
    var __args = arguments;
    if (__args.length === 3 && j_K.accept(__args[0]) && j_V.accept(__args[1]) && j_V.accept(__args[2])) {
      return j_localMap.replaceIfPresent(j_K.unwrap(key), j_V.unwrap(oldValue), j_V.unwrap(newValue));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Replace the entry only if there is an existing entry with the key

   @public
   @param key {Object} the key 
   @param value {Object} the new value 
   @return {Object} the old value
   */
  this.replace = function(key, value) {
    var __args = arguments;
    if (__args.length === 2 && j_K.accept(__args[0]) && j_V.accept(__args[1])) {
      return j_V.wrap(j_localMap.replace(j_K.unwrap(key), j_V.unwrap(value)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close and release the map

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_localMap.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns <code>true</code> if this map contains a mapping for the specified
   key.

   @public
   @param key {Object} key whose presence in this map is to be tested 
   @return {boolean} <code>true</code> if this map contains a mapping for the specified key
   */
  this.containsKey = function(key) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      return j_localMap.containsKey(utils.convParamTypeUnknown(key));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns @{code true} if this map maps one or more keys to the
   specified value.

   @public
   @param value {Object} value whose presence in this map is to be tested 
   @return {boolean} @{code true} if this map maps one or more keys to the specified value
   */
  this.containsValue = function(value) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] !== 'function') {
      return j_localMap.containsValue(utils.convParamTypeUnknown(value));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the value to which the specified key is mapped, or
   <code>defaultValue</code> if this map contains no mapping for the key.

   @public
   @param key {Object} the key whose associated value is to be returned 
   @param defaultValue {Object} the default mapping of the key 
   @return {Object} the value to which the specified key is mapped, or <code>defaultValue</code> if this map contains no mapping for the key
   */
  this.getOrDefault = function(key, defaultValue) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] !== 'function' && j_V.accept(__args[1])) {
      return j_V.wrap(j_localMap.getOrDefault(utils.convParamTypeUnknown(key), j_V.unwrap(defaultValue)));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_localMap;
};

LocalMap._jclass = utils.getJavaClass("io.vertx.core.shareddata.LocalMap");
LocalMap._jtype = {
  accept: function(obj) {
    return LocalMap._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(LocalMap.prototype, {});
    LocalMap.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
LocalMap._create = function(jdel) {
  var obj = Object.create(LocalMap.prototype, {});
  LocalMap.apply(obj, arguments);
  return obj;
}
module.exports = LocalMap;