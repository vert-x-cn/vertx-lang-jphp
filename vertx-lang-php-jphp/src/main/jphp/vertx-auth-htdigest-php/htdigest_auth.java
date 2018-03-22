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

package io.vertx.php.ext.auth.htdigest;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;

/**
 An extension of AuthProvider which is using .htdigest file as store

 * @class
 */
@Name("HtdigestAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\htdigest")
public class HtdigestAuth extends BaseWrapper<HtdigestAuth>{
  AuthProvider.call(this, j_val);

  /**
   Authenticate a user.
   <p>
   The first argument is a JSON object containing information for authenticating the user. What this actually contains
   depends on the specific implementation. In the case of a simple username/password based
   authentication it is likely to contain a JSON object with the following structure:
   <pre>
     {
       "username": "tim",
       "password": "mypassword"
     }
   </pre>
   For other types of authentication it contain different information - for example a JWT token or OAuth bearer token.
   <p>
   If the user is successfully authenticated a  object is passed to the handler in an {@link AsyncResult}.
   The user object can then be used for authorisation.

   @public
   @param authInfo {Object} The auth information 
   @param resultHandler {function} The result handler 
   */
  this.authenticate = function(authInfo, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && (typeof __args[0] === 'object' && __args[0] != null) && typeof __args[1] === 'function') {
      j_htdigestAuth.authenticate(utils.convParamJsonObject(authInfo), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnVertxGen(User, ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Return the currently used realm

   @public

   @return {string} the realm
   */
  this.realm = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_htdigestAuth.realm();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_htdigestAuth;
};

HtdigestAuth._jclass = utils.getJavaClass("io.vertx.ext.auth.htdigest.HtdigestAuth");
HtdigestAuth._jtype = {
  accept: function(obj) {
    return HtdigestAuth._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(HtdigestAuth.prototype, {});
    HtdigestAuth.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
HtdigestAuth._create = function(jdel) {
  var obj = Object.create(HtdigestAuth.prototype, {});
  HtdigestAuth.apply(obj, arguments);
  return obj;
}
/**
 Creates an instance of HtdigestAuth by using the given htfile file.

 @memberof module:vertx-auth-htdigest-js/htdigest_auth
 @param vertx {Vertx} 
 @param htfile {string} the existing htfile. 
 @return {HtdigestAuth} the created instance of {@link HtdigestAuth}s
 */
HtdigestAuth.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(HtdigestAuth, JHtdigestAuth.create(__args[0]._jdel));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string') {
    return utils.convReturnVertxGen(HtdigestAuth, JHtdigestAuth.create(__args[0]._jdel, __args[1]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = HtdigestAuth;