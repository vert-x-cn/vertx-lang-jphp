package io.vertx.php.ext.web.codec;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.WriteStream;
import java.lang.Class;
import java.lang.Void;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("BodyCodec")
@Namespace("io\\vertx\\php\\ext\\web\\codec")
@SuppressWarnings("ALL")
public class BodyCodec<T> extends VertxGenVariable1Wrapper<io.vertx.ext.web.codec.BodyCodec<T>,T>{
    
    private BodyCodec(Environment env, io.vertx.ext.web.codec.BodyCodec<T> wrappedObject, TypeConverter<T> bodyCodecVariableTConverter){
        super(env, wrappedObject, bodyCodecVariableTConverter);
    }
    public static <T> BodyCodec<T> __create(Environment env, io.vertx.ext.web.codec.BodyCodec<T> wrappedObject, TypeConverter<T> bodyCodecVariableTConverter){
        return new BodyCodec<>(env, wrappedObject, bodyCodecVariableTConverter);
    }

    public static BodyCodec<Object> __create(Environment env, io.vertx.ext.web.codec.BodyCodec<Object> wrappedObject) {
        return new BodyCodec<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getBodyCodecVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setBodyCodecVariableTConverter(TypeConverter<T> bodyCodecVariableTConverter) {
        this.setTypeConverter1(bodyCodecVariableTConverter);
    }

    @Signature
    public static Memory string(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.codec.BodyCodec<String>, BodyCodec<String>, String>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.STRING, io.vertx.ext.web.codec.BodyCodec.string());
    }/*4*/

    @Signature
    public static Memory string(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.codec.BodyCodec<String>, BodyCodec<String>, String>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.STRING, io.vertx.ext.web.codec.BodyCodec.string(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory buffer(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.codec.BodyCodec<io.vertx.core.buffer.Buffer>, BodyCodec<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), io.vertx.ext.web.codec.BodyCodec.buffer());
    }/*1*/

    @Signature
    public static Memory jsonObject(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.codec.BodyCodec<JsonObject>, BodyCodec<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.JSON_OBJECT, io.vertx.ext.web.codec.BodyCodec.jsonObject());
    }/*1*/

    @Signature
    public static Memory jsonArray(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.codec.BodyCodec<JsonArray>, BodyCodec<JsonArray>, JsonArray>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.JSON_ARRAY, io.vertx.ext.web.codec.BodyCodec.jsonArray());
    }/*1*/

    @Signature
    public static Memory json(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.codec.BodyCodec<Object>, BodyCodec<Object>, Object>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.ext.web.codec.BodyCodec.json(Utils.convParamClassType(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory none(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.codec.BodyCodec<Void>, BodyCodec<Void>, Void>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.VOID, io.vertx.ext.web.codec.BodyCodec.none());
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.codec.BodyCodec<Object>, BodyCodec<Object>, Object>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.ext.web.codec.BodyCodec.create(Utils.convParamFunction(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), TypeConverter.UNKNOWN_TYPE, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory pipe(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.streams.WriteStream.class, WriteStream.class, arg0)) {
            return Utils.<io.vertx.ext.web.codec.BodyCodec<Void>, BodyCodec<Void>, Void>convReturnVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create, TypeConverter.VOID, io.vertx.ext.web.codec.BodyCodec.pipe(Utils.  <io.vertx.core.streams.WriteStream<io.vertx.core.buffer.Buffer>, WriteStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, WriteStream.class, WriteStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
