package io.vertx.lang.jphp;

import io.vertx.codegen.Case;
import io.vertx.codegen.Model;
import io.vertx.codegen.ModuleInfo;

import java.io.PrintWriter;
import java.util.*;

class PhpExtensionGenerator extends PhpGenerator<Model> {
    PhpExtensionGenerator() {
        this.kinds = new HashSet<>(Arrays.asList("class", "dataObject"));
        this.incremental = true;
    }

    @Override
    public String filename(Model model) {
//        ModuleInfo module = model.getModule();
//        return module.translatePackageName("jphp") + "." + name(module) + ".java";
        return fcq(model) + ".java";
    }

    private Set<String> importClassSet = new TreeSet<>();
    private Set<String> registerClassSet = new TreeSet<>();

    {
        importClassSet.add("php.runtime.env.CompileScope");
        importClassSet.add("php.runtime.ext.support.Extension");
    }

    @Override
    void render(Model model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        importClassSet.add(model.getFqn());
        registerClassSet.add(model.getFqn());
        if (index == size - 1) {
            ModuleInfo module = model.getModule();
            String packageName = module.translatePackageName("jphp");
            String simpleName = simpleName(module);
            writer.print("package ");
            writer.print(packageName);
            writer.println(";");
            writer.println();

            for (String importClass : importClassSet) {
                writer.print("import ");
                writer.print(importClass);
                writer.println(";");
            }
            writer.println();

            writer.print("public class ");
            writer.print(simpleName);
            writer.println(" extends Extension {");

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
        return module.translatePackageName("jphp") + "." + className;
    }

    private static String simpleName(ModuleInfo model) {
        String name = model.getName();
        if ("vertx".equals(name)) {
            name = "VertxCore";
        }
        return Case.KEBAB.to(Case.CAMEL, name) + "Extension";
    }
}
