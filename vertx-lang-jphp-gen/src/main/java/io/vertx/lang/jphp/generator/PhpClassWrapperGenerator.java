package io.vertx.lang.jphp.generator;

import io.vertx.codegen.ClassModel;
import io.vertx.codegen.writer.CodeWriter;

import java.io.PrintWriter;
import java.util.Map;

public class PhpClassWrapperGenerator extends PhpGenerator<ClassModel> {
  @Override
  void render(ClassModel model, int index, int size, Map<String, Object> session, CodeWriter writer) {

  }

  @Override
  protected String getConverterMethodName(ClassModel model, String methodPrefix, String paramName) {
    return methodPrefix + model.getIfaceSimpleName() + "Variable" + paramName + "Converter";
  }
}
