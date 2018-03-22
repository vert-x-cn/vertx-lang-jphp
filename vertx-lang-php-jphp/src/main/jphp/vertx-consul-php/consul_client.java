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

package io.vertx.php.ext.consul;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;

/**
 A Vert.x service used to interact with Consul.

 * @class
 */
@Name("ConsulClient")
@Namespace("io\\vertx\\php\\ext\\consul")
public class ConsulClient extends BaseWrapper<ConsulClient>{

  /**
   Returns the configuration and member information of the local agent

   @public
   @param resultHandler {function} will be provided with the configuration and member information of the local agent 
   @return {ConsulClient} reference to this, for fluency
   */
  this.agentInfo = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.agentInfo(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnJson(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the LAN network coordinates for all nodes in a given DC

   @public
   @param resultHandler {function} will be provided with network coordinates of nodes in datacenter 
   @return {ConsulClient} reference to this, for fluency
   */
  this.coordinateNodes = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.coordinateNodes(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the LAN network coordinates for all nodes in a given DC
   This is blocking query unlike {@link ConsulClient#coordinateNodes}

   @public
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with network coordinates of nodes in datacenter 
   @return {ConsulClient} reference to this, for fluency
   */
  this.coordinateNodesWithOptions = function(options, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.coordinateNodesWithOptions(options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the WAN network coordinates for all Consul servers, organized by DCs

   @public
   @param resultHandler {function} will be provided with network coordinates for all Consul servers 
   @return {ConsulClient} reference to this, for fluency
   */
  this.coordinateDatacenters = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.coordinateDatacenters(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the list of keys that corresponding to the specified key prefix.

   @public
   @param keyPrefix {string} the prefix 
   @param resultHandler {function} will be provided with keys list 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getKeys = function(keyPrefix, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.getKeys(keyPrefix, function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the list of keys that corresponding to the specified key prefix.

   @public
   @param keyPrefix {string} the prefix 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with keys list 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getKeysWithOptions = function(keyPrefix, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.getKeysWithOptions(keyPrefix, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns key/value pair that corresponding to the specified key.
   An empty <a href="../../dataobjects.html#KeyValue">KeyValue</a> object will be returned if no such key is found.

   @public
   @param key {string} the key 
   @param resultHandler {function} will be provided with key/value pair 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getValue = function(key, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.getValue(key, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns key/value pair that corresponding to the specified key.
   An empty <a href="../../dataobjects.html#KeyValue">KeyValue</a> object will be returned if no such key is found.
   This is blocking query unlike {@link ConsulClient#getValue}

   @public
   @param key {string} the key 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with key/value pair 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getValueWithOptions = function(key, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.getValueWithOptions(key, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove the key/value pair that corresponding to the specified key

   @public
   @param key {string} the key 
   @param resultHandler {function} will be called on complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.deleteValue = function(key, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.deleteValue(key, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the list of key/value pairs that corresponding to the specified key prefix.
   An empty <a href="../../dataobjects.html#KeyValueList">KeyValueList</a> object will be returned if no such key prefix is found.

   @public
   @param keyPrefix {string} the prefix 
   @param resultHandler {function} will be provided with list of key/value pairs 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getValues = function(keyPrefix, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.getValues(keyPrefix, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the list of key/value pairs that corresponding to the specified key prefix.
   An empty <a href="../../dataobjects.html#KeyValueList">KeyValueList</a> object will be returned if no such key prefix is found.
   This is blocking query unlike {@link ConsulClient#getValues}

   @public
   @param keyPrefix {string} the prefix 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of key/value pairs 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getValuesWithOptions = function(keyPrefix, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.getValuesWithOptions(keyPrefix, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Removes all the key/value pair that corresponding to the specified key prefix

   @public
   @param keyPrefix {string} the prefix 
   @param resultHandler {function} will be called on complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.deleteValues = function(keyPrefix, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.deleteValues(keyPrefix, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Adds specified key/value pair

   @public
   @param key {string} the key 
   @param value {string} the value 
   @param resultHandler {function} will be provided with success of operation 
   @return {ConsulClient} reference to this, for fluency
   */
  this.putValue = function(key, value, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_consulClient.putValue(key, value, function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param key {string} the key 
   @param value {string} the value 
   @param options {Object} options used to push pair 
   @param resultHandler {function} will be provided with success of operation 
   @return {ConsulClient} reference to this, for fluency
   */
  this.putValueWithOptions = function(key, value, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_consulClient.putValueWithOptions(key, value, options != null ? new KeyValueOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Manages multiple operations inside a single, atomic transaction.

   @public
   @param request {Object} transaction request 
   @param resultHandler {function} will be provided with result of transaction 
   @return {ConsulClient} reference to this, for fluency
   */
  this.transaction = function(request, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.transaction(request != null ? new TxnRequest(new JsonObject(Java.asJSONCompatible(request))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create new Acl token

   @public
   @param token {Object} properties of the token 
   @param idHandler {function} will be provided with ID of created token 
   @return {ConsulClient} reference to this, for fluency
   */
  this.createAclToken = function(token, idHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.createAclToken(token != null ? new AclToken(new JsonObject(Java.asJSONCompatible(token))) : null, function(ar) {
      if (ar.succeeded()) {
        idHandler(ar.result(), null);
      } else {
        idHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Update Acl token

   @public
   @param token {Object} properties of the token to be updated 
   @param idHandler {function} will be provided with ID of updated 
   @return {ConsulClient} reference to this, for fluency
   */
  this.updateAclToken = function(token, idHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.updateAclToken(token != null ? new AclToken(new JsonObject(Java.asJSONCompatible(token))) : null, function(ar) {
      if (ar.succeeded()) {
        idHandler(ar.result(), null);
      } else {
        idHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Clone Acl token

   @public
   @param id {string} the ID of token to be cloned 
   @param idHandler {function} will be provided with ID of cloned token 
   @return {ConsulClient} reference to this, for fluency
   */
  this.cloneAclToken = function(id, idHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.cloneAclToken(id, function(ar) {
      if (ar.succeeded()) {
        idHandler(ar.result(), null);
      } else {
        idHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get list of Acl token

   @public
   @param resultHandler {function} will be provided with list of tokens 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listAclTokens = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.listAclTokens(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get info of Acl token

   @public
   @param id {string} the ID of token 
   @param tokenHandler {function} will be provided with token 
   @return {ConsulClient} reference to this, for fluency
   */
  this.infoAclToken = function(id, tokenHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.infoAclToken(id, function(ar) {
      if (ar.succeeded()) {
        tokenHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        tokenHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Destroy Acl token

   @public
   @param id {string} the ID of token 
   @param resultHandler {function} will be called on complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.destroyAclToken = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.destroyAclToken(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Fires a new user event

   @public
   @param name {string} name of event 
   @param resultHandler {function} will be provided with properties of event 
   @return {ConsulClient} reference to this, for fluency
   */
  this.fireEvent = function(name, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.fireEvent(name, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Fires a new user event

   @public
   @param name {string} name of event 
   @param options {Object} options used to create event 
   @param resultHandler {function} will be provided with properties of event 
   @return {ConsulClient} reference to this, for fluency
   */
  this.fireEventWithOptions = function(name, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.fireEventWithOptions(name, options != null ? new EventOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the most recent events known by the agent

   @public
   @param resultHandler {function} will be provided with list of events 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listEvents = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.listEvents(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the most recent events known by the agent.
   This is blocking query unlike {@link ConsulClient#listEvents}. However, the semantics of this endpoint
   are slightly different. Most blocking queries provide a monotonic index and block until a newer index is available.
   This can be supported as a consequence of the total ordering of the consensus protocol. With gossip,
   there is no ordering, and instead <code>X-Consul-Index</code> maps to the newest event that matches the query.
   <p>
   In practice, this means the index is only useful when used against a single agent and has no meaning globally.
   Because Consul defines the index as being opaque, clients should not be expecting a natural ordering either.

   @public
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of events 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listEventsWithOptions = function(options, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.listEventsWithOptions(options != null ? new EventListOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Adds a new service, with an optional health check, to the local agent.

   @public
   @param serviceOptions {Object} the options of new service 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.registerService = function(serviceOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.registerService(serviceOptions != null ? new ServiceOptions(new JsonObject(Java.asJSONCompatible(serviceOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Places a given service into "maintenance mode"

   @public
   @param maintenanceOptions {Object} the maintenance options 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.maintenanceService = function(maintenanceOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.maintenanceService(maintenanceOptions != null ? new MaintenanceOptions(new JsonObject(Java.asJSONCompatible(maintenanceOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove a service from the local agent. The agent will take care of deregistering the service with the Catalog.
   If there is an associated check, that is also deregistered.

   @public
   @param id {string} the ID of service 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.deregisterService = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.deregisterService(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes providing a service

   @public
   @param service {string} name of service 
   @param resultHandler {function} will be provided with list of nodes providing given service 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogServiceNodes = function(service, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.catalogServiceNodes(service, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes providing a service

   @public
   @param service {string} name of service 
   @param options {Object} options used to request services 
   @param resultHandler {function} will be provided with list of nodes providing given service 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogServiceNodesWithOptions = function(service, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.catalogServiceNodesWithOptions(service, options != null ? new ServiceQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return all the datacenters that are known by the Consul server

   @public
   @param resultHandler {function} will be provided with list of datacenters 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogDatacenters = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.catalogDatacenters(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes registered in a datacenter

   @public
   @param resultHandler {function} will be provided with list of nodes 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogNodes = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.catalogNodes(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes registered in a datacenter

   @public
   @param options {Object} options used to request nodes 
   @param resultHandler {function} will be provided with list of nodes 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogNodesWithOptions = function(options, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.catalogNodesWithOptions(options != null ? new NodeQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the checks associated with the service

   @public
   @param service {string} the service name 
   @param resultHandler {function} will be provided with list of checks 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthChecks = function(service, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.healthChecks(service, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the checks associated with the service

   @public
   @param service {string} the service name 
   @param options {Object} options used to request checks 
   @param resultHandler {function} will be provided with list of checks 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthChecksWithOptions = function(service, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.healthChecksWithOptions(service, options != null ? new CheckQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the checks in the specified status

   @public
   @param checkStatus {Object} the check status 
   @param resultHandler {function} will be provided with list of checks 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthState = function(checkStatus, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.healthState(io.vertx.ext.consul.CheckStatus.valueOf(checkStatus), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the checks in the specified status

   @public
   @param checkStatus {Object} the check status 
   @param options {Object} options used to request checks 
   @param resultHandler {function} will be provided with list of checks 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthStateWithOptions = function(checkStatus, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.healthStateWithOptions(io.vertx.ext.consul.CheckStatus.valueOf(checkStatus), options != null ? new CheckQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes providing the service. This endpoint is very similar to the {@link ConsulClient#catalogServiceNodes} endpoint;
   however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.

   @public
   @param service {string} the service name 
   @param passing {boolean} if true, filter results to only nodes with all checks in the passing state 
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthServiceNodes = function(service, passing, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && typeof __args[2] === 'function') {
      j_consulClient.healthServiceNodes(service, passing, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the nodes providing the service. This endpoint is very similar to the {@link ConsulClient#catalogServiceNodesWithOptions} endpoint;
   however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.

   @public
   @param service {string} the service name 
   @param passing {boolean} if true, filter results to only nodes with all checks in the passing state 
   @param options {Object} options used to request services 
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.healthServiceNodesWithOptions = function(service, passing, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] ==='boolean' && (typeof __args[2] === 'object' && __args[2] != null) && typeof __args[3] === 'function') {
      j_consulClient.healthServiceNodesWithOptions(service, passing, options != null ? new ServiceQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the services registered in a datacenter

   @public
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogServices = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.catalogServices(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the services registered in a datacenter
   This is blocking query unlike {@link ConsulClient#catalogServices}

   @public
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogServicesWithOptions = function(options, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.catalogServicesWithOptions(options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the node's registered services

   @public
   @param node {string} node name 
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogNodeServices = function(node, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.catalogNodeServices(node, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the node's registered services
   This is blocking query unlike {@link ConsulClient#catalogNodeServices}

   @public
   @param node {string} node name 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.catalogNodeServicesWithOptions = function(node, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.catalogNodeServicesWithOptions(node, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns list of services registered with the local agent.

   @public
   @param resultHandler {function} will be provided with list of services 
   @return {ConsulClient} reference to this, for fluency
   */
  this.localServices = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.localServices(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return all the checks that are registered with the local agent.

   @public
   @param resultHandler {function} will be provided with list of checks 
   @return {ConsulClient} reference to this, for fluency
   */
  this.localChecks = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.localChecks(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a new check to the local agent. The agent is responsible for managing the status of the check
   and keeping the Catalog in sync.

   @public
   @param checkOptions {Object} options used to register new check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.registerCheck = function(checkOptions, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.registerCheck(checkOptions != null ? new CheckOptions(new JsonObject(Java.asJSONCompatible(checkOptions))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove a check from the local agent. The agent will take care of deregistering the check from the Catalog.

   @public
   @param checkId {string} the ID of check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.deregisterCheck = function(checkId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.deregisterCheck(checkId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.passCheck = function(checkId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.passCheck(checkId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param note {string} a human-readable message with the status of the check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.passCheckWithNote = function(checkId, note, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_consulClient.passCheckWithNote(checkId, note, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.warnCheck = function(checkId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.warnCheck(checkId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param note {string} a human-readable message with the status of the check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.warnCheckWithNote = function(checkId, note, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_consulClient.warnCheckWithNote(checkId, note, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.failCheck = function(checkId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.failCheck(checkId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param note {string} a human-readable message with the status of the check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.failCheckWithNote = function(checkId, note, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_consulClient.failCheckWithNote(checkId, note, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param status {Object} new status of check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.updateCheck = function(checkId, status, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_consulClient.updateCheck(checkId, io.vertx.ext.consul.CheckStatus.valueOf(status), function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.

   @public
   @param checkId {string} the ID of check 
   @param status {Object} new status of check 
   @param note {string} a human-readable message with the status of the check 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.updateCheckWithNote = function(checkId, status, note, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_consulClient.updateCheckWithNote(checkId, io.vertx.ext.consul.CheckStatus.valueOf(status), note, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the Raft leader for the datacenter in which the agent is running.
   It returns an address in format "<code>10.1.10.12:8300</code>"

   @public
   @param resultHandler {function} will be provided with address of cluster leader 
   @return {ConsulClient} reference to this, for fluency
   */
  this.leaderStatus = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.leaderStatus(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Retrieves the Raft peers for the datacenter in which the the agent is running.
   It returns a list of addresses "<code>10.1.10.12:8300</code>", "<code>10.1.10.13:8300</code>"

   @public
   @param resultHandler {function} will be provided with list of peers 
   @return {ConsulClient} reference to this, for fluency
   */
  this.peersStatus = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.peersStatus(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Initialize a new session

   @public
   @param idHandler {function} will be provided with ID of new session 
   @return {ConsulClient} reference to this, for fluency
   */
  this.createSession = function(idHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.createSession(function(ar) {
      if (ar.succeeded()) {
        idHandler(ar.result(), null);
      } else {
        idHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Initialize a new session

   @public
   @param options {Object} options used to create session 
   @param idHandler {function} will be provided with ID of new session 
   @return {ConsulClient} reference to this, for fluency
   */
  this.createSessionWithOptions = function(options, idHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.createSessionWithOptions(options != null ? new SessionOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        idHandler(ar.result(), null);
      } else {
        idHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the requested session information

   @public
   @param id {string} the ID of requested session 
   @param resultHandler {function} will be provided with info of requested session 
   @return {ConsulClient} reference to this, for fluency
   */
  this.infoSession = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.infoSession(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the requested session information
   This is blocking query unlike {@link ConsulClient#infoSession}

   @public
   @param id {string} the ID of requested session 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with info of requested session 
   @return {ConsulClient} reference to this, for fluency
   */
  this.infoSessionWithOptions = function(id, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.infoSessionWithOptions(id, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Renews the given session. This is used with sessions that have a TTL, and it extends the expiration by the TTL

   @public
   @param id {string} the ID of session that should be renewed 
   @param resultHandler {function} will be provided with info of renewed session 
   @return {ConsulClient} reference to this, for fluency
   */
  this.renewSession = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.renewSession(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the active sessions

   @public
   @param resultHandler {function} will be provided with list of sessions 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listSessions = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.listSessions(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the active sessions
   This is blocking query unlike {@link ConsulClient#listSessions}

   @public
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of sessions 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listSessionsWithOptions = function(options, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.listSessionsWithOptions(options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the active sessions for a given node

   @public
   @param nodeId {string} the ID of node 
   @param resultHandler {function} will be provided with list of sessions 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listNodeSessions = function(nodeId, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.listNodeSessions(nodeId, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the active sessions for a given node
   This is blocking query unlike {@link ConsulClient#listNodeSessions}

   @public
   @param nodeId {string} the ID of node 
   @param options {Object} the blocking options 
   @param resultHandler {function} will be provided with list of sessions 
   @return {ConsulClient} reference to this, for fluency
   */
  this.listNodeSessionsWithOptions = function(nodeId, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.listNodeSessionsWithOptions(nodeId, options != null ? new BlockingQueryOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Destroys the given session

   @public
   @param id {string} the ID of session 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.destroySession = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.destroySession(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param definition {Object} definition of the prepare query 
   @param resultHandler {function} will be provided with id of created prepare query 
   @return {ConsulClient} reference to this, for fluency
   */
  this.createPreparedQuery = function(definition, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.createPreparedQuery(definition != null ? new PreparedQueryDefinition(new JsonObject(Java.asJSONCompatible(definition))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns an existing prepared query

   @public
   @param id {string} the id of the query to read 
   @param resultHandler {function} will be provided with definition of the prepare query 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getPreparedQuery = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.getPreparedQuery(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a list of all prepared queries.

   @public
   @param resultHandler {function} will be provided with list of definitions of the all prepare queries 
   @return {ConsulClient} reference to this, for fluency
   */
  this.getAllPreparedQueries = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_consulClient.getAllPreparedQueries(function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnListSetDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param definition {Object} definition of the prepare query 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.updatePreparedQuery = function(definition, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_consulClient.updatePreparedQuery(definition != null ? new PreparedQueryDefinition(new JsonObject(Java.asJSONCompatible(definition))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Deletes an existing prepared query

   @public
   @param id {string} the id of the query to delete 
   @param resultHandler {function} will be called when complete 
   @return {ConsulClient} reference to this, for fluency
   */
  this.deletePreparedQuery = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.deletePreparedQuery(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes an existing prepared query.

   @public
   @param query {string} the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template. 
   @param resultHandler {function} will be provided with response 
   @return {ConsulClient} reference to this, for fluency
   */
  this.executePreparedQuery = function(query, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_consulClient.executePreparedQuery(query, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes an existing prepared query.

   @public
   @param query {string} the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template. 
   @param options {Object} the options used to execute prepared query 
   @param resultHandler {function} will be provided with response 
   @return {ConsulClient} reference to this, for fluency
   */
  this.executePreparedQueryWithOptions = function(query, options, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'function') {
      j_consulClient.executePreparedQueryWithOptions(query, options != null ? new PreparedQueryExecuteOptions(new JsonObject(Java.asJSONCompatible(options))) : null, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the client and release its resources

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_consulClient.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_consulClient;
};

ConsulClient._jclass = utils.getJavaClass("io.vertx.ext.consul.ConsulClient");
ConsulClient._jtype = {
  accept: function(obj) {
    return ConsulClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ConsulClient.prototype, {});
    ConsulClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ConsulClient._create = function(jdel) {
  var obj = Object.create(ConsulClient.prototype, {});
  ConsulClient.apply(obj, arguments);
  return obj;
}
/**
 Create a Consul client.

 @memberof module:vertx-consul-js/consul_client
 @param vertx {Vertx} the Vert.x instance 
 @param options {Object} the options 
 @return {ConsulClient} the client
 */
ConsulClient.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(ConsulClient, JConsulClient.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(ConsulClient, JConsulClient.create(__args[0]._jdel, __args[1] != null ? new ConsulClientOptions(new JsonObject(Java.asJSONCompatible(__args[1]))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ConsulClient;