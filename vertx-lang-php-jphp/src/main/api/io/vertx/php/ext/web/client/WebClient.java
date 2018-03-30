package io.vertx.php.ext.web.client;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpClient;
import io.vertx.php.core.http.RequestOptions;
import io.vertx.php.ext.web.client.HttpRequest;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WebClient")
@Namespace("io\\vertx\\php\\ext\\web\\client")
@SuppressWarnings("ALL")
public class WebClient extends VertxGenVariable0Wrapper<io.vertx.ext.web.client.WebClient>{
    
    private WebClient(Environment env, io.vertx.ext.web.client.WebClient wrappedObject){
        super(env, wrappedObject);
    }
    public static  WebClient __create(Environment env, io.vertx.ext.web.client.WebClient wrappedObject){
        return new WebClient(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.web.client.WebClient, WebClient>convReturnVertxGenVariable0(__ENV__, WebClient.class, WebClient::__create, io.vertx.ext.web.client.WebClient.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.web.client.WebClientOptions.class, arg1)) {
            return Utils.<io.vertx.ext.web.client.WebClient, WebClient>convReturnVertxGenVariable0(__ENV__, WebClient.class, WebClient::__create, io.vertx.ext.web.client.WebClient.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.web.client.WebClientOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory wrap(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.http.HttpClient.class, HttpClient.class, arg0)) {
            return Utils.<io.vertx.ext.web.client.WebClient, WebClient>convReturnVertxGenVariable0(__ENV__, WebClient.class, WebClient::__create, io.vertx.ext.web.client.WebClient.wrap(Utils.  <io.vertx.core.http.HttpClient, HttpClient  >convParamVertxGenVariable0(__ENV__, HttpClient.class, HttpClient::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory wrap(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.http.HttpClient.class, HttpClient.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.web.client.WebClientOptions.class, arg1)) {
            return Utils.<io.vertx.ext.web.client.WebClient, WebClient>convReturnVertxGenVariable0(__ENV__, WebClient.class, WebClient::__create, io.vertx.ext.web.client.WebClient.wrap(Utils.  <io.vertx.core.http.HttpClient, HttpClient  >convParamVertxGenVariable0(__ENV__, HttpClient.class, HttpClient::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.web.client.WebClientOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory requestAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().requestAbs(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().get(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().getAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().post(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory postAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().postAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().put(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory putAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().putAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().delete(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deleteAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().deleteAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory patch(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().patch(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory patch(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().patch(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory patch(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().patch(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory patchAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().patchAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().head(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory headAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<io.vertx.core.buffer.Buffer>, HttpRequest<io.vertx.core.buffer.Buffer>, io.vertx.core.buffer.Buffer>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), this.getWrappedObject().headAbs(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
