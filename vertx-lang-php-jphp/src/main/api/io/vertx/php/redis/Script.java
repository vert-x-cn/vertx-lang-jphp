package io.vertx.php.redis;
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
@Name("Script")
@Namespace("io\\vertx\\php\\redis")
@SuppressWarnings("ALL")
public class Script extends VertxGenVariable0Wrapper<io.vertx.redis.Script>{
    
    private Script(Environment env, io.vertx.redis.Script wrappedObject){
        super(env, wrappedObject);
    }
    public static  Script __create(Environment env, io.vertx.redis.Script wrappedObject){
        return new Script(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.redis.Script, Script>convReturnVertxGenVariable0(__ENV__, Script.class, Script::__create, io.vertx.redis.Script.create(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.redis.Script, Script>convReturnVertxGenVariable0(__ENV__, Script.class, Script::__create, io.vertx.redis.Script.create(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getScript(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getScript());
    }/*1*/

    @Signature
    public Memory getSha1(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getSha1());
    }/*1*/

}
