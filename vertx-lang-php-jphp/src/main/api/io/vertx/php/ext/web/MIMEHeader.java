package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.ParsedHeaderValue;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MIMEHeader")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class MIMEHeader extends VertxGenVariable0Wrapper<io.vertx.ext.web.MIMEHeader>{
    
    private MIMEHeader(Environment env, io.vertx.ext.web.MIMEHeader wrappedObject){
        super(env, wrappedObject);
    }
    public static  MIMEHeader __create(Environment env, io.vertx.ext.web.MIMEHeader wrappedObject){
        return new MIMEHeader(env, wrappedObject);
    }

    @Signature
    public Memory rawValue(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().rawValue());
    }/*1*/

    @Signature
    public Memory value(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().value());
    }/*1*/

    @Signature
    public Memory weight(Environment __ENV__) {
        return Utils.convReturnFloat(__ENV__, this.getWrappedObject().weight());
    }/*1*/

    @Signature
    public Memory parameter(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().parameter(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory parameters(Environment __ENV__) {
        return Utils.convReturnMap(__ENV__, TypeConverter.STRING,this.getWrappedObject().parameters());
    }/*1*/

    @Signature
    public Memory isPermitted(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isPermitted());
    }/*1*/

    @Signature
    public Memory isMatchedBy(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.ParsedHeaderValue.class, ParsedHeaderValue.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMatchedBy(Utils.  <io.vertx.ext.web.ParsedHeaderValue, ParsedHeaderValue  >convParamVertxGenVariable0(__ENV__, ParsedHeaderValue.class, ParsedHeaderValue::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory weightedOrder(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().weightedOrder());
    }/*1*/

    @Signature
    public Memory component(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().component());
    }/*1*/

    @Signature
    public Memory subComponent(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().subComponent());
    }/*1*/

}
