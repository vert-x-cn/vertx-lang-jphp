package io.vertx.codetrans.lang.jphp;

import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.Lang;
import io.vertx.codetrans.Script;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class JPhpLang implements Lang {

  @Override
  public String id() {
    return "jphp";
  }

  @Override
  public CodeBuilder codeBuilder() {
    return new JPhpCodeBuilder();
  }

  @Override
  public Script loadScript(ClassLoader loader, String path, String method) throws Exception {
    throw new UnsupportedOperationException("not yet implemented");
  }

  @Override
  public File createSourceFile(File root, List<String> className, String methodName) {
    File folder = new File(root, className.stream().collect(Collectors.joining(File.separator)));
    if (methodName != null) {
      folder = new File(folder, methodName);
    }
    return new File(folder.getParent(), folder.getName() + ".php");
  }

  @Override
  public String getExtension() {
    return "php";
  }

}
