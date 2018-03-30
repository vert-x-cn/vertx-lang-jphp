package io.vertx.php.ext.shell.session;
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
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\shell\\session")
@SuppressWarnings("ALL")
public class Session extends VertxGenVariable0Wrapper<io.vertx.ext.shell.session.Session>{
    
    private Session(Environment env, io.vertx.ext.shell.session.Session wrappedObject){
        super(env, wrappedObject);
    }
    public static  Session __create(Environment env, io.vertx.ext.shell.session.Session wrappedObject){
        return new Session(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.shell.session.Session, Session>convReturnVertxGenVariable0(__ENV__, Session.class, Session::__create, io.vertx.ext.shell.session.Session.create());
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
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

}
