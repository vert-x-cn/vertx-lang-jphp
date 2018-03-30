package io.vertx.php.ext.unit.collect;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.ext.unit.report.ReportingOptions;
import io.vertx.php.ext.unit.report.TestSuiteReport;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("EventBusCollector")
@Namespace("io\\vertx\\php\\ext\\unit\\collect")
@SuppressWarnings("ALL")
public class EventBusCollector extends VertxGenVariable0Wrapper<io.vertx.ext.unit.collect.EventBusCollector>{
    
    private EventBusCollector(Environment env, io.vertx.ext.unit.collect.EventBusCollector wrappedObject){
        super(env, wrappedObject);
    }
    public static  EventBusCollector __create(Environment env, io.vertx.ext.unit.collect.EventBusCollector wrappedObject){
        return new EventBusCollector(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.unit.report.ReportingOptions.class, arg1)) {
            return Utils.<io.vertx.ext.unit.collect.EventBusCollector, EventBusCollector>convReturnVertxGenVariable0(__ENV__, EventBusCollector.class, EventBusCollector::__create, io.vertx.ext.unit.collect.EventBusCollector.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.unit.report.ReportingOptions.class, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.unit.collect.EventBusCollector, EventBusCollector>convReturnVertxGenVariable0(__ENV__, EventBusCollector.class, EventBusCollector::__create, io.vertx.ext.unit.collect.EventBusCollector.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.report.TestSuiteReport, TestSuiteReport>create0(TestSuiteReport.class, TestSuiteReport::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory register(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.eventbus.MessageConsumer, MessageConsumer>convReturnVertxGenVariable0(__ENV__, MessageConsumer.class, MessageConsumer::__create, this.getWrappedObject().register(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
