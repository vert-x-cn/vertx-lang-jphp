package io.vertx.php.servicediscovery;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.servicediscovery.spi.ServiceExporter;
import io.vertx.php.servicediscovery.spi.ServiceImporter;
import java.lang.Void;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ServiceDiscovery")
@Namespace("io\\vertx\\php\\servicediscovery")
@SuppressWarnings("ALL")
public class ServiceDiscovery extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.ServiceDiscovery>{
    
    private ServiceDiscovery(Environment env, io.vertx.servicediscovery.ServiceDiscovery wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServiceDiscovery __create(Environment env, io.vertx.servicediscovery.ServiceDiscovery wrappedObject){
        return new ServiceDiscovery(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, io.vertx.servicediscovery.ServiceDiscovery.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.ServiceDiscoveryOptions.class, arg1)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, io.vertx.servicediscovery.ServiceDiscovery.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.ServiceDiscoveryOptions.class, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, io.vertx.servicediscovery.ServiceDiscovery.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>create0(ServiceDiscovery.class, ServiceDiscovery::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.ServiceDiscoveryOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, io.vertx.servicediscovery.ServiceDiscovery.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.ServiceDiscoveryOptions.class, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>create0(ServiceDiscovery.class, ServiceDiscovery::__create), arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getReference(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0)) {
            return Utils.<io.vertx.servicediscovery.ServiceReference, ServiceReference>convReturnVertxGenVariable0(__ENV__, ServiceReference.class, ServiceReference::__create, this.getWrappedObject().getReference(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getReferenceWithConfiguration(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.servicediscovery.ServiceReference, ServiceReference>convReturnVertxGenVariable0(__ENV__, ServiceReference.class, ServiceReference::__create, this.getWrappedObject().getReferenceWithConfiguration(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory release(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceReference.class, ServiceReference.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().release(Utils.  <io.vertx.servicediscovery.ServiceReference, ServiceReference  >convParamVertxGenVariable0(__ENV__, ServiceReference.class, ServiceReference::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerServiceImporter(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServiceImporter.class, ServiceImporter.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, this.getWrappedObject().registerServiceImporter(Utils.  <io.vertx.servicediscovery.spi.ServiceImporter, ServiceImporter  >convParamVertxGenVariable0(__ENV__, ServiceImporter.class, ServiceImporter::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory registerServiceImporter(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServiceImporter.class, ServiceImporter.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, this.getWrappedObject().registerServiceImporter(Utils.  <io.vertx.servicediscovery.spi.ServiceImporter, ServiceImporter  >convParamVertxGenVariable0(__ENV__, ServiceImporter.class, ServiceImporter::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory registerServiceExporter(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServiceExporter.class, ServiceExporter.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, this.getWrappedObject().registerServiceExporter(Utils.  <io.vertx.servicediscovery.spi.ServiceExporter, ServiceExporter  >convParamVertxGenVariable0(__ENV__, ServiceExporter.class, ServiceExporter::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory registerServiceExporter(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServiceExporter.class, ServiceExporter.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery>convReturnVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, this.getWrappedObject().registerServiceExporter(Utils.  <io.vertx.servicediscovery.spi.ServiceExporter, ServiceExporter  >convParamVertxGenVariable0(__ENV__, ServiceExporter.class, ServiceExporter::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public void publish(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().publish(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void unpublish(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().unpublish(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getRecord(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getRecord(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg1));
        } else if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getRecord(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void getRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getRecord(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg0), Utils.convParamBoolean(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getRecords(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getRecords(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.servicediscovery.Record.class)), arg1));
        } else if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getRecords(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg0), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.servicediscovery.Record.class)), arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void getRecords(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getRecords(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg0), Utils.convParamBoolean(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.servicediscovery.Record.class)), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void update(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().update(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bindings(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, VertxGenVariable0Converter.<io.vertx.servicediscovery.ServiceReference, ServiceReference>create0(ServiceReference.class, ServiceReference::__create),this.getWrappedObject().bindings());
    }/*1*/

    @Signature
    public Memory options(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.ServiceDiscoveryOptions.class, ServiceDiscoveryOptions::new, this.getWrappedObject().options());
    }/*1*/

    @Signature
    public static void releaseServiceObject(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isObject(__ENV__, arg1)) {
            io.vertx.servicediscovery.ServiceDiscovery.releaseServiceObject(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamObject(__ENV__, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
