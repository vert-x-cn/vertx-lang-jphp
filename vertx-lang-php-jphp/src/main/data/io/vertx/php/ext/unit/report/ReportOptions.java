package io.vertx.php.ext.unit.report;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ReportOptions")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
//false
public  class ReportOptions extends DataObjectWrapper<io.vertx.ext.unit.report.ReportOptions> { 
    public ReportOptions(Environment env, io.vertx.ext.unit.report.ReportOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ReportOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.unit.report.ReportOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.unit.report.ReportOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getFormat(){ 
        return this.getWrappedObject().getFormat();
    }

    @Signature
    public ReportOptions setFormat(String format){ 
        this.getWrappedObject().setFormat(format);
        return this;
    }

    @Signature
    public String getTo(){ 
        return this.getWrappedObject().getTo();
    }

    @Signature
    public ReportOptions setTo(String to){ 
        this.getWrappedObject().setTo(to);
        return this;
    }
}
