package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.Route;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RouteImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class RouteImpl extends VertxGenWrapper<io.vertx.ext.web.Route> implements Route<io.vertx.ext.web.Route>{
    
    public RouteImpl(Environment env, io.vertx.ext.web.Route wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory method(Environment __env__, Memory... args) {
        this.getWrappedObject().method(method)
    }

    @Signature
    public Memory path(Environment __env__, Memory... args) {
        this.getWrappedObject().path(path)
    }

    @Signature
    public Memory pathRegex(Environment __env__, Memory... args) {
        this.getWrappedObject().pathRegex(path)
    }

    @Signature
    public Memory produces(Environment __env__, Memory... args) {
        this.getWrappedObject().produces(contentType)
    }

    @Signature
    public Memory consumes(Environment __env__, Memory... args) {
        this.getWrappedObject().consumes(contentType)
    }

    @Signature
    public Memory order(Environment __env__, Memory... args) {
        this.getWrappedObject().order(order)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(requestHandler)
    }

    @Signature
    public Memory blockingHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().blockingHandler(requestHandler)
    }

    @Signature
    public Memory failureHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().failureHandler(failureHandler)
    }

    @Signature
    public Memory useNormalisedPath(Environment __env__, Memory... args) {
        this.getWrappedObject().useNormalisedPath(useNormalisedPath)
    }

    @Signature
    public Memory setRegexGroupsNames(Environment __env__, Memory... args) {
        this.getWrappedObject().setRegexGroupsNames(groups)
    }

}
