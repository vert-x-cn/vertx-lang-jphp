package io.vertx.php.ext.unit;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.ext.unit.report.ReportOptions;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("TestOptions")
@Namespace("io\\vertx\\php\\ext\\unit")
//false
public  class TestOptions extends DataObjectWrapper<io.vertx.ext.unit.TestOptions> { 
    public TestOptions(Environment env, io.vertx.ext.unit.TestOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public TestOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.unit.TestOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.unit.TestOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public TestOptions addReporter(io.vertx.ext.unit.report.ReportOptions reporters){ 
        this.getWrappedObject().addReporter(reporters);
        return this;
    }

    @Signature
    public List<ReportOptions> getReporters(){ 
        return this.getWrappedObject().getReporters().stream().map(v -> new ReportOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public TestOptions setReporters(List<ReportOptions> reporters){ 
        this.getWrappedObject().setReporters((reporters.stream().map(ReportOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public long getTimeout(){ 
        return this.getWrappedObject().getTimeout();
    }

    @Signature
    public TestOptions setTimeout(long timeout){ 
        this.getWrappedObject().setTimeout(timeout);
        return this;
    }

    @Signature
    public Boolean isUseEventLoop(){ 
        return this.getWrappedObject().isUseEventLoop();
    }

    @Signature
    public TestOptions setUseEventLoop(Boolean useEventLoop){ 
        this.getWrappedObject().setUseEventLoop(useEventLoop);
        return this;
    }
}
