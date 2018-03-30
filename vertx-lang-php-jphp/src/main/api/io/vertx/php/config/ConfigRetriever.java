package io.vertx.php.config;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ConfigRetriever")
@Namespace("io\\vertx\\php\\config")
@SuppressWarnings("ALL")
public class ConfigRetriever extends VertxGenVariable0Wrapper<io.vertx.config.ConfigRetriever>{
    
    private ConfigRetriever(Environment env, io.vertx.config.ConfigRetriever wrappedObject){
        super(env, wrappedObject);
    }
    public static  ConfigRetriever __create(Environment env, io.vertx.config.ConfigRetriever wrappedObject){
        return new ConfigRetriever(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.config.ConfigRetriever, ConfigRetriever>convReturnVertxGenVariable0(__ENV__, ConfigRetriever.class, ConfigRetriever::__create, io.vertx.config.ConfigRetriever.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.config.ConfigRetrieverOptions.class, arg1)) {
            return Utils.<io.vertx.config.ConfigRetriever, ConfigRetriever>convReturnVertxGenVariable0(__ENV__, ConfigRetriever.class, ConfigRetriever::__create, io.vertx.config.ConfigRetriever.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.config.ConfigRetrieverOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory getConfigAsFuture(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.config.ConfigRetriever.class, ConfigRetriever.class, arg0)) {
            return Utils.<io.vertx.core.Future<JsonObject>, Future<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.JSON_OBJECT, io.vertx.config.ConfigRetriever.getConfigAsFuture(Utils.  <io.vertx.config.ConfigRetriever, ConfigRetriever  >convParamVertxGenVariable0(__ENV__, ConfigRetriever.class, ConfigRetriever::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getConfig(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().getConfig(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public Memory getCachedConfig(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().getCachedConfig());
    }/*1*/

    @Signature
    public void listen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamHandler(__ENV__, DataObjectConverter.create(io.vertx.config.ConfigChange.class), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory configStream(Environment __ENV__) {
        return Utils.<io.vertx.core.streams.ReadStream<JsonObject>, ReadStream<JsonObject>, JsonObject>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, TypeConverter.JSON_OBJECT, this.getWrappedObject().configStream());
    }/*1*/

}
