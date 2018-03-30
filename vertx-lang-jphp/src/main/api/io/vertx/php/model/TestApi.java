package io.vertx.php.model;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.ContainerConverter;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.EnumConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpServerOptions;
import java.lang.Class;
import java.lang.Void;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("TestApi")
@Namespace("io\\vertx\\php\\model")
@SuppressWarnings("ALL")
public class TestApi<TV, TTT> extends VertxGenVariable2Wrapper<io.vertx.model.TestApi<TV,TTT>,TV,TTT>{
    
    private TestApi(Environment env, io.vertx.model.TestApi<TV,TTT> wrappedObject, TypeConverter<TV> testApiVariableTVConverter, TypeConverter<TTT> testApiVariableTTTConverter){
        super(env, wrappedObject, testApiVariableTVConverter, testApiVariableTTTConverter);
    }
    public static <TV, TTT> TestApi<TV, TTT> __create(Environment env, io.vertx.model.TestApi<TV,TTT> wrappedObject, TypeConverter<TV> testApiVariableTVConverter, TypeConverter<TTT> testApiVariableTTTConverter){
        return new TestApi<>(env, wrappedObject, testApiVariableTVConverter, testApiVariableTTTConverter);
    }

    public static TestApi<Object, Object> __create(Environment env, io.vertx.model.TestApi<Object, Object> wrappedObject) {
        return new TestApi<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<TV> getTestApiVariableTVConverter() {
        return this.getTypeConverter1();
    }

    public void setTestApiVariableTVConverter(TypeConverter<TV> testApiVariableTVConverter) {
        this.setTypeConverter1(testApiVariableTVConverter);
    }

    public TypeConverter<TTT> getTestApiVariableTTTConverter() {
        return this.getTypeConverter2();
    }

    public void setTestApiVariableTTTConverter(TypeConverter<TTT> testApiVariableTTTConverter) {
        this.setTypeConverter2(testApiVariableTTTConverter);
    }

    @Signature
    public Memory testString(Environment __ENV__, Memory arg0) {
        if(Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().testString(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isByte(__ENV__, arg0)) {
            return Utils.convReturnByte(__ENV__, this.getWrappedObject().testByte(Utils.convParamByte(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testByteBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isByte(__ENV__, arg0)) {
            return Utils.convReturnByte(__ENV__, this.getWrappedObject().testByteBoxed(Utils.convParamByte(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testChar(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isCharacter(__ENV__, arg0)) {
            return Utils.convReturnCharacter(__ENV__, this.getWrappedObject().testChar(Utils.convParamCharacter(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isCharacter(__ENV__, arg0)) {
            return Utils.convReturnCharacter(__ENV__, this.getWrappedObject().testCharacter(Utils.convParamCharacter(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testShortBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isShort(__ENV__, arg0)) {
            return Utils.convReturnShort(__ENV__, this.getWrappedObject().testShortBoxed(Utils.convParamShort(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isShort(__ENV__, arg0)) {
            return Utils.convReturnShort(__ENV__, this.getWrappedObject().testShort(Utils.convParamShort(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testIntegerBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, this.getWrappedObject().testIntegerBoxed(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnInteger(__ENV__, this.getWrappedObject().testInteger(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.convReturnLong(__ENV__, this.getWrappedObject().testLong(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testLongBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.convReturnLong(__ENV__, this.getWrappedObject().testLongBoxed(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testDoubleBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDouble(__ENV__, arg0)) {
            return Utils.convReturnDouble(__ENV__, this.getWrappedObject().testDoubleBoxed(Utils.convParamDouble(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDouble(__ENV__, arg0)) {
            return Utils.convReturnDouble(__ENV__, this.getWrappedObject().testDouble(Utils.convParamDouble(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testFloatBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFloat(__ENV__, arg0)) {
            return Utils.convReturnFloat(__ENV__, this.getWrappedObject().testFloatBoxed(Utils.convParamFloat(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFloat(__ENV__, arg0)) {
            return Utils.convReturnFloat(__ENV__, this.getWrappedObject().testFloat(Utils.convParamFloat(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testBooleanBoxed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().testBooleanBoxed(Utils.convParamBoolean(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().testBoolean(Utils.convParamBoolean(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().testJsonObject(Utils.convParamJsonObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonArray(__ENV__, arg0)) {
            return Utils.convReturnJsonArray(__ENV__, this.getWrappedObject().testJsonArray(Utils.convParamJsonArray(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.HttpServerOptions.class, arg0)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.core.http.HttpServerOptions.class, HttpServerOptions::new, this.getWrappedObject().testDataObject(Utils.convParamDataObject(__ENV__, io.vertx.core.http.HttpServerOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpVersion.class, arg0)) {
            return Utils.convReturnEnum(__ENV__, this.getWrappedObject().testEnum(Utils.convParamEnum(__ENV__, HttpVersion.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testThrowable(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().testThrowable(Utils.convParamThrowable(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testVariableV(Environment __ENV__, Memory arg0) {
        if(Utils.isVariable(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().testVariableV(Utils.convParamVariable(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testVariableTV(Environment __ENV__, Memory arg0) {
        if(getTestApiVariableTVConverter().accept(__ENV__, arg0)) {
            return getTestApiVariableTVConverter().convReturn(__ENV__, this.getWrappedObject().testVariableTV(getTestApiVariableTVConverter().convParam(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testObject(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return Utils.convReturnObject(__ENV__, this.getWrappedObject().testObject(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testVertxGenV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.model.TestApi.class, TestApi.class, arg0)) {
            return Utils.<io.vertx.model.TestApi<TV, TTT>, TestApi<TV, TTT>, TV, TTT>convReturnVertxGenVariable2(__ENV__, TestApi.class, TestApi::__create, getTestApiVariableTVConverter(), getTestApiVariableTTTConverter(), this.getWrappedObject().testVertxGenV1(Utils.  <io.vertx.model.TestApi<TV, TTT>, TestApi<TV, TTT>  , TV, TTT  >convParamVertxGenVariable2(__ENV__, TestApi.class, TestApi::__create,  getTestApiVariableTVConverter(), getTestApiVariableTTTConverter(), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory testVertxGenV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().testVertxGenV2(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenBuffer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenBuffer(Utils.  <io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenVoid(Utils.  <io.vertx.core.Future<Void>, Future<Void>  , Void  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenString(Utils.  <io.vertx.core.Future<String>, Future<String>  , String  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenByte(Utils.  <io.vertx.core.Future<Byte>, Future<Byte>  , Byte  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenCharacter(Utils.  <io.vertx.core.Future<Character>, Future<Character>  , Character  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenShort(Utils.  <io.vertx.core.Future<Short>, Future<Short>  , Short  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenInteger(Utils.  <io.vertx.core.Future<Integer>, Future<Integer>  , Integer  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenLong(Utils.  <io.vertx.core.Future<Long>, Future<Long>  , Long  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenDouble(Utils.  <io.vertx.core.Future<Double>, Future<Double>  , Double  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenFloat(Utils.  <io.vertx.core.Future<Float>, Future<Float>  , Float  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenBoolean(Utils.  <io.vertx.core.Future<Boolean>, Future<Boolean>  , Boolean  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenJsonObject(Utils.  <io.vertx.core.Future<JsonObject>, Future<JsonObject>  , JsonObject  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenJsonArray(Utils.  <io.vertx.core.Future<JsonArray>, Future<JsonArray>  , JsonArray  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenDataObject(Utils.  <io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>  , io.vertx.core.http.HttpServerOptions  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().testVertxGenEnum(Utils.  <io.vertx.core.Future<HttpVersion>, Future<HttpVersion>  , HttpVersion  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().testListString(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.BYTE, arg0)) {
            this.getWrappedObject().testListByte(Utils.convParamList(__ENV__, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.CHARACTER, arg0)) {
            this.getWrappedObject().testListCharacter(Utils.convParamList(__ENV__, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.SHORT, arg0)) {
            this.getWrappedObject().testListShort(Utils.convParamList(__ENV__, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.INTEGER, arg0)) {
            this.getWrappedObject().testListInteger(Utils.convParamList(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.LONG, arg0)) {
            this.getWrappedObject().testListLong(Utils.convParamList(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.DOUBLE, arg0)) {
            this.getWrappedObject().testListDouble(Utils.convParamList(__ENV__, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.FLOAT, arg0)) {
            this.getWrappedObject().testListFloat(Utils.convParamList(__ENV__, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.BOOLEAN, arg0)) {
            this.getWrappedObject().testListBoolean(Utils.convParamList(__ENV__, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.JSON_OBJECT, arg0)) {
            this.getWrappedObject().testListJsonObject(Utils.convParamList(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.JSON_ARRAY, arg0)) {
            this.getWrappedObject().testListJsonArray(Utils.convParamList(__ENV__, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            this.getWrappedObject().testListVertxGen(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create), arg0)) {
            this.getWrappedObject().testListVertxGen2(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0)) {
            this.getWrappedObject().testListDataObject(Utils.convParamList(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, EnumConverter.create(HttpVersion.class), arg0)) {
            this.getWrappedObject().testListEnum(Utils.convParamList(__ENV__, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().testSetString(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.BYTE, arg0)) {
            this.getWrappedObject().testSetByte(Utils.convParamSet(__ENV__, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.CHARACTER, arg0)) {
            this.getWrappedObject().testSetCharacter(Utils.convParamSet(__ENV__, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.SHORT, arg0)) {
            this.getWrappedObject().testSetShort(Utils.convParamSet(__ENV__, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.INTEGER, arg0)) {
            this.getWrappedObject().testSetInteger(Utils.convParamSet(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.LONG, arg0)) {
            this.getWrappedObject().testSetLong(Utils.convParamSet(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.DOUBLE, arg0)) {
            this.getWrappedObject().testSetDouble(Utils.convParamSet(__ENV__, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.FLOAT, arg0)) {
            this.getWrappedObject().testSetFloat(Utils.convParamSet(__ENV__, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.BOOLEAN, arg0)) {
            this.getWrappedObject().testSetBoolean(Utils.convParamSet(__ENV__, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.JSON_OBJECT, arg0)) {
            this.getWrappedObject().testSetJsonObject(Utils.convParamSet(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.JSON_ARRAY, arg0)) {
            this.getWrappedObject().testSetJsonArray(Utils.convParamSet(__ENV__, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            this.getWrappedObject().testSetVertxGen(Utils.convParamSet(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create), arg0)) {
            this.getWrappedObject().testSetVertxGen2(Utils.convParamSet(__ENV__, VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0)) {
            this.getWrappedObject().testSetDataObject(Utils.convParamSet(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, EnumConverter.create(HttpVersion.class), arg0)) {
            this.getWrappedObject().testSetEnum(Utils.convParamSet(__ENV__, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().testMapString(Utils.convParamMap(__ENV__, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.BYTE, arg0)) {
            this.getWrappedObject().testMapByte(Utils.convParamMap(__ENV__, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.CHARACTER, arg0)) {
            this.getWrappedObject().testMapCharacter(Utils.convParamMap(__ENV__, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.SHORT, arg0)) {
            this.getWrappedObject().testMapShort(Utils.convParamMap(__ENV__, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.INTEGER, arg0)) {
            this.getWrappedObject().testMapInteger(Utils.convParamMap(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.LONG, arg0)) {
            this.getWrappedObject().testMapLong(Utils.convParamMap(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.DOUBLE, arg0)) {
            this.getWrappedObject().testMapDouble(Utils.convParamMap(__ENV__, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.FLOAT, arg0)) {
            this.getWrappedObject().testMapFloat(Utils.convParamMap(__ENV__, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.BOOLEAN, arg0)) {
            this.getWrappedObject().testMapBoolean(Utils.convParamMap(__ENV__, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.JSON_OBJECT, arg0)) {
            this.getWrappedObject().testMapJsonObject(Utils.convParamMap(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, TypeConverter.JSON_ARRAY, arg0)) {
            this.getWrappedObject().testMapJsonArray(Utils.convParamMap(__ENV__, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testMapVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isMap(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            this.getWrappedObject().testMapVertxGen(Utils.convParamMap(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testClassType(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            this.getWrappedObject().testClassType(Utils.convParamClassType(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerThrowable(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerThrowable(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerVoid(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerString(Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerByte(Utils.convParamHandler(__ENV__, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerCharacter(Utils.convParamHandler(__ENV__, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerShort(Utils.convParamHandler(__ENV__, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerInteger(Utils.convParamHandler(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerLong(Utils.convParamHandler(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerDouble(Utils.convParamHandler(__ENV__, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerFloat(Utils.convParamHandler(__ENV__, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerBoolean(Utils.convParamHandler(__ENV__, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerJsonObject(Utils.convParamHandler(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerJsonArray(Utils.convParamHandler(__ENV__, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerDataObject(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerEnum(Utils.convParamHandler(__ENV__, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerVariable(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerVariable(Utils.convParamHandler(__ENV__, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerObject(Utils.convParamHandler(__ENV__, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListString(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListByte(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListCharacter(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListShort(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListInteger(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListLong(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListDouble(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListFloat(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListBoolean(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListJsonObject(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListJsonArray(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListVertxGen(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListVertxGen2(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListHttpServerOptions(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerListHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerListHttpVersion(Utils.convParamHandler(__ENV__, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetString(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetByte(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetCharacter(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetShort(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetInteger(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetLong(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetDouble(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetFloat(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetBoolean(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetJsonObject(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetJsonArray(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetVertxGen(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetVertxGen2(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetHttpServerOptions(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerSetHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerSetHttpVersion(Utils.convParamHandler(__ENV__, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapString(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapByte(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapCharacter(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapShort(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapInteger(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapLong(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapDouble(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapFloat(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapBoolean(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapJsonObject(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerMapJsonArray(Utils.convParamHandler(__ENV__, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncVoid(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncString(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncByte(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncCharacter(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncShort(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncInteger(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncLong(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncDouble(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncFloat(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncBoolean(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncJsonObject(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncJsonArray(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncDataObject(Utils.convParamHandlerAsyncResult(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncEnum(Utils.convParamHandlerAsyncResult(__ENV__, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncVariable(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncVariable(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncObject(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsync(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsync(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListString(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListByte(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListCharacter(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListShort(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListInteger(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListLong(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListDouble(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListFloat(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListBoolean(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListJsonObject(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListJsonArray(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListVertxGen(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListVertxGen2(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListHttpServerOptions(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncListHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncListHttpVersion(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetString(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetByte(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetCharacter(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetShort(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetInteger(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetLong(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetDouble(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetFloat(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetBoolean(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetJsonObject(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetJsonArray(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetVertxGen(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetVertxGen2(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetHttpServerOptions(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncSetHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncSetHttpVersion(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapString(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapByte(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapCharacter(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapShort(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapInteger(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapLong(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapDouble(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapFloat(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapBoolean(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapJsonObject(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testHandlerAsyncMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().testHandlerAsyncMapJsonArray(Utils.convParamHandlerAsyncResult(__ENV__, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableString(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableByte(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableCharacter(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableShort(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableInteger(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableLong(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableDouble(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableFloat(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableBoolean(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVVVV(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListString(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListByte(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListShort(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListInteger(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListLong(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListDouble(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListFloat(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableListEnum(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetString(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetByte(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetShort(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetLong(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapString(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapByte(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapShort(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapLong(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionThrowableMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionThrowableMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidString(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidByte(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidCharacter(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidShort(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidInteger(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidLong(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidDouble(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidFloat(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidBoolean(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.VOID, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.VOID, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVVVV(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.VOID, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.VOID, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListString(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListByte(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListShort(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListInteger(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListLong(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListDouble(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListFloat(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidListEnum(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetString(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetByte(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetShort(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetLong(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapString(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapByte(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapShort(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapLong(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVoidMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVoidMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.VOID, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringString(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringByte(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringCharacter(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringShort(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringInteger(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringLong(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringDouble(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringFloat(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringBoolean(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.STRING, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.STRING, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVVVV(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.STRING, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.STRING, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListString(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListByte(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListShort(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListInteger(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListLong(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListDouble(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListFloat(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringListEnum(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetString(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetByte(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetShort(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetLong(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapString(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapByte(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapShort(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapLong(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionStringMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionStringMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.STRING, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteString(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteByte(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteShort(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteInteger(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteLong(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteDouble(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteFloat(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVVVV(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListString(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListByte(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListShort(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListInteger(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListLong(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListDouble(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListFloat(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteListEnum(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetString(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetByte(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetShort(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetLong(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapString(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapByte(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapShort(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapLong(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionByteMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionByteMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BYTE, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterString(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterByte(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterCharacter(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterShort(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterInteger(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterLong(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterDouble(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterFloat(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterBoolean(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVVVV(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListString(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListByte(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListShort(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListInteger(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListLong(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListDouble(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListFloat(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterListEnum(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetString(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetByte(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetShort(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetLong(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapString(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapByte(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapShort(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapLong(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionCharacterMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionCharacterMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.CHARACTER, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortString(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortByte(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortCharacter(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortShort(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortInteger(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortLong(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortDouble(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortFloat(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortBoolean(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVVVV(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListString(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListByte(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListShort(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListInteger(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListLong(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListDouble(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListFloat(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortListEnum(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetString(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetByte(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetShort(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetLong(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapString(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapByte(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapShort(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapLong(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionShortMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionShortMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.SHORT, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerString(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerByte(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerCharacter(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerShort(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerInteger(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerLong(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerDouble(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerFloat(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerBoolean(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVVVV(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListString(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListByte(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListShort(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListInteger(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListLong(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListDouble(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListFloat(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerListEnum(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetString(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetByte(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetShort(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetLong(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapString(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapByte(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapShort(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapLong(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionIntegerMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionIntegerMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.INTEGER, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongString(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongByte(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongCharacter(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongShort(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongInteger(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongLong(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongDouble(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongFloat(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongBoolean(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.LONG, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.LONG, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVVVV(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.LONG, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.LONG, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListString(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListByte(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListShort(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListInteger(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListLong(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListDouble(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListFloat(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongListEnum(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetString(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetByte(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetShort(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetLong(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapString(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapByte(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapShort(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapLong(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionLongMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionLongMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.LONG, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleString(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleByte(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleCharacter(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleShort(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleInteger(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleLong(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleDouble(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleFloat(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleBoolean(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVVVV(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListString(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListByte(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListShort(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListInteger(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListLong(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListDouble(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListFloat(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleListEnum(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetString(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetByte(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetShort(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetLong(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapString(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapByte(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapShort(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapLong(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionDoubleMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionDoubleMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.DOUBLE, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatString(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatByte(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatCharacter(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatShort(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatInteger(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatLong(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatDouble(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatFloat(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatBoolean(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVVVV(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListString(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListByte(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListShort(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListInteger(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListLong(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListDouble(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListFloat(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatListEnum(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetString(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetByte(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetShort(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetLong(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapString(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapByte(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapShort(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapLong(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionFloatMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionFloatMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.FLOAT, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanString(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanByte(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanShort(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanInteger(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanLong(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanDouble(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanFloat(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVVVV(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListString(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListByte(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListShort(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListInteger(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListLong(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListDouble(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListFloat(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanListEnum(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetString(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetByte(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetShort(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetLong(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapString(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapByte(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapShort(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapLong(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionBooleanMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionBooleanMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVVVV(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectListEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonObjectMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonObjectMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_OBJECT, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVVVV(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayListEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArraySetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArraySetEnum(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapString(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapByte(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapShort(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapLong(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionJsonArrayMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionJsonArrayMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.JSON_ARRAY, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsString(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsByte(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsCharacter(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsShort(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsInteger(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsLong(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsDouble(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsFloat(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsBoolean(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsJsonObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsJsonArray(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsHttpServerOptions(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsHttpVersion(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVVVV(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVVVV2(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenVVVV1(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenVVVVV2(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenVertxGen(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenVoid(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenString(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenByte(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenCharacter(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenShort(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenInteger(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenLong(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenDouble(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenFloat(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenBoolean(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenJsonObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenJsonArray(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenDataObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsVertxGenEnum(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListString(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListByte(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListCharacter(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListShort(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListInteger(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListLong(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListDouble(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListFloat(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListBoolean(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListJsonObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListJsonArray(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListVertxGen(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListVertxGen2(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListDataObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsListEnum(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetString(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetByte(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetCharacter(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetShort(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetInteger(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetLong(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetDouble(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetFloat(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetBoolean(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetJsonObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetJsonArray(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetVertxGen(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetVertxGen2(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetDataObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsSetEnum(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapString(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapByte(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapCharacter(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapShort(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapInteger(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapLong(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapDouble(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapFloat(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapBoolean(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapJsonObject(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionHttpServerOptionsMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionHttpServerOptionsMapJsonArray(Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumString(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumByte(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumCharacter(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumShort(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumInteger(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumLong(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumDouble(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumFloat(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumBoolean(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumJsonObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumJsonArray(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumHttpServerOptions(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumHttpVersion(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVVVV(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVVVV2(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenVVVV1(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenVVVVV2(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenVertxGen(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenVoid(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenString(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenByte(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenCharacter(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenShort(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenInteger(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenLong(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenDouble(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenFloat(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenBoolean(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenJsonObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenJsonArray(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenDataObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumVertxGenEnum(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListString(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListByte(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListCharacter(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListShort(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListInteger(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListLong(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListDouble(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListFloat(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListBoolean(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListJsonObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListJsonArray(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListVertxGen(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListVertxGen2(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListDataObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumListEnum(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetString(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetByte(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetCharacter(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetShort(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetInteger(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetLong(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetDouble(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetFloat(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetBoolean(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetJsonObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetJsonArray(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetVertxGen(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetVertxGen2(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetDataObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumSetEnum(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapString(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapByte(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapCharacter(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapShort(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapInteger(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapLong(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapDouble(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapFloat(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapBoolean(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapJsonObject(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionEnumMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionEnumMapJsonArray(Utils.convParamFunction(__ENV__, EnumConverter.create(HttpVersion.class), ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVVVV(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableListEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionVariableMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionVariableMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.STRING, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.BYTE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.CHARACTER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.SHORT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.DOUBLE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.FLOAT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.BOOLEAN, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.JSON_ARRAY, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectHttpServerOptions(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectHttpServerOptions(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectHttpVersion(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectHttpVersion(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, EnumConverter.create(HttpVersion.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVVVV(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVVVV(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, getTestApiVariableTVConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenVVVV1(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenVVVV1(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<TV>, Future<TV>, TV>create1(Future.class, Future::__create, getTestApiVariableTVConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenVVVVV2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenVVVVV2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.buffer.Buffer>, Future<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenVoid(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenVoid(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Void>, Future<Void>, Void>create1(Future.class, Future::__create, TypeConverter.VOID), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<String>, Future<String>, String>create1(Future.class, Future::__create, TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Byte>, Future<Byte>, Byte>create1(Future.class, Future::__create, TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Character>, Future<Character>, Character>create1(Future.class, Future::__create, TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Short>, Future<Short>, Short>create1(Future.class, Future::__create, TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Integer>, Future<Integer>, Integer>create1(Future.class, Future::__create, TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Long>, Future<Long>, Long>create1(Future.class, Future::__create, TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Double>, Future<Double>, Double>create1(Future.class, Future::__create, TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Float>, Future<Float>, Float>create1(Future.class, Future::__create, TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>create1(Future.class, Future::__create, TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<JsonArray>, Future<JsonArray>, JsonArray>create1(Future.class, Future::__create, TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpServerOptions>, Future<io.vertx.core.http.HttpServerOptions>, io.vertx.core.http.HttpServerOptions>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectVertxGenEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectVertxGenEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, VertxGenVariable0Converter.<io.vertx.core.Future<HttpVersion>, Future<HttpVersion>, HttpVersion>create1(Future.class, Future::__create, EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectListEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectListEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createListConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetVertxGen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetVertxGen(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetVertxGen2(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetVertxGen2(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(VertxGenVariable0Converter.<io.vertx.model.TestApi, TestApi>create0(TestApi.class, TestApi::__create)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetDataObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetDataObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(DataObjectConverter.create(io.vertx.core.http.HttpServerOptions.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectSetEnum(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectSetEnum(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createSetConverter(EnumConverter.create(HttpVersion.class)), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapString(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.STRING), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapByte(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapByte(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.BYTE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapCharacter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapCharacter(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.CHARACTER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapShort(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapShort(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.SHORT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapInteger(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapInteger(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.INTEGER), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapLong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapLong(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.LONG), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapDouble(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapDouble(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.DOUBLE), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapFloat(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapFloat(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.FLOAT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapBoolean(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapBoolean(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.BOOLEAN), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapJsonObject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapJsonObject(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.JSON_OBJECT), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void testFunctionObjectMapJsonArray(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().testFunctionObjectMapJsonArray(Utils.convParamFunction(__ENV__, TypeConverter.UNKNOWN_TYPE, ContainerConverter.createMapConverter(TypeConverter.JSON_ARRAY), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
