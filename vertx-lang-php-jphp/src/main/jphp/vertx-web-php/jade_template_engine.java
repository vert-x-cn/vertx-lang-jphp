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
 A template engine that uses Jade.

 * @class
 */
@Name("JadeTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public class JadeTemplateEngine extends BaseWrapper<JadeTemplateEngine>{
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
      j_jadeTemplateEngine.render(__args[0]._jdel, __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(Buffer, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
    }  else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_jadeTemplateEngine.render(__args[0]._jdel, __args[1], __args[2], function(ar) {
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
      return j_jadeTemplateEngine.isCachingEnabled();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the extension for the engine

   @public
   @param extension {string} the extension 
   @return {JadeTemplateEngine} a reference to this for fluency
   */
  this.setExtension = function(extension) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'string') {
      j_jadeTemplateEngine.setExtension(extension);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the max cache size for the engine

   @public
   @param maxCacheSize {number} the maxCacheSize 
   @return {JadeTemplateEngine} a reference to this for fluency
   */
  this.setMaxCacheSize = function(maxCacheSize) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_jadeTemplateEngine.setMaxCacheSize(maxCacheSize);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_jadeTemplateEngine;
};

JadeTemplateEngine._jclass = utils.getJavaClass("io.vertx.ext.web.templ.JadeTemplateEngine");
JadeTemplateEngine._jtype = {
  accept: function(obj) {
    return JadeTemplateEngine._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(JadeTemplateEngine.prototype, {});
    JadeTemplateEngine.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
JadeTemplateEngine._create = function(jdel) {
  var obj = Object.create(JadeTemplateEngine.prototype, {});
  JadeTemplateEngine.apply(obj, arguments);
  return obj;
}
/**
 Create a template engine using defaults

 @memberof module:vertx-web-js/jade_template_engine

 @return {JadeTemplateEngine} the engine
 */
JadeTemplateEngine.create = function() {
  var __args = arguments;
  if (__args.length === 0) {
    return utils.convReturnVertxGen(JadeTemplateEngine, JJadeTemplateEngine.create());
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = JadeTemplateEngine;