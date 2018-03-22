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

package io.vertx.php.redis;
import io.vertx.lang.php.util.Wrapper;

/**
 Container for a script and its sha1 hash.

 * @class
 */
@Name("Script")
@Namespace("io\\vertx\\php\\redis")
public class Script extends BaseWrapper<Script>{

  /**

   @public

   @return {string}
   */
  this.getScript = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_script.getScript();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string}
   */
  this.getSha1 = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_script.getSha1();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_script;
};

Script._jclass = utils.getJavaClass("io.vertx.redis.Script");
Script._jtype = {
  accept: function(obj) {
    return Script._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Script.prototype, {});
    Script.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Script._create = function(jdel) {
  var obj = Object.create(Script.prototype, {});
  Script.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-redis-js/script
 @param script {string} 
 @param sha1 {string} 
 @return {Script}
 */
Script.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'string') {
    return utils.convReturnVertxGen(Script, JScript.create(__args[0]));
  }else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(Script, JScript.create(__args[0], __args[1]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Script;