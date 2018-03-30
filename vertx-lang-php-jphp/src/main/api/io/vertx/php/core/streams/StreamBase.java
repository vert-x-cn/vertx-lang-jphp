package io.vertx.php.core.streams;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StreamBase")
@Namespace("io\\vertx\\php\\core\\streams")
@SuppressWarnings("ALL")
public class StreamBase extends VertxGenVariable0Wrapper<io.vertx.core.streams.StreamBase>{
    
    private StreamBase(Environment env, io.vertx.core.streams.StreamBase wrappedObject){
        super(env, wrappedObject);
    }
    public static  StreamBase __create(Environment env, io.vertx.core.streams.StreamBase wrappedObject){
        return new StreamBase(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
