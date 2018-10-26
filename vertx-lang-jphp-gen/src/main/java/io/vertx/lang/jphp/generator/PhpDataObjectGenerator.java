package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Case;
import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.writer.CodeWriter;

import java.util.Set;
import java.util.TreeSet;

import static java.lang.String.join;

public class PhpDataObjectGenerator extends AbstractPhpDataObjectGenerator {
  @Override
  public String filename(DataObjectModel model) {
    return phpFileName(model);
  }

  @Override
  void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace) {
    genPhpNamespace(writer, packageOrNamespace);
  }

  @Override
  void genImportsOrUses(DataObjectModel model, CodeWriter writer) {
    Set<String> importClassSet = new TreeSet<>();

    if (model.getSuperType() != null) {
      String superTypeSimpleName = model.getSuperType().getSimpleName();
      if (model.getType().getSimpleName().equals(superTypeSimpleName)) {
        importClassSet.add(translateClassName(model.getSuperType()) + " as J" + superTypeSimpleName);
      } else {
        addImport(model, importClassSet, model.getSuperType());
      }
    }
    for (PropertyInfo property : model.getPropertyMap().values()) {
      TypeInfo type = property.getType();
      ClassKind kind = type.getKind();
      if (kind != ClassKind.ENUM && !kind.json) {
        addImport(model, importClassSet, property.getType());
      }
    }

    for (String importClass : importClassSet) {
      writer.format("use %s;", importClass.replace(".", "\\")).println();
    }
  }

  @Override
  void genClassStartTemplate(DataObjectModel model, CodeWriter writer) {
    if (model.isAbstract()) {
      writer.print("abstract ");
    }
    writer.format("class %s", model.getType().getSimpleName());
    String superType = null;
    if (model.getSuperType() != null) {
      String superTypeSimpleName = model.getSuperType().getSimpleName();
      if (model.getType().getSimpleName().equals(superTypeSimpleName)) {
        superType = "J" + superTypeSimpleName;
      } else {
        superType = superTypeSimpleName;
      }
    }
    if (superType != null) {
      writer.format(" extends %s", superType);
    }
    writer.println();
    writer.println("{");
  }

  @Override
  void genConstructor(DataObjectModel model, CodeWriter writer) {
    writer.println("/**");
    writer.format(" * %s constructor", model.getType().getSimpleName()).println();
    writer.format(" * @param $%s mixed | null", model.getType().getSimpleName(Case.LOWER_CAMEL)).println();
    writer.println(" */");
    writer.format("public function __construct($%s%s)", model.getType().getSimpleName(Case.LOWER_CAMEL), model.hasEmptyConstructor() ? " = null" : "").println();
    writer.println("{");
    writer.indent().println();
    writer.unindent().println("}");
  }

  @Override
  String renderLinkToHtml(Tag.Link link) {
    return renderPhpLinkToHtml(link);
  }

  @Override
  void genAdderMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    if (property.getKind().isMap()) {
      writer.println("/**");
      writer.println(" * @param $key String");
      writer.println(" * @param $value String");
      writer.println(" * @return $this");
      writer.println(" */");
      writer.format("public function %s($key, $value)", property.getAdderMethod()).println();
      writer.println("{");
      writer.indent().println("return $this;");
      writer.unindent().println("}");
    } else {
      writer.println("/**");
      writer.format(" * @param $%s %s", property.getName(), join("|", getPHPDocType(property.getType(), true))).println();
      writer.println(" * @return $this");
      writer.println(" */");
      writer.format("public function %s($%s)", property.getAdderMethod(), property.getName()).println();
      writer.println("{");
      writer.indent().println("return $this;");
      writer.unindent().println("}");
    }
  }

  @Override
  void genGetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    writer.println();
    writer.println("/**");
    writer.format(" * @return %s", join("|", getPHPDocType(property.getType(), false))).println();
    writer.println(" */");
    writer.format("public function %s()", property.getGetterMethod()).println();
    writer.println("{");
    writer.indent().format("return %s;", getReturnInfo(property.getType())).println();
    writer.unindent().println("}");
  }

  @Override
  void genSetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    writer.println();
    writer.println("/**");
    writer.format(" * @param $%s %s", property.getName(), join("|", getPHPDocType(property.getType(), true))).println();
    writer.println(" * @return $this");
    writer.println(" */");
    writer.format("public function %s($%s)", property.getSetterMethod(), property.getName()).println();
    writer.println("{");
    writer.indent().println("return $this;");
    writer.unindent().println("}");
  }
}
