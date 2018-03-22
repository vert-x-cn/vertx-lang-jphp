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

package io.vertx.php.ext.web.templ;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.php.ext.web.RoutingContext;

/**
 A template engine that uses the Thymeleaf library.

 * @class
 */
@Name("ThymeleafTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public class ThymeleafTemplateEngine extends BaseWrapper<ThymeleafTemplateEngine>{
  TemplateEngine.call(this, j_val);

  /**
   Render the template
   <p>
   <b>NOTE</b> if you call method directly (i.e. not using {@link TemplateHandler}) make sure
   that <i>templateFileName</i> is sanitized via {@link Utils#normalizePath}

   @public
   @param context {RoutingContext} the routing context 
   @param templateDirectory {string} the template directory to use 
   @param templateFileName {string} the relative template file name to use 
   @param handler {function} the handler that will be called with a result containing the buffer or a failure. 
   */
  this.render = function() {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'function') {
      j_thymeleafTemplateEngine.render(__args[0]._jdel, __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(Buffer, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
    }  else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_thymeleafTemplateEngine.render(__args[0]._jdel, __args[1], __args[2], function(ar) {
      if (ar.succeeded()) {
        __args[3](utils.convReturnVertxGen(Buffer, ar.result()), null);
      } else {
        __args[3](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns true if the template engine caches template files. If false, then template files are freshly loaded each
   time they are used.

   @public

   @return {boolean} True if template files are cached; otherwise, false.
   */
  this.isCachingEnabled = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_thymeleafTemplateEngine.isCachingEnabled();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the mode for the engine

   @public
   @param mode {Object} the mode 
   @return {ThymeleafTemplateEngine} a reference to this for fluency
   */
  this.setMode = function(mode) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_thymeleafTemplateEngine.setMode(org.thymeleaf.templatemode.TemplateMode.valueOf(mode));
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_thymeleafTemplateEngine;
};

ThymeleafTemplateEngine._jclass = utils.getJavaClass("io.vertx.ext.web.templ.ThymeleafTemplateEngine");
ThymeleafTemplateEngine._jtype = {
  accept: function(obj) {
    return ThymeleafTemplateEngine._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(ThymeleafTemplateEngine.prototype, {});
    ThymeleafTemplateEngine.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
ThymeleafTemplateEngine._create = function(jdel) {
  var obj = Object.create(ThymeleafTemplateEngine.prototype, {});
  ThymeleafTemplateEngine.apply(obj, arguments);
  return obj;
}
/**
 Create a template engine using defaults

 @memberof module:vertx-web-js/thymeleaf_template_engine

 @return {ThymeleafTemplateEngine} the engine
 */
ThymeleafTemplateEngine.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(ThymeleafTemplateEngine, JThymeleafTemplateEngine.create());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = ThymeleafTemplateEngine;