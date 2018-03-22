package io.vertx.php.ext.web.client.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.client.HttpResponse;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpResponseImpl")
@Namespace("io\\vertx\\php\\ext\\web\\client\\impl")
public class HttpResponseImpl<T> extends VertxGenWrapper<io.vertx.ext.web.client.HttpResponse<T>> implements HttpResponse<io.vertx.ext.web.client.HttpResponse<T>, T>{
    
    public HttpResponseImpl(Environment env, io.vertx.ext.web.client.HttpResponse<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory getHeader(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHeader(headerName)
    }

    @Signature
    public Memory getTrailer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getTrailer(trailerName)
    }

    @Signature
    public Memory bodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsString()
    }

    @Signature
    public Memory bodyAsJson(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsJson(type)
    }

}
