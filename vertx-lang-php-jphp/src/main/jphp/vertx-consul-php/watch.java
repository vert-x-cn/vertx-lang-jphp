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

package io.vertx.php.ext.consul;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.consul.WatchResult;

/**
 Watches are a way of specifying a view of data (e.g. list of nodes, KV pairs, health checks)
 * @class
 */
@Name("Watch")
@Namespace("io\\vertx\\php\\ext\\consul")
public class Watch extends BaseWrapper<Watch>{

  /**
   Set the result handler. As data is changed, the handler will be called with the result.

   @public
   @param handler {function} the result handler 
   @return {Watch} reference to this, for fluency
   */
  this.setHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_watch.setHandler(function(jVal) {
      handler(utils.convReturnVertxGen(WatchResult, jVal, undefined));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Start this <code>Watch</code>

   @public

   @return {Watch} reference to this, for fluency
   */
  this.start = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_watch.start();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Stop the watch and release its resources

   @public

   */
  this.stop = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_watch.stop();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_watch;
};

Watch._jclass = utils.getJavaClass("io.vertx.ext.consul.Watch");
Watch._jtype = {
  accept: function(obj) {
    return Watch._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Watch.prototype, {});
    Watch.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Watch._create = function(jdel) {
  var obj = Object.create(Watch.prototype, {});
  Watch.apply(obj, arguments);
  return obj;
}
/**
 Creates <code>Watch</code> to monitoring a specific key in the KV store.
 This maps to the <a href="https://www.consul.io/api/kv.html">/v1/kv/</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param key {string} the key 
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.key = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.key(__args[0], __args[1]._jdel), undefined);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.key(__args[0], __args[1]._jdel, __args[2] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates <code>Watch</code> to monitoring a prefix of keys in the KV store.
 This maps to the <a href="https://www.consul.io/api/kv.html">/v1/kv/</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param keyPrefix {string} the key 
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.keyPrefix = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.keyPrefix(__args[0], __args[1]._jdel), undefined);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.keyPrefix(__args[0], __args[1]._jdel, __args[2] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates <code>Watch</code> to monitoring the list of available services.
 This maps to the <a href="https://www.consul.io/docs/agent/http/catalog.html#catalog_services">/v1/catalog/services</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.services = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.services(__args[0]._jdel), undefined);
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.services(__args[0]._jdel, __args[1] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates <code>Watch</code> to monitoring the nodes providing the service.
 This maps to the <a href="https://www.consul.io/docs/agent/http/health.html#health_service">/v1/health/service/&lt;service&gt;</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param service {string} the service name 
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.service = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.service(__args[0], __args[1]._jdel), undefined);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.service(__args[0], __args[1]._jdel, __args[2] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates <code>Watch</code> to monitoring the custom user events.
 This maps to the <a href="https://www.consul.io/docs/agent/http/event.html#event_list">/v1/event/list</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param event {string} the event name 
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.events = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.events(__args[0], __args[1]._jdel), undefined);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.events(__args[0], __args[1]._jdel, __args[2] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[2]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates <code>Watch</code> to monitoring the list of available nodes.
 This maps to the <a href="https://www.consul.io/api/catalog.html#list-nodes">/v1/catalog/nodes</a> API internally.

 @memberof module:vertx-consul-js/watch
 @param vertx {Vertx} the <code>Vertx</code> instance 
 @param options {Object} the options to create underlying Consul client 
 @return {Watch} the <code>Watch</code> instance
 */
Watch.nodes = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(Watch, JWatch.nodes(__args[0]._jdel), undefined);
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(Watch, JWatch.nodes(__args[0]._jdel, __args[1] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null), undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Watch;