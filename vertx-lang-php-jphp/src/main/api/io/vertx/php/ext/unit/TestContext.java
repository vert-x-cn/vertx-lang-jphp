package io.vertx.php.ext.unit;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.unit.Async;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestContext")
@Namespace("io\\vertx\\php\\ext\\unit")
@SuppressWarnings("ALL")
public class TestContext extends VertxGenVariable0Wrapper<io.vertx.ext.unit.TestContext>{
    
    private TestContext(Environment env, io.vertx.ext.unit.TestContext wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestContext __create(Environment env, io.vertx.ext.unit.TestContext wrappedObject){
        return new TestContext(env, wrappedObject);
    }

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().remove(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertNull(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            this.getWrappedObject().assertNull(Utils.convParamObject(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertNull(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().assertNull(Utils.convParamObject(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertNotNull(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            this.getWrappedObject().assertNotNull(Utils.convParamObject(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertNotNull(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().assertNotNull(Utils.convParamObject(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertTrue(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().assertTrue(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertTrue(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().assertTrue(Utils.convParamBoolean(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertFalse(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().assertFalse(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertFalse(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().assertFalse(Utils.convParamBoolean(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertEquals(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().assertEquals(Utils.convParamObject(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertEquals(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            this.getWrappedObject().assertEquals(Utils.convParamObject(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamString(__ENV__, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertInRange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isDouble(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2)) {
            this.getWrappedObject().assertInRange(Utils.convParamDouble(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertInRange(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isDouble(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDouble(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isDouble(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            this.getWrappedObject().assertInRange(Utils.convParamDouble(__ENV__, arg0), Utils.convParamDouble(__ENV__, arg1), Utils.convParamDouble(__ENV__, arg2), Utils.convParamString(__ENV__, arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory assertNotEquals(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().assertNotEquals(Utils.convParamObject(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory assertNotEquals(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            this.getWrappedObject().assertNotEquals(Utils.convParamObject(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1), Utils.convParamString(__ENV__, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory verify(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().verify(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void fail(Environment __ENV__) {
        this.getWrappedObject().fail();
    }/*4*/

    @Signature
    public void fail(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamString(__ENV__, arg0));
        } else if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamThrowable(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory async(Environment __ENV__) {
        return Utils.<io.vertx.ext.unit.Async, Async>convReturnVertxGenVariable0(__ENV__, Async.class, Async::__create, this.getWrappedObject().async());
    }/*4*/

    @Signature
    public Memory async(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.unit.Async, Async>convReturnVertxGenVariable0(__ENV__, Async.class, Async::__create, this.getWrappedObject().async(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory strictAsync(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.unit.Async, Async>convReturnVertxGenVariable0(__ENV__, Async.class, Async::__create, this.getWrappedObject().strictAsync(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory asyncAssertSuccess(Environment __ENV__) {
        return Utils.convReturnHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE,this.getWrappedObject().asyncAssertSuccess());
    }/*4*/

    @Signature
    public Memory asyncAssertSuccess(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.convReturnHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE,this.getWrappedObject().asyncAssertSuccess(Utils.convParamHandler(__ENV__, TypeConverter.UNKNOWN_TYPE, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory asyncAssertFailure(Environment __ENV__) {
        return Utils.convReturnHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE,this.getWrappedObject().asyncAssertFailure());
    }/*4*/

    @Signature
    public Memory asyncAssertFailure(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.convReturnHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE,this.getWrappedObject().asyncAssertFailure(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__) {
        return Utils.convReturnHandler(__ENV__, TypeConverter.THROWABLE,this.getWrappedObject().exceptionHandler());
    }/*1*/

}
