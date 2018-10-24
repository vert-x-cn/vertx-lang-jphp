package io.vertx.lang.jphp.wrapper.extension;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.Variable1Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;

@Name("AsyncHandler")
@Namespace("io\\vertx\\php\\core")
public class AsyncHandler<T> extends BaseWrapper<io.vertx.core.Handler<io.vertx.core.AsyncResult<T>>> implements Variable1Wrapper<io.vertx.core.Handler<io.vertx.core.AsyncResult<T>>, T> {
  private TypeConverter<T> converter;

  public AsyncHandler(Environment __env__, Handler<io.vertx.core.AsyncResult<T>> __wrappedObject, TypeConverter<T> converter) {
    super(__env__, __wrappedObject);
    this.converter = converter;
  }

  @Override
  public TypeConverter<T> getTypeConverter1() {
    return converter;
  }

  @Signature
  public void handle(Environment __ENV__, Memory result) {
    handle(__ENV__, result, null);
  }
  @Signature
  public void handle(Environment __ENV__, Memory result, Memory cause) {
    if (!Utils.isNotNull(cause) && converter.accept(__ENV__, result)) {
      getWrappedObject().handle(Future.succeededFuture(converter.convParam(__ENV__, result)));
    } else if (Utils.isNotNull(cause)) {
      if(Utils.isThrowable(__ENV__, cause)) {
        getWrappedObject().handle(Future.failedFuture(Utils.convParamThrowable(__ENV__, cause)));
      } else {
        getWrappedObject().handle(Future.failedFuture(new RuntimeException(cause.toString())));
      }
    } else {
      throw new RuntimeException("function invoked with invalid arguments");
    }
  }
}
