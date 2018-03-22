package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("StaticHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface StaticHandler<S extends io.vertx.ext.web.handler.StaticHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StaticHandlerImpl::new, io.vertx.ext.web.handler.StaticHandler.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StaticHandlerImpl::new, io.vertx.ext.web.handler.StaticHandler.create()
    }

    @Signature
    default Memory setAllowRootFileSystemAccess(Environment __env__, Memory... args) {
        this.getWrappedObject().setAllowRootFileSystemAccess(allowRootFileSystemAccess)
    }

    @Signature
    default Memory setWebRoot(Environment __env__, Memory... args) {
        this.getWrappedObject().setWebRoot(webRoot)
    }

    @Signature
    default Memory setFilesReadOnly(Environment __env__, Memory... args) {
        this.getWrappedObject().setFilesReadOnly(readOnly)
    }

    @Signature
    default Memory setMaxAgeSeconds(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAgeSeconds(maxAgeSeconds)
    }

    @Signature
    default Memory setCachingEnabled(Environment __env__, Memory... args) {
        this.getWrappedObject().setCachingEnabled(enabled)
    }

    @Signature
    default Memory setDirectoryListing(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectoryListing(directoryListing)
    }

    @Signature
    default Memory setIncludeHidden(Environment __env__, Memory... args) {
        this.getWrappedObject().setIncludeHidden(includeHidden)
    }

    @Signature
    default Memory setCacheEntryTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setCacheEntryTimeout(timeout)
    }

    @Signature
    default Memory setIndexPage(Environment __env__, Memory... args) {
        this.getWrappedObject().setIndexPage(indexPage)
    }

    @Signature
    default Memory setMaxCacheSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxCacheSize(maxCacheSize)
    }

    @Signature
    default Memory setHttp2PushMapping(Environment __env__, Memory... args) {
        this.getWrappedObject().setHttp2PushMapping(http2PushMappings)
    }

    @Signature
    default Memory setAlwaysAsyncFS(Environment __env__, Memory... args) {
        this.getWrappedObject().setAlwaysAsyncFS(alwaysAsyncFS)
    }

    @Signature
    default Memory setEnableFSTuning(Environment __env__, Memory... args) {
        this.getWrappedObject().setEnableFSTuning(enableFSTuning)
    }

    @Signature
    default Memory setMaxAvgServeTimeNs(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAvgServeTimeNs(maxAvgServeTimeNanoSeconds)
    }

    @Signature
    default Memory setDirectoryTemplate(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectoryTemplate(directoryTemplate)
    }

    @Signature
    default Memory setEnableRangeSupport(Environment __env__, Memory... args) {
        this.getWrappedObject().setEnableRangeSupport(enableRangeSupport)
    }

    @Signature
    default Memory setSendVaryHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().setSendVaryHeader(varyHeader)
    }

    @Signature
    default Memory setDefaultContentEncoding(Environment __env__, Memory... args) {
        this.getWrappedObject().setDefaultContentEncoding(contentEncoding)
    }

}
