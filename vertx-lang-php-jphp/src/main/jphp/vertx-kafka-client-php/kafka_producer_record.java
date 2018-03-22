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

package io.vertx.php.kafka.client.producer;
import io.vertx.lang.php.util.Wrapper;

/**
 Vert.x Kafka producer record.

 * @class
 */
@Name("KafkaProducerRecord")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
public class KafkaProducerRecord extends BaseWrapper<KafkaProducerRecord>{

  /**

   @public

   @return {string} the topic this record is being sent to
   */
  this.topic = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_kafkaProducerRecord.topic();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the key (or null if no key is specified)
   */
  this.key = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_K.wrap(j_kafkaProducerRecord.key());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Object} the value
   */
  this.value = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_V.wrap(j_kafkaProducerRecord.value());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the timestamp of this record
   */
  this.timestamp = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnLong(j_kafkaProducerRecord.timestamp());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the partition to which the record will be sent (or null if no partition was specified)
   */
  this.partition = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_kafkaProducerRecord.partition();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_kafkaProducerRecord;
};

KafkaProducerRecord._jclass = utils.getJavaClass("io.vertx.kafka.client.producer.KafkaProducerRecord");
KafkaProducerRecord._jtype = {
  accept: function(obj) {
    return KafkaProducerRecord._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KafkaProducerRecord.prototype, {});
    KafkaProducerRecord.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KafkaProducerRecord._create = function(jdel) {
  var obj = Object.create(KafkaProducerRecord.prototype, {});
  KafkaProducerRecord.apply(obj, arguments);
  return obj;
}
/**
 Create a concrete instance of a Vert.x producer record

 @memberof module:vertx-kafka-client-js/kafka_producer_record
 @param topic {string} the topic this record is being sent to 
 @param key {Object} the key (or null if no key is specified) 
 @param value {Object} the value 
 @param timestamp {number} the timestamp of this record 
 @param partition {number} the partition to which the record will be sent (or null if no partition was specified) 
 @return {KafkaProducerRecord} Vert.x producer record
 */
KafkaProducerRecord.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] !== 'function') {
    return utils.convReturnVertxGen(KafkaProducerRecord, JKafkaProducerRecord.create(__args[0], utils.convParamTypeUnknown(__args[1])), undefined, undefined);
  }else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] !== 'function') {
    return utils.convReturnVertxGen(KafkaProducerRecord, JKafkaProducerRecord.create(__args[0], utils.convParamTypeUnknown(__args[1]), utils.convParamTypeUnknown(__args[2])), undefined, undefined);
  }else if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] !== 'function' && typeof __args[2] !== 'function' && typeof __args[3] ==='number' && typeof __args[4] ==='number') {
    return utils.convReturnVertxGen(KafkaProducerRecord, JKafkaProducerRecord.create(__args[0], utils.convParamTypeUnknown(__args[1]), utils.convParamTypeUnknown(__args[2]), utils.convParamLong(__args[3]), utils.convParamInteger(__args[4])), undefined, undefined);
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = KafkaProducerRecord;