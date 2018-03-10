package io.vertx.lang.php;

import org.develnext.jphp.json.gson.MemorySerializer;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class VertxExtension extends Extension {
    public static MemorySerializer s = new MemorySerializer();
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
        System.out.println("register");
        registerClass(compileScope, io.vertx.php.core.cli.Argument.class);
        registerClass(compileScope, io.vertx.php.core.cli.Option.class);
        registerClass(compileScope, io.vertx.php.core.datagram.DatagramSocketOptions.class);
        registerClass(compileScope, io.vertx.php.core.dns.AddressResolverOptions.class);
        registerClass(compileScope, io.vertx.php.core.dns.DnsClientOptions.class);
        registerClass(compileScope, io.vertx.php.core.eventbus.DeliveryOptions.class);
        registerClass(compileScope, io.vertx.php.core.eventbus.EventBusOptions.class);
        registerClass(compileScope, io.vertx.php.core.file.CopyOptions.class);
        registerClass(compileScope, io.vertx.php.core.file.OpenOptions.class);
        registerClass(compileScope, io.vertx.php.core.http.GoAway.class);
        registerClass(compileScope, io.vertx.php.core.http.Http2Settings.class);
        registerClass(compileScope, io.vertx.php.core.http.HttpClientOptions.class);
        registerClass(compileScope, io.vertx.php.core.http.HttpServerOptions.class);
        registerClass(compileScope, io.vertx.php.core.http.RequestOptions.class);
        registerClass(compileScope, io.vertx.php.core.metrics.MetricsOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.ClientOptionsBase.class);
        registerClass(compileScope, io.vertx.php.core.net.JdkSSLEngineOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.JksOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.NetClientOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.NetServerOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.NetworkOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.OpenSSLEngineOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.PemKeyCertOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.PemTrustOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.PfxOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.ProxyOptions.class);
        registerClass(compileScope, io.vertx.php.core.net.TCPSSLOptions.class);
        registerClass(compileScope, io.vertx.php.core.DeploymentOptions.class);
        registerClass(compileScope, io.vertx.php.core.VertxOptions.class);



        registerMemoryOperation(Operations.HandlerOperation.class);
    }
}