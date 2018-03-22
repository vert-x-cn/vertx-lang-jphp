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

package io.vertx.php.core;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.core.Future;

/**

 * @class
 */
@Name("CompositeFuture")
@Namespace("io\\vertx\\php\\core")
public class CompositeFuture extends BaseWrapper<CompositeFuture>{
  Future.call(this, j_val, CompositeFuture._jtype);

  /**
   Returns true if a wrapped future is completed

   @public
   @param index {number} the wrapped future index 
   @return {boolean}
   */
  this.isComplete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_compositeFuture.isComplete();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_compositeFuture.isComplete(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the result. Any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param result {CompositeFuture} the result 
   */
  this.complete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_compositeFuture.complete();
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      j_compositeFuture.complete(__args[0]._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to set the failure. When it happens, any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param failureMessage {string} the failure message 
   */
  this.fail = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object') {
      j_compositeFuture.fail(utils.convParamThrowable(__args[0]));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      j_compositeFuture.fail(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Set the failure. Any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param result {CompositeFuture} the result 
   @return {boolean} false when the future is already completed
   */
  this.tryComplete = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_compositeFuture.tryComplete();
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return j_compositeFuture.tryComplete(__args[0]._jdel);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Try to set the failure. When it happens, any handler will be called, if there is one, and the future will be marked as completed.

   @public
   @param failureMessage {string} the failure message 
   @return {boolean} false when the future is already completed
   */
  this.tryFail = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'object') {
      return j_compositeFuture.tryFail(utils.convParamThrowable(__args[0]));
    }  else if (__args.length === 1 && typeof __args[0] === 'string') {
      return j_compositeFuture.tryFail(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The result of the operation. This will be null if the operation failed.

   @public

   @return {CompositeFuture} the result or null if the operation failed.
   */
  this.result = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(CompositeFuture, j_compositeFuture.result());
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns a cause of a wrapped future

   @public
   @param index {number} the wrapped future index 
   @return {todo}
   */
  this.cause = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnThrowable(j_compositeFuture.cause());
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnThrowable(j_compositeFuture.cause(__args[0]));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns true if a wrapped future is succeeded

   @public
   @param index {number} the wrapped future index 
   @return {boolean}
   */
  this.succeeded = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_compositeFuture.succeeded();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_compositeFuture.succeeded(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns true if a wrapped future is failed

   @public
   @param index {number} the wrapped future index 
   @return {boolean}
   */
  this.failed = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_compositeFuture.failed();
    }  else if (__args.length === 1 && typeof __args[0] ==='number') {
      return j_compositeFuture.failed(__args[0]);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Compose this future with a provided <code>next</code> future.<p>
  
   When this (the one on which <code>compose</code> is called) future succeeds, the <code>handler</code> will be called with
   the completed value, this handler should complete the next future.<p>
  
   If the <code>handler</code> throws an exception, the returned future will be failed with this exception.<p>
  
   When this future fails, the failure will be propagated to the <code>next</code> future and the <code>handler</code>
   will not be called.

   @public
   @param handler {function} the handler 
   @param next {Future} the next future 
   @return {Future} the next future, used for chaining
   */
  this.compose = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_compositeFuture.compose(function(jVal) {
      var jRet = __args[0](utils.convReturnVertxGen(CompositeFuture, jVal));
      return jRet._jdel;
    }), undefined);
    }  else if (__args.length === 2 && typeof __args[0] === 'function' && typeof __args[1] === 'object' && __args[1]._jdel) {
      return utils.convReturnVertxGen(Future, j_compositeFuture.compose(function(jVal) {
      __args[0](utils.convReturnVertxGen(CompositeFuture, jVal));
    }, __args[1]._jdel), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the result of a future to a specific <code>value</code>.<p>
  
   When this future succeeds, this <code>value</code> will complete the future returned by this method call.<p>
  
   When this future fails, the failure will be propagated to the returned future.

   @public
   @param value {Object} the value that eventually completes the mapped future 
   @return {Future} the mapped future
   */
  this.map = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_compositeFuture.map(function(jVal) {
      var jRet = __args[0](utils.convReturnVertxGen(CompositeFuture, jVal));
      return utils.convParamTypeUnknown(jRet);
    }), undefined);
    }  else if (__args.length === 1 && typeof __args[0] !== 'function') {
      return utils.convReturnVertxGen(Future, j_compositeFuture.map(utils.convParamTypeUnknown(__args[0])), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the result of a future to <code>null</code>.<p>
  
   This is a conveniency for <code>future.map((T) null)</code> or <code>future.map((Void) null)</code>.<p>
  
   When this future succeeds, <code>null</code> will complete the future returned by this method call.<p>
  
   When this future fails, the failure will be propagated to the returned future.

   @public

   @return {Future} the mapped future
   */
  this.mapEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Future, j_compositeFuture.mapEmpty(), undefined);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {function} an handler completing this future
   */
  this.completer = function() {
    var __args = arguments;
    if (__args.length === 0) {
      if (that.cachedcompleter == null) {
        that.cachedcompleter = utils.convReturnHandlerAsyncResult(j_compositeFuture.completer(), function(result) { return result._jdel; });
      }
      return that.cachedcompleter;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Handles a failure of this Future by returning the result of another Future.
   If the mapper fails, then the returned future will be failed with this failure.

   @public
   @param mapper {todo} A function which takes the exception of a failure and returns a new future. 
   @return {Future} A recovered future
   */
  this.recover = function(mapper) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_compositeFuture.recover(function(jVal) {
      var jRet = mapper(utils.convReturnThrowable(jVal));
      return jRet._jdel;
    }), CompositeFuture._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the failure of a future to a specific <code>value</code>.<p>
  
   When this future fails, this <code>value</code> will complete the future returned by this method call.<p>
  
   When this future succeeds, the result will be propagated to the returned future.

   @public
   @param value {CompositeFuture} the value that eventually completes the mapped future 
   @return {Future} the mapped future
   */
  this.otherwise = function() {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      return utils.convReturnVertxGen(Future, j_compositeFuture.otherwise(function(jVal) {
      var jRet = __args[0](utils.convReturnThrowable(jVal));
      return jRet._jdel;
    }), CompositeFuture._jtype);
    }  else if (__args.length === 1 && typeof __args[0] === 'object' && __args[0]._jdel) {
      return utils.convReturnVertxGen(Future, j_compositeFuture.otherwise(__args[0]._jdel), CompositeFuture._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Map the failure of a future to <code>null</code>.<p>
  
   This is a convenience for <code>future.otherwise((T) null)</code>.<p>
  
   When this future fails, the <code>null</code> value will complete the future returned by this method call.<p>
  
   When this future succeeds, the result will be propagated to the returned future.

   @public

   @return {Future} the mapped future
   */
  this.otherwiseEmpty = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return utils.convReturnVertxGen(Future, j_compositeFuture.otherwiseEmpty(), CompositeFuture._jtype);
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public
   @param handler {function} 
   @return {CompositeFuture}
   */
  this.setHandler = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_compositeFuture.setHandler(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(CompositeFuture, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Returns the result of a wrapped future

   @public
   @param index {number} the wrapped future index 
   @return {Object}
   */
  this.resultAt = function(index) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      return utils.convReturnTypeUnknown(j_compositeFuture.resultAt(index));
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**

   @public

   @return {number} the number of wrapped future
   */
  this.size = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_compositeFuture.size();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_compositeFuture;
};

CompositeFuture._jclass = utils.getJavaClass("io.vertx.core.CompositeFuture");
CompositeFuture._jtype = {
  accept: function(obj) {
    return CompositeFuture._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(CompositeFuture.prototype, {});
    CompositeFuture.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
CompositeFuture._create = function(jdel) {
  var obj = Object.create(CompositeFuture.prototype, {});
  CompositeFuture.apply(obj, arguments);
  return obj;
}
/**
 Like {@link CompositeFuture#all} but with 6 futures.

 @memberof module:vertx-js/composite_future
 @param f1 {Future} 
 @param f2 {Future} 
 @param f3 {Future} 
 @param f4 {Future} 
 @param f5 {Future} 
 @param f6 {Future} 
 @return {CompositeFuture}
 */
CompositeFuture.all = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(utils.convParamListVertxGen(__args[0])));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(__args[0]._jdel, __args[1]._jdel));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel));
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel));
  }else if (__args.length === 6 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel && typeof __args[5] === 'object' && __args[5]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.all(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel, __args[5]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Like {@link CompositeFuture#any} but with 6 futures.

 @memberof module:vertx-js/composite_future
 @param f1 {Future} 
 @param f2 {Future} 
 @param f3 {Future} 
 @param f4 {Future} 
 @param f5 {Future} 
 @param f6 {Future} 
 @return {CompositeFuture}
 */
CompositeFuture.any = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(utils.convParamListVertxGen(__args[0])));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(__args[0]._jdel, __args[1]._jdel));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel));
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel));
  }else if (__args.length === 6 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel && typeof __args[5] === 'object' && __args[5]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.any(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel, __args[5]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

/**
 Like {@link CompositeFuture#join} but with 6 futures.

 @memberof module:vertx-js/composite_future
 @param f1 {Future} 
 @param f2 {Future} 
 @param f3 {Future} 
 @param f4 {Future} 
 @param f5 {Future} 
 @param f6 {Future} 
 @return {CompositeFuture}
 */
CompositeFuture.join = function() {
  var __args = arguments;
  if (__args.length === 1 && typeof __args[0] === 'object' && __args[0] instanceof Array) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(utils.convParamListVertxGen(__args[0])));
  }else if (__args.length === 2 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(__args[0]._jdel, __args[1]._jdel));
  }else if (__args.length === 3 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel));
  }else if (__args.length === 4 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel));
  }else if (__args.length === 5 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel));
  }else if (__args.length === 6 && typeof __args[0] === 'object' && __args[0]._jdel && typeof __args[1] === 'object' && __args[1]._jdel && typeof __args[2] === 'object' && __args[2]._jdel && typeof __args[3] === 'object' && __args[3]._jdel && typeof __args[4] === 'object' && __args[4]._jdel && typeof __args[5] === 'object' && __args[5]._jdel) {
    return utils.convReturnVertxGen(CompositeFuture, JCompositeFuture.join(__args[0]._jdel, __args[1]._jdel, __args[2]._jdel, __args[3]._jdel, __args[4]._jdel, __args[5]._jdel));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = CompositeFuture;