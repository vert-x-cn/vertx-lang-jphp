package io.vertx.php.ext.web.client.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.client.WebClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WebClientImpl")
@Namespace("io\\vertx\\php\\ext\\web\\client\\impl")
public class WebClientImpl extends VertxGenWrapper<io.vertx.ext.web.client.WebClient> implements WebClient<io.vertx.ext.web.client.WebClient>{
    
    public WebClientImpl(Environment env, io.vertx.ext.web.client.WebClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebClientImpl::new, io.vertx.ext.web.client.WebClient.create(vertx)
    }

    @Signature
    public static Memory wrap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebClientImpl::new, io.vertx.ext.web.client.WebClient.wrap(httpClient)
    }

    @Signature
    public Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().request(method, requestURI)
    }

    @Signature
    public Memory requestAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().requestAbs(method, absoluteURI)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().get(requestURI)
    }

    @Signature
    public Memory getAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().getAbs(absoluteURI)
    }

    @Signature
    public Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().post(requestURI)
    }

    @Signature
    public Memory postAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().postAbs(absoluteURI)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().put(requestURI)
    }

    @Signature
    public Memory putAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().putAbs(absoluteURI)
    }

    @Signature
    public Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().delete(requestURI)
    }

    @Signature
    public Memory deleteAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().deleteAbs(absoluteURI)
    }

    @Signature
    public Memory patch(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().patch(requestURI)
    }

    @Signature
    public Memory patchAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().patchAbs(absoluteURI)
    }

    @Signature
    public Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().head(requestURI)
    }

    @Signature
    public Memory headAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().headAbs(absoluteURI)
    }

}
