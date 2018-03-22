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
import io.vertx.php.ext.web.RoutingContext;

/**
 A template engine uses a specific template and the data in a routing context to render a resource into a buffer.
 <p>
 Concrete implementations exist for several well-known template engines.

 * @class
 */
@Name("TemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public class TemplateEngine extends BaseWrapper<TemplateEngine>{

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
      j_templateEngine.render(__args[0]._jdel, __args[1], function(ar) {
      if (ar.succeeded()) {
        __args[2](utils.convReturnVertxGen(Buffer, ar.result()), null);
      } else {
        __args[2](null, ar.cause());
      }
    });
    }  else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'string' && typeof __args[2] === 'string' && typeof __args[3] === 'function') {
      j_templateEngine.render(__args[0]._jdel, __args[1], __args[2], function(ar) {
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
      return j_templateEngine.isCachingEnabled();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_templateEngine;
};

TemplateEngine._jclass = utils.getJavaClass("io.vertx.ext.web.templ.TemplateEngine");
TemplateEngine._jtype = {
  accept: function(obj) {
    return TemplateEngine._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TemplateEngine.prototype, {});
    TemplateEngine.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TemplateEngine._create = function(jdel) {
  var obj = Object.create(TemplateEngine.prototype, {});
  TemplateEngine.apply(obj, arguments);
  return obj;
}
module.exports = TemplateEngine;