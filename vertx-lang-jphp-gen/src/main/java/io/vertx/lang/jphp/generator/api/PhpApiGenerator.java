package io.vertx.lang.jphp.generator.api;

import io.vertx.codegen.ClassModel;

import java.io.PrintWriter;
import java.util.Map;

public class PhpApiGenerator extends AbstractPhpApiGenerator {
    public PhpApiGenerator(boolean implement, String suffix) {
        super(implement, suffix);
    }

    @Override
    protected void render(ClassModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {

    }
}
