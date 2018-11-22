package io.vertx.lang.jphp.generator;


import io.vertx.codegen.Case;
import io.vertx.codegen.Model;
import io.vertx.codegen.ModuleInfo;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.writer.CodeWriter;

import java.lang.annotation.Annotation;
import java.util.*;

public class PhpExtensionGenerator extends PhpGenerator<Model> {
  public PhpExtensionGenerator() {
    this.kinds = new HashSet<>(Arrays.asList("class", "dataObject"));
    this.incremental = true;
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(ModuleGen.class, VertxGen.class, DataObject.class);
  }

  @Override
  public String filename(Model model) {
    return fcq(model) + ".java";
  }

  private Set<String> importClassSet = new TreeSet<>();
  private Set<String> registerClassSet = new TreeSet<>();

  {
    importClassSet.add("php.runtime.env.CompileScope");
    importClassSet.add("php.runtime.ext.support.Extension");

    importClassSet.add("io.vertx.lang.jphp.wrapper.extension.AsyncHandler");
    importClassSet.add("io.vertx.lang.jphp.wrapper.extension.BaseThrowable");
    importClassSet.add("io.vertx.lang.jphp.wrapper.extension.Handler");
//    registerClassSet.add("AsyncHandler");
//    registerClassSet.add("BaseThrowable");
//    registerClassSet.add("Handler");
  }

  @Override
  protected void render(Model model, int index, int size, Map<String, Object> session, CodeWriter writer) {
    ModuleInfo module = model.getModule();
    registerClassSet.add(module.translateQualifiedName(model.getFqn(), "jphp"));
    if (index == size - 1) {
      writer.format("package %s;", module.translatePackageName(id)).println();
      writer.println();

      for (String importClass : importClassSet) {
        writer.format("import %s;", importClass).println();
      }
      writer.println();

      String simpleName = simpleName(module);
      writer.format("public class %s extends Extension {", simpleName).println();

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
      if (module.getName().equals("vertx")) {
        writer.println("registerClass(scope, AsyncHandler.class);");
        writer.println("registerClass(scope, BaseThrowable.class);");
        writer.println("registerClass(scope, Handler.class);");
      }
      for (String registerClass : registerClassSet) {
        writer.format("registerClass(scope, %s.class);", registerClass).println();
      }
//      for (String registerClass : registerClassSet) {
//        writer.format("registerMemoryOperation(%sOperation.class);", registerClass).println();
//      }

      writer.unindent().println("}");
      writer.unindent().println("}");

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
