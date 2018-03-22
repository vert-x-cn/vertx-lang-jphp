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
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.Vertx;
import io.vertx.php.kafka.client.producer.KafkaProducerRecord;

/**
 Vert.x Kafka producer.
 <p>
 * @class
 */
@Name("KafkaProducer")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
public class KafkaProducer extends BaseWrapper<KafkaProducer>{
  WriteStream.call(this, j_val);

  /**

   @public
   @param handler {function} 
   @return {KafkaProducer}
   */
  this.exceptionHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_kafkaProducer.exceptionHandler(handler == null ? null : function(jVal) {
      handler(utils.convReturnThrowable(jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Asynchronously write a record to a topic

   @public
   @param record {KafkaProducerRecord} record to write 
   @param handler {function} handler called on operation completed 
   @return {KafkaProducer} current KafkaWriteStream instance
   */
  this.write = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_kafkaProducer.write(__args[0]._jdel);
      return that;
    }  else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_kafkaProducer.write(__args[0]._jdel, function(ar) {
      if (ar.succeeded()) {
        __args[1](utils.convReturnDataObject(ar.result()), null);
      } else {
        __args[1](null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param kafkaProducerRecord {KafkaProducerRecord} 
   */
  this.end = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaProducer.end();
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_kafkaProducer.end(__args[0]._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param i {number} 
   @return {KafkaProducer}
   */
  this.setWriteQueueMaxSize = function(i) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_kafkaProducer.setWriteQueueMaxSize(i);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {boolean}
   */
  this.writeQueueFull = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_kafkaProducer.writeQueueFull();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {KafkaProducer}
   */
  this.drainHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'function' || __args[0] == null)) {
      j_kafkaProducer.drainHandler(handler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the partition metadata for the give topic.

   @public
   @param topic {string} topic partition for which getting partitions info 
   @param handler {function} handler called on operation completed 
   @return {KafkaProducer} current KafkaProducer instance
   */
  this.partitionsFor = function(topic, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_kafkaProducer.partitionsFor(topic, function(ar) {
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
   Invoking this method makes all buffered records immediately available to write

   @public
   @param completionHandler {function} handler called on operation completed 
   @return {KafkaProducer} current KafkaProducer instance
   */
  this.flush = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaProducer.flush(completionHandler);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the producer

   @public
   @param timeout {number} timeout to wait for closing 
   @param completionHandler {function} handler called on operation completed 
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_kafkaProducer.close();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_kafkaProducer.close(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] === 'function') {
      j_kafkaProducer.close(__args[0], function(ar) {
      if (ar.succeeded()) {
        __args[1](null, null);
      } else {
        __args[1](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_kafkaProducer;
};

KafkaProducer._jclass = utils.getJavaClass("io.vertx.kafka.client.producer.KafkaProducer");
KafkaProducer._jtype = {
  accept: function(obj) {
    return KafkaProducer._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(KafkaProducer.prototype, {});
    KafkaProducer.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
KafkaProducer._create = function(jdel) {
  var obj = Object.create(KafkaProducer.prototype, {});
  KafkaProducer.apply(obj, arguments);
  return obj;
}
/**
 Get or create a KafkaProducer instance which shares its stream with any other KafkaProducer created with the same <code>name</code>

 @memberof module:vertx-kafka-client-js/kafka_producer
 @param vertx {Vertx} Vert.x instance to use 
 @param name {string} the producer name to identify it 
 @param config {Array.<string>} Kafka producer configuration 
 @param keyType {todo} class type for the key serialization 
 @param valueType {todo} class type for the value serialization 
 @return {KafkaProducer} an instance of the KafkaProducer
 */
KafkaProducer.createShared = function() {
  var __args = arguments;
  if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null)) {
    return utils.convReturnVertxGen(KafkaProducer, JKafkaProducer.createShared(__args[0]._jdel, __args[1], __args[2]), undefined, undefined);
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function' && typeof __args[4] === 'function') {
    return utils.convReturnVertxGen(KafkaProducer, JKafkaProducer.createShared(__args[0]._jdel, __args[1], __args[2], utils.get_jclass(__args[3]), utils.get_jclass(__args[4])), utils.get_jtype(__args[3]), utils.get_jtype(__args[4]));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Create a new KafkaProducer instance

 @memberof module:vertx-kafka-client-js/kafka_producer
 @param vertx {Vertx} Vert.x instance to use 
 @param config {Array.<string>} Kafka producer configuration 
 @param keyType {todo} class type for the key serialization 
 @param valueType {todo} class type for the value serialization 
 @return {KafkaProducer} an instance of the KafkaProducer
 */
KafkaProducer.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(KafkaProducer, JKafkaProducer.create(__args[0]._jdel, __args[1]), undefined, undefined);
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function' && typeof __args[3] === 'function') {
    return utils.convReturnVertxGen(KafkaProducer, JKafkaProducer.create(__args[0]._jdel, __args[1], utils.get_jclass(__args[2]), utils.get_jclass(__args[3])), utils.get_jtype(__args[2]), utils.get_jtype(__args[3]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = KafkaProducer;