package io.vertx.php.core.parsetools;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.parsetools.JsonEventType;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import java.lang.Class;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("JsonEvent")
@Namespace("io\\vertx\\php\\core\\parsetools")
@SuppressWarnings("ALL")
public class JsonEvent extends VertxGenVariable0Wrapper<io.vertx.core.parsetools.JsonEvent>{
    
    private JsonEvent(Environment env, io.vertx.core.parsetools.JsonEvent wrappedObject){
        super(env, wrappedObject);
    }
    public static  JsonEvent __create(Environment env, io.vertx.core.parsetools.JsonEvent wrappedObject){
        return new JsonEvent(env, wrappedObject);
    }

    @Signature
    public Memory type(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().type());
    }/*1*/

    @Signature
    public Memory fieldName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().fieldName());
    }/*1*/

    @Signature
    public Memory value(Environment __ENV__) {
        return Utils.convReturnObject(__ENV__, this.getWrappedObject().value());
    }/*1*/

    @Signature
    public Memory isNumber(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isNumber());
    }/*1*/

    @Signature
    public Memory integerValue(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().integerValue());
    }/*1*/

    @Signature
    public Memory longValue(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().longValue());
    }/*1*/

    @Signature
    public Memory floatValue(Environment __ENV__) {
        return Utils.convReturnFloat(__ENV__, this.getWrappedObject().floatValue());
    }/*1*/

    @Signature
    public Memory doubleValue(Environment __ENV__) {
        return Utils.convReturnDouble(__ENV__, this.getWrappedObject().doubleValue());
    }/*1*/

    @Signature
    public Memory isBoolean(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isBoolean());
    }/*1*/

    @Signature
    public Memory booleanValue(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().booleanValue());
    }/*1*/

    @Signature
    public Memory isString(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isString());
    }/*1*/

    @Signature
    public Memory stringValue(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().stringValue());
    }/*1*/

    @Signature
    public Memory binaryValue(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().binaryValue());
    }/*1*/

    @Signature
    public Memory isNull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isNull());
    }/*1*/

    @Signature
    public Memory isObject(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isObject());
    }/*1*/

    @Signature
    public Memory objectValue(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().objectValue());
    }/*1*/

    @Signature
    public Memory isArray(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isArray());
    }/*1*/

    @Signature
    public Memory arrayValue(Environment __ENV__) {
        return Utils.convReturnJsonArray(__ENV__, this.getWrappedObject().arrayValue());
    }/*1*/

    @Signature
    public Memory mapTo(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().mapTo(Utils.convParamClassType(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
