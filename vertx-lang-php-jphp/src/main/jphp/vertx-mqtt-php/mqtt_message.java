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
 Represent the interface for each MQTT message

 * @class
 */
@Name("MqttMessage")
@Namespace("io\\vertx\\php\\mqtt\\messages")
public class MqttMessage extends BaseWrapper<MqttMessage>{

  /**

   @public

   @return {number} Message identifier
   */
  this.messageId = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedmessageId == null) {
        that.cachedmessageId = j_mqttMessage.messageId();
      }
      return that.cachedmessageId;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_mqttMessage;
};

MqttMessage._jclass = utils.getJavaClass("io.vertx.mqtt.messages.MqttMessage");
MqttMessage._jtype = {
  accept: function(obj) {
    return MqttMessage._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(MqttMessage.prototype, {});
    MqttMessage.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
MqttMessage._create = function(jdel) {
  var obj = Object.create(MqttMessage.prototype, {});
  MqttMessage.apply(obj, arguments);
  return obj;
}
module.exports = MqttMessage;