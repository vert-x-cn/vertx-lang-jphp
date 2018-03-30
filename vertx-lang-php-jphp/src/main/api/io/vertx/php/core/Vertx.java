package io.vertx.php.core;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Context;
import io.vertx.php.core.Future;
import io.vertx.php.core.TimeoutStream;
import io.vertx.php.core.WorkerExecutor;
import io.vertx.php.core.datagram.DatagramSocket;
import io.vertx.php.core.datagram.DatagramSocketOptions;
import io.vertx.php.core.dns.DnsClient;
import io.vertx.php.core.dns.DnsClientOptions;
import io.vertx.php.core.eventbus.EventBus;
import io.vertx.php.core.file.FileSystem;
import io.vertx.php.core.http.HttpClient;
import io.vertx.php.core.http.HttpClientOptions;
import io.vertx.php.core.http.HttpServer;
import io.vertx.php.core.http.HttpServerOptions;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.net.NetClient;
import io.vertx.php.core.net.NetClientOptions;
import io.vertx.php.core.net.NetServer;
import io.vertx.php.core.net.NetServerOptions;
import io.vertx.php.core.shareddata.SharedData;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Vertx")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class Vertx extends VertxGenVariable0Wrapper<io.vertx.core.Vertx>{
    
    private Vertx(Environment env, io.vertx.core.Vertx wrappedObject){
        super(env, wrappedObject);
    }
    public static  Vertx __create(Environment env, io.vertx.core.Vertx wrappedObject){
        return new Vertx(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public static Memory vertx(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, io.vertx.core.Vertx.vertx());
    }/*4*/

    @Signature
    public static Memory vertx(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.VertxOptions.class, arg0)) {
            return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, io.vertx.core.Vertx.vertx(Utils.convParamDataObject(__ENV__, io.vertx.core.VertxOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void clusteredVertx(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.VertxOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            io.vertx.core.Vertx.clusteredVertx(Utils.convParamDataObject(__ENV__, io.vertx.core.VertxOptions.class, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Vertx, Vertx>create0(Vertx.class, Vertx::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory currentContext(Environment __ENV__) {
        return Utils.<io.vertx.core.Context, Context>convReturnVertxGenVariable0(__ENV__, Context.class, Context::__create, io.vertx.core.Vertx.currentContext());
    }/*1*/

    @Signature
    public Memory getOrCreateContext(Environment __ENV__) {
        return Utils.<io.vertx.core.Context, Context>convReturnVertxGenVariable0(__ENV__, Context.class, Context::__create, this.getWrappedObject().getOrCreateContext());
    }/*1*/

    @Signature
    public Memory createNetServer(Environment __ENV__) {
        return Utils.<io.vertx.core.net.NetServer, NetServer>convReturnVertxGenVariable0(__ENV__, NetServer.class, NetServer::__create, this.getWrappedObject().createNetServer());
    }/*4*/

    @Signature
    public Memory createNetServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.net.NetServerOptions.class, arg0)) {
            return Utils.<io.vertx.core.net.NetServer, NetServer>convReturnVertxGenVariable0(__ENV__, NetServer.class, NetServer::__create, this.getWrappedObject().createNetServer(Utils.convParamDataObject(__ENV__, io.vertx.core.net.NetServerOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createNetClient(Environment __ENV__) {
        return Utils.<io.vertx.core.net.NetClient, NetClient>convReturnVertxGenVariable0(__ENV__, NetClient.class, NetClient::__create, this.getWrappedObject().createNetClient());
    }/*4*/

    @Signature
    public Memory createNetClient(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.net.NetClientOptions.class, arg0)) {
            return Utils.<io.vertx.core.net.NetClient, NetClient>convReturnVertxGenVariable0(__ENV__, NetClient.class, NetClient::__create, this.getWrappedObject().createNetClient(Utils.convParamDataObject(__ENV__, io.vertx.core.net.NetClientOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createHttpServer(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpServer, HttpServer>convReturnVertxGenVariable0(__ENV__, HttpServer.class, HttpServer::__create, this.getWrappedObject().createHttpServer());
    }/*4*/

    @Signature
    public Memory createHttpServer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.HttpServerOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpServer, HttpServer>convReturnVertxGenVariable0(__ENV__, HttpServer.class, HttpServer::__create, this.getWrappedObject().createHttpServer(Utils.convParamDataObject(__ENV__, io.vertx.core.http.HttpServerOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createHttpClient(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpClient, HttpClient>convReturnVertxGenVariable0(__ENV__, HttpClient.class, HttpClient::__create, this.getWrappedObject().createHttpClient());
    }/*4*/

    @Signature
    public Memory createHttpClient(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.HttpClientOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClient, HttpClient>convReturnVertxGenVariable0(__ENV__, HttpClient.class, HttpClient::__create, this.getWrappedObject().createHttpClient(Utils.convParamDataObject(__ENV__, io.vertx.core.http.HttpClientOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createDatagramSocket(Environment __ENV__) {
        return Utils.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>convReturnVertxGenVariable0(__ENV__, DatagramSocket.class, DatagramSocket::__create, this.getWrappedObject().createDatagramSocket());
    }/*4*/

    @Signature
    public Memory createDatagramSocket(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.datagram.DatagramSocketOptions.class, arg0)) {
            return Utils.<io.vertx.core.datagram.DatagramSocket, DatagramSocket>convReturnVertxGenVariable0(__ENV__, DatagramSocket.class, DatagramSocket::__create, this.getWrappedObject().createDatagramSocket(Utils.convParamDataObject(__ENV__, io.vertx.core.datagram.DatagramSocketOptions.class, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory fileSystem(Environment __ENV__) {
        return Utils.<io.vertx.core.file.FileSystem, FileSystem>convReturnVertxGenVariable0(__ENV__, FileSystem.class, FileSystem::__create, this.getWrappedObject().fileSystem());
    }/*1*/

    @Signature
    public Memory eventBus(Environment __ENV__) {
        return Utils.<io.vertx.core.eventbus.EventBus, EventBus>convReturnVertxGenVariable0(__ENV__, EventBus.class, EventBus::__create, this.getWrappedObject().eventBus());
    }/*1*/

    @Signature
    public Memory createDnsClient(Environment __ENV__) {
        return Utils.<io.vertx.core.dns.DnsClient, DnsClient>convReturnVertxGenVariable0(__ENV__, DnsClient.class, DnsClient::__create, this.getWrappedObject().createDnsClient());
    }/*4*/

    @Signature
    public Memory createDnsClient(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.dns.DnsClientOptions.class, arg0)) {
            return Utils.<io.vertx.core.dns.DnsClient, DnsClient>convReturnVertxGenVariable0(__ENV__, DnsClient.class, DnsClient::__create, this.getWrappedObject().createDnsClient(Utils.convParamDataObject(__ENV__, io.vertx.core.dns.DnsClientOptions.class, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory createDnsClient(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.dns.DnsClient, DnsClient>convReturnVertxGenVariable0(__ENV__, DnsClient.class, DnsClient::__create, this.getWrappedObject().createDnsClient(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory sharedData(Environment __ENV__) {
        return Utils.<io.vertx.core.shareddata.SharedData, SharedData>convReturnVertxGenVariable0(__ENV__, SharedData.class, SharedData::__create, this.getWrappedObject().sharedData());
    }/*1*/

    @Signature
    public Memory setTimer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.convReturnLong(__ENV__, this.getWrappedObject().setTimer(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.LONG, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory timerStream(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.<io.vertx.core.TimeoutStream, TimeoutStream>convReturnVertxGenVariable0(__ENV__, TimeoutStream.class, TimeoutStream::__create, this.getWrappedObject().timerStream(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setPeriodic(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.convReturnLong(__ENV__, this.getWrappedObject().setPeriodic(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandler(__ENV__, TypeConverter.LONG, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory periodicStream(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.<io.vertx.core.TimeoutStream, TimeoutStream>convReturnVertxGenVariable0(__ENV__, TimeoutStream.class, TimeoutStream::__create, this.getWrappedObject().periodicStream(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cancelTimer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().cancelTimer(Utils.convParamLong(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void runOnContext(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().runOnContext(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void deployVerticle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().deployVerticle(Utils.convParamString(__ENV__, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void deployVerticle(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().deployVerticle(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg1));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.DeploymentOptions.class, arg1)) {
            this.getWrappedObject().deployVerticle(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.DeploymentOptions.class, arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void deployVerticle(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.DeploymentOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().deployVerticle(Utils.convParamString(__ENV__, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.DeploymentOptions.class, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.STRING, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void undeploy(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().undeploy(Utils.convParamString(__ENV__, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void undeploy(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().undeploy(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deploymentIDs(Environment __ENV__) {
        return Utils.convReturnSet(__ENV__, TypeConverter.STRING,this.getWrappedObject().deploymentIDs());
    }/*1*/

    @Signature
    public Memory isClustered(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isClustered());
    }/*1*/

    @Signature
    public void executeBlocking(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().executeBlocking(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void executeBlocking(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().executeBlocking(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamBoolean(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory createSharedWorkerExecutor(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.WorkerExecutor, WorkerExecutor>convReturnVertxGenVariable0(__ENV__, WorkerExecutor.class, WorkerExecutor::__create, this.getWrappedObject().createSharedWorkerExecutor(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory createSharedWorkerExecutor(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1)) {
            return Utils.<io.vertx.core.WorkerExecutor, WorkerExecutor>convReturnVertxGenVariable0(__ENV__, WorkerExecutor.class, WorkerExecutor::__create, this.getWrappedObject().createSharedWorkerExecutor(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory createSharedWorkerExecutor(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2)) {
            return Utils.<io.vertx.core.WorkerExecutor, WorkerExecutor>convReturnVertxGenVariable0(__ENV__, WorkerExecutor.class, WorkerExecutor::__create, this.getWrappedObject().createSharedWorkerExecutor(Utils.convParamString(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isNativeTransportEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isNativeTransportEnabled());
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
