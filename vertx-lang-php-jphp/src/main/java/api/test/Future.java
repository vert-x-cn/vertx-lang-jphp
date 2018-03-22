package api.test;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.lang.php.BaseWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.BiFunction;

public class Future<T> extends BaseWrapper<io.vertx.core.Future<T>>{
    private BiFunction<Environment, T, Memory> biFunction;
    private BiFunction<Environment, Memory, T> function;
    public Future(Environment env, io.vertx.core.Future<T> wrappedObject) {
        this(env, wrappedObject, Utils::convReturnTypeUnknown, Utils::convParamTypeUnknown);
    }
    public Future(Environment env, io.vertx.core.Future<T> wrappedObject, BiFunction<Environment, T, Memory> biFunction, BiFunction<Environment, Memory, T> function) {
        super(env, wrappedObject);
        this.biFunction = biFunction;
        this.function = function;
    }

    public boolean isComplete() {
        return false;
    }

    public Future<T> setHandler(Handler<AsyncResult<T>> handler) {
        return this;
    }

    public void complete(T result) {

    }

    public void complete() {

    }

    public void fail(Throwable cause) {

    }

    public void fail(String failureMessage) {

    }

    public boolean tryComplete(T result) {
        return false;
    }

    public boolean tryComplete() {
        return false;
    }

    public boolean tryFail(Throwable cause) {
        return false;
    }

    public boolean tryFail(String failureMessage) {
        return false;
    }

    public T result() {
        return null;
    }

    public Throwable cause() {
        return null;
    }

    public boolean succeeded() {
        return false;
    }

    public boolean failed() {
        return false;
    }

    public void handle(AsyncResult<T> asyncResult) {

    }
}
