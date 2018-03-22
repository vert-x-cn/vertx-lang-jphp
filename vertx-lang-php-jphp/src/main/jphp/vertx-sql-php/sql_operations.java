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

package io.vertx.php.ext.sql;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.sql.SQLRowStream;

/**
 Represents a SQL query interface to a database

 * @class
 */
@Name("SQLOperations")
@Namespace("io\\vertx\\php\\ext\\sql")
public class SQLOperations extends BaseWrapper<SQLOperations>{

  /**
   Executes the given SQL <code>SELECT</code> statement which returns the results of the query.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLOperations}
   */
  this.query = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLOperations.query(sql, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param params {todo} these are the parameters to fill the statement. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLOperations}
   */
  this.queryWithParams = function(sql, params, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLOperations.queryWithParams(sql, utils.convParamJsonArray(params), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param handler {function} the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>. 
   @return {SQLOperations}
   */
  this.queryStream = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLOperations.queryStream(sql, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(SQLRowStream, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param params {todo} these are the parameters to fill the statement. 
   @param handler {function} the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>. 
   @return {SQLOperations}
   */
  this.queryStreamWithParams = function(sql, params, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLOperations.queryStreamWithParams(sql, utils.convParamJsonArray(params), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(SQLRowStream, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by
   getting a connection from the pool (this object) and return it back after the execution. Only the first result
   from the result set is returned.

   @public
   @param sql {string} the statement to execute 
   @param handler {function} the result handler 
   @return {SQLOperations} self
   */
  this.querySingle = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLOperations.querySingle(sql, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the
   boilerplate code by getting a connection from the pool (this object) and return it back after the execution.
   Only the first result from the result set is returned.

   @public
   @param sql {string} the statement to execute 
   @param arguments {todo} the arguments 
   @param handler {function} the result handler 
   @return {SQLOperations} self
   */
  this.querySingleWithParams = function(sql, arguments, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLOperations.querySingleWithParams(sql, utils.convParamJsonArray(arguments), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnJson(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
   statement.

   @public
   @param sql {string} the SQL to execute. For example <code>INSERT INTO table ...</code> 
   @param resultHandler {function} the handler which is called once the operation completes. 
   @return {SQLOperations}
   */
  this.update = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLOperations.update(sql, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
   statement with the given parameters

   @public
   @param sql {string} the SQL to execute. For example <code>INSERT INTO table ...</code> 
   @param params {todo} these are the parameters to fill the statement. 
   @param resultHandler {function} the handler which is called once the operation completes. 
   @return {SQLOperations}
   */
  this.updateWithParams = function(sql, params, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLOperations.updateWithParams(sql, utils.convParamJsonArray(params), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.

   @public
   @param sql {string} the SQL to execute. For example <code>{call getEmpName}</code>. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLOperations}
   */
  this.call = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLOperations.call(sql, function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
  
   The index of params and outputs are important for both arrays, for example when dealing with a prodecure that
   takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:
  
   <pre>
     params = [VALUE1, VALUE2, null]
     outputs = [null, null, "VARCHAR"]
   </pre>

   @public
   @param sql {string} the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>. 
   @param params {todo} these are the parameters to fill the statement. 
   @param outputs {todo} these are the outputs to fill the statement. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLOperations}
   */
  this.callWithParams = function(sql, params, outputs, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_sQLOperations.callWithParams(sql, utils.convParamJsonArray(params), utils.convParamJsonArray(outputs), function(ar) {
      if (ar.succeeded()) {
        resultHandler(utils.convReturnDataObject(ar.result()), null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_sQLOperations;
};

SQLOperations._jclass = utils.getJavaClass("io.vertx.ext.sql.SQLOperations");
SQLOperations._jtype = {
  accept: function(obj) {
    return SQLOperations._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SQLOperations.prototype, {});
    SQLOperations.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SQLOperations._create = function(jdel) {
  var obj = Object.create(SQLOperations.prototype, {});
  SQLOperations.apply(obj, arguments);
  return obj;
}
module.exports = SQLOperations;