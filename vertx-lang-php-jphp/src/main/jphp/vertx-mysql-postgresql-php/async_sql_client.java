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

package io.vertx.php.ext.asyncsql;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.sql.SQLRowStream;
import io.vertx.php.ext.sql.SQLConnection;
import io.vertx.php.ext.sql.SQLClient;
import io.vertx.php.ext.sql.SQLOperations;

/**
 Represents an asynchronous SQL client

 * @class
 */
@Name("AsyncSQLClient")
@Namespace("io\\vertx\\php\\ext\\asyncsql")
public class AsyncSQLClient extends BaseWrapper<AsyncSQLClient>{
  SQLClient.call(this, j_val);

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
      j_asyncSQLClient.querySingle(sql, function(ar) {
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
      j_asyncSQLClient.querySingleWithParams(sql, utils.convParamJsonArray(arguments), function(ar) {
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
   Returns a connection that can be used to perform SQL operations on. It's important to remember
   to close the connection when you are done, so it is returned to the pool.

   @public
   @param handler {function} the handler which is called when the <code>JdbcConnection</code> object is ready for use. 
   @return {SQLClient}
   */
  this.getConnection = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_asyncSQLClient.getConnection(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnVertxGen(SQLConnection, ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Close the client and release all resources.
   Call the handler when close is complete.

   @public
   @param handler {function} the handler that will be called when close is complete 
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_asyncSQLClient.close();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_asyncSQLClient.close(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Execute a single SQL statement, this method acquires a connection from the the pool and executes the SQL
   statement and returns it back after the execution.

   @public
   @param sql {string} the statement to execute 
   @param handler {function} the result handler 
   @return {SQLClient} self
   */
  this.query = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_asyncSQLClient.query(sql, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
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
   @param handler {function} the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>. 
   @return {SQLClient}
   */
  this.queryStream = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_asyncSQLClient.queryStream(sql, function(ar) {
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
   @return {SQLClient}
   */
  this.queryStreamWithParams = function(sql, params, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_asyncSQLClient.queryStreamWithParams(sql, utils.convParamJsonArray(params), function(ar) {
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
   Execute a single SQL prepared statement, this method acquires a connection from the the pool and executes the SQL
   prepared statement and returns it back after the execution.

   @public
   @param sql {string} the statement to execute 
   @param arguments {todo} the arguments to the statement 
   @param handler {function} the result handler 
   @return {SQLClient} self
   */
  this.queryWithParams = function(sql, arguments, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_asyncSQLClient.queryWithParams(sql, utils.convParamJsonArray(arguments), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
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
   @param handler {function} the handler which is called once the operation completes. 
   @return {SQLClient}
   */
  this.update = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_asyncSQLClient.update(sql, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
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
   @param handler {function} the handler which is called once the operation completes. 
   @return {SQLClient}
   */
  this.updateWithParams = function(sql, params, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_asyncSQLClient.updateWithParams(sql, utils.convParamJsonArray(params), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.

   @public
   @param sql {string} the SQL to execute. For example <code>{call getEmpName}</code>. 
   @param handler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLClient}
   */
  this.call = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_asyncSQLClient.call(sql, function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
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
   @param handler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLClient}
   */
  this.callWithParams = function(sql, params, outputs, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_asyncSQLClient.callWithParams(sql, utils.convParamJsonArray(params), utils.convParamJsonArray(outputs), function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnDataObject(ar.result()), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_asyncSQLClient;
};

AsyncSQLClient._jclass = utils.getJavaClass("io.vertx.ext.asyncsql.AsyncSQLClient");
AsyncSQLClient._jtype = {
  accept: function(obj) {
    return AsyncSQLClient._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(AsyncSQLClient.prototype, {});
    AsyncSQLClient.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
AsyncSQLClient._create = function(jdel) {
  var obj = Object.create(AsyncSQLClient.prototype, {});
  AsyncSQLClient.apply(obj, arguments);
  return obj;
}
module.exports = AsyncSQLClient;