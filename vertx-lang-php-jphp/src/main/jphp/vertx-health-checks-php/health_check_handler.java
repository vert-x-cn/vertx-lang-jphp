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

package io.vertx.php.ext.healthchecks;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.healthchecks.HealthChecks;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.core.Future;
import io.vertx.php.ext.auth.AuthProvider;

/**
 A Vert.x Web handler on which you register health check procedure. It computes the outcome status (`UP` or `DOWN`)
 . When the handler process a HTTP request, it computes the global outcome and build a HTTP response as follows:
 <p>
 <ul>
 <li>204 - status is `UP` but no procedures installed (no payload)</li>
 <li>200 - status is `UP`, the payload contains the result of the installed procedures</li>
 <li>503 - status is `DOWN`, the payload contains the result of the installed procedures</li>
 <li>500 - status is `DOWN`, the payload contains the result of the installed procedures, one of the
 procedure has failed</li>
 </ul>

 * @class
 */
@Name("HealthCheckHandler")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
public class HealthCheckHandler extends BaseWrapper<HealthCheckHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_healthCheckHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Registers a health check procedure.
   <p>
   The procedure is a  taking a  of <a href="../../dataobjects.html#Status">Status</a> as parameter. Procedures are
   asynchronous, and <strong>must</strong> complete or fail the given . If the future object is
   failed, the procedure outcome is considered as `DOWN`. If the future is completed without any object, the
   procedure outcome is considered as `UP`. If the future is completed with a (not-null) <a href="../../dataobjects.html#Status">Status</a>, the
   procedure outcome is the received status.

   @public
   @param name {string} the name of the procedure, must not be <code>null</code> or empty 
   @param timeout {number} the procedure timeout 
   @param procedure {function} the procedure, must not be <code>null</code> 
   @return {HealthCheckHandler} the current {@link HealthCheckHandler}
   */
  this.register = function() {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_healthCheckHandler.register(__args[0], function(jVal) {
      __args[1](utils.convReturnVertxGen(Future, jVal, undefined));
    });
      return that;
    }  else if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] ==='number' && typeof __args[2] === 'function') {
      j_healthCheckHandler.register(__args[0], __args[1], function(jVal) {
      __args[2](utils.convReturnVertxGen(Future, jVal, undefined));
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Unregisters a procedure.

   @public
   @param name {string} the name of the procedure 
   @return {HealthCheckHandler} the current {@link HealthCheckHandler}
   */
  this.unregister = function(name) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_healthCheckHandler.unregister(name);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_healthCheckHandler;
};

HealthCheckHandler._jclass = utils.getJavaClass("io.vertx.ext.healthchecks.HealthCheckHandler");
HealthCheckHandler._jtype = {
  accept: function(obj) {
    return HealthCheckHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HealthCheckHandler.prototype, {});
    HealthCheckHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HealthCheckHandler._create = function(jdel) {
  var obj = Object.create(HealthCheckHandler.prototype, {});
  HealthCheckHandler.apply(obj, arguments);
  return obj;
}
/**
 Creates an instance of the default implementation of the {@link HealthCheckHandler}.
 This function creates a new instance of {@link HealthChecks}.

 @memberof module:vertx-health-checks-js/health_check_handler
 @param vertx {Vertx} the Vert.x instance, must not be <code>null</code> 
 @param provider {AuthProvider} the Authentication provider used to authenticate the HTTP request 
 @return {HealthCheckHandler} the created instance
 */
HealthCheckHandler.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(HealthCheckHandler, JHealthCheckHandler.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(HealthCheckHandler, JHealthCheckHandler.create(__args[0]._jdel, __args[1]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Creates an instance of the default implementation of the {@link HealthCheckHandler}.

 @memberof module:vertx-health-checks-js/health_check_handler
 @param hc {HealthChecks} the health checks object to use, must not be <code>null</code> 
 @param provider {AuthProvider} 
 @return {HealthCheckHandler} the created instance
 */
HealthCheckHandler.createWithHealthChecks = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(HealthCheckHandler, JHealthCheckHandler.createWithHealthChecks(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(HealthCheckHandler, JHealthCheckHandler.createWithHealthChecks(__args[0]._jdel, __args[1]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = HealthCheckHandler;