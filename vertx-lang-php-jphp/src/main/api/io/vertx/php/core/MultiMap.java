package io.vertx.php.core;
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
@Name("MultiMap")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class MultiMap extends VertxGenVariable0Wrapper<io.vertx.core.MultiMap>{
    
    private MultiMap(Environment env, io.vertx.core.MultiMap wrappedObject){
        super(env, wrappedObject);
    }
    public static  MultiMap __create(Environment env, io.vertx.core.MultiMap wrappedObject){
        return new MultiMap(env, wrappedObject);
    }

    @Signature
    public static Memory caseInsensitiveMultiMap(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, io.vertx.core.MultiMap.caseInsensitiveMultiMap());
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getAll(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().getAll(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory contains(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().contains(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory contains(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isBoolean(__ENV__, arg2)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().contains(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamBoolean(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isEmpty(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isEmpty());
    }/*1*/

    @Signature
    public Memory names(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, TypeConverter.STRING,this.getWrappedObject().names());
    }/*1*/

    @Signature
    public Memory add(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().add(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addAll(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg0)) {
            this.getWrappedObject().addAll(Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory set(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().set(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setAll(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg0)) {
            this.getWrappedObject().setAll(Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().remove(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory clear(Environment __ENV__) {
        this.getWrappedObject().clear();
        return toMemory();
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().size());
    }/*1*/

}
