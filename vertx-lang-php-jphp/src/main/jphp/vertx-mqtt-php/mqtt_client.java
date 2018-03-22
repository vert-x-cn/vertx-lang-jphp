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

package io.vertx.php.mqtt;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.mqtt.messages.MqttConnAckMessage;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.Vertx;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.mqtt.messages.MqttSubAckMessage;

/**
 An MQTT client

 * @class
 */
@Name("MqttClient")
@Namespace("io\\vertx\\php\\mqtt")
public class MqttClient extends BaseWrapper<MqttClient>{

  /**
   Connects to an MQTT server calling connectHandler after connection

   @public
   @param port {number} port of the MQTT server 
   @param host {string} hostname/ip address of the MQTT server 
   @param serverName {string} the SNI server name 
   @param connectHandler {function} handler called when the asynchronous connect call ends 
   @return {MqttClient} current MQTT client instance
   */
  this.connect = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_mqttClient.connect(__args[0], __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(MqttConnAckMessage, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 4 && typeof __args[0] ==='number' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_mqttClient.connect(__args[0], __args[1], __args[2], function(ar) {
      if (ar.succeeded()) {
        __args[3](utils.convReturnVertxGen(MqttConnAckMessage, ar.result()), null);
      } else {
        __args[3](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Disconnects from the MQTT server calling disconnectHandler after disconnection

   @public
   @param disconnectHandler {function} handler called when asynchronous disconnect call ends 
   @return {MqttClient} current MQTT client instance
   */
  this.disconnect = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mqttClient.disconnect();
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.disconnect(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the PUBLISH message to the remote MQTT server

   @public
   @param topic {string} topic on which the message is published 
   @param payload {Buffer} message payload 
   @param qosLevel {Object} QoS level 
   @param isDup {boolean} if the message is a duplicate 
   @param isRetain {boolean} if the message needs to be retained 
   @param publishSentHandler {function} handler called after PUBLISH packet sent with packetid (not when QoS 0) 
   @return {MqttClient} current MQTT client instance
   */
  this.publish = function() {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'string' && typeof __args[3] ==='boolean' && typeof __args[4] ==='boolean') {
      j_mqttClient.publish(__args[0], __args[1]._jdel, io.netty.handler.codec.mqtt.MqttQoS.valueOf(__args[2]), __args[3], __args[4]);
      return that;
    }  else if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'string' && typeof __args[3] ==='boolean' && typeof __args[4] ==='boolean' && typeof __args[5] === 'function') {
      j_mqttClient.publish(__args[0], __args[1]._jdel, io.netty.handler.codec.mqtt.MqttQoS.valueOf(__args[2]), __args[3], __args[4], function(ar) {
      if (ar.succeeded()) {
        __args[5](ar.result(), null);
      } else {
        __args[5](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets handler which will be called each time publish is completed

   @public
   @param publishCompletionHandler {function} handler called with the packetId 
   @return {MqttClient} current MQTT client instance
   */
  this.publishCompletionHandler = function(publishCompletionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.publishCompletionHandler(function(jVal) {
      publishCompletionHandler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets handler which will be called each time server publish something to client

   @public
   @param publishHandler {function} handler to call 
   @return {MqttClient} current MQTT client instance
   */
  this.publishHandler = function(publishHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.publishHandler(function(jVal) {
      publishHandler(utils.convReturnVertxGen(MqttPublishMessage, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets handler which will be called after SUBACK packet receiving

   @public
   @param subscribeCompletionHandler {function} handler to call. List inside is a granted QoS array 
   @return {MqttClient} current MQTT client instance
   */
  this.subscribeCompletionHandler = function(subscribeCompletionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.subscribeCompletionHandler(function(jVal) {
      subscribeCompletionHandler(utils.convReturnVertxGen(MqttSubAckMessage, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Subscribes to the topic with a specified QoS level

   @public
   @param topic {string} topic you subscribe on 
   @param qos {number} QoS level 
   @param subscribeSentHandler {function} handler called after SUBSCRIBE packet sent with packetid 
   @return {MqttClient} current MQTT client instance
   */
  this.subscribe = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_mqttClient.subscribe(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] ==='number') {
      j_mqttClient.subscribe(__args[0], __args[1]);
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_mqttClient.subscribe(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](ar.result(), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_mqttClient.subscribe(__args[0], __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](ar.result(), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets handler which will be called after UNSUBACK packet receiving

   @public
   @param unsubscribeCompletionHandler {function} handler to call with the packetid 
   @return {MqttClient} current MQTT client instance
   */
  this.unsubscribeCompletionHandler = function(unsubscribeCompletionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.unsubscribeCompletionHandler(function(jVal) {
      unsubscribeCompletionHandler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unsubscribe from receiving messages on given topic

   @public
   @param topic {string} Topic you want to unsubscribe from 
   @param unsubscribeSentHandler {function} handler called after UNSUBSCRIBE packet sent 
   @return {MqttClient} current MQTT client instance
   */
  this.unsubscribe = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mqttClient.unsubscribe(__args[0]);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_mqttClient.unsubscribe(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](ar.result(), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets handler which will be called after PINGRESP packet receiving

   @public
   @param pingResponseHandler {function} handler to call 
   @return {MqttClient} current MQTT client instance
   */
  this.pingResponseHandler = function(pingResponseHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.pingResponseHandler(pingResponseHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an exception handler for the client, that will be called when an error happens
   in internal netty structures.
  
   <code>io.netty.handler.codec.DecoderException</code> can be one of the cause

   @public
   @param handler {function} the exception handler 
   @return {MqttClient} current MQTT client instance
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.exceptionHandler(function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a handler that will be called when the connection with server is closed

   @public
   @param closeHandler {function} handler to call 
   @return {MqttClient} current MQTT client instance
   */
  this.closeHandler = function(closeHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttClient.closeHandler(closeHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   This method is needed by the client in order to avoid server closes the
   connection due to the keep alive timeout if client has no messages to send

   @public

   @return {MqttClient} current MQTT client instance
   */
  this.ping = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mqttClient.ping();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the client identifier
   */
  this.clientId = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttClient.clientId();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} if the connection between client and remote server is established/open
   */
  this.isConnected = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttClient.isConnected();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mqttClient;
};

MqttClient._jclass = utils.getJavaClass("io.vertx.mqtt.MqttClient");
MqttClient._jtype = {
  accept: function(obj) {
    return MqttClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MqttClient.prototype, {});
    MqttClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MqttClient._create = function(jdel) {
  var obj = Object.create(MqttClient.prototype, {});
  MqttClient.apply(obj, arguments);
  return obj;
}
/**
 Return an MQTT client instance

 @memberof module:vertx-mqtt-js/mqtt_client
 @param vertx {Vertx} Vert.x instance 
 @param options {Object} MQTT client options 
 @return {MqttClient} MQTT client instance
 */
MqttClient.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(MqttClient, JMqttClient.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(MqttClient, JMqttClient.create(__args[0]._jdel, __args[1] != null ? new MqttClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MqttClient;