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
import io.vertx.php.mqtt.messages.MqttUnsubscribeMessage;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.mqtt.messages.MqttSubscribeMessage;
import io.vertx.php.mqtt.messages.MqttPublishMessage;
import io.vertx.php.core.net.SocketAddress;

/**
 Represents an MQTT endpoint for point-to-point communication with the remote MQTT client

 * @class
 */
@Name("MqttEndpoint")
@Namespace("io\\vertx\\php\\mqtt")
public class MqttEndpoint extends BaseWrapper<MqttEndpoint>{

  /**
   Close the endpoint, so the connection with remote MQTT client

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mqttEndpoint.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {SocketAddress} the remote address for this socket
   */
  this.remoteAddress = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedremoteAddress == null) {
        that.cachedremoteAddress = utils.convReturnVertxGen(SocketAddress, j_mqttEndpoint.remoteAddress());
      }
      return that.cachedremoteAddress;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {SocketAddress} the local address for this socket
   */
  this.localAddress = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedlocalAddress == null) {
        that.cachedlocalAddress = utils.convReturnVertxGen(SocketAddress, j_mqttEndpoint.localAddress());
      }
      return that.cachedlocalAddress;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the client identifier as provided by the remote MQTT client
   */
  this.clientIdentifier = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedclientIdentifier == null) {
        that.cachedclientIdentifier = j_mqttEndpoint.clientIdentifier();
      }
      return that.cachedclientIdentifier;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the Authentication information as provided by the remote MQTT client
   */
  this.auth = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedauth == null) {
        that.cachedauth = utils.convReturnDataObject(j_mqttEndpoint.auth());
      }
      return that.cachedauth;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the Will information as provided by the remote MQTT client
   */
  this.will = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedwill == null) {
        that.cachedwill = utils.convReturnDataObject(j_mqttEndpoint.will());
      }
      return that.cachedwill;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the protocol version required by the remote MQTT client
   */
  this.protocolVersion = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedprotocolVersion == null) {
        that.cachedprotocolVersion = j_mqttEndpoint.protocolVersion();
      }
      return that.cachedprotocolVersion;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {string} the protocol name provided by the remote MQTT client
   */
  this.protocolName = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedprotocolName == null) {
        that.cachedprotocolName = j_mqttEndpoint.protocolName();
      }
      return that.cachedprotocolName;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when clean session is requested by the remote MQTT client
   */
  this.isCleanSession = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedisCleanSession == null) {
        that.cachedisCleanSession = j_mqttEndpoint.isCleanSession();
      }
      return that.cachedisCleanSession;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the keep alive timeout (in seconds) specified by the remote MQTT client
   */
  this.keepAliveTimeSeconds = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedkeepAliveTimeSeconds == null) {
        that.cachedkeepAliveTimeSeconds = j_mqttEndpoint.keepAliveTimeSeconds();
      }
      return that.cachedkeepAliveTimeSeconds;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the message identifier used for last published message
   */
  this.lastMessageId = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedlastMessageId == null) {
        that.cachedlastMessageId = j_mqttEndpoint.lastMessageId();
      }
      return that.cachedlastMessageId;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Enable/disable subscription/unsubscription requests auto acknowledge

   @public
   @param isSubscriptionAutoAck {boolean} auto acknowledge status 
   */
  this.subscriptionAutoAck = function(isSubscriptionAutoAck) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_mqttEndpoint.subscriptionAutoAck(isSubscriptionAutoAck);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} true when auto acknowledge status for subscription/unsubscription requests
   */
  this.isSubscriptionAutoAck = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttEndpoint.isSubscriptionAutoAck();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Enable/disable publishing (in/out) auto acknowledge

   @public
   @param isPublishAutoAck {boolean} auto acknowledge status 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishAutoAck = function(isPublishAutoAck) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_mqttEndpoint.publishAutoAck(isPublishAutoAck);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} auto acknowledge status for publishing (in/out)
   */
  this.isPublishAutoAck = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttEndpoint.isPublishAutoAck();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Enable/disable auto keep alive (sending ping response)

   @public
   @param isAutoKeepAlive {boolean} auto keep alive 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.autoKeepAlive = function(isAutoKeepAlive) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_mqttEndpoint.autoKeepAlive(isAutoKeepAlive);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} the auto keep alive status (sending ping response)
   */
  this.isAutoKeepAlive = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttEndpoint.isAutoKeepAlive();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} if the connection between remote client and local endpoint is established/open
   */
  this.isConnected = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_mqttEndpoint.isConnected();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set client identifier if not provided by the remote MQTT client (zero-bytes)

   @public
   @param clientIdentifier {string} the client identifier 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.setClientIdentifier = function(clientIdentifier) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mqttEndpoint.setClientIdentifier(clientIdentifier);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a disconnect handler on the MQTT endpoint. This handler is called when a DISCONNECT
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.disconnectHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.disconnectHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a subscribe handler on the MQTT endpoint. This handler is called when a SUBSCRIBE
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.subscribeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.subscribeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(MqttSubscribeMessage, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a unsubscribe handler on the MQTT endpoint. This handler is called when a UNSUBSCRIBE
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.unsubscribeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.unsubscribeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(MqttUnsubscribeMessage, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the publish handler on the MQTT endpoint. This handler is called when a PUBLISH
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.publishHandler(function(jVal) {
      handler(utils.convReturnVertxGen(MqttPublishMessage, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the puback handler on the MQTT endpoint. This handler is called when a PUBACK
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishAcknowledgeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.publishAcknowledgeHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the pubrec handler on the MQTT endpoint. This handler is called when a PUBREC
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishReceivedHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.publishReceivedHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the pubrel handler on the MQTT endpoint. This handler is called when a PUBREL
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishReleaseHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.publishReleaseHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the pubcomp handler on the MQTT endpoint. This handler is called when a PUBCOMP
   message is received by the remote MQTT client

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishCompletionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.publishCompletionHandler(function(jVal) {
      handler(jVal);
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the pingreq handler on the MQTT endpoint. This handler is called when a PINGREQ
   message is received by the remote MQTT client. In any case the endpoint sends the
   PINGRESP internally after executing this handler.

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.pingHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.pingHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set a close handler. This will be called when the MQTT endpoint is closed

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.closeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.closeHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set an exception handler. This will be called when an error at protocol level happens

   @public
   @param handler {function} the handler 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_mqttEndpoint.exceptionHandler(function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the CONNACK message to the remote MQTT client with "connection accepted"
   return code. See {@link MqttEndpoint#reject} for refusing connection

   @public
   @param sessionPresent {boolean} if a previous session is present 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.accept = function(sessionPresent) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='boolean') {
      j_mqttEndpoint.accept(sessionPresent);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the CONNACK message to the remote MQTT client rejecting the connection
   request with specified return code. See {@link MqttEndpoint#accept} for accepting connection

   @public
   @param returnCode {Object} the connect return code 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.reject = function(returnCode) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_mqttEndpoint.reject(io.netty.handler.codec.mqtt.MqttConnectReturnCode.valueOf(returnCode));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the SUBACK message to the remote MQTT client

   @public
   @param subscribeMessageId {number} identifier of the SUBSCRIBE message to acknowledge 
   @param grantedQoSLevels {Array.<Object>} granted QoS levels for the requested topics 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.subscribeAcknowledge = function(subscribeMessageId, grantedQoSLevels) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'object' && __args[1] instanceof Array) {
      j_mqttEndpoint.subscribeAcknowledge(subscribeMessageId, utils.convParamListEnum(grantedQoSLevels, function(val) { return Packages.io.netty.handler.codec.mqtt.MqttQoS.valueOf(val); }));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the UNSUBACK message to the remote MQTT client

   @public
   @param unsubscribeMessageId {number} identifier of the UNSUBSCRIBE message to acknowledge 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.unsubscribeAcknowledge = function(unsubscribeMessageId) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_mqttEndpoint.unsubscribeAcknowledge(unsubscribeMessageId);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the PUBACK message to the remote MQTT client

   @public
   @param publishMessageId {number} identifier of the PUBLISH message to acknowledge 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishAcknowledge = function(publishMessageId) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_mqttEndpoint.publishAcknowledge(publishMessageId);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the PUBREC message to the remote MQTT client

   @public
   @param publishMessageId {number} identifier of the PUBLISH message to acknowledge 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishReceived = function(publishMessageId) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_mqttEndpoint.publishReceived(publishMessageId);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the PUBREL message to the remote MQTT client

   @public
   @param publishMessageId {number} identifier of the PUBLISH message to acknowledge 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishRelease = function(publishMessageId) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_mqttEndpoint.publishRelease(publishMessageId);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sends the PUBCOMP message to the remote MQTT client

   @public
   @param publishMessageId {number} identifier of the PUBLISH message to acknowledge 
   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.publishComplete = function(publishMessageId) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_mqttEndpoint.publishComplete(publishMessageId);
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
   @param publishSentHandler {function} handler called after PUBLISH packet sent with a packetId 
   @return {MqttEndpoint} current MQTT client instance
   */
  this.publish = function() {
    var __args = arguments;
    if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'string' && typeof __args[3] ==='boolean' && typeof __args[4] ==='boolean') {
      j_mqttEndpoint.publish(__args[0], __args[1]._jdel, io.netty.handler.codec.mqtt.MqttQoS.valueOf(__args[2]), __args[3], __args[4]);
      return that;
    }  else if (__args.length === 6 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'string' && typeof __args[3] ==='boolean' && typeof __args[4] ==='boolean' && typeof __args[5] === 'function') {
      j_mqttEndpoint.publish(__args[0], __args[1]._jdel, io.netty.handler.codec.mqtt.MqttQoS.valueOf(__args[2]), __args[3], __args[4], function(ar) {
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
   Sends the PINGRESP message to the remote MQTT client

   @public

   @return {MqttEndpoint} a reference to this, so the API can be used fluently
   */
  this.pong = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_mqttEndpoint.pong();
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mqttEndpoint;
};

MqttEndpoint._jclass = utils.getJavaClass("io.vertx.mqtt.MqttEndpoint");
MqttEndpoint._jtype = {
  accept: function(obj) {
    return MqttEndpoint._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MqttEndpoint.prototype, {});
    MqttEndpoint.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MqttEndpoint._create = function(jdel) {
  var obj = Object.create(MqttEndpoint.prototype, {});
  MqttEndpoint.apply(obj, arguments);
  return obj;
}
module.exports = MqttEndpoint;