package io.vertx.php.core.dns;
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
@Name("SrvRecord")
@Namespace("io\\vertx\\php\\core\\dns")
@SuppressWarnings("ALL")
public class SrvRecord extends VertxGenVariable0Wrapper<io.vertx.core.dns.SrvRecord>{
    
    private SrvRecord(Environment env, io.vertx.core.dns.SrvRecord wrappedObject){
        super(env, wrappedObject);
    }
    public static  SrvRecord __create(Environment env, io.vertx.core.dns.SrvRecord wrappedObject){
        return new SrvRecord(env, wrappedObject);
    }

    @Signature
    public Memory priority(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().priority());
    }/*1*/

    @Signature
    public Memory weight(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().weight());
    }/*1*/

    @Signature
    public Memory port(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().port());
    }/*1*/

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

    @Signature
    public Memory protocol(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().protocol());
    }/*1*/

    @Signature
    public Memory service(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().service());
    }/*1*/

    @Signature
    public Memory target(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().target());
    }/*1*/

}
