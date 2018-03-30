package io.vertx.php.core.parsetools;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RecordParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
@SuppressWarnings("ALL")
public class RecordParser extends VertxGenVariable0Wrapper<io.vertx.core.parsetools.RecordParser>{
    
    private RecordParser(Environment env, io.vertx.core.parsetools.RecordParser wrappedObject){
        super(env, wrappedObject);
    }
    public static  RecordParser __create(Environment env, io.vertx.core.parsetools.RecordParser wrappedObject){
        return new RecordParser(env, wrappedObject);
    }

    @Signature
    public void setOutput(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().setOutput(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory newDelimited(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.convParamString(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory newDelimited(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer>, ReadStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newDelimited(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.  <io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer>, ReadStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory newFixed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newFixed(Utils.convParamInteger(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory newFixed(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newFixed(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg1)) {
            return Utils.<io.vertx.core.parsetools.RecordParser, RecordParser>convReturnVertxGenVariable0(__ENV__, RecordParser.class, RecordParser::__create, io.vertx.core.parsetools.RecordParser.newFixed(Utils.convParamInteger(__ENV__, arg0), Utils.  <io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer>, ReadStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void delimitedMode(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().delimitedMode(Utils.convParamString(__ENV__, arg0));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().delimitedMode(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void fixedSizeMode(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().fixedSizeMode(Utils.convParamInteger(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
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

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
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

}
