package io.vertx.lang.jphp.generator;


import io.vertx.codegen.Case;
import io.vertx.codegen.Model;
import io.vertx.codegen.ModuleInfo;
import io.vertx.codegen.writer.CodeWriter;

import java.util.*;

public class PhpExtensionGenerator extends PhpGenerator<Model> {
    public PhpExtensionGenerator() {
        this.kinds = new HashSet<>(Arrays.asList("class", "dataObject"));
        this.incremental = true;
    }

    @Override
    public String filename(Model model) {
        return "io.vertx.lang.jphp.VertxExtension.java";
    }

    private Set<String> importClassSet = new TreeSet<>();
    private Set<String> registerClassSet = new TreeSet<>();

    {
        importClassSet.add("php.runtime.env.CompileScope");
        importClassSet.add("php.runtime.ext.support.Extension");

        importClassSet.add("io.vertx.lang.jphp.wrapper.extension.AsyncHandler");
        importClassSet.add("io.vertx.lang.jphp.wrapper.extension.BaseThrowable");
        importClassSet.add("io.vertx.lang.jphp.wrapper.extension.Handler");
        registerClassSet.add("AsyncHandler");
        registerClassSet.add("BaseThrowable");
        registerClassSet.add("Handler");
    }

    @Override
    protected void render(Model model, int index, int size, Map<String, Object> session, CodeWriter writer) {
        ModuleInfo module = model.getModule();
        registerClassSet.add(module.translateQualifiedName(model.getFqn(), "jphp"));
        if (index == size - 1) {
            writer.println("package io.vertx.lang.jphp;");
            writer.println();

            for (String importClass : importClassSet) {
                writer.format("import %s;", importClass).println();
            }
            writer.println();

            writer.println("public class VertxExtension extends Extension {");

            writer.println();
            writer.indent();

            writer.println("@Override");
            writer.println("public Status getStatus() {");
            writer.indent().println("return Status.BETA;");
            writer.unindent().println("}");
            writer.println();

            writer.println("@Override");
            writer.println("public void onRegister(CompileScope scope) {");

            writer.indent();
            for (String registerClass : registerClassSet) {
                writer.format("registerClass(scope, %s.class);", registerClass).println();
            }

            writer.unindent().println("}");
            writer.unindent().println("}");

        }
    }
}
