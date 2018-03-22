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

package io.vertx.php.kafka.admin;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**
 Provides a wrapper around important methods in Kafka's AdminUtils, namely
 * @class
 */
@Name("AdminUtils")
@Namespace("io\\vertx\\php\\kafka\\admin")
public class AdminUtils extends BaseWrapper<AdminUtils>{

  /**
   Creates a new Kafka topic on all Brokers managed by the given Zookeeper instance(s). In contrast
   to @see {@link AdminUtils#createTopic}, one can pass in additional configuration
   parameters as a map (String -> String).

   @public
   @param topicName {string} Name of the to-be-created topic 
   @param partitionCount {number} Number of partitions 
   @param replicationFactor {number} Number of replicates. Must be lower or equal to the number of available Brokers 
   @param topicConfig {Array.<string>} map with additional topic configuration parameters 
   @param completionHandler {function} vert.x callback 
   */
  this.createTopic = function() {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && typeof __args[3] === 'function') {
      j_adminUtils.createTopic(__args[0], __args[1], __args[2], function(ar) {
      if (ar.succeeded()) {
        __args[3](null, null);
      } else {
        __args[3](null, ar.cause());
      }
    });
    }  else if (__args.length === 5 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] ==='number' && (typeof __args[3] === 'object' && __args[3] != null) && typeof __args[4] === 'function') {
      j_adminUtils.createTopic(__args[0], __args[1], __args[2], __args[3], function(ar) {
      if (ar.succeeded()) {
        __args[4](null, null);
      } else {
        __args[4](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete the Kafka topic given by the topicName.

   @public
   @param topicName {string} Name of the topic to be deleted 
   @param completionHandler {function} vert.x callback 
   */
  this.deleteTopic = function(topicName, completionHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_adminUtils.deleteTopic(topicName, function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Checks if the Kafka topic given by topicName does exist.

   @public
   @param topicName {string} Name of the topic 
   @param completionHandler {function} vert.x callback 
   */
  this.topicExists = function(topicName, completionHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_adminUtils.topicExists(topicName, function(ar) {
      if (ar.succeeded()) {
        completionHandler(ar.result(), null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Updates the configuration of the topic given by topicName. Configuration parameters
   are passed in as a Map (Key -> Value) of Strings.

   @public
   @param topicName {string} topic to be configured 
   @param topicConfig {Array.<string>} Map with configuration items 
   @param completionHandler {function} vert.x callback 
   */
  this.changeTopicConfig = function(topicName, topicConfig, completionHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_adminUtils.changeTopicConfig(topicName, topicConfig, function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Closes the underlying connection to Zookeeper. It is required to call the method for cleanup
   purposes if AdminUtils was not created with autoClose set to true.

   @public
   @param completionHandler {function} vert.x callback 
   */
  this.close = function(completionHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_adminUtils.close(function(ar) {
      if (ar.succeeded()) {
        completionHandler(null, null);
      } else {
        completionHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_adminUtils;
};

AdminUtils._jclass = utils.getJavaClass("io.vertx.kafka.admin.AdminUtils");
AdminUtils._jtype = {
  accept: function(obj) {
    return AdminUtils._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(AdminUtils.prototype, {});
    AdminUtils.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AdminUtils._create = function(jdel) {
  var obj = Object.create(AdminUtils.prototype, {});
  AdminUtils.apply(obj, arguments);
  return obj;
}
/**
 Create a new AdminUtils instance

 @memberof module:vertx-kafka-client-js/admin_utils
 @param vertx {Vertx} Vert.x instance to use 
 @param zookeeperHosts {string} comma-separated list of Zookeeper server, e.g. localhost:2181,localhost:2182 
 @param connectionTimeoutMs {number} Maximum time in ms to wait for the client to connect to Zookeeper 
 @param isSecure {boolean} If set to true, ZkUtils will perform security checks, i.e. ACL checks 
 @param autoClose {boolean} If set to true, the client will auto-close the connection after a command 
 @return {AdminUtils} an instance of the AdminUtilWrapper
 */
AdminUtils.create = function() {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(AdminUtils, JAdminUtils.create(__args[0]._jdel, __args[1]));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] ==='boolean') {
    return utils.convReturnVertxGen(AdminUtils, JAdminUtils.create(__args[0]._jdel, __args[1], __args[2]));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] ==='number' && typeof __args[3] ==='boolean' && typeof __args[4] ==='boolean') {
    return utils.convReturnVertxGen(AdminUtils, JAdminUtils.create(__args[0]._jdel, __args[1], __args[2], __args[3], __args[4]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = AdminUtils;