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

package io.vertx.php.rabbitmq;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**

 * @class
 */
@Name("RabbitMQClient")
@Namespace("io\\vertx\\php\\rabbitmq")
public class RabbitMQClient extends BaseWrapper<RabbitMQClient>{

  /**
   Acknowledge one or several received messages. Supply the deliveryTag from the AMQP.Basic.GetOk or AMQP.Basic.Deliver
   method containing the received message being acknowledged.

   @public
   @param deliveryTag {number} 
   @param multiple {boolean} 
   @param resultHandler {function} 
   */
  this.basicAck = function(deliveryTag, multiple, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] ==='boolean' && typeof __args[2] === 'function') {
      j_rabbitMQClient.basicAck(deliveryTag, multiple, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Reject one or several received messages.

   @public
   @param deliveryTag {number} 
   @param multiple {boolean} 
   @param requeue {boolean} 
   @param resultHandler {function} 
   */
  this.basicNack = function(deliveryTag, multiple, requeue, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] ==='number' && typeof __args[1] ==='boolean' && typeof __args[2] ==='boolean' && typeof __args[3] === 'function') {
      j_rabbitMQClient.basicNack(deliveryTag, multiple, requeue, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieve a message from a queue using AMQP.Basic.Get

   @public
   @param queue {string} 
   @param autoAck {boolean} 
   @param resultHandler {function} 
   */
  this.basicGet = function(queue, autoAck, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && typeof __args[2] === 'function') {
      j_rabbitMQClient.basicGet(queue, autoAck, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Start a non-nolocal, non-exclusive consumer, with a server-generated consumerTag and error handler

   @public
   @param queue {string} 
   @param address {string} 
   @param autoAck {boolean} 
   @param resultHandler {function} 
   @param errorHandler {function} 
   */
  this.basicConsume = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_rabbitMQClient.basicConsume(__args[0], __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
    }  else if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='boolean' && typeof __args[3] === 'function') {
      j_rabbitMQClient.basicConsume(__args[0], __args[1], __args[2], function(ar) {
      if (ar.succeeded()) {
        __args[3](null, null);
      } else {
        __args[3](null, ar.cause());
      }
    });
    }  else if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='boolean' && typeof __args[3] === 'function' && typeof __args[4] === 'function') {
      j_rabbitMQClient.basicConsume(__args[0], __args[1], __args[2], function(ar) {
      if (ar.succeeded()) {
        __args[3](null, null);
      } else {
        __args[3](null, ar.cause());
      }
    }, function(jVal) {
      __args[4](utils.convReturnThrowable(jVal));
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Publish a message. Publishing to a non-existent exchange will result in a channel-level protocol exception,
   which closes the channel. Invocations of Channel#basicPublish will eventually block if a resource-driven alarm is in effect.

   @public
   @param exchange {string} 
   @param routingKey {string} 
   @param message {Object} 
   @param resultHandler {function} 
   */
  this.basicPublish = function(exchange, routingKey, message, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_rabbitMQClient.basicPublish(exchange, routingKey, utils.convParamJsonObject(message), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Enables publisher acknowledgements on this channel. Can be called once during client initialisation. Calls to basicPublish()
   will have to be confirmed.

   @public
   @param resultHandler {function} 
   */
  this.confirmSelect = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_rabbitMQClient.confirmSelect(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Wait until all messages published since the last call have been either ack'd or nack'd by the broker; or until timeout elapses. If the timeout expires a TimeoutException is thrown.

   @public
   @param timeout {number} 
   @param resultHandler {function} 
   */
  this.waitForConfirms = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_rabbitMQClient.waitForConfirms(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_rabbitMQClient.waitForConfirms(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Request specific "quality of service" settings, Limiting the number of unacknowledged messages on
   a channel (or connection). This limit is applied separately to each new consumer on the channel.

   @public
   @param prefetchCount {number} 
   @param resultHandler {function} 
   */
  this.basicQos = function(prefetchCount, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_rabbitMQClient.basicQos(prefetchCount, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Declare an exchange with additional parameters such as dead lettering, an alternate exchange or TTL.

   @public
   @param exchange {string} 
   @param type {string} 
   @param durable {boolean} 
   @param autoDelete {boolean} 
   @param config {Object} 
   @param resultHandler {function} 
   */
  this.exchangeDeclare = function() {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='boolean' && typeof __args[3] ==='boolean' && typeof __args[4] === 'function') {
      j_rabbitMQClient.exchangeDeclare(__args[0], __args[1], __args[2], __args[3], function(ar) {
      if (ar.succeeded()) {
        __args[4](null, null);
      } else {
        __args[4](null, ar.cause());
      }
    });
    }  else if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] ==='boolean' && typeof __args[3] ==='boolean' && (typeof __args[4] === 'object' && __args[4] != null) && typeof __args[5] === 'function') {
      j_rabbitMQClient.exchangeDeclare(__args[0], __args[1], __args[2], __args[3], utils.convParamJsonObject(__args[4]), function(ar) {
      if (ar.succeeded()) {
        __args[5](null, null);
      } else {
        __args[5](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete an exchange, without regard for whether it is in use or not.

   @public
   @param exchange {string} 
   @param resultHandler {function} 
   */
  this.exchangeDelete = function(exchange, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_rabbitMQClient.exchangeDelete(exchange, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Bind an exchange to an exchange.

   @public
   @param destination {string} 
   @param source {string} 
   @param routingKey {string} 
   @param resultHandler {function} 
   */
  this.exchangeBind = function(destination, source, routingKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_rabbitMQClient.exchangeBind(destination, source, routingKey, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unbind an exchange from an exchange.

   @public
   @param destination {string} 
   @param source {string} 
   @param routingKey {string} 
   @param resultHandler {function} 
   */
  this.exchangeUnbind = function(destination, source, routingKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_rabbitMQClient.exchangeUnbind(destination, source, routingKey, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Actively declare a server-named exclusive, autodelete, non-durable queue.

   @public
   @param resultHandler {function} 
   */
  this.queueDeclareAuto = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_rabbitMQClient.queueDeclareAuto(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Declare a queue with config options

   @public
   @param queue {string} 
   @param durable {boolean} 
   @param exclusive {boolean} 
   @param autoDelete {boolean} 
   @param config {Object} 
   @param resultHandler {function} 
   */
  this.queueDeclare = function() {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && typeof __args[2] ==='boolean' && typeof __args[3] ==='boolean' && typeof __args[4] === 'function') {
      j_rabbitMQClient.queueDeclare(__args[0], __args[1], __args[2], __args[3], function(ar) {
      if (ar.succeeded()) {
        __args[4](utils.convReturnJson(ar.result()), null);
      } else {
        __args[4](null, ar.cause());
      }
    });
    }  else if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && typeof __args[2] ==='boolean' && typeof __args[3] ==='boolean' && (typeof __args[4] === 'object' && __args[4] != null) && typeof __args[5] === 'function') {
      j_rabbitMQClient.queueDeclare(__args[0], __args[1], __args[2], __args[3], utils.convParamJsonObject(__args[4]), function(ar) {
      if (ar.succeeded()) {
        __args[5](utils.convReturnJson(ar.result()), null);
      } else {
        __args[5](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a queue, without regard for whether it is in use or has messages on it

   @public
   @param queue {string} 
   @param resultHandler {function} 
   */
  this.queueDelete = function(queue, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_rabbitMQClient.queueDelete(queue, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete a queue

   @public
   @param queue {string} 
   @param ifUnused {boolean} 
   @param ifEmpty {boolean} 
   @param resultHandler {function} 
   */
  this.queueDeleteIf = function(queue, ifUnused, ifEmpty, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && typeof __args[2] ==='boolean' && typeof __args[3] === 'function') {
      j_rabbitMQClient.queueDeleteIf(queue, ifUnused, ifEmpty, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Bind a queue to an exchange

   @public
   @param queue {string} 
   @param exchange {string} 
   @param routingKey {string} 
   @param resultHandler {function} 
   */
  this.queueBind = function(queue, exchange, routingKey, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_rabbitMQClient.queueBind(queue, exchange, routingKey, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the number of messages in a queue ready to be delivered.

   @public
   @param queue {string} 
   @param resultHandler {function} 
   */
  this.messageCount = function(queue, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_rabbitMQClient.messageCount(queue, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Start the rabbitMQ client. Create the connection and the chanel.

   @public
   @param resultHandler {function} 
   */
  this.start = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_rabbitMQClient.start(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Stop the rabbitMQ client. Close the connection and its chanel.

   @public
   @param resultHandler {function} 
   */
  this.stop = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_rabbitMQClient.stop(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Check if a connection is open

   @public

   @return {boolean} true when the connection is open, false otherwise
   */
  this.isConnected = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_rabbitMQClient.isConnected();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Check if a channel is open

   @public

   @return {boolean} true when the connection is open, false otherwise
   */
  this.isOpenChannel = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_rabbitMQClient.isOpenChannel();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_rabbitMQClient;
};

RabbitMQClient._jclass = utils.getJavaClass("io.vertx.rabbitmq.RabbitMQClient");
RabbitMQClient._jtype = {
  accept: function(obj) {
    return RabbitMQClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(RabbitMQClient.prototype, {});
    RabbitMQClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
RabbitMQClient._create = function(jdel) {
  var obj = Object.create(RabbitMQClient.prototype, {});
  RabbitMQClient.apply(obj, arguments);
  return obj;
}
/**
 Create and return a client.

 @memberof module:vertx-rabbitmq-js/rabbit_mq_client
 @param vertx {Vertx} the vertx instance 
 @param config {Object} the client config 
 @return {RabbitMQClient} the client
 */
RabbitMQClient.create = function(vertx, config) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(RabbitMQClient, JRabbitMQClient.create(vertx._jdel, config != null ? new RabbitMQOptions(new JsonObject(Java.asJSONCompatible(config))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = RabbitMQClient;