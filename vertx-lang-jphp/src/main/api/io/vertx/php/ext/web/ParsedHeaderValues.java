package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ParsedHeaderValues")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class ParsedHeaderValues extends VertxGenVariable0Wrapper<io.vertx.ext.web.ParsedHeaderValues>{
    
    private ParsedHeaderValues(Environment env, io.vertx.ext.web.ParsedHeaderValues wrappedObject){
        super(env, wrappedObject);
    }
    public static  ParsedHeaderValues __create(Environment env, io.vertx.ext.web.ParsedHeaderValues wrappedObject){
        return new ParsedHeaderValues(env, wrappedObject);
    }

    @Signature
    public Memory accept(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.MIMEHeader, MIMEHeader>create0(MIMEHeader.class, MIMEHeader::__create),this.getWrappedObject().accept());
    }/*1*/

    @Signature
    public Memory acceptCharset(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.ParsedHeaderValue, ParsedHeaderValue>create0(ParsedHeaderValue.class, ParsedHeaderValue::__create),this.getWrappedObject().acceptCharset());
    }/*1*/

    @Signature
    public Memory acceptEncoding(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.ParsedHeaderValue, ParsedHeaderValue>create0(ParsedHeaderValue.class, ParsedHeaderValue::__create),this.getWrappedObject().acceptEncoding());
    }/*1*/

    @Signature
    public Memory acceptLanguage(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.LanguageHeader, LanguageHeader>create0(LanguageHeader.class, LanguageHeader::__create),this.getWrappedObject().acceptLanguage());
    }/*1*/

    @Signature
    public Memory contentType(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.MIMEHeader, MIMEHeader>convReturnVertxGenVariable0(__ENV__, MIMEHeader.class, MIMEHeader::__create, this.getWrappedObject().contentType());
    }/*1*/

}
