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
import io.vertx.php.core.shareddata.AsyncMap;
import io.vertx.php.core.shareddata.Lock;
import io.vertx.php.core.shareddata.LocalMap;
import io.vertx.php.core.shareddata.Counter;

/**
 Shared data allows you to share data safely between different parts of your application in a safe way.
 <p>
 Shared data provides:
 <ul>
   <li>synchronous shared maps (local)</li>
   <li>asynchronous maps (local or cluster-wide)</li>
   <li>asynchronous locks (local or cluster-wide)</li>
   <li>asynchronous counters (local or cluster-wide)</li>
 </ul>
 <p>
 <p>
   <strong>WARNING</strong>: In clustered mode, asynchronous maps/locks/counters rely on distributed data structures provided by the cluster manager.
   Beware that the latency relative to asynchronous maps/locks/counters operations can be much higher in clustered than in local mode.
 </p>
 Please see the documentation for more information.

 * @class
 */
@Name("SharedData")
@Namespace("io\\vertx\\php\\core\\shareddata")
public class SharedData extends BaseWrapper<SharedData>{

  /**
   Get the cluster wide map with the specified name. The map is accessible to all nodes in the cluster and data
   put into the map from any node is visible to to any other node.

   @public
   @param name {string} the name of the map 
   @param resultHandler {function} the map will be returned asynchronously in this handler 
   */
  this.getClusterWideMap = function(name, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sharedData.getClusterWideMap(name, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(AsyncMap, ar.result(), undefined, undefined), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the {@link AsyncMap} with the specified name. When clustered, the map is accessible to all nodes in the cluster
   and data put into the map from any node is visible to to any other node.
   <p>
     <strong>WARNING</strong>: In clustered mode, asynchronous shared maps rely on distributed data structures provided by the cluster manager.
     Beware that the latency relative to asynchronous shared maps operations can be much higher in clustered than in local mode.
   </p>

   @public
   @param name {string} the name of the map 
   @param resultHandler {function} the map will be returned asynchronously in this handler 
   */
  this.getAsyncMap = function(name, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sharedData.getAsyncMap(name, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(AsyncMap, ar.result(), undefined, undefined), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get an asynchronous lock with the specified name. The lock will be passed to the handler when it is available.

   @public
   @param name {string} the name of the lock 
   @param resultHandler {function} the handler 
   */
  this.getLock = function(name, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sharedData.getLock(name, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(Lock, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Like {@link SharedData#getLock} but specifying a timeout. If the lock is not obtained within the timeout
   a failure will be sent to the handler

   @public
   @param name {string} the name of the lock 
   @param timeout {number} the timeout in ms 
   @param resultHandler {function} the handler 
   */
  this.getLockWithTimeout = function(name, timeout, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_sharedData.getLockWithTimeout(name, timeout, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(Lock, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get an asynchronous counter. The counter will be passed to the handler.

   @public
   @param name {string} the name of the counter. 
   @param resultHandler {function} the handler 
   */
  this.getCounter = function(name, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sharedData.getCounter(name, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(Counter, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return a <code>LocalMap</code> with the specific <code>name</code>.

   @public
   @param name {string} the name of the map 
   @return {LocalMap} the msp
   */
  this.getLocalMap = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(LocalMap, j_sharedData.getLocalMap(name), undefined, undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sharedData;
};

SharedData._jclass = utils.getJavaClass("io.vertx.core.shareddata.SharedData");
SharedData._jtype = {
  accept: function(obj) {
    return SharedData._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SharedData.prototype, {});
    SharedData.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SharedData._create = function(jdel) {
  var obj = Object.create(SharedData.prototype, {});
  SharedData.apply(obj, arguments);
  return obj;
}
module.exports = SharedData;