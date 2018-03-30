package io.vertx.php.ext.unit.report;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ReportingOptions")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
//false
public  class ReportingOptions extends DataObjectWrapper<io.vertx.ext.unit.report.ReportingOptions> { 
    public ReportingOptions(Environment env, io.vertx.ext.unit.report.ReportingOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ReportingOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.unit.report.ReportingOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.unit.report.ReportingOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public ReportingOptions addReporter(io.vertx.ext.unit.report.ReportOptions reporters){ 
        this.getWrappedObject().addReporter(reporters);
        return this;
    }

    @Signature
    public List<ReportOptions> getReporters(){ 
        return this.getWrappedObject().getReporters().stream().map(v -> new ReportOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public ReportingOptions setReporters(List<ReportOptions> reporters){ 
        this.getWrappedObject().setReporters((reporters.stream().map(ReportOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
