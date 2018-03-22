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
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.php.ext.web.RoutingContext;

/**

 A handler which renders responses using a template engine and where the template name is selected from the URI
 path.

 * @class
 */
@Name("TemplateHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public class TemplateHandler extends BaseWrapper<TemplateHandler>{

  /**
   Something has happened, so handle it.

   @public
   @param event {RoutingContext} the event to handle 
   */
  this.handle = function(event) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_templateHandler.handle(event._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the index template

   @public
   @param indexTemplate {string} the index template 
   @return {TemplateHandler} a reference to this, so the API can be used fluently
   */
  this.setIndexTemplate = function(indexTemplate) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_templateHandler.setIndexTemplate(indexTemplate);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_templateHandler;
};

TemplateHandler._jclass = utils.getJavaClass("io.vertx.ext.web.handler.TemplateHandler");
TemplateHandler._jtype = {
  accept: function(obj) {
    return TemplateHandler._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TemplateHandler.prototype, {});
    TemplateHandler.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TemplateHandler._create = function(jdel) {
  var obj = Object.create(TemplateHandler.prototype, {});
  TemplateHandler.apply(obj, arguments);
  return obj;
}
/**
 Create a handler

 @memberof module:vertx-web-js/template_handler
 @param engine {TemplateEngine} the template engine 
 @param templateDirectory {string} the template directory where templates will be looked for 
 @param contentType {string} the content type header to be used in the response 
 @return {TemplateHandler} the handler
 */
TemplateHandler.create = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
    return utils.convReturnVertxGen(TemplateHandler, JTemplateHandler.create(__args[0]._jdel));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string') {
    return utils.convReturnVertxGen(TemplateHandler, JTemplateHandler.create(__args[0]._jdel, __args[1], __args[2]));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = TemplateHandler;