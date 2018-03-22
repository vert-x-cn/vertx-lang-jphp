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
import io.vertx.php.ext.sql.SQLOperations;

/**
 Represents a connection to a SQL database

 * @class
 */
@Name("SQLConnection")
@Namespace("io\\vertx\\php\\ext\\sql")
public class SQLConnection extends BaseWrapper<SQLConnection>{
  SQLOperations.call(this, j_val);

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
      j_sQLConnection.querySingle(sql, function(ar) {
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
      j_sQLConnection.querySingleWithParams(sql, utils.convParamJsonArray(arguments), function(ar) {
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
   Sets the desired options to be applied to the current connection when statements are executed.
  
   The options are not applied globally but applicable to the current connection. For example changing the transaction
   isolation level will only affect statements run on this connection and not future or current connections acquired
   from the connection pool.
  
   This method is not async in nature since the apply will only happen at the moment a query is run.

   @public
   @param options {Object} the options to modify the unwrapped connection. 
   @return {SQLConnection}
   */
  this.setOptions = function(options) {
    var __args = arguments;
    if (__args.length === 1 && (typeof __args[0] === 'object' && __args[0] != null)) {
      j_sQLConnection.setOptions(options != null ? new SQLOptions(new JsonObject(Java.asJSONCompatible(options))) : null);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets the auto commit flag for this connection. True by default.

   @public
   @param autoCommit {boolean} the autoCommit flag, true by default. 
   @param resultHandler {function} the handler which is called once this operation completes. 
   @return {SQLConnection}
   */
  this.setAutoCommit = function(autoCommit, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] ==='boolean' && typeof __args[1] === 'function') {
      j_sQLConnection.setAutoCommit(autoCommit, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL statement

   @public
   @param sql {string} the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code> 
   @param resultHandler {function} the handler which is called once this operation completes. 
   @return {SQLConnection}
   */
  this.execute = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.execute(sql, function(ar) {
      if (ar.succeeded()) {
        resultHandler(null, null);
      } else {
        resultHandler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Executes the given SQL <code>SELECT</code> statement which returns the results of the query.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLConnection}
   */
  this.query = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.query(sql, function(ar) {
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
   @return {SQLConnection}
   */
  this.queryStream = function(sql, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.queryStream(sql, function(ar) {
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
   Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.

   @public
   @param sql {string} the SQL to execute. For example <code>SELECT * FROM table ...</code>. 
   @param params {todo} these are the parameters to fill the statement. 
   @param resultHandler {function} the handler which is called once the operation completes. It will return a <code>ResultSet</code>. 
   @return {SQLConnection}
   */
  this.queryWithParams = function(sql, params, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLConnection.queryWithParams(sql, utils.convParamJsonArray(params), function(ar) {
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
   @param params {todo} these are the parameters to fill the statement. 
   @param handler {function} the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>. 
   @return {SQLConnection}
   */
  this.queryStreamWithParams = function(sql, params, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLConnection.queryStreamWithParams(sql, utils.convParamJsonArray(params), function(ar) {
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
   Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
   statement.

   @public
   @param sql {string} the SQL to execute. For example <code>INSERT INTO table ...</code> 
   @param resultHandler {function} the handler which is called once the operation completes. 
   @return {SQLConnection}
   */
  this.update = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.update(sql, function(ar) {
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
   @return {SQLConnection}
   */
  this.updateWithParams = function(sql, params, resultHandler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLConnection.updateWithParams(sql, utils.convParamJsonArray(params), function(ar) {
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
   @return {SQLConnection}
   */
  this.call = function(sql, resultHandler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.call(sql, function(ar) {
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
   @return {SQLConnection}
   */
  this.callWithParams = function(sql, params, outputs, resultHandler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_sQLConnection.callWithParams(sql, utils.convParamJsonArray(params), utils.convParamJsonArray(outputs), function(ar) {
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
   Closes the connection. Important to always close the connection when you are done so it's returned to the pool.

   @public
   @param handler {function} the handler called when this operation completes. 
   */
  this.close = function() {
    var __args = arguments;
    if (__args.length === 0) {
      j_sQLConnection.close();
    }  else if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sQLConnection.close(function(ar) {
      if (ar.succeeded()) {
        __args[0](null, null);
      } else {
        __args[0](null, ar.cause());
      }
    });
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Commits all changes made since the previous commit/rollback.

   @public
   @param handler {function} the handler called when this operation completes. 
   @return {SQLConnection}
   */
  this.commit = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sQLConnection.commit(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Rolls back all changes made since the previous commit/rollback.

   @public
   @param handler {function} the handler called when this operation completes. 
   @return {SQLConnection}
   */
  this.rollback = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sQLConnection.rollback(function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Sets a connection wide query timeout.
  
   It can be over written at any time and becomes active on the next query call.

   @public
   @param timeoutInSeconds {number} the max amount of seconds the query can take to execute. 
   @return {SQLConnection}
   */
  this.setQueryTimeout = function(timeoutInSeconds) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] ==='number') {
      j_sQLConnection.setQueryTimeout(timeoutInSeconds);
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Batch simple SQL strings and execute the batch where the async result contains a array of Integers.

   @public
   @param sqlStatements {Array.<string>} sql statement 
   @param handler {function} the result handler 
   @return {SQLConnection}
   */
  this.batch = function(sqlStatements, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'object' && __args[0] instanceof Array && typeof __args[1] === 'function') {
      j_sQLConnection.batch(utils.convParamListBasicOther(sqlStatements), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Batch a prepared statement with all entries from the args list. Each entry is a batch.
   The operation completes with the execution of the batch where the async result contains a array of Integers.

   @public
   @param sqlStatement {string} sql statement 
   @param args {Array.<todo>} the prepared statement arguments 
   @param handler {function} the result handler 
   @return {SQLConnection}
   */
  this.batchWithParams = function(sqlStatement, args, handler) {
    var __args = arguments;
    if (__args.length === 3 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'function') {
      j_sQLConnection.batchWithParams(sqlStatement, utils.convParamListJsonArray(args), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Batch a callable statement with all entries from the args list. Each entry is a batch.
   The size of the lists inArgs and outArgs MUST be the equal.
   The operation completes with the execution of the batch where the async result contains a array of Integers.

   @public
   @param sqlStatement {string} sql statement 
   @param inArgs {Array.<todo>} the callable statement input arguments 
   @param outArgs {Array.<todo>} the callable statement output arguments 
   @param handler {function} the result handler 
   @return {SQLConnection}
   */
  this.batchCallableWithParams = function(sqlStatement, inArgs, outArgs, handler) {
    var __args = arguments;
    if (__args.length === 4 && typeof __args[0] === 'string' && typeof __args[1] === 'object' && __args[1] instanceof Array && typeof __args[2] === 'object' && __args[2] instanceof Array && typeof __args[3] === 'function') {
      j_sQLConnection.batchCallableWithParams(sqlStatement, utils.convParamListJsonArray(inArgs), utils.convParamListJsonArray(outArgs), function(ar) {
      if (ar.succeeded()) {
        handler(ar.result(), null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Attempts to change the transaction isolation level for this Connection object to the one given.
  
   The constants defined in the interface Connection are the possible transaction isolation levels.

   @public
   @param isolation {Object} the level of isolation 
   @param handler {function} the handler called when this operation completes. 
   @return {SQLConnection}
   */
  this.setTransactionIsolation = function(isolation, handler) {
    var __args = arguments;
    if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
      j_sQLConnection.setTransactionIsolation(io.vertx.ext.sql.TransactionIsolation.valueOf(isolation), function(ar) {
      if (ar.succeeded()) {
        handler(null, null);
      } else {
        handler(null, ar.cause());
      }
    });
      return that;
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Attempts to return the transaction isolation level for this Connection object to the one given.

   @public
   @param handler {function} the handler called when this operation completes. 
   @return {SQLConnection}
   */
  this.getTransactionIsolation = function(handler) {
    var __args = arguments;
    if (__args.length === 1 && typeof __args[0] === 'function') {
      j_sQLConnection.getTransactionIsolation(function(ar) {
      if (ar.succeeded()) {
        handler(utils.convReturnEnum(ar.result()), null);
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
  this._jdel = j_sQLConnection;
};

SQLConnection._jclass = utils.getJavaClass("io.vertx.ext.sql.SQLConnection");
SQLConnection._jtype = {
  accept: function(obj) {
    return SQLConnection._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(SQLConnection.prototype, {});
    SQLConnection.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
SQLConnection._create = function(jdel) {
  var obj = Object.create(SQLConnection.prototype, {});
  SQLConnection.apply(obj, arguments);
  return obj;
}
module.exports = SQLConnection;