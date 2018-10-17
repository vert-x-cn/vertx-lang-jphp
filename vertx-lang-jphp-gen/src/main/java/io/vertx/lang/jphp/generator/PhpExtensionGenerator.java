package io.vertx.lang.jphp.generator;


import io.vertx.codegen.Case;
import io.vertx.codegen.Model;
import io.vertx.codegen.ModuleInfo;

import java.io.PrintWriter;
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
    protected void render(Model model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        ModuleInfo module = model.getModule();
//        importClassSet.add(module.translateQualifiedName(model.getFqn(), "jphp"));
        registerClassSet.add(module.translateQualifiedName(model.getFqn(), "jphp"));
        if (index == size - 1) {
            String packageName = module.translatePackageName(id);
            writer.println("package io.vertx.lang.jphp;");
            writer.println();

            for (String importClass : importClassSet) {
                writer.print("import ");
                writer.print(importClass);
                writer.println(";");
            }
            writer.println();

            writer.println("public class VertxExtension extends Extension {");

            writer.println();

            writer.println("  @Override");
            writer.println("  public Status getStatus() {");
            writer.println("    return Status.BETA;");
            writer.println("  }");
            writer.println();

            writer.println("  @Override");
            writer.println("  public void onRegister(CompileScope scope) {");

            for (String registerClass : registerClassSet) {
                writer.print("    registerClass(scope, ");
                writer.print(registerClass);
                writer.println(".class);");
            }

            writer.println("  }");
            writer.println("}");

        }
    }

    static String fcq(Model model) {
        ModuleInfo module = model.getModule();
        String className = simpleName(module);
        return module.translatePackageName(id) + "." + className;
    }

    private static String simpleName(ModuleInfo model) {
        String name = model.getName();
        if ("vertx".equals(name)) {
            name = "VertxCore";
        }
        return Case.KEBAB.to(Case.CAMEL, name) + "Extension";
    }
}
