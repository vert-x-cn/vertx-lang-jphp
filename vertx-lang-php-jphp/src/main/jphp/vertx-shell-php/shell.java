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

package io.vertx.php.ext.shell;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.shell.system.Job;
import io.vertx.php.ext.shell.system.JobController;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;

/**
 An interactive session between a consumer and a shell.

 * @class
 */
@Name("Shell")
@Namespace("io\\vertx\\php\\ext\\shell")
public class Shell extends BaseWrapper<Shell>{

  /**
   See {@link Shell#createJob}

   @public
   @param line {string} 
   @return {Job}
   */
  this.createJob = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
      return utils.convReturnVertxGen(Job, j_shell.createJob(utils.convParamListVertxGen(__args[0])));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      return utils.convReturnVertxGen(Job, j_shell.createJob(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {JobController} the shell's job controller
   */
  this.jobController = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedjobController == null) {
        that.cachedjobController = utils.convReturnVertxGen(JobController, j_shell.jobController());
      }
      return that.cachedjobController;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {Session} the current shell session
   */
  this.session = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedsession == null) {
        that.cachedsession = utils.convReturnVertxGen(Session, j_shell.session());
      }
      return that.cachedsession;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the shell.

   @public

   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_shell.close();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_shell;
};

Shell._jclass = utils.getJavaClass("io.vertx.ext.shell.Shell");
Shell._jtype = {
  accept: function(obj) {
    return Shell._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(Shell.prototype, {});
    Shell.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
Shell._create = function(jdel) {
  var obj = Object.create(Shell.prototype, {});
  Shell.apply(obj, arguments);
  return obj;
}
module.exports = Shell;