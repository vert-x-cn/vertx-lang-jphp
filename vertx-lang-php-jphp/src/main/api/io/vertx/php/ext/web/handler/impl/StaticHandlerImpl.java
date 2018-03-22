package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.StaticHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StaticHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class StaticHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.StaticHandler> implements StaticHandler<io.vertx.ext.web.handler.StaticHandler>{
    
    public StaticHandlerImpl(Environment env, io.vertx.ext.web.handler.StaticHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StaticHandlerImpl::new, io.vertx.ext.web.handler.StaticHandler.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StaticHandlerImpl::new, io.vertx.ext.web.handler.StaticHandler.create()
    }

    @Signature
    public Memory setAllowRootFileSystemAccess(Environment __env__, Memory... args) {
        this.getWrappedObject().setAllowRootFileSystemAccess(allowRootFileSystemAccess)
    }

    @Signature
    public Memory setWebRoot(Environment __env__, Memory... args) {
        this.getWrappedObject().setWebRoot(webRoot)
    }

    @Signature
    public Memory setFilesReadOnly(Environment __env__, Memory... args) {
        this.getWrappedObject().setFilesReadOnly(readOnly)
    }

    @Signature
    public Memory setMaxAgeSeconds(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAgeSeconds(maxAgeSeconds)
    }

    @Signature
    public Memory setCachingEnabled(Environment __env__, Memory... args) {
        this.getWrappedObject().setCachingEnabled(enabled)
    }

    @Signature
    public Memory setDirectoryListing(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectoryListing(directoryListing)
    }

    @Signature
    public Memory setIncludeHidden(Environment __env__, Memory... args) {
        this.getWrappedObject().setIncludeHidden(includeHidden)
    }

    @Signature
    public Memory setCacheEntryTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setCacheEntryTimeout(timeout)
    }

    @Signature
    public Memory setIndexPage(Environment __env__, Memory... args) {
        this.getWrappedObject().setIndexPage(indexPage)
    }

    @Signature
    public Memory setMaxCacheSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxCacheSize(maxCacheSize)
    }

    @Signature
    public Memory setHttp2PushMapping(Environment __env__, Memory... args) {
        this.getWrappedObject().setHttp2PushMapping(http2PushMappings)
    }

    @Signature
    public Memory setAlwaysAsyncFS(Environment __env__, Memory... args) {
        this.getWrappedObject().setAlwaysAsyncFS(alwaysAsyncFS)
    }

    @Signature
    public Memory setEnableFSTuning(Environment __env__, Memory... args) {
        this.getWrappedObject().setEnableFSTuning(enableFSTuning)
    }

    @Signature
    public Memory setMaxAvgServeTimeNs(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAvgServeTimeNs(maxAvgServeTimeNanoSeconds)
    }

    @Signature
    public Memory setDirectoryTemplate(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectoryTemplate(directoryTemplate)
    }

    @Signature
    public Memory setEnableRangeSupport(Environment __env__, Memory... args) {
        this.getWrappedObject().setEnableRangeSupport(enableRangeSupport)
    }

    @Signature
    public Memory setSendVaryHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().setSendVaryHeader(varyHeader)
    }

    @Signature
    public Memory setDefaultContentEncoding(Environment __env__, Memory... args) {
        this.getWrappedObject().setDefaultContentEncoding(contentEncoding)
    }

}
