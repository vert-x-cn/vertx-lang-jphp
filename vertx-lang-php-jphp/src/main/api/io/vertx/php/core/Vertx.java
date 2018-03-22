package io.vertx.php.core;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.datagram.DatagramSocket;
import io.vertx.php.core.http.HttpServer;
import io.vertx.php.core.Context;
import io.vertx.php.core.Future;
import io.vertx.php.core.shareddata.SharedData;
import io.vertx.php.core.WorkerExecutor;
import io.vertx.php.core.TimeoutStream;
import io.vertx.php.core.dns.DnsClient;
import io.vertx.php.core.eventbus.EventBus;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.net.NetServer;
import io.vertx.php.core.file.FileSystem;
import io.vertx.php.core.net.NetClient;
import io.vertx.php.core.http.HttpClient;
@Name("Vertx")
@Namespace("io\\vertx\\php\\core")
public interface Vertx<S extends io.vertx.core.Vertx> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }
    
    @Signature
    static Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, io.vertx.core.Vertx.vertx()
    }

    @Signature
    static Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, io.vertx.core.Vertx.vertx()
    }

    @Signature
    static void clusteredVertx(Environment __env__, Memory... args) {
        io.vertx.core.Vertx.clusteredVertx(options, resultHandler)
    }
    
    @Signature
    static Memory currentContext(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ContextImpl::new, io.vertx.core.Vertx.currentContext()
    }
    
    @Signature
    default Memory getOrCreateContext(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ContextImpl::new, this.getWrappedObject().getOrCreateContext()
    }
    
    @Signature
    default Memory createNetServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetServerImpl::new, this.getWrappedObject().createNetServer()
    }

    @Signature
    default Memory createNetServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetServerImpl::new, this.getWrappedObject().createNetServer()
    }
    
    @Signature
    default Memory createNetClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetClientImpl::new, this.getWrappedObject().createNetClient()
    }

    @Signature
    default Memory createNetClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetClientImpl::new, this.getWrappedObject().createNetClient()
    }
    
    @Signature
    default Memory createHttpServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerImpl::new, this.getWrappedObject().createHttpServer()
    }

    @Signature
    default Memory createHttpServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerImpl::new, this.getWrappedObject().createHttpServer()
    }
    
    @Signature
    default Memory createHttpClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientImpl::new, this.getWrappedObject().createHttpClient()
    }

    @Signature
    default Memory createHttpClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientImpl::new, this.getWrappedObject().createHttpClient()
    }
    
    @Signature
    default Memory createDatagramSocket(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DatagramSocketImpl::new, this.getWrappedObject().createDatagramSocket()
    }

    @Signature
    default Memory createDatagramSocket(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DatagramSocketImpl::new, this.getWrappedObject().createDatagramSocket()
    }
    
    @Signature
    default Memory fileSystem(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FileSystemImpl::new, this.getWrappedObject().fileSystem()
    }
    
    @Signature
    default Memory eventBus(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, EventBusImpl::new, this.getWrappedObject().eventBus()
    }
    
    @Signature
    default Memory createDnsClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DnsClientImpl::new, this.getWrappedObject().createDnsClient()
    }

    @Signature
    default Memory createDnsClient(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, DnsClientImpl::new, this.getWrappedObject().createDnsClient()
    }
    
    @Signature
    default Memory sharedData(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SharedDataImpl::new, this.getWrappedObject().sharedData()
    }

    @Signature
    default Memory setTimer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().setTimer(delay, handler)
    }

    @Signature
    default Memory timerStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TimeoutStreamImpl::new, this.getWrappedObject().timerStream(delay)
    }

    @Signature
    default Memory setPeriodic(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().setPeriodic(delay, handler)
    }

    @Signature
    default Memory periodicStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TimeoutStreamImpl::new, this.getWrappedObject().periodicStream(delay)
    }

    @Signature
    default Memory cancelTimer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cancelTimer(id)
    }

    @Signature
    default void runOnContext(Environment __env__, Memory... args) {
        this.getWrappedObject().runOnContext(action)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void deployVerticle(Environment __env__, Memory... args) {
        this.getWrappedObject().deployVerticle(name)
    }

    @Signature
    default void undeploy(Environment __env__, Memory... args) {
        this.getWrappedObject().undeploy(deploymentID)
    }
    
    @Signature
    default Memory deploymentIDs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().deploymentIDs()
    }
    
    @Signature
    default Memory isClustered(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isClustered()
    }

    @Signature
    default void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }

    @Signature
    default Memory createSharedWorkerExecutor(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WorkerExecutorImpl::new, this.getWrappedObject().createSharedWorkerExecutor(name)
    }
    
    @Signature
    default Memory isNativeTransportEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isNativeTransportEnabled()
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
