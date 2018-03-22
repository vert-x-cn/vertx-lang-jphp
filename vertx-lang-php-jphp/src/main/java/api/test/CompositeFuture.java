package api.test;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CompositeFuture extends Future<io.vertx.core.CompositeFuture>{
    private static BiFunction<Environment, io.vertx.core.CompositeFuture, Memory> biFunction = (env, future) -> new CompositeFuture(env, future).toMemory();
    private static BiFunction<Environment, Memory, io.vertx.core.CompositeFuture> function = Utils.newUnwrap(io.vertx.core.CompositeFuture.class);
    public CompositeFuture(Environment env, io.vertx.core.CompositeFuture wrappedObject) {
        super(env, wrappedObject, biFunction, function);
    }

    public io.vertx.core.CompositeFuture getWrappedObject() {
        return (io.vertx.core.CompositeFuture)super.getWrappedObject();
    }

    public static <T> void test(Object obj, Class<T> clazz){
        if (clazz.isInstance(obj)) {

        }
    }

    public Throwable cause(int index) {
        return null;
    }

    public boolean succeeded(int index) {
        return false;
    }

    public boolean failed(int index) {
        return false;
    }

    public boolean isComplete(int index) {
        return false;
    }

    public <T> T resultAt(int index) {
        return this.getWrappedObject().resultAt(index);
    }

    public int size() {
        return 0;
    }

    public <T> List<T> list() {
        return null;
    }

    public <U> Future<U> compose(Handler<io.vertx.core.CompositeFuture> handler, Future<U> next) {
        return null;
    }

    public <U> Future<U> compose(Function<io.vertx.core.CompositeFuture, Future<U>> mapper) {
        return null;
    }

    public <U> Future<U> map(Function<io.vertx.core.CompositeFuture, U> mapper) {
        return null;
    }

    public <V> Future<V> map(V value) {
        return null;
    }

    public <V> Future<V> mapEmpty() {
        return null;
    }

    public Handler<AsyncResult<io.vertx.core.CompositeFuture>> completer() {
        return null;
    }

    public Future<io.vertx.core.CompositeFuture> recover(Function<Throwable, Future<io.vertx.core.CompositeFuture>> mapper) {
        return null;
    }

    public Future<io.vertx.core.CompositeFuture> otherwise(Function<Throwable, io.vertx.core.CompositeFuture> mapper) {
        return null;
    }

    public Future<io.vertx.core.CompositeFuture> otherwise(io.vertx.core.CompositeFuture value) {
        return null;
    }

    public Future<io.vertx.core.CompositeFuture> otherwiseEmpty() {
        return null;
    }
}
