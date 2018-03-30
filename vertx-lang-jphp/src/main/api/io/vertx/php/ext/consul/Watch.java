package io.vertx.php.ext.consul;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Watch")
@Namespace("io\\vertx\\php\\ext\\consul")
@SuppressWarnings("ALL")
public class Watch<T> extends VertxGenVariable1Wrapper<io.vertx.ext.consul.Watch<T>,T>{
    
    private Watch(Environment env, io.vertx.ext.consul.Watch<T> wrappedObject, TypeConverter<T> watchVariableTConverter){
        super(env, wrappedObject, watchVariableTConverter);
    }
    public static <T> Watch<T> __create(Environment env, io.vertx.ext.consul.Watch<T> wrappedObject, TypeConverter<T> watchVariableTConverter){
        return new Watch<>(env, wrappedObject, watchVariableTConverter);
    }

    public static Watch<Object> __create(Environment env, io.vertx.ext.consul.Watch<Object> wrappedObject) {
        return new Watch<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getWatchVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setWatchVariableTConverter(TypeConverter<T> watchVariableTConverter) {
        this.setTypeConverter1(watchVariableTConverter);
    }

    @Signature
    public static Memory key(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.KeyValue>, Watch<io.vertx.ext.consul.KeyValue>, io.vertx.ext.consul.KeyValue>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.KeyValue.class), io.vertx.ext.consul.Watch.key(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory key(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.KeyValue>, Watch<io.vertx.ext.consul.KeyValue>, io.vertx.ext.consul.KeyValue>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.KeyValue.class), io.vertx.ext.consul.Watch.key(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory keyPrefix(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.KeyValueList>, Watch<io.vertx.ext.consul.KeyValueList>, io.vertx.ext.consul.KeyValueList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.KeyValueList.class), io.vertx.ext.consul.Watch.keyPrefix(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory keyPrefix(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.KeyValueList>, Watch<io.vertx.ext.consul.KeyValueList>, io.vertx.ext.consul.KeyValueList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.KeyValueList.class), io.vertx.ext.consul.Watch.keyPrefix(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory services(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.ServiceList>, Watch<io.vertx.ext.consul.ServiceList>, io.vertx.ext.consul.ServiceList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.ServiceList.class), io.vertx.ext.consul.Watch.services(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory services(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.ServiceList>, Watch<io.vertx.ext.consul.ServiceList>, io.vertx.ext.consul.ServiceList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.ServiceList.class), io.vertx.ext.consul.Watch.services(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory service(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.ServiceEntryList>, Watch<io.vertx.ext.consul.ServiceEntryList>, io.vertx.ext.consul.ServiceEntryList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.ServiceEntryList.class), io.vertx.ext.consul.Watch.service(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory service(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.ServiceEntryList>, Watch<io.vertx.ext.consul.ServiceEntryList>, io.vertx.ext.consul.ServiceEntryList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.ServiceEntryList.class), io.vertx.ext.consul.Watch.service(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory events(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.EventList>, Watch<io.vertx.ext.consul.EventList>, io.vertx.ext.consul.EventList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.EventList.class), io.vertx.ext.consul.Watch.events(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory events(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.EventList>, Watch<io.vertx.ext.consul.EventList>, io.vertx.ext.consul.EventList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.EventList.class), io.vertx.ext.consul.Watch.events(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory nodes(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.NodeList>, Watch<io.vertx.ext.consul.NodeList>, io.vertx.ext.consul.NodeList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.NodeList.class), io.vertx.ext.consul.Watch.nodes(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory nodes(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg1)) {
            return Utils.<io.vertx.ext.consul.Watch<io.vertx.ext.consul.NodeList>, Watch<io.vertx.ext.consul.NodeList>, io.vertx.ext.consul.NodeList>convReturnVertxGenVariable1(__ENV__, Watch.class, Watch::__create, DataObjectConverter.create(io.vertx.ext.consul.NodeList.class), io.vertx.ext.consul.Watch.nodes(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.consul.ConsulClientOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().setHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.consul.WatchResult<T>, WatchResult<T>, T>create1(WatchResult.class, WatchResult::__create, getWatchVariableTConverter()), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory start(Environment __ENV__) {
        this.getWrappedObject().start();
        return toMemory();
    }/*1*/

    @Signature
    public void stop(Environment __ENV__) {
        this.getWrappedObject().stop();
    }/*1*/

}
