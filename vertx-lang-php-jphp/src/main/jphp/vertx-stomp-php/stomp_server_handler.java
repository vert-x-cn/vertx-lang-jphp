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
import io.vertx.php.ext.stomp.Destination;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.stomp.DestinationFactory;
import io.vertx.php.ext.stomp.Acknowledgement;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.ServerFrame;
import io.vertx.php.ext.stomp.StompServerConnection;
import io.vertx.php.ext.auth.AuthProvider;

/**
 STOMP server handler implements the behavior of the STOMP server when a specific event occurs. For instance, if
 let customize the behavior when specific STOMP frames arrives or when a connection is closed. This class has been
 designed to let you customize the server behavior. The default implementation is compliant with the STOMP
 specification. In this default implementation, not acknowledge frames are dropped.

 * @class
 */
@Name("StompServerHandler")
@Namespace("io\\vertx\\php\\ext\\stomp")
public class StompServerHandler extends BaseWrapper<StompServerHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {ServerFrame} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_stompServerHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures a handler that get notified when a STOMP frame is received by the server.
   This handler can be used for logging, debugging or ad-hoc behavior.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.receivedFrameHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.receivedFrameHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>CONNECT</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.connectHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.connectHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>STOMP</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.stompHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.stompHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>SUBSCRIBE</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.subscribeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.subscribeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>UNSUBSCRIBE</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.unsubscribeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.unsubscribeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>SEND</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.sendHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.sendHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a connection with the client is closed.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.closeHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.closeHandler(function(jVal) {
      handler(utils.convReturnVertxGen(StompServerConnection, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Called when the connection is closed. This method executes a default behavior and must calls the configured
   {@link StompServerHandler#closeHandler} if any.

   @public
   @param connection {StompServerConnection} the connection 
   */
  this.onClose = function(connection) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_stompServerHandler.onClose(connection._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>COMMIT</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.commitHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.commitHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>ABORT</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.abortHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.abortHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>BEGIN</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.beginHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.beginHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>DISCONNECT</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.disconnectHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.disconnectHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>ACK</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.ackHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.ackHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when a <code>NACK</code> frame is received.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.nackHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.nackHandler(function(jVal) {
      handler(utils.convReturnVertxGen(ServerFrame, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Called when the client connects to a server requiring authentication. It invokes the  configured
   using {@link StompServerHandler#authProvider}.

   @public
   @param connection {StompServerConnection} server connection that contains session ID 
   @param login {string} the login 
   @param passcode {string} the password 
   @param handler {function} handler receiving the authentication result 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.onAuthenticationRequest = function(connection, login, passcode, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_stompServerHandler.onAuthenticationRequest(connection._jdel, login, passcode, function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Provides for authorization matches on a destination level, this will return the User created by the .

   @public
   @param session {string} session ID for the server connection. 
   @return {User} null if not authenticated.
   */
  this.getUserBySession = function(session) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(User, j_stompServerHandler.getUserBySession(session));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the  to be used to authenticate the user.

   @public
   @param handler {AuthProvider} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.authProvider = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_stompServerHandler.authProvider(handler._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Array.<Destination>} the list of destination managed by the STOMP server. Don't forget the STOMP interprets destination as opaque Strings.
   */
  this.getDestinations = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnListSetVertxGen(j_stompServerHandler.getDestinations(), Destination);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets the destination with the given name.

   @public
   @param destination {string} the destination 
   @return {Destination} the {@link Destination}, <code>null</code> if not existing.
   */
  this.getDestination = function(destination) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Destination, j_stompServerHandler.getDestination(destination));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Method called by single message (client-individual policy) or a set of message (client policy) are acknowledged.
   Implementations must call the handler configured using {@link StompServerHandler#onAckHandler}.

   @public
   @param connection {StompServerConnection} the connection 
   @param subscribe {Object} the <code>SUBSCRIBE</code> frame 
   @param messages {Array.<Object>} the acknowledge messages 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.onAck = function(connection, subscribe, messages) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'object' && __args[2] instanceof Array) {
      j_stompServerHandler.onAck(connection._jdel, subscribe != null ? new Frame(new JsonObject(Java.asJSONCompatible(subscribe))) : null, utils.convParamListDataObject(messages, function(json) { return new Frame(json); }));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Method called by single message (client-individual policy) or a set of message (client policy) are
   <strong>not</strong> acknowledged. Not acknowledgment can result from a <code>NACK</code> frame or from a timeout (no
   <code>ACK</code> frame received in a given time. Implementations must call the handler configured using
   {@link StompServerHandler#onNackHandler}.

   @public
   @param connection {StompServerConnection} the connection 
   @param subscribe {Object} the <code>SUBSCRIBE</code> frame 
   @param messages {Array.<Object>} the acknowledge messages 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.onNack = function(connection, subscribe, messages) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && (typeof __args[1] === 'object' && __args[1] != null) && typeof __args[2] === 'object' && __args[2] instanceof Array) {
      j_stompServerHandler.onNack(connection._jdel, subscribe != null ? new Frame(new JsonObject(Java.asJSONCompatible(subscribe))) : null, utils.convParamListDataObject(messages, function(json) { return new Frame(json); }));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when messages are acknowledged.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.onAckHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.onAckHandler(function(jVal) {
      handler(utils.convReturnVertxGen(Acknowledgement, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the action to execute when messages are <strong>not</strong> acknowledged.

   @public
   @param handler {function} the handler 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.onNackHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.onNackHandler(function(jVal) {
      handler(utils.convReturnVertxGen(Acknowledgement, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Allows customizing the action to do when the server needs to send a `PING` to the client. By default it send a
   frame containing <code>EOL</code> (specification). However, you can customize this and send another frame. However,
   be aware that this may requires a custom client.
   <p/>
   The handler will only be called if the connection supports heartbeats.

   @public
   @param handler {function} the action to execute when a `PING` needs to be sent. 
   @return {StompServerHandler} the current {@link StompServerHandler}
   */
  this.pingHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_stompServerHandler.pingHandler(function(jVal) {
      handler(utils.convReturnVertxGen(StompServerConnection, jVal));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Gets a {@link Destination} object if existing, or create a new one. The creation is delegated to the
   {@link DestinationFactory}.

   @public
   @param destination {string} the destination 
   @return {Destination} the {@link Destination} instance, may have been created.
   */
  this.getOrCreateDestination = function(destination) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Destination, j_stompServerHandler.getOrCreateDestination(destination));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the {@link DestinationFactory} used to create {@link Destination} objects.

   @public
   @param factory {DestinationFactory} the factory 
   @return {StompServerHandler} the current {@link StompServerHandler}.
   */
  this.destinationFactory = function(factory) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_stompServerHandler.destinationFactory(factory._jdel);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Configures the STOMP server to act as a bridge with the Vert.x event bus.

   @public
   @param options {Object} the configuration options 
   @return {StompServerHandler} the current {@link StompServerHandler}.
   */
  this.bridge = function(options) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_stompServerHandler.bridge(options != null ? new BridgeOptions(new JsonObject(Java.asJSONCompatible(options))) : null);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_stompServerHandler;
};

StompServerHandler._jclass = utils.getJavaClass("io.vertx.ext.stomp.StompServerHandler");
StompServerHandler._jtype = {
  accept: function(obj) {
    return StompServerHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(StompServerHandler.prototype, {});
    StompServerHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
StompServerHandler._create = function(jdel) {
  var obj = Object.create(StompServerHandler.prototype, {});
  StompServerHandler.apply(obj, arguments);
  return obj;
}
/**
 Creates an instance of {@link StompServerHandler} using the default (compliant) implementation.

 @memberof module:vertx-stomp-js/stomp_server_handler
 @param vertx {Vertx} the vert.x instance to use 
 @return {StompServerHandler} the created {@link StompServerHandler}
 */
StompServerHandler.create = function(vertx) {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(StompServerHandler, JStompServerHandler.create(vertx._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = StompServerHandler;