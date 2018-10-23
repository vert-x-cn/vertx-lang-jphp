package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Model;
import io.vertx.codegen.writer.CodeWriter;

import java.util.*;

public class ServiceLoaderGenerator extends PhpGenerator<Model> {

  public ServiceLoaderGenerator() {
    this.kinds = new HashSet<>(Arrays.asList("class", "dataObject"));
    this.incremental = true;
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
