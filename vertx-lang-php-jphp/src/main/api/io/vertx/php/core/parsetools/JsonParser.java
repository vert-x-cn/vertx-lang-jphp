package io.vertx.php.core.parsetools;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.parsetools.JsonEvent;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JsonParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
@SuppressWarnings("ALL")
public class JsonParser extends VertxGenVariable0Wrapper<io.vertx.core.parsetools.JsonParser>{
    
    private JsonParser(Environment env, io.vertx.core.parsetools.JsonParser wrappedObject){
        super(env, wrappedObject);
    }
    public static  JsonParser __create(Environment env, io.vertx.core.parsetools.JsonParser wrappedObject){
        return new JsonParser(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory newParser(Environment __ENV__) {
        return Utils.<io.vertx.core.parsetools.JsonParser, JsonParser>convReturnVertxGenVariable0(__ENV__, JsonParser.class, JsonParser::__create, io.vertx.core.parsetools.JsonParser.newParser());
    }/*4*/

    @Signature
    public static Memory newParser(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg0)) {
            return Utils.<io.vertx.core.parsetools.JsonParser, JsonParser>convReturnVertxGenVariable0(__ENV__, JsonParser.class, JsonParser::__create, io.vertx.core.parsetools.JsonParser.newParser(Utils.  <io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer>, ReadStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().write(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*1*/

    @Signature
    public Memory objectEventMode(Environment __ENV__) {
        this.getWrappedObject().objectEventMode();
        return toMemory();
    }/*1*/

    @Signature
    public Memory objectValueMode(Environment __ENV__) {
        this.getWrappedObject().objectValueMode();
        return toMemory();
    }/*1*/

    @Signature
    public Memory arrayEventMode(Environment __ENV__) {
        this.getWrappedObject().arrayEventMode();
        return toMemory();
    }/*1*/

    @Signature
    public Memory arrayValueMode(Environment __ENV__) {
        this.getWrappedObject().arrayValueMode();
        return toMemory();
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.parsetools.JsonEvent, JsonEvent>create0(JsonEvent.class, JsonEvent::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

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
