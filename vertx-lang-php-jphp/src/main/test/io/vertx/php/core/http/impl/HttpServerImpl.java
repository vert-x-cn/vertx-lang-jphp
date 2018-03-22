package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpServerImpl extends VertxGenWrapper<io.vertx.core.http.HttpServer> implements HttpServer<io.vertx.core.http.HttpServer>{
    
    public HttpServerImpl(Environment env, io.vertx.core.http.HttpServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory requestHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().requestHandler(handler)
    }

    @Signature
    public Memory connectionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory websocketHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().websocketHandler(handler)
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
