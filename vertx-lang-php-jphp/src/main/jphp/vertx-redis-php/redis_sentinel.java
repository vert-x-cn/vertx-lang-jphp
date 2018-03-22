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

package io.vertx.php.redis.sentinel;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**
 Interface for sentinel commands

 * @class
 */
@Name("RedisSentinel")
@Namespace("io\\vertx\\php\\redis\\sentinel")
public class RedisSentinel extends BaseWrapper<RedisSentinel>{

  /**
   Close the client - when it is fully closed the handler will be called.

   @public
   @param handler {function} 
   */
  this.close = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisSentinel.close(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Show a list of monitored masters and their state

   @public
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.masters = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisSentinel.masters(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Show the state and info of the specified master

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.master = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.master(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Show a list of slaves for this master, and their state

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.slaves = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.slaves(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Show a list of sentinel instances for this master, and their state

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.sentinels = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.sentinels(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the ip and port number of the master with that name.
   If a failover is in progress or terminated successfully for this master
   it returns the address and port of the promoted slave

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.getMasterAddrByName = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.getMasterAddrByName(name, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reset all the masters with matching name.
   The pattern argument is a glob-style pattern.
   The reset process clears any previous state in a master (including a failover in pro

   @public
   @param pattern {string} pattern String 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.reset = function(pattern, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.reset(pattern, function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Force a failover as if the master was not reachable, and without asking for agreement to other Sentinels
   (however a new version of the configuration will be published so that the other Sentinels
   will update their configurations)

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.failover = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.failover(name, function(ar) {
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
   Check if the current Sentinel configuration is able to reach the quorum needed to failover a master,
   and the majority needed to authorize the failover. This command should be used in monitoring systems
   to check if a Sentinel deployment is ok.

   @public
   @param name {string} master name 
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.ckquorum = function(name, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_redisSentinel.ckquorum(name, function(ar) {
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
   Force Sentinel to rewrite its configuration on disk, including the current Sentinel state.
   Normally Sentinel rewrites the configuration every time something changes in its state
   (in the context of the subset of the state which is persisted on disk across restart).
   However sometimes it is possible that the configuration file is lost because of operation errors,
   disk failures, package upgrade scripts or configuration managers. In those cases a way to to force Sentinel to
   rewrite the configuration file is handy. This command works even if the previous configuration file
   is completely missing.

   @public
   @param handler {function} Handler for the result of this call 
   @return {RedisSentinel}
   */
  this.flushConfig = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_redisSentinel.flushConfig(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_redisSentinel;
};

RedisSentinel._jclass = utils.getJavaClass("io.vertx.redis.sentinel.RedisSentinel");
RedisSentinel._jtype = {
  accept: function(obj) {
    return RedisSentinel._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(RedisSentinel.prototype, {});
    RedisSentinel.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RedisSentinel._create = function(jdel) {
  var obj = Object.create(RedisSentinel.prototype, {});
  RedisSentinel.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-redis-js/redis_sentinel
 @param vertx {Vertx} 
 @param config {Object} 
 @return {RedisSentinel}
 */
RedisSentinel.create = function(vertx, config) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(RedisSentinel, JRedisSentinel.create(vertx._jdel, config != null ? new RedisOptions(new JsonObject(Java.asJSONCompatible(config))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = RedisSentinel;