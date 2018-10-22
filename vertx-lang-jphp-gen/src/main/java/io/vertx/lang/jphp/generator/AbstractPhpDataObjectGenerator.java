package io.vertx.lang.jphp.generator;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.writer.CodeWriter;

import java.util.Collections;
import java.util.Map;

public abstract class AbstractPhpDataObjectGenerator extends PhpGenerator<DataObjectModel> {
  public AbstractPhpDataObjectGenerator() {
    this.kinds = Collections.singleton("dataObject");
  }

  @Override
  final void render(DataObjectModel model, int index, int size, Map<String, Object> session, CodeWriter writer) {
    String packageName = model.getType().translatePackageName(id);
    genPackageOrNamespace(writer, packageName);
    writer.println();
    genImportsOrUses(model, writer);
    writer.println();

    genClassTemplate(model, writer);
  }

  final void genClassTemplate(DataObjectModel model, CodeWriter writer) {
    Doc doc = model.getDoc();
    if (doc != null) {
      writer.println("/**");
      Token.toHtml(doc.getTokens(), " *", this::renderLinkToHtml, "\n", writer);
      writer.println(" */");
    }
    genClassStartTemplate(model, writer);
    writer.println();
    writer.indent();

    genConstructor(model, writer);

//    for (PropertyInfo property : model.getPropertyMap().values()) {
//      if (property.getAdderMethod() != null) {
//        genAdderMethod(model, property, writer);
//      }
//      if (property.getGetterMethod() != null) {
//        genGetterMethod(model, property, writer);
//      }
//      if (property.getSetterMethod() != null) {
//        genSetterMethod(model, property, writer);
//      }
//    }
    writer.unindent().print("}");
  }

  abstract void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace);

  abstract void genImportsOrUses(DataObjectModel model, CodeWriter writer);

  abstract void genClassStartTemplate(DataObjectModel model, CodeWriter writer);

  abstract void genConstructor(DataObjectModel model, CodeWriter writer);

  abstract void genAdderMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer);

  abstract void genGetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer);

  abstract void genSetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer);


  abstract String renderLinkToHtml(Tag.Link link);
}
