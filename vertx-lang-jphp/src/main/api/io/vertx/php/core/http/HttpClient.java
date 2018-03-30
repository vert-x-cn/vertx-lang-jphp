package io.vertx.php.core.http;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HttpClient")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpClient extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpClient>{
    
    private HttpClient(Environment env, io.vertx.core.http.HttpClient wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpClient __create(Environment env, io.vertx.core.http.HttpClient wrappedObject){
        return new HttpClient(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3)));
        } else if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory request(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamInteger(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg4)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory requestAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().requestAbs(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory requestAbs(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().requestAbs(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().get(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().getAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory getAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().getAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getNow(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getNow(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getNow(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory getNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getNow(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory getNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().getNow(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().post(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory postAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().postAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory postAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().postAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().head(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory headAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().headAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory headAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().headAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory headNow(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().headNow(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().headNow(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory headNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().headNow(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory headNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().headNow(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory options(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory options(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory options(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory options(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().options(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory optionsAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().optionsAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory optionsAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().optionsAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory optionsNow(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().optionsNow(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().optionsNow(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory optionsNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().optionsNow(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory optionsNow(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().optionsNow(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().put(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory putAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().putAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory putAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().putAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().delete(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deleteAbs(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().deleteAbs(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory deleteAbs(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().deleteAbs(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg1), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg1), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg2));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg2), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg3));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg3), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg4));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg5));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg5));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg5));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg5));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3) && Utils.isNotNull(arg4) && Utils.isString(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3), Utils.convParamString(__ENV__, arg4), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg5));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg5));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5, Memory arg6) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg5), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg6));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4) && Utils.isNotNull(arg5) && Utils.isString(__ENV__, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4), Utils.convParamString(__ENV__, arg5), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg6));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3) && Utils.isNotNull(arg4) && Utils.isString(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6)) {
            this.getWrappedObject().websocket(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3), Utils.convParamString(__ENV__, arg4), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg5), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg6));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocket(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5, Memory arg6, Memory arg7) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4) && Utils.isNotNull(arg5) && Utils.isString(__ENV__, arg5) && Utils.isNotNull(arg6) && Utils.isHandler(__ENV__, arg6) && Utils.isNotNull(arg7) && Utils.isHandler(__ENV__, arg7)) {
            this.getWrappedObject().websocket(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4), Utils.convParamString(__ENV__, arg5), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg6), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg7));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory websocketAbs(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isHandler(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isHandler(__ENV__, arg5)) {
            this.getWrappedObject().websocketAbs(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), arg4), Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg5));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3)));
        } else if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamDataObject(__ENV__, io.vertx.core.http.RequestOptions.class, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg2) && Utils.isNotNull(arg3) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg3) && Utils.isNotNull(arg4) && Utils.isString(__ENV__, arg4)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg2), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg3), Utils.convParamString(__ENV__, arg4)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory websocketStream(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg3) && Utils.isNotNull(arg4) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg4) && Utils.isNotNull(arg5) && Utils.isString(__ENV__, arg5)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStream(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg3), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg4), Utils.convParamString(__ENV__, arg5)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory websocketStreamAbs(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg1) && Utils.isNotNull(arg2) && Utils.isEnum(__ENV__, WebsocketVersion.class, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.WebSocket>, ReadStream<io.vertx.core.http.WebSocket>, io.vertx.core.http.WebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.WebSocket, WebSocket>create0(WebSocket.class, WebSocket::__create), this.getWrappedObject().websocketStreamAbs(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg1), Utils.convParamEnum(__ENV__, WebsocketVersion.class, arg2), Utils.convParamString(__ENV__, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory redirectHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().redirectHandler(Utils.convParamFunction(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientResponse, HttpClientResponse>create0(HttpClientResponse.class, HttpClientResponse::__create), VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.http.HttpClientRequest>, Future<io.vertx.core.http.HttpClientRequest>, io.vertx.core.http.HttpClientRequest>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>create0(HttpClientRequest.class, HttpClientRequest::__create)), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

}
