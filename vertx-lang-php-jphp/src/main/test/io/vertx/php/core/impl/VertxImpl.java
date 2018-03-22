package io.vertx.php.core.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.Vertx;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("VertxImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class VertxImpl extends VertxGenWrapper<io.vertx.core.Vertx> implements Vertx<io.vertx.core.Vertx>{
    
    public VertxImpl(Environment env, io.vertx.core.Vertx wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, io.vertx.core.Vertx.vertx()
    }

    @Signature
    public static Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, io.vertx.core.Vertx.vertx()
    }

    @Signature
    public static void clusteredVertx(Environment __env__, Memory... args) {
        io.vertx.core.Vertx.clusteredVertx(options, resultHandler)
    }
    
    @Signature
    public static Memory currentContext(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ContextImpl::new, io.vertx.core.Vertx.currentContext()
    }

    @Signature
    public Memory createNetServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetServerImpl::new, this.getWrappedObject().createNetServer()
    }

    @Signature
    public Memory createNetClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetClientImpl::new, this.getWrappedObject().createNetClient()
    }

    @Signature
    public Memory createHttpServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerImpl::new, this.getWrappedObject().createHttpServer()
    }

    @Signature
    public Memory createHttpClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientImpl::new, this.getWrappedObject().createHttpClient()
    }

    @Signature
    public Memory createDatagramSocket(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DatagramSocketImpl::new, this.getWrappedObject().createDatagramSocket()
    }

    @Signature
    public Memory createDnsClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DnsClientImpl::new, this.getWrappedObject().createDnsClient()
    }

    @Signature
    public Memory setTimer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().setTimer(delay, handler)
    }

    @Signature
    public Memory timerStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TimeoutStreamImpl::new, this.getWrappedObject().timerStream(delay)
    }

    @Signature
    public Memory setPeriodic(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().setPeriodic(delay, handler)
    }

    @Signature
    public Memory periodicStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TimeoutStreamImpl::new, this.getWrappedObject().periodicStream(delay)
    }

    @Signature
    public Memory cancelTimer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cancelTimer(id)
    }

    @Signature
    public void runOnContext(Environment __env__, Memory... args) {
        this.getWrappedObject().runOnContext(action)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public void deployVerticle(Environment __env__, Memory... args) {
        this.getWrappedObject().deployVerticle(name)
    }

    @Signature
    public void undeploy(Environment __env__, Memory... args) {
        this.getWrappedObject().undeploy(deploymentID)
    }

    @Signature
    public void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }

    @Signature
    public Memory createSharedWorkerExecutor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WorkerExecutorImpl::new, this.getWrappedObject().createSharedWorkerExecutor(name)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
