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

package io.vertx.php.amqpbridge;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.core.eventbus.MessageProducer;

/**
 Vert.x AMQP Bridge. Facilitates sending and receiving AMQP 1.0 messages.

 * @class
 */
@Name("AmqpBridge")
@Namespace("io\\vertx\\php\\amqpbridge")
public class AmqpBridge extends BaseWrapper<AmqpBridge>{

  /**
   Starts the bridge, establishing the underlying connection.

   @public
   @param hostname {string} the host name to connect to 
   @param port {number} the port to connect to 
   @param username {string} the username 
   @param password {string} the password 
   @param resultHandler {function} the result handler 
   */
  this.start = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_amqpBridge.start(__args[0], __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(AmqpBridge, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
    }  else if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'string' && typeof __args[3] === 'string' && typeof __args[4] === 'function') {
      j_amqpBridge.start(__args[0], __args[1], __args[2], __args[3], function(ar) {
      if (ar.succeeded()) {
        __args[4](utils.convReturnVertxGen(AmqpBridge, ar.result()), null);
      } else {
        __args[4](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Creates a consumer on the given AMQP address.
  
   This method MUST be called from the bridge Context thread, as used in the result handler callback from the start
   methods. The bridge MUST be successfully started before the method is called.

   @public
   @param amqpAddress {string} the address to consume from 
   @return {MessageConsumer} the consumer
   */
  this.createConsumer = function(amqpAddress) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(MessageConsumer, j_amqpBridge.createConsumer(amqpAddress), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Creates a producer to the given AMQP address.
  
   This method MUST be called from the bridge Context thread, as used in the result handler callback from the start
   methods. The bridge MUST be successfully started before the method is called.

   @public
   @param amqpAddress {string} the address to produce to 
   @return {MessageProducer} the producer
   */
  this.createProducer = function(amqpAddress) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(MessageProducer, j_amqpBridge.createProducer(amqpAddress), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Shuts the bridge down, closing the underlying connection.

   @public
   @param resultHandler {function} the result handler 
   */
  this.close = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_amqpBridge.close(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an end handler. This will fire if the underlying connection is unexpectedly disconnected or remotely closed.

   @public
   @param endHandler {function} the handler 
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_amqpBridge.endHandler(endHandler);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_amqpBridge;
};

AmqpBridge._jclass = utils.getJavaClass("io.vertx.amqpbridge.AmqpBridge");
AmqpBridge._jtype = {
  accept: function(obj) {
    return AmqpBridge._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(AmqpBridge.prototype, {});
    AmqpBridge.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AmqpBridge._create = function(jdel) {
  var obj = Object.create(AmqpBridge.prototype, {});
  AmqpBridge.apply(obj, arguments);
  return obj;
}
/**
 Creates a Bridge with the given options.

 @memberof module:vertx-amqp-bridge-js/amqp_bridge
 @param vertx {Vertx} the vertx instance to use 
 @param options {Object} the options 
 @return {AmqpBridge} the (not-yet-started) bridge.
 */
AmqpBridge.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(AmqpBridge, JAmqpBridge.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(AmqpBridge, JAmqpBridge.create(__args[0]._jdel, __args[1] != null ? new AmqpBridgeOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = AmqpBridge;