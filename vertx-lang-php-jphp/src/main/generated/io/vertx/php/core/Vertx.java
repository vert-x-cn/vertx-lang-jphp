package io.vertx.php.core;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.lang.php.wrapper.JavaThrowable;
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
import io.vertx.php.core.net.NetClient;
import io.vertx.php.core.net.NetClientOptions;
import io.vertx.php.core.net.NetServer;
import io.vertx.php.core.net.NetServerOptions;
import io.vertx.php.core.shareddata.SharedData;
import java.lang.Long;
import java.lang.String;
import java.lang.Void;
import java.util.Set;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.Closure;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("Vertx")
@Namespace("io\\vertx\\php\\core")
public class Vertx extends BaseWrapper<io.vertx.core.Vertx> {
    
    public Vertx(Environment env, io.vertx.core.Vertx wrappedObject) {
        super(env, wrappedObject);
    }
    
    public Vertx(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.Vertx getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public boolean cancelTimer(long id){
        return this.getWrappedObject().cancelTimer(id);
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public void close(Closure completionHandler){
            }
   
    @Signature
    //false
    public static void clusteredVertx(Environment __env__, VertxOptions options, Closure resultHandler){
            }
   
    @Signature
    //false
    public DatagramSocket createDatagramSocket(DatagramSocketOptions options){
        return new DatagramSocket(__env__, this.getWrappedObject().createDatagramSocket(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public DatagramSocket createDatagramSocket(){
        return new DatagramSocket(__env__, this.getWrappedObject().createDatagramSocket());
    }
   
    @Signature
    //false
    public DnsClient createDnsClient(int port, String host){
        return new DnsClient(__env__, this.getWrappedObject().createDnsClient(port,host));
    }
   
    @Signature
    //false
    public DnsClient createDnsClient(DnsClientOptions options){
        return new DnsClient(__env__, this.getWrappedObject().createDnsClient(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public HttpClient createHttpClient(HttpClientOptions options){
        return new HttpClient(__env__, this.getWrappedObject().createHttpClient(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public HttpClient createHttpClient(){
        return new HttpClient(__env__, this.getWrappedObject().createHttpClient());
    }
   
    @Signature
    //false
    public HttpServer createHttpServer(HttpServerOptions options){
        return new HttpServer(__env__, this.getWrappedObject().createHttpServer(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public HttpServer createHttpServer(){
        return new HttpServer(__env__, this.getWrappedObject().createHttpServer());
    }
   
    @Signature
    //false
    public NetClient createNetClient(NetClientOptions options){
        return new NetClient(__env__, this.getWrappedObject().createNetClient(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public NetClient createNetClient(){
        return new NetClient(__env__, this.getWrappedObject().createNetClient());
    }
   
    @Signature
    //false
    public NetServer createNetServer(NetServerOptions options){
        return new NetServer(__env__, this.getWrappedObject().createNetServer(options.getWrappedObject()));
    }
   
    @Signature
    //false
    public NetServer createNetServer(){
        return new NetServer(__env__, this.getWrappedObject().createNetServer());
    }
   
    @Signature
    //false
    public WorkerExecutor createSharedWorkerExecutor(String name){
        return new WorkerExecutor(__env__, this.getWrappedObject().createSharedWorkerExecutor(name));
    }
   
    @Signature
    //false
    public WorkerExecutor createSharedWorkerExecutor(String name, int poolSize){
        return new WorkerExecutor(__env__, this.getWrappedObject().createSharedWorkerExecutor(name,poolSize));
    }
   
    @Signature
    //false
    public WorkerExecutor createSharedWorkerExecutor(String name, int poolSize, long maxExecuteTime){
        return new WorkerExecutor(__env__, this.getWrappedObject().createSharedWorkerExecutor(name,poolSize,maxExecuteTime));
    }
   
    @Signature
    //false
    public static Context currentContext(Environment __env__){
        return new Context(__env__, io.vertx.core.Vertx.currentContext());
    }
   
    @Signature
    //false
    public void deployVerticle(String name){
            }
   
    @Signature
    //false
    public void deployVerticle(String name, Memory memory0){
            }
   
    @Signature
    //false
    public void deployVerticle(String name, DeploymentOptions options, Closure completionHandler){
            }
   
    @Signature
    //false
    public Set deploymentIDs(){
        return this.getWrappedObject().deploymentIDs();
    }
   
    @Signature
    //false
    public EventBus eventBus(){
        return new EventBus(__env__, this.getWrappedObject().eventBus());
    }
   
    @Signature
    //false
    public Vertx exceptionHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public void executeBlocking(Closure blockingCodeHandler, boolean ordered, Closure resultHandler){
            }
   
    @Signature
    //false
    public void executeBlocking(Closure blockingCodeHandler, Closure resultHandler){
            }
   
    @Signature
    //false
    public FileSystem fileSystem(){
        return new FileSystem(__env__, this.getWrappedObject().fileSystem());
    }
   
    @Signature
    //false
    public Context getOrCreateContext(){
        return new Context(__env__, this.getWrappedObject().getOrCreateContext());
    }
   
    @Signature
    //false
    public boolean isClustered(){
        return this.getWrappedObject().isClustered();
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public boolean isNativeTransportEnabled(){
        return this.getWrappedObject().isNativeTransportEnabled();
    }
   
    @Signature
    //false
    public TimeoutStream periodicStream(long delay){
        return new TimeoutStream(__env__, this.getWrappedObject().periodicStream(delay));
    }
   
    @Signature
    //false
    public void runOnContext(Closure action){
            }
   
    @Signature
    //false
    public long setPeriodic(long delay, Closure handler){
        return this.getWrappedObject().setPeriodic(delay,e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        });
    }
   
    @Signature
    //false
    public long setTimer(long delay, Closure handler){
        return this.getWrappedObject().setTimer(delay,e -> {
            try{
                handler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        });
    }
   
    @Signature
    //false
    public SharedData sharedData(){
        return new SharedData(__env__, this.getWrappedObject().sharedData());
    }
   
    @Signature
    //false
    public TimeoutStream timerStream(long delay){
        return new TimeoutStream(__env__, this.getWrappedObject().timerStream(delay));
    }
   
    @Signature
    //false
    public void undeploy(String deploymentID){
            }
   
    @Signature
    //false
    public void undeploy(String deploymentID, Closure completionHandler){
            }
   
    @Signature
    //false
    public static Vertx vertx(Environment __env__){
        return new Vertx(__env__, io.vertx.core.Vertx.vertx());
    }
   
    @Signature
    //false
    public static Vertx vertx(Environment __env__, VertxOptions options){
        return new Vertx(__env__, io.vertx.core.Vertx.vertx(options.getWrappedObject()));
    }

}
