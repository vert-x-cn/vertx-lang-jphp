package io.vertx.lang.php;

import io.vertx.core.*;
import io.vertx.core.buffer.*;
import io.vertx.core.cli.*;
import io.vertx.core.datagram.*;
import io.vertx.core.dns.*;
import io.vertx.core.eventbus.*;
import io.vertx.core.file.*;
import io.vertx.core.http.*;
import io.vertx.core.metrics.*;
import io.vertx.core.net.*;
import io.vertx.core.parsetools.*;
import io.vertx.core.shareddata.*;
import io.vertx.core.streams.*;


import org.develnext.jphp.json.gson.MemorySerializer;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class VertxExtension extends Extension {
    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public String getVersion() {
        return "0.0.1";
    }

    @Override
    public void onRegister(CompileScope compileScope) {

        Operations.registerOperations(compileScope);

//        registerWrapperClass(compileScope, Buffer.class, io.vertx.php.core.buffer.Buffer.class);
//        registerWrapperClass(compileScope, CLI.class, io.vertx.php.core.cli.CLI.class);
//        registerWrapperClass(compileScope, CommandLine.class, io.vertx.php.core.cli.CommandLine.class);
//        registerWrapperClass(compileScope, DatagramPacket.class, io.vertx.php.core.datagram.DatagramPacket.class);
//        registerWrapperClass(compileScope, DatagramSocket.class, io.vertx.php.core.datagram.DatagramSocket.class);
//        registerWrapperClass(compileScope, DnsClient.class, io.vertx.php.core.dns.DnsClient.class);
//        registerWrapperClass(compileScope, MxRecord.class, io.vertx.php.core.dns.MxRecord.class);
//        registerWrapperClass(compileScope, SrvRecord.class, io.vertx.php.core.dns.SrvRecord.class);
//        registerWrapperClass(compileScope, EventBus.class, io.vertx.php.core.eventbus.EventBus.class);
//        registerWrapperClass(compileScope, Message.class, io.vertx.php.core.eventbus.Message.class);
//        registerWrapperClass(compileScope, MessageConsumer.class, io.vertx.php.core.eventbus.MessageConsumer.class);
//        registerWrapperClass(compileScope, MessageProducer.class, io.vertx.php.core.eventbus.MessageProducer.class);
//        registerWrapperClass(compileScope, SendContext.class, io.vertx.php.core.eventbus.SendContext.class);
//        registerWrapperClass(compileScope, AsyncFile.class, io.vertx.php.core.file.AsyncFile.class);
//        registerWrapperClass(compileScope, FileProps.class, io.vertx.php.core.file.FileProps.class);
//        registerWrapperClass(compileScope, FileSystem.class, io.vertx.php.core.file.FileSystem.class);
//        registerWrapperClass(compileScope, FileSystemProps.class, io.vertx.php.core.file.FileSystemProps.class);
//        registerWrapperClass(compileScope, HttpClient.class, io.vertx.php.core.http.HttpClient.class);
//        registerWrapperClass(compileScope, HttpClientRequest.class, io.vertx.php.core.http.HttpClientRequest.class);
//        registerWrapperClass(compileScope, HttpClientResponse.class, io.vertx.php.core.http.HttpClientResponse.class);
//        registerWrapperClass(compileScope, HttpConnection.class, io.vertx.php.core.http.HttpConnection.class);
//        registerWrapperClass(compileScope, HttpFrame.class, io.vertx.php.core.http.HttpFrame.class);
//        registerWrapperClass(compileScope, HttpServer.class, io.vertx.php.core.http.HttpServer.class);
//        registerWrapperClass(compileScope, HttpServerFileUpload.class, io.vertx.php.core.http.HttpServerFileUpload.class);
//        registerWrapperClass(compileScope, HttpServerRequest.class, io.vertx.php.core.http.HttpServerRequest.class);
//        registerWrapperClass(compileScope, HttpServerResponse.class, io.vertx.php.core.http.HttpServerResponse.class);
//        registerWrapperClass(compileScope, ServerWebSocket.class, io.vertx.php.core.http.ServerWebSocket.class);
//        registerWrapperClass(compileScope, WebSocket.class, io.vertx.php.core.http.WebSocket.class);
//        registerWrapperClass(compileScope, WebSocketBase.class, io.vertx.php.core.http.WebSocketBase.class);
//        registerWrapperClass(compileScope, WebSocketFrame.class, io.vertx.php.core.http.WebSocketFrame.class);
//        registerWrapperClass(compileScope, Measured.class, io.vertx.php.core.metrics.Measured.class);
//        registerWrapperClass(compileScope, NetClient.class, io.vertx.php.core.net.NetClient.class);
//        registerWrapperClass(compileScope, NetServer.class, io.vertx.php.core.net.NetServer.class);
//        registerWrapperClass(compileScope, NetSocket.class, io.vertx.php.core.net.NetSocket.class);
//        registerWrapperClass(compileScope, SelfSignedCertificate.class, io.vertx.php.core.net.SelfSignedCertificate.class);
//        registerWrapperClass(compileScope, SocketAddress.class, io.vertx.php.core.net.SocketAddress.class);
//        registerWrapperClass(compileScope, JsonEvent.class, io.vertx.php.core.parsetools.JsonEvent.class);
//        registerWrapperClass(compileScope, JsonParser.class, io.vertx.php.core.parsetools.JsonParser.class);
//        registerWrapperClass(compileScope, RecordParser.class, io.vertx.php.core.parsetools.RecordParser.class);
//        registerWrapperClass(compileScope, AsyncMap.class, io.vertx.php.core.shareddata.AsyncMap.class);
//        registerWrapperClass(compileScope, Counter.class, io.vertx.php.core.shareddata.Counter.class);
//        registerWrapperClass(compileScope, LocalMap.class, io.vertx.php.core.shareddata.LocalMap.class);
//        registerWrapperClass(compileScope, Lock.class, io.vertx.php.core.shareddata.Lock.class);
//        registerWrapperClass(compileScope, SharedData.class, io.vertx.php.core.shareddata.SharedData.class);
//        registerWrapperClass(compileScope, Pump.class, io.vertx.php.core.streams.Pump.class);
//        registerWrapperClass(compileScope, ReadStream.class, io.vertx.php.core.streams.ReadStream.class);
//        registerWrapperClass(compileScope, StreamBase.class, io.vertx.php.core.streams.StreamBase.class);
//        registerWrapperClass(compileScope, WriteStream.class, io.vertx.php.core.streams.WriteStream.class);
//        registerWrapperClass(compileScope, CompositeFuture.class, io.vertx.php.core.CompositeFuture.class);
//        registerWrapperClass(compileScope, Context.class, io.vertx.php.core.Context.class);
//        registerWrapperClass(compileScope, Future.class, io.vertx.php.core.Future.class);
//        registerWrapperClass(compileScope, MultiMap.class, io.vertx.php.core.MultiMap.class);
//        registerWrapperClass(compileScope, TimeoutStream.class, io.vertx.php.core.TimeoutStream.class);
//        registerWrapperClass(compileScope, Vertx.class, io.vertx.php.core.Vertx.class);
//        registerWrapperClass(compileScope, WorkerExecutor.class, io.vertx.php.core.WorkerExecutor.class);



        registerMemoryOperation(Operations.BaseWrapperOperation.class);
    }
}