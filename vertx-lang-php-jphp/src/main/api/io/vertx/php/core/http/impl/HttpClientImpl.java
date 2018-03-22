package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpClientImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpClientImpl extends VertxGenWrapper<io.vertx.core.http.HttpClient> implements HttpClient<io.vertx.core.http.HttpClient>{
    
    public HttpClientImpl(Environment env, io.vertx.core.http.HttpClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().request(method, options)
    }

    @Signature
    public Memory requestAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().requestAbs(method, absoluteURI)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().get(options)
    }

    @Signature
    public Memory getAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().getAbs(absoluteURI)
    }

    @Signature
    public Memory getNow(Environment __env__, Memory... args) {
        this.getWrappedObject().getNow(options, responseHandler)
    }

    @Signature
    public Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().post(options)
    }

    @Signature
    public Memory postAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().postAbs(absoluteURI)
    }

    @Signature
    public Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().head(options)
    }

    @Signature
    public Memory headAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().headAbs(absoluteURI)
    }

    @Signature
    public Memory headNow(Environment __env__, Memory... args) {
        this.getWrappedObject().headNow(options, responseHandler)
    }

    @Signature
    public Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().options(options)
    }

    @Signature
    public Memory optionsAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().optionsAbs(absoluteURI)
    }

    @Signature
    public Memory optionsNow(Environment __env__, Memory... args) {
        this.getWrappedObject().optionsNow(options, responseHandler)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().put(options)
    }

    @Signature
    public Memory putAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().putAbs(absoluteURI)
    }

    @Signature
    public Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().delete(options)
    }

    @Signature
    public Memory deleteAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().deleteAbs(absoluteURI)
    }

    @Signature
    public Memory websocket(Environment __env__, Memory... args) {
        this.getWrappedObject().websocket(options, wsConnect)
    }

    @Signature
    public Memory websocketAbs(Environment __env__, Memory... args) {
        this.getWrappedObject().websocketAbs(url, headers, version, subProtocols, wsConnect, failureHandler)
    }

    @Signature
    public Memory websocketStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().websocketStream(options)
    }

    @Signature
    public Memory websocketStreamAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().websocketStreamAbs(url, headers, version, subProtocols)
    }

    @Signature
    public Memory redirectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().redirectHandler(handler)
    }

}
