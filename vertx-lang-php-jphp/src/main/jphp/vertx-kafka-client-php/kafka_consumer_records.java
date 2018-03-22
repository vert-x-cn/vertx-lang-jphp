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

package io.vertx.php.kafka.client.consumer;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecord;

/**
 Vert.x Kafka consumer records

 * @class
 */
@Name("KafkaConsumerRecords")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
public class KafkaConsumerRecords extends BaseWrapper<KafkaConsumerRecords>{

  /**

   @public

   @return {number} the total number of records in this batch
   */
  this.size = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_kafkaConsumerRecords.size();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean} whether this batch contains any records
   */
  this.isEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_kafkaConsumerRecords.isEmpty();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the record at the given index

   @public
   @param index {number} the index of the record to get 
   @return {KafkaConsumerRecord}
   */
  this.recordAt = function(index) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(KafkaConsumerRecord, j_kafkaConsumerRecords.recordAt(index), undefined, undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_kafkaConsumerRecords;
};

KafkaConsumerRecords._jclass = utils.getJavaClass("io.vertx.kafka.client.consumer.KafkaConsumerRecords");
KafkaConsumerRecords._jtype = {
  accept: function(obj) {
    return KafkaConsumerRecords._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KafkaConsumerRecords.prototype, {});
    KafkaConsumerRecords.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KafkaConsumerRecords._create = function(jdel) {
  var obj = Object.create(KafkaConsumerRecords.prototype, {});
  KafkaConsumerRecords.apply(obj, arguments);
  return obj;
}
module.exports = KafkaConsumerRecords;