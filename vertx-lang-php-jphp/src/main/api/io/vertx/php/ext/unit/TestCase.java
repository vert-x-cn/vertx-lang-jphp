package io.vertx.php.ext.unit;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.unit.TestContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestCase")
@Namespace("io\\vertx\\php\\ext\\unit")
@SuppressWarnings("ALL")
public class TestCase extends VertxGenVariable0Wrapper<io.vertx.ext.unit.TestCase>{
    
    private TestCase(Environment env, io.vertx.ext.unit.TestCase wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestCase __create(Environment env, io.vertx.ext.unit.TestCase wrappedObject){
        return new TestCase(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.unit.TestCase, TestCase>convReturnVertxGenVariable0(__ENV__, TestCase.class, TestCase::__create, io.vertx.ext.unit.TestCase.create(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
