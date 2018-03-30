package io.vertx.php.core.shareddata;
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
@Name("Lock")
@Namespace("io\\vertx\\php\\core\\shareddata")
@SuppressWarnings("ALL")
public class Lock extends VertxGenVariable0Wrapper<io.vertx.core.shareddata.Lock>{
    
    private Lock(Environment env, io.vertx.core.shareddata.Lock wrappedObject){
        super(env, wrappedObject);
    }
    public static  Lock __create(Environment env, io.vertx.core.shareddata.Lock wrappedObject){
        return new Lock(env, wrappedObject);
    }

    @Signature
    public void release(Environment __ENV__) {
        this.getWrappedObject().release();
    }/*1*/

}
