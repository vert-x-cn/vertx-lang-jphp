package io.vertx.php.servicediscovery.spi;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import io.vertx.php.servicediscovery.spi.ServicePublisher;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServiceImporter")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
@SuppressWarnings("ALL")
public class ServiceImporter extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.spi.ServiceImporter>{
    
    private ServiceImporter(Environment env, io.vertx.servicediscovery.spi.ServiceImporter wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServiceImporter __create(Environment env, io.vertx.servicediscovery.spi.ServiceImporter wrappedObject){
        return new ServiceImporter(env, wrappedObject);
    }

    @Signature
    public void start(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServicePublisher.class, ServicePublisher.class, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3)) {
            this.getWrappedObject().start(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.servicediscovery.spi.ServicePublisher, ServicePublisher  >convParamVertxGenVariable0(__ENV__, ServicePublisher.class, ServicePublisher::__create, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.  <io.vertx.core.Future<Void>, Future<Void>  , Void  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.VOID, arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
