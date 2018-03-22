package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.client.WebClient;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import io.vertx.php.core.http.HttpClient;
@Name("HttpEndpoint")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface HttpEndpoint<S extends io.vertx.servicediscovery.types.HttpEndpoint> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(name, host)
    }

    @Signature
    static void getClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.HttpEndpoint.getClient(discovery, filter, resultHandler)
    }

    @Signature
    static void getWebClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(discovery, filter, resultHandler)
    }

}
