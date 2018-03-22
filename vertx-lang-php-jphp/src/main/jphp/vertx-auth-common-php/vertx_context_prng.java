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

package io.vertx.php.ext.auth;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**
 A secure non blocking random number generator isolated to the current context. The PRNG is bound to the vert.x
 context and setup to close when the context shuts down.
 <p>
 When applicable, use of VertxContextPRNG rather than create new PRNG objects is helpful to keep the system entropy
 usage to the minimum avoiding potential blocking across the application.
 <p>
 The use of VertxContextPRNG is particularly appropriate when multiple handlers use random numbers.

 * @class
 */
@Name("VertxContextPRNG")
@Namespace("io\\vertx\\php\\ext\\auth")
public class VertxContextPRNG extends BaseWrapper<VertxContextPRNG>{

  /**
   Returns a Base64 mime encoded String of random data with the given length. The length parameter refers to the length
   of the String before the encoding step.

   @public
   @param length {number} the desired string length before Base64 encoding. 
   @return {string} A base 64 encoded string.
   */
  this.nextString = function(length) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_vertxContextPRNG.nextString(length);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a secure random int, between 0 (inclusive) and the specified bound (exclusive).

   @public
   @param bound {number} the upper bound (exclusive), which must be positive. 
   @return {number} random int.
   */
  this.nextInt = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_vertxContextPRNG.nextInt();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_vertxContextPRNG.nextInt(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_vertxContextPRNG;
};

VertxContextPRNG._jclass = utils.getJavaClass("io.vertx.ext.auth.VertxContextPRNG");
VertxContextPRNG._jtype = {
  accept: function(obj) {
    return VertxContextPRNG._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(VertxContextPRNG.prototype, {});
    VertxContextPRNG.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
VertxContextPRNG._create = function(jdel) {
  var obj = Object.create(VertxContextPRNG.prototype, {});
  VertxContextPRNG.apply(obj, arguments);
  return obj;
}
/**
 Get or create a secure non blocking random number generator using the current vert.x instance. Since the context
 might be different this method will attempt to use the current context first if available and then fall back to
 create a new instance of the PRNG.

 @memberof module:vertx-auth-common-js/vertx_context_prng
 @param vertx {Vertx} a Vert.x instance. 
 @return {VertxContextPRNG} A secure non blocking random number generator.
 */
VertxContextPRNG.current = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(VertxContextPRNG, JVertxContextPRNG.current());
  }else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(VertxContextPRNG, JVertxContextPRNG.current(__args[0]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = VertxContextPRNG;