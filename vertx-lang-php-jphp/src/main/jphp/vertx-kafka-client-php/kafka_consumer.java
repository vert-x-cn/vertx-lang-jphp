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
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecords;

/**
 Vert.x Kafka consumer.
 <p>
 * @class
 */
@Name("KafkaConsumer")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
public class KafkaConsumer extends BaseWrapper<KafkaConsumer>{
  ReadStream.call(this, j_val);

  /**

   @public
   @param handler {function} 
   @return {KafkaConsumer}
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_kafkaConsumer.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {KafkaConsumer}
   */
  this.handler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_kafkaConsumer.handler(handler == null ? null : function(jVal) {
      handler(utils.convReturnVertxGen(KafkaConsumerRecord, jVal, undefined, undefined));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Suspend fetching from the requested partitions.
   <p>
   Due to internal buffering of messages,
   the  will 
   continue to observe messages from the given <code>topicParations</code> 
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will not see messages 
   from the given <code>topicParations</code>.

   @public
   @param topicPartitions {Array.<Object>} topic partition from which suspend fetching 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.pause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaConsumer.pause();
      return that;
    }  else if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_kafkaConsumer.pause(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.pause(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }));
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.pause(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.pause(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Resume specified partitions which have been paused with pause.

   @public
   @param topicPartitions {Array.<Object>} topic partition from which resume fetching 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.resume = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaConsumer.resume();
      return that;
    }  else if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_kafkaConsumer.resume(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.resume(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }));
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.resume(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.resume(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param endHandler {function} 
   @return {KafkaConsumer}
   */
  this.endHandler = function(endHandler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_kafkaConsumer.endHandler(endHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Subscribe to the given list of topics to get dynamically assigned partitions.
   <p>
   Due to internal buffering of messages, when changing the subscribed topics  
   the old set of topics may remain in effect 
   (as observed by the  record handler}) 
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will only see messages 
   consistent with the new set of topics.

   @public
   @param topics {Array.<string>} topics to subscribe to 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.subscribe = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_kafkaConsumer.subscribe(__args[0]);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.subscribe(utils.convParamSetBasicOther(__args[0]));
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_kafkaConsumer.subscribe(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.subscribe(utils.convParamSetBasicOther(__args[0]), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Manually assign a list of partition to this consumer.
   <p>
   Due to internal buffering of messages, when reassigning
   the old set of partitions may remain in effect 
   (as observed by the  record handler)} 
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will only see messages 
   consistent with the new set of partitions.

   @public
   @param topicPartitions {Array.<Object>} partitions which want assigned 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.assign = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_kafkaConsumer.assign(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.assign(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }));
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.assign(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.assign(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the set of partitions currently assigned to this consumer.

   @public
   @param handler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.assignment = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.assignment(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unsubscribe from topics currently subscribed with subscribe.

   @public
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.unsubscribe = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaConsumer.unsubscribe();
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.unsubscribe(function(ar) {
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
   Get the current subscription.

   @public
   @param handler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.subscription = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.subscription(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnSet(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the set of partitions that were previously paused by a call to pause(Set).

   @public
   @param handler {function} handler called on operation completed 
   */
  this.paused = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.paused(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the handler called when topic partitions are revoked to the consumer

   @public
   @param handler {function} handler called on revoked topic partitions 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.partitionsRevokedHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.partitionsRevokedHandler(function(jVal) {
      handler(utils.convReturnListSetDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the handler called when topic partitions are assigned to the consumer

   @public
   @param handler {function} handler called on assigned topic partitions 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.partitionsAssignedHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.partitionsAssignedHandler(function(jVal) {
      handler(utils.convReturnListSetDataObject(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Overrides the fetch offsets that the consumer will use on the next poll.
   <p>
   Due to internal buffering of messages,
   the  will 
   continue to observe messages fetched with respect to the old offset  
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will only see messages 
   consistent with the new offset.

   @public
   @param topicPartition {Object} topic partition for which seek 
   @param offset {number} offset to seek inside the topic partition 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.seek = function() {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] ==='number') {
      j_kafkaConsumer.seek(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, __args[1]);
      return that;
    }  else if (__args.length === 3 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_kafkaConsumer.seek(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](null, null);
      } else {
        __args[2](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Seek to the first offset for each of the given partitions.
   <p>
   Due to internal buffering of messages,
   the  will 
   continue to observe messages fetched with respect to the old offset  
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will only see messages 
   consistent with the new offset.

   @public
   @param topicPartitions {Array.<Object>} topic partition for which seek 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.seekToBeginning = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_kafkaConsumer.seekToBeginning(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.seekToBeginning(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }));
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.seekToBeginning(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.seekToBeginning(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Seek to the last offset for each of the given partitions.
   <p>
   Due to internal buffering of messages,
   the  will 
   continue to observe messages fetched with respect to the old offset  
   until some time <em>after</em> the given <code>completionHandler</code> 
   is called. In contrast, the once the given <code>completionHandler</code> 
   is called the {@link KafkaConsumer#batchHandler} will only see messages 
   consistent with the new offset.

   @public
   @param topicPartitions {Array.<Object>} topic partition for which seek 
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.seekToEnd = function() {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_kafkaConsumer.seekToEnd(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null);
      return that;
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      j_kafkaConsumer.seekToEnd(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }));
      return that;
    }  else if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.seekToEnd(__args[0] != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(__args[0]))) : null, function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_kafkaConsumer.seekToEnd(utils.convParamSetDataObject(__args[0], function(json) { return new TopicPartition(json); }), function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Commit current offsets for all the subscribed list of topics and partition.

   @public
   @param completionHandler {function} handler called on operation completed 
   */
  this.commit = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaConsumer.commit();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.commit(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the last committed offset for the given partition (whether the commit happened by this process or another).

   @public
   @param topicPartition {Object} topic partition for getting last committed offset 
   @param handler {function} handler called on operation completed 
   */
  this.committed = function(topicPartition, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.committed(topicPartition != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(topicPartition))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get metadata about the partitions for a given topic.

   @public
   @param topic {string} topic partition for which getting partitions info 
   @param handler {function} handler called on operation completed 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.partitionsFor = function(topic, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_kafkaConsumer.partitionsFor(topic, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the handler to be used when batches of messages are fetched
   from the Kafka server. Batch handlers need to take care not to block
   the event loop when dealing with large batches. It is better to process
   records individually using the [#handler(Handler) record handler] {@link KafkaConsumer}.

   @public
   @param handler {function} handler called when batches of messages are fetched 
   @return {KafkaConsumer} current KafkaConsumer instance
   */
  this.batchHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.batchHandler(function(jVal) {
      handler(utils.convReturnVertxGen(KafkaConsumerRecords, jVal, undefined, undefined));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the consumer

   @public
   @param completionHandler {function} handler called on operation completed 
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaConsumer.close();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaConsumer.close(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the offset of the next record that will be fetched (if a record with that offset exists).

   @public
   @param partition {Object} The partition to get the position for 
   @param handler {function} handler called on operation completed 
   */
  this.position = function(partition, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.position(partition != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(partition))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Look up the offset for the given partition by timestamp. Note: the result might be null in case
   for the given timestamp no offset can be found -- e.g., when the timestamp refers to the future

   @public
   @param topicPartition {Object} TopicPartition to query. 
   @param timestamp {number} Timestamp to be used in the query. 
   @param handler {function} handler called on operation completed 
   */
  this.offsetsForTimes = function(topicPartition, timestamp, handler) {
    var __args = arguments;
    if (__args.length === 3 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_kafkaConsumer.offsetsForTimes(topicPartition != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(topicPartition))) : null, utils.convParamLong(timestamp), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the first offset for the given partitions.

   @public
   @param topicPartition {Object} the partition to get the earliest offset. 
   @param handler {function} handler called on operation completed. Returns the earliest available offset for the given partition 
   */
  this.beginningOffsets = function(topicPartition, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.beginningOffsets(topicPartition != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(topicPartition))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the last offset for the given partition. The last offset of a partition is the offset
   of the upcoming message, i.e. the offset of the last available message + 1.

   @public
   @param topicPartition {Object} the partition to get the end offset. 
   @param handler {function} handler called on operation completed. The end offset for the given partition. 
   */
  this.endOffsets = function(topicPartition, handler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_kafkaConsumer.endOffsets(topicPartition != null ? new TopicPartition(new JsonObject(Java.asJSONCompatible(topicPartition))) : null, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnLong(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets the poll timeout (in ms) for the underlying native Kafka Consumer. Defaults to 1000.
   Setting timeout to a lower value results in a more 'responsive' client, because it will block for a shorter period
   if no data is available in the assigned partition and therefore allows subsequent actions to be executed with a shorter
   delay. At the same time, the client will poll more frequently and thus will potentially create a higher load on the Kafka Broker.

   @public
   @param timeout {number} The time, in milliseconds, spent waiting in poll if data is not available in the buffer. If 0, returns immediately with any records that are available currently in the native Kafka consumer's buffer, else returns empty. Must not be negative. 
   @return {KafkaConsumer}
   */
  this.pollTimeout = function(timeout) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(KafkaConsumer, j_kafkaConsumer.pollTimeout(timeout), undefined, undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_kafkaConsumer;
};

KafkaConsumer._jclass = utils.getJavaClass("io.vertx.kafka.client.consumer.KafkaConsumer");
KafkaConsumer._jtype = {
  accept: function(obj) {
    return KafkaConsumer._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KafkaConsumer.prototype, {});
    KafkaConsumer.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KafkaConsumer._create = function(jdel) {
  var obj = Object.create(KafkaConsumer.prototype, {});
  KafkaConsumer.apply(obj, arguments);
  return obj;
}
/**
 Create a new KafkaConsumer instance

 @memberof module:vertx-kafka-client-js/kafka_consumer
 @param vertx {Vertx} Vert.x instance to use 
 @param config {Array.<string>} Kafka consumer configuration 
 @param keyType {todo} class type for the key deserialization 
 @param valueType {todo} class type for the value deserialization 
 @return {KafkaConsumer} an instance of the KafkaConsumer
 */
KafkaConsumer.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(KafkaConsumer, JKafkaConsumer.create(__args[0]._jdel, __args[1]), undefined, undefined);
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function' && typeof __args[3] === 'function') {
    return utils.convReturnVertxGen(KafkaConsumer, JKafkaConsumer.create(__args[0]._jdel, __args[1], utils.get_jclass(__args[2]), utils.get_jclass(__args[3])), utils.get_jtype(__args[2]), utils.get_jtype(__args[3]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = KafkaConsumer;