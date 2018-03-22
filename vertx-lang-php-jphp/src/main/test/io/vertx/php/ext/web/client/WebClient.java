package io.vertx.php.ext.web.client;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.http.HttpClient;
import io.vertx.php.ext.web.client.HttpRequest;
@Name("WebClient")
@Namespace("io\\vertx\\php\\ext\\web\\client")
public interface WebClient<S extends io.vertx.ext.web.client.WebClient> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebClientImpl::new, io.vertx.ext.web.client.WebClient.create(vertx)
    }

    @Signature
    static Memory wrap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebClientImpl::new, io.vertx.ext.web.client.WebClient.wrap(httpClient)
    }

    @Signature
    default Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().request(method, requestURI)
    }

    @Signature
    default Memory requestAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().requestAbs(method, absoluteURI)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().get(requestURI)
    }

    @Signature
    default Memory getAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().getAbs(absoluteURI)
    }

    @Signature
    default Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().post(requestURI)
    }

    @Signature
    default Memory postAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().postAbs(absoluteURI)
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().put(requestURI)
    }

    @Signature
    default Memory putAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().putAbs(absoluteURI)
    }

    @Signature
    default Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().delete(requestURI)
    }

    @Signature
    default Memory deleteAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().deleteAbs(absoluteURI)
    }

    @Signature
    default Memory patch(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().patch(requestURI)
    }

    @Signature
    default Memory patchAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().patchAbs(absoluteURI)
    }

    @Signature
    default Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().head(requestURI)
    }

    @Signature
    default Memory headAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().headAbs(absoluteURI)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
