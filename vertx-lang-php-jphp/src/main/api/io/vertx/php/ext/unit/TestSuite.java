package io.vertx.php.ext.unit;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.unit.TestCompletion;
import io.vertx.php.ext.unit.TestContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestSuite")
@Namespace("io\\vertx\\php\\ext\\unit")
@SuppressWarnings("ALL")
public class TestSuite extends VertxGenVariable0Wrapper<io.vertx.ext.unit.TestSuite>{
    
    private TestSuite(Environment env, io.vertx.ext.unit.TestSuite wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestSuite __create(Environment env, io.vertx.ext.unit.TestSuite wrappedObject){
        return new TestSuite(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.unit.TestSuite, TestSuite>convReturnVertxGenVariable0(__ENV__, TestSuite.class, TestSuite::__create, io.vertx.ext.unit.TestSuite.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory before(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().before(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory beforeEach(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().beforeEach(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory after(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().after(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory afterEach(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().afterEach(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory test(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().test(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory test(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().test(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.TestContext, TestContext>create0(TestContext.class, TestContext::__create), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory run(Environment __ENV__) {
        return Utils.<io.vertx.ext.unit.TestCompletion, TestCompletion>convReturnVertxGenVariable0(__ENV__, TestCompletion.class, TestCompletion::__create, this.getWrappedObject().run());
    }/*4*/

    @Signature
    public Memory run(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.unit.TestOptions.class, arg0)) {
            return Utils.<io.vertx.ext.unit.TestCompletion, TestCompletion>convReturnVertxGenVariable0(__ENV__, TestCompletion.class, TestCompletion::__create, this.getWrappedObject().run(Utils.convParamDataObject(__ENV__, io.vertx.ext.unit.TestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.unit.TestCompletion, TestCompletion>convReturnVertxGenVariable0(__ENV__, TestCompletion.class, TestCompletion::__create, this.getWrappedObject().run(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory run(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.unit.TestOptions.class, arg1)) {
            return Utils.<io.vertx.ext.unit.TestCompletion, TestCompletion>convReturnVertxGenVariable0(__ENV__, TestCompletion.class, TestCompletion::__create, this.getWrappedObject().run(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.unit.TestOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
