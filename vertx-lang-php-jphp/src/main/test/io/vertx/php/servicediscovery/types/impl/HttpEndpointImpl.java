package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.HttpEndpoint;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpEndpointImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class HttpEndpointImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.HttpEndpoint> implements HttpEndpoint<io.vertx.servicediscovery.types.HttpEndpoint>{
    
    public HttpEndpointImpl(Environment env, io.vertx.servicediscovery.types.HttpEndpoint wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(name, host)
    }

    @Signature
    public static void getClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.HttpEndpoint.getClient(discovery, filter, resultHandler)
    }

    @Signature
    public static void getWebClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(discovery, filter, resultHandler)
    }

}
