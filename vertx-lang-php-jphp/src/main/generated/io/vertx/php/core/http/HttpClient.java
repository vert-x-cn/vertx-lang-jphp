package io.vertx.php.core.http;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.lang.php.wrapper.JavaThrowable;
import io.vertx.php.core.Future;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import java.lang.String;
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
@Name("HttpClient")
@Namespace("io\\vertx\\php\\core\\http")
public class HttpClient extends BaseWrapper<io.vertx.core.http.HttpClient> {
    
    public HttpClient(Environment env, io.vertx.core.http.HttpClient wrappedObject) {
        super(env, wrappedObject);
    }
    
    public HttpClient(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.http.HttpClient getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public void close(){
            }
   
    @Signature
    //false
    public HttpClientRequest delete(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().delete(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest delete(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().delete(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest delete(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().delete(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest delete(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().delete(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest deleteAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().deleteAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest deleteAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().deleteAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest get(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().get(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest get(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().get(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest get(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().get(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest get(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().get(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest getAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().getAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest getAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().getAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClient getNow(Memory memory0, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient getNow(int port, String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient getNow(String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest head(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().head(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest head(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().head(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest head(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().head(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest head(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().head(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest headAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().headAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest headAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().headAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClient headNow(Memory memory0, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient headNow(int port, String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient headNow(String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public boolean isMetricsEnabled(){
        return this.getWrappedObject().isMetricsEnabled();
    }
   
    @Signature
    //false
    public HttpClientRequest options(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().options(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest options(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().options(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest options(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().options(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest options(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().options(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest optionsAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().optionsAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest optionsAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().optionsAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClient optionsNow(Memory memory0, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient optionsNow(int port, String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient optionsNow(String host, String requestURI, Closure responseHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest post(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().post(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest post(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().post(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest post(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().post(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest post(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().post(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest postAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().postAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest postAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().postAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest put(Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().put(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest put(Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().put(/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest put(Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().put(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest put(int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().put(port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest putAbs(String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().putAbs(absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest putAbs(String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().putAbs(absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClient redirectHandler(Closure handler){
         return this;
    }
   
    @Signature
    //false
    public HttpClientRequest request(HttpMethod method, Memory memory0){
        return new HttpClientRequest(__env__, this.getWrappedObject().request(method,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest request(HttpMethod method, Memory memory0, String host, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().request(method,/*paramSize:2*/null,host,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest request(HttpMethod method, Memory memory0, Memory memory1){
        return new HttpClientRequest(__env__, this.getWrappedObject().request(method,/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public HttpClientRequest request(HttpMethod method, int port, String host, String requestURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().request(method,port,host,requestURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI){
        return new HttpClientRequest(__env__, this.getWrappedObject().requestAbs(method,absoluteURI));
    }
   
    @Signature
    //false
    public HttpClientRequest requestAbs(HttpMethod method, String absoluteURI, Closure responseHandler){
        return new HttpClientRequest(__env__, this.getWrappedObject().requestAbs(method,absoluteURI,e -> {
            try{
                responseHandler.__invoke(__env__, null);
            } catch (Throwable throwable){
                __env__.forwardThrow(throwable);
            }
        }));
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, Closure wsConnect){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, Memory memory1, Memory memory2, Memory memory3){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, Memory memory1, Memory memory2){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, Memory memory1, Memory memory2, Memory memory3, Memory memory4){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, Memory memory1, Memory memory2, Memory memory3, Memory memory4, Memory memory5){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(Memory memory0, String host, Memory memory1, Memory memory2, Memory memory3, Memory memory4, Memory memory5){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocket(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols, Closure wsConnect, Closure failureHandler){
         return this;
    }
   
    @Signature
    //false
    public HttpClient websocketAbs(String url, MultiMap headers, WebsocketVersion version, String subProtocols, Closure wsConnect, Closure failureHandler){
         return this;
    }
   
    @Signature
    //false
    public ReadStream websocketStream(Memory memory0){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public ReadStream websocketStream(Memory memory0, Memory memory1, Memory memory2){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(/*paramSize:3*/null,/*paramSize:2*/null,/*paramSize:3*/null));
    }
   
    @Signature
    //false
    public ReadStream websocketStream(Memory memory0, Memory memory1){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public ReadStream websocketStream(Memory memory0, Memory memory1, Memory memory2, Memory memory3){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(/*paramSize:3*/null,/*paramSize:2*/null,/*paramSize:3*/null,/*paramSize:3*/null));
    }
   
    @Signature
    //false
    public ReadStream websocketStream(Memory memory0, String host, Memory memory1, Memory memory2, Memory memory3){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(/*paramSize:2*/null,host,/*paramSize:2*/null,/*paramSize:2*/null,/*paramSize:2*/null));
    }
   
    @Signature
    //false
    public ReadStream websocketStream(int port, String host, String requestURI, MultiMap headers, WebsocketVersion version, String subProtocols){
        return new ReadStream(__env__, this.getWrappedObject().websocketStream(port,host,requestURI,headers.getWrappedObject(),version,subProtocols));
    }
   
    @Signature
    //false
    public ReadStream websocketStreamAbs(String url, MultiMap headers, WebsocketVersion version, String subProtocols){
        return new ReadStream(__env__, this.getWrappedObject().websocketStreamAbs(url,headers.getWrappedObject(),version,subProtocols));
    }

}
