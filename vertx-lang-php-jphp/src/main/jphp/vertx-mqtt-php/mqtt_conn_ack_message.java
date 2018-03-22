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

package io.vertx.php.mqtt.messages;
import io.vertx.lang.php.util.Wrapper;

/**
 Represents an MQTT CONNACK message

 * @class
 */
@Name("MqttConnAckMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public class MqttConnAckMessage extends BaseWrapper<MqttConnAckMessage>{

  /**

   @public

   @return {Object} return code from the connection request
   */
  this.code = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedcode == null) {
        that.cachedcode = utils.convReturnEnum(j_mqttConnAckMessage.code());
      }
      return that.cachedcode;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} is an old session is present
   */
  this.isSessionPresent = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedisSessionPresent == null) {
        that.cachedisSessionPresent = j_mqttConnAckMessage.isSessionPresent();
      }
      return that.cachedisSessionPresent;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mqttConnAckMessage;
};

MqttConnAckMessage._jclass = utils.getJavaClass("io.vertx.mqtt.messages.MqttConnAckMessage");
MqttConnAckMessage._jtype = {
  accept: function(obj) {
    return MqttConnAckMessage._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MqttConnAckMessage.prototype, {});
    MqttConnAckMessage.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MqttConnAckMessage._create = function(jdel) {
  var obj = Object.create(MqttConnAckMessage.prototype, {});
  MqttConnAckMessage.apply(obj, arguments);
  return obj;
}
/**
 Create a concrete instance of a Vert.x connack message

 @memberof module:vertx-mqtt-js/mqtt_conn_ack_message
 @param code {Object} return code from the connection request 
 @param isSessionPresent {boolean} is an old session is present 
 @return {MqttConnAckMessage} 
 */
MqttConnAckMessage.create = function(code, isSessionPresent) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean') {
    return utils.convReturnVertxGen(MqttConnAckMessage, JMqttConnAckMessage.create(io.netty.handler.codec.mqtt.MqttConnectReturnCode.valueOf(code), isSessionPresent));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = MqttConnAckMessage;