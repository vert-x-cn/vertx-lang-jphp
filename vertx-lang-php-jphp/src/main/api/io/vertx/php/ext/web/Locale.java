package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Locale")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class Locale extends VertxGenVariable0Wrapper<io.vertx.ext.web.Locale>{
    
    private Locale(Environment env, io.vertx.ext.web.Locale wrappedObject){
        super(env, wrappedObject);
    }
    public static  Locale __create(Environment env, io.vertx.ext.web.Locale wrappedObject){
        return new Locale(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Locale, Locale>convReturnVertxGenVariable0(__ENV__, Locale.class, Locale::__create, io.vertx.ext.web.Locale.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Locale, Locale>convReturnVertxGenVariable0(__ENV__, Locale.class, Locale::__create, io.vertx.ext.web.Locale.create(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.Locale, Locale>convReturnVertxGenVariable0(__ENV__, Locale.class, Locale::__create, io.vertx.ext.web.Locale.create(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.Locale, Locale>convReturnVertxGenVariable0(__ENV__, Locale.class, Locale::__create, io.vertx.ext.web.Locale.create(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory language(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().language());
    }/*1*/

    @Signature
    public Memory country(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().country());
    }/*1*/

    @Signature
    public Memory variant(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().variant());
    }/*1*/

}
