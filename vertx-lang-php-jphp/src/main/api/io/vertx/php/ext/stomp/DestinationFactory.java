package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.stomp.Destination;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DestinationFactory")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class DestinationFactory extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.DestinationFactory>{
    
    private DestinationFactory(Environment env, io.vertx.ext.stomp.DestinationFactory wrappedObject){
        super(env, wrappedObject);
    }
    public static  DestinationFactory __create(Environment env, io.vertx.ext.stomp.DestinationFactory wrappedObject){
        return new DestinationFactory(env, wrappedObject);
    }

    @Signature
    public Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.stomp.Destination, Destination>convReturnVertxGenVariable0(__ENV__, Destination.class, Destination::__create, this.getWrappedObject().create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
