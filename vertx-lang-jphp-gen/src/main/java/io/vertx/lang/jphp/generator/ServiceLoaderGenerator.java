package io.vertx.lang.jphp.generator;

import io.vertx.codegen.ModuleModel;
import io.vertx.codegen.writer.CodeWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ServiceLoaderGenerator extends PhpGenerator<ModuleModel> {

  public ServiceLoaderGenerator() {
    this.kinds = Collections.singleton("module");
    this.incremental = true;
  }

  @Override
  public String filename(ModuleModel model) {
    return "resources/META-INF/services/php.runtime.ext.support.Extension";
  }

  private Set<String> extensions = new HashSet<>();

  @Override
  protected void render(ModuleModel model, int index, int size, Map<String, Object> session, CodeWriter writer) {
    extensions.add(PhpExtensionGenerator.fcq(model));
    if (index == size - 1) {
      for (String extension : extensions) {
        writer.println(extension);
      }
    }
  }
}
