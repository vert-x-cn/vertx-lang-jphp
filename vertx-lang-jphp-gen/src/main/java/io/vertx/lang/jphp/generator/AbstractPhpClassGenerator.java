package io.vertx.lang.jphp.generator;

import io.vertx.codegen.ClassModel;
import io.vertx.codegen.ConstantInfo;
import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.writer.CodeWriter;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public abstract class AbstractPhpClassGenerator extends PhpGenerator<ClassModel> {
  public AbstractPhpClassGenerator() {
    this.kinds = Collections.singleton("class");
  }

  @Override
  public Collection<Class<? extends Annotation>> annotations() {
    return Arrays.asList(ModuleGen.class, VertxGen.class);
  }

  @Override
  void render(ClassModel model, int index, int size, Map<String, Object> session, CodeWriter writer) {
    String packageName = model.getType().translatePackageName(id);
    genPackageOrNamespace(writer, packageName);
    writer.println();
    genImportsOrUses(model, writer);
    writer.println();
    genClassTemplate(model, writer);
  }

  final void genClassTemplate(ClassModel model, CodeWriter writer) {
    Doc doc = model.getDoc();
    if (doc != null || model.isDeprecated()) {
      writer.println("/**");
      if (doc != null) {
        Token.toHtml(doc.getTokens(), " *", this::renderLinkToHtml, "\n", writer);
      }
      if (model.isDeprecated()) {
        genDeprecatedDoc(model, writer);
      }
      writer.println(" */");
    }
    genClassStartTemplate(model, writer);
    writer.indent();

    for (ConstantInfo constant : model.getConstants()) {
      genConstant(model, constant, writer);
    }

    genConstructor(model, writer);

    genMethodBody(model, writer);

    writer.unindent().print("}");
  }

  void genMethodBody(ClassModel model, CodeWriter writer) {
    for (String methodName : model.getMethodMap().keySet()) {
      genMethod(model, methodName, writer);
    }
  }

  abstract void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace);

  abstract void genImportsOrUses(ClassModel model, CodeWriter writer);

  void genDeprecatedDoc(ClassModel model, CodeWriter writer) {

  }

  abstract void genClassStartTemplate(ClassModel model, CodeWriter writer);

  abstract void genConstructor(ClassModel model, CodeWriter writer);

  abstract void genMethod(ClassModel model, String methodName, CodeWriter writer);

  abstract void genConstant(ClassModel model, ConstantInfo constant, CodeWriter writer);

  abstract String renderLinkToHtml(Tag.Link link);
}
