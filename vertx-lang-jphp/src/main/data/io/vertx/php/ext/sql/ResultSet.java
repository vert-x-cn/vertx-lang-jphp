package io.vertx.php.ext.sql;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ResultSet")
@Namespace("io\\vertx\\php\\ext\\sql")
//false
public  class ResultSet extends DataObjectWrapper<io.vertx.ext.sql.ResultSet> { 
    public ResultSet(Environment env, io.vertx.ext.sql.ResultSet wrappedObject) {
        super(env, wrappedObject);
    }

    public ResultSet(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.sql.ResultSet();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.sql.ResultSet(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<String> getColumnNames(){ 
        return this.getWrappedObject().getColumnNames();
    }

    @Signature
    public ResultSet setColumnNames(List<String> columnNames){ 
        this.getWrappedObject().setColumnNames(columnNames);
        return this;
    }

    @Signature
    public ResultSet getNext(){ 
        return new ResultSet(__env__, this.getWrappedObject().getNext());
    }

    @Signature
    public ResultSet setNext(ResultSet next){ 
        this.getWrappedObject().setNext(next.getWrappedObject());
        return this;
    }

    @Signature
    public int getNumColumns(){ 
        return this.getWrappedObject().getNumColumns();
    }

    @Signature
    public int getNumRows(){ 
        return this.getWrappedObject().getNumRows();
    }

    @Signature
    public JsonArray getOutput(){ 
        return this.getWrappedObject().getOutput();
    }

    @Signature
    public ResultSet setOutput(JsonArray output){ 
        this.getWrappedObject().setOutput(output);
        return this;
    }

    @Signature
    public List<JsonArray> getResults(){ 
        return this.getWrappedObject().getResults();
    }

    @Signature
    public ResultSet setResults(List<JsonArray> results){ 
        this.getWrappedObject().setResults(results);
        return this;
    }

    @Signature
    public List<JsonObject> getRows(){ 
        return this.getWrappedObject().getRows();
    }
}
