package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("Route")
@Namespace("io\\vertx\\php\\ext\\web")
public interface Route<S extends io.vertx.ext.web.Route> extends IWrapper<S>{

    @Signature
    default Memory method(Environment __env__, Memory... args) {
        this.getWrappedObject().method(method)
    }

    @Signature
    default Memory path(Environment __env__, Memory... args) {
        this.getWrappedObject().path(path)
    }

    @Signature
    default Memory pathRegex(Environment __env__, Memory... args) {
        this.getWrappedObject().pathRegex(path)
    }

    @Signature
    default Memory produces(Environment __env__, Memory... args) {
        this.getWrappedObject().produces(contentType)
    }

    @Signature
    default Memory consumes(Environment __env__, Memory... args) {
        this.getWrappedObject().consumes(contentType)
    }

    @Signature
    default Memory order(Environment __env__, Memory... args) {
        this.getWrappedObject().order(order)
    }
    
    @Signature
    default Memory last(Environment __env__, Memory... args) {
        this.getWrappedObject().last()
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(requestHandler)
    }

    @Signature
    default Memory blockingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().blockingHandler(requestHandler)
    }

    @Signature
    default Memory failureHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().failureHandler(failureHandler)
    }
    
    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove()
    }
    
    @Signature
    default Memory disable(Environment __env__, Memory... args) {
        this.getWrappedObject().disable()
    }
    
    @Signature
    default Memory enable(Environment __env__, Memory... args) {
        this.getWrappedObject().enable()
    }

    @Signature
    default Memory useNormalisedPath(Environment __env__, Memory... args) {
        this.getWrappedObject().useNormalisedPath(useNormalisedPath)
    }
    
    @Signature
    default Memory getPath(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getPath()
    }

    @Signature
    default Memory setRegexGroupsNames(Environment __env__, Memory... args) {
        this.getWrappedObject().setRegexGroupsNames(groups)
    }

}
