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

package io.vertx.php.ext.web.sstore;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.Session;

/**
 A session store is used to store sessions for an Vert.x-Web web app

 * @class
 */
@Name("SessionStore")
@Namespace("io\\vertx\\php\\ext\\web\\sstore")
public class SessionStore extends BaseWrapper<SessionStore>{

  /**
   The retry timeout value in milli seconds used by the session handler when it retrieves a value from the store.<p/>
  
   A non positive value means there is no retry at all.

   @public

   @return {number} the timeout value, in ms
   */
  this.retryTimeout = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_sessionStore.retryTimeout();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Create a new session

   @public
   @param timeout {number} - the session timeout, in ms 
   @param length {number} - the required length for the session id 
   @return {Session} the session
   */
  this.createSession = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnVertxGen(Session, j_sessionStore.createSession(__args[0]));
    }  else if (__args.length === 2 && typeof __args[0] ==='number' && typeof __args[1] ==='number') {
      return utils.convReturnVertxGen(Session, j_sessionStore.createSession(__args[0], __args[1]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the session with the specified ID

   @public
   @param id {string} the unique ID of the session 
   @param resultHandler {function} will be called with a result holding the session, or a failure 
   */
  this.get = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sessionStore.get(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(Session, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Delete the session with the specified ID

   @public
   @param id {string} the unique ID of the session 
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.delete = function(id, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sessionStore.delete(id, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Add a session with the specified ID

   @public
   @param session {Session} the session 
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.put = function(session, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'function') {
      j_sessionStore.put(session._jdel, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Remove all sessions from the store

   @public
   @param resultHandler {function} will be called with a success or a failure 
   */
  this.clear = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sessionStore.clear(function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Get the number of sessions in the store

   @public
   @param resultHandler {function} will be called with the number, or a failure 
   */
  this.size = function(resultHandler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sessionStore.size(function(ar) {
      if (ar.succeeded()) {
        resultHandler(ar.result(), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the store

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sessionStore.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sessionStore;
};

SessionStore._jclass = utils.getJavaClass("io.vertx.ext.web.sstore.SessionStore");
SessionStore._jtype = {
  accept: function(obj) {
    return SessionStore._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SessionStore.prototype, {});
    SessionStore.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SessionStore._create = function(jdel) {
  var obj = Object.create(SessionStore.prototype, {});
  SessionStore.apply(obj, arguments);
  return obj;
}
module.exports = SessionStore;