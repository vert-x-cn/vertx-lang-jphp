package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Model;
import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.writer.CodeWriter;

import java.lang.annotation.Annotation;
import java.util.*;

public class ServiceLoaderGenerator extends PhpGenerator<Model> {

  public ServiceLoaderGenerator() {
    this.kinds = new HashSet<>(Arrays.asList("class"));
    this.incremental = true;
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(ModuleGen.class, VertxGen.class, DataObject.class);
  }

  @Override
  public String filename(Model model) {
    return "resources/META-INF/services/php.runtime.ext.support.Extension";
  }

  private Set<String> extensions = new TreeSet<>();

  @Override
  protected void render(Model model, int index, int size, Map<String, Object> session, CodeWriter writer) {
    extensions.add(PhpExtensionGenerator.fcq(model));
    if (index == size - 1) {
      for (String extension : extensions) {
        writer.println(extension);
      }
    }
  }
}
