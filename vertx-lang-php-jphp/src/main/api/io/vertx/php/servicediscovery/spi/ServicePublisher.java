package io.vertx.php.servicediscovery.spi;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.servicediscovery.Record;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServicePublisher")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
@SuppressWarnings("ALL")
public class ServicePublisher extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.spi.ServicePublisher>{
    
    private ServicePublisher(Environment env, io.vertx.servicediscovery.spi.ServicePublisher wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServicePublisher __create(Environment env, io.vertx.servicediscovery.spi.ServicePublisher wrappedObject){
        return new ServicePublisher(env, wrappedObject);
    }

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
    public void update(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().update(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
