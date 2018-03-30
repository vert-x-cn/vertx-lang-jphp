package io.vertx.php.ext.healthchecks;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HealthChecks")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
@SuppressWarnings("ALL")
public class HealthChecks extends VertxGenVariable0Wrapper<io.vertx.ext.healthchecks.HealthChecks>{
    
    private HealthChecks(Environment env, io.vertx.ext.healthchecks.HealthChecks wrappedObject){
        super(env, wrappedObject);
    }
    public static  HealthChecks __create(Environment env, io.vertx.ext.healthchecks.HealthChecks wrappedObject){
        return new HealthChecks(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.healthchecks.HealthChecks, HealthChecks>convReturnVertxGenVariable0(__ENV__, HealthChecks.class, HealthChecks::__create, io.vertx.ext.healthchecks.HealthChecks.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory register(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().register(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.ext.healthchecks.Status>, Future<io.vertx.ext.healthchecks.Status>, io.vertx.ext.healthchecks.Status>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.ext.healthchecks.Status.class)), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory register(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().register(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.ext.healthchecks.Status>, Future<io.vertx.ext.healthchecks.Status>, io.vertx.ext.healthchecks.Status>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.ext.healthchecks.Status.class)), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unregister(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().unregister(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory invoke(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().invoke(Utils.convParamHandler(__ENV__, TypeConverter.JSON_OBJECT, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory invoke(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().invoke(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
