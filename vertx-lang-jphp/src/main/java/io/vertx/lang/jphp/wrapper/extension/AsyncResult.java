package io.vertx.lang.jphp.wrapper.extension;

import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.Variable1Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.env.Environment;

@Name("AsyncResult")
@Namespace("io\\vertx\\php\\core")
public class AsyncResult<T> extends BaseWrapper<io.vertx.core.AsyncResult<T>> implements Variable1Wrapper<io.vertx.core.AsyncResult<T>, T> {
  private TypeConverter<T> converter;

  public AsyncResult(Environment __env__, io.vertx.core.AsyncResult<T> __wrappedObject, TypeConverter<T> converter) {
    super(__env__, __wrappedObject);
    this.converter = converter;
  }

  @Override
  public TypeConverter<T> getTypeConverter1() {
    return converter;
  }

  @Reflection.Signature
  public Memory result(Environment __ENV__) {
    return converter.convReturn(__ENV__, getWrappedObject().result());
  }

  @Reflection.Signature
  public Memory cause(Environment __ENV__) {
    return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().cause());
  }

  @Reflection.Signature
  public Memory succeeded(Environment __ENV__) {
    return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().succeeded());
  }

  @Reflection.Signature
  public Memory failed(Environment __ENV__) {
    return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed());
  }

  @Reflection.Signature
  public Memory map(Environment __ENV__, Memory arg0) {
    if (Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
      return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamFunction(__ENV__, converter, TypeConverter.UNKNOWN_TYPE, arg0)));
    } else if (Utils.isVariable(__ENV__, arg0)) {
      return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamVariable(__ENV__, arg0)));
    }/*2*/ else {
      throw new RuntimeException("function invoked with invalid arguments");
    }
  }

  @SuppressWarnings({"unchecked", "unused"})
  @Reflection.Signature
  public Memory mapEmpty(Environment __ENV__) {
    return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().mapEmpty());
  }

  @SuppressWarnings("unused")
  @Reflection.Signature
  public Memory otherwise(Environment __ENV__, Memory arg0) {
    if (Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
      return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, converter, this.getWrappedObject().otherwise(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, converter, arg0)));
    } else if (converter.accept(__ENV__, arg0)) {
      return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, converter, this.getWrappedObject().otherwise(converter.convParam(__ENV__, arg0)));
    }/*2*/ else {
      throw new RuntimeException("function invoked with invalid arguments");
    }
  }/*1*/


  @SuppressWarnings("unused")
  @Reflection.Signature
  public Memory otherwiseEmpty(Environment __ENV__) {
    return Utils.convReturnVertxGenVariable1(__ENV__, AsyncResult.class, AsyncResult::new, converter, this.getWrappedObject().otherwiseEmpty());
  }/*1*/
}
