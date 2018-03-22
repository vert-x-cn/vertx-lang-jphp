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

package io.vertx.php.ext.stomp;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.StompServerConnection;

/**
 Represents a STOMP destination.
 Depending on the implementation, the message delivery is different. Queue are sending message to only one
 subscribers, while topics are broadcasting the message to all subscribers.
 <p/>
 Implementations <strong>must</strong> be thread-safe.

 * @class
 */
@Name("Destination")
@Namespace("io\\vertx\\php\\ext\\stomp")
public class Destination extends BaseWrapper<Destination>{

  /**

   @public

   @return {string} the destination address.
   */
  this.destination = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_destination.destination();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Dispatches the given frame.

   @public
   @param connection {StompServerConnection} the connection 
   @param frame {Object} the frame 
   @return {Destination} the current instance of {@link Destination}
   */
  this.dispatch = function(connection, frame) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_destination.dispatch(connection._jdel, frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a subscription request to the current {@link Destination}.

   @public
   @param connection {StompServerConnection} the connection 
   @param frame {Object} the <code>SUBSCRIBE</code> frame 
   @return {Destination} the current instance of {@link Destination}
   */
  this.subscribe = function(connection, frame) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      j_destination.subscribe(connection._jdel, frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a un-subscription request to the current {@link Destination}.

   @public
   @param connection {StompServerConnection} the connection 
   @param frame {Object} the <code>UNSUBSCRIBE</code> frame 
   @return {boolean} <code>true</code> if the un-subscription has been handled, <code>false</code> otherwise.
   */
  this.unsubscribe = function(connection, frame) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      return j_destination.unsubscribe(connection._jdel, frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Removes all subscriptions of the given connection

   @public
   @param connection {StompServerConnection} the connection 
   @return {Destination} the current instance of {@link Destination}
   */
  this.unsubscribeConnection = function(connection) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_destination.unsubscribeConnection(connection._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a <code>ACK</code> frame.

   @public
   @param connection {StompServerConnection} the connection 
   @param frame {Object} the <code>ACK</code> frame 
   @return {boolean} <code>true</code> if the destination has handled the frame (meaning it has sent the message with id)
   */
  this.ack = function(connection, frame) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      return j_destination.ack(connection._jdel, frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a <code>NACK</code> frame.

   @public
   @param connection {StompServerConnection} the connection 
   @param frame {Object} the <code>NACK</code> frame 
   @return {boolean} <code>true</code> if the destination has handled the frame (meaning it has sent the message with id)
   */
  this.nack = function(connection, frame) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
      return j_destination.nack(connection._jdel, frame != null ? new Frame(new JsonObject(Java.asJSONCompatible(frame))) : null);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets all subscription ids for the given destination hold by the given client

   @public
   @param connection {StompServerConnection} the connection (client) 
   @return {Array.<string>} the list of subscription id, empty if none
   */
  this.getSubscriptions = function(connection) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_destination.getSubscriptions(connection._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets the number of subscriptions attached to the current {@link Destination}.

   @public

   @return {number} the number of subscriptions.
   */
  this.numberOfSubscriptions = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_destination.numberOfSubscriptions();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Checks whether or not the given address matches with the current destination.

   @public
   @param address {string} the address 
   @return {boolean} <code>true</code> if it matches, <code>false</code> otherwise.
   */
  this.matches = function(address) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_destination.matches(address);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_destination;
};

Destination._jclass = utils.getJavaClass("io.vertx.ext.stomp.Destination");
Destination._jtype = {
  accept: function(obj) {
    return Destination._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Destination.prototype, {});
    Destination.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Destination._create = function(jdel) {
  var obj = Object.create(Destination.prototype, {});
  Destination.apply(obj, arguments);
  return obj;
}
/**

 @memberof module:vertx-stomp-js/destination
 @param vertx {Vertx} 
 @param destination {string} 
 @return {Destination}
 */
Destination.topic = function(vertx, destination) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(Destination, JDestination.topic(vertx._jdel, destination));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-stomp-js/destination
 @param vertx {Vertx} 
 @param destination {string} 
 @return {Destination}
 */
Destination.queue = function(vertx, destination) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(Destination, JDestination.queue(vertx._jdel, destination));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**

 @memberof module:vertx-stomp-js/destination
 @param vertx {Vertx} 
 @param options {Object} 
 @return {Destination}
 */
Destination.bridge = function(vertx, options) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null)) {
    return utils.convReturnVertxGen(Destination, JDestination.bridge(vertx._jdel, options != null ? new BridgeOptions(new JsonObject(Java.asJSONCompatible(options))) : null));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = Destination;