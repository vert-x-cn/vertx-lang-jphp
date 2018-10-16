package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Model;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

public abstract class PhpGenerator<M extends Model> extends Generator<M> {
    protected static final String id = "jphp";

    protected PhpGenerator() {
        this.name = "JPhp";
    }

    @Override
    public String render(M model, int index, int size, Map<String, Object> session) {
        StringWriter buffer = new StringWriter();
        PrintWriter writer = new PrintWriter(buffer);
        render(model, index, size, session, writer);
        return buffer.toString();
    }

    protected abstract void render(M model, int index, int size, Map<String, Object> session, PrintWriter writer);
}
