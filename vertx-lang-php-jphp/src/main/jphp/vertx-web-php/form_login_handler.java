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

package io.vertx.php.ext.web.handler;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.AuthProvider;

/**
 Handler that handles login from a form on a custom login page.
 <p>
 * @class
 */
@Name("FormLoginHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class FormLoginHandler extends BaseWrapper<FormLoginHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_formLoginHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the form param used to submit the username

   @public
   @param usernameParam {string} the name of the param 
   @return {FormLoginHandler} a reference to this for a fluent API
   */
  this.setUsernameParam = function(usernameParam) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_formLoginHandler.setUsernameParam(usernameParam);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the form param used to submit the password

   @public
   @param passwordParam {string} the name of the param 
   @return {FormLoginHandler} a reference to this for a fluent API
   */
  this.setPasswordParam = function(passwordParam) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_formLoginHandler.setPasswordParam(passwordParam);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the name of the session attrioute used to specify the return url

   @public
   @param returnURLParam {string} the name of the param 
   @return {FormLoginHandler} a reference to this for a fluent API
   */
  this.setReturnURLParam = function(returnURLParam) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_formLoginHandler.setReturnURLParam(returnURLParam);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the url to redirect to if the user logs in directly at the url of the form login handler
   without being redirected here first

   @public
   @param directLoggedInOKURL {string} the URL to redirect to 
   @return {FormLoginHandler} a reference to this for a fluent API
   */
  this.setDirectLoggedInOKURL = function(directLoggedInOKURL) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_formLoginHandler.setDirectLoggedInOKURL(directLoggedInOKURL);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_formLoginHandler;
};

FormLoginHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.FormLoginHandler");
FormLoginHandler._jtype = {
  accept: function(obj) {
    return FormLoginHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(FormLoginHandler.prototype, {});
    FormLoginHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
FormLoginHandler._create = function(jdel) {
  var obj = Object.create(FormLoginHandler.prototype, {});
  FormLoginHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a handler

 @memberof module:vertx-web-js/form_login_handler
 @param authProvider {AuthProvider} the auth service to use 
 @param usernameParam {string} the value of the form attribute which will contain the username 
 @param passwordParam {string} the value of the form attribute which will contain the password 
 @param returnURLParam {string} the value of the session attribute which will contain the return url 
 @param directLoggedInOKURL {string} a url to redirect to if the user logs in directly at the url of the form login handler without being redirected here first 
 @return {FormLoginHandler} the handler
 */
FormLoginHandler.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(FormLoginHandler, JFormLoginHandler.create(__args[0]._jdel));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'string' && typeof __args[4] === 'string') {
    return utils.convReturnVertxGen(FormLoginHandler, JFormLoginHandler.create(__args[0]._jdel, __args[1], __args[2], __args[3], __args[4]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = FormLoginHandler;