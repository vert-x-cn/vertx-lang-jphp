package io.vertx.php.servicediscovery;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import java.lang.Class;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ServiceReference")
@Namespace("io\\vertx\\php\\servicediscovery")
@SuppressWarnings("ALL")
public class ServiceReference extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.ServiceReference>{
    
    private ServiceReference(Environment env, io.vertx.servicediscovery.ServiceReference wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServiceReference __create(Environment env, io.vertx.servicediscovery.ServiceReference wrappedObject){
        return new ServiceReference(env, wrappedObject);
    }

    @Signature
    public Memory record(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, this.getWrappedObject().record());
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__) {
        return Utils.convReturnVariable(__ENV__, this.getWrappedObject().get());
    }/*1*/

    @Signature
    public Memory getAs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().getAs(Utils.convParamClassType(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cachedAs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().cachedAs(Utils.convParamClassType(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cached(Environment __ENV__) {
        return Utils.convReturnVariable(__ENV__, this.getWrappedObject().cached());
    }/*1*/

    @Signature
    public void release(Environment __ENV__) {
        this.getWrappedObject().release();
    }/*1*/

    @Signature
    public Memory isHolding(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isHolding(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
