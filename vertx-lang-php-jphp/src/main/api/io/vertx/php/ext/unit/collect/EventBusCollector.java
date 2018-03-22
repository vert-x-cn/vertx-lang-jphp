package io.vertx.php.ext.unit.collect;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.report.TestSuiteReport;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.eventbus.MessageConsumer;
@Name("EventBusCollector")
@Namespace("io\\vertx\\php\\ext\\unit\\collect")
public interface EventBusCollector<S extends io.vertx.ext.unit.collect.EventBusCollector> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusCollectorImpl::new, io.vertx.ext.unit.collect.EventBusCollector.create(vertx, options)
    }

    @Signature
    default Memory register(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().register(address)
    }

}
