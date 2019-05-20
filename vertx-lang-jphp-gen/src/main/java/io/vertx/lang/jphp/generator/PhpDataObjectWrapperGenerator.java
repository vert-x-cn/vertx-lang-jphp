package io.vertx.lang.jphp.generator;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.PropertyKind;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.writer.CodeWriter;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhpDataObjectWrapperGenerator extends AbstractPhpDataObjectGenerator {

  @Override
  public String filename(DataObjectModel model) {
    return javaFileName(model);
  }

  @Override
  void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace) {
    genJavaPackage(writer, packageOrNamespace);
  }

  @Override
  void genClassStartTemplate(DataObjectModel model, CodeWriter writer) {
    ClassTypeInfo type = model.getType().getRaw();
    String fqn = type.getName();
    String simpleName = type.getSimpleName();
    String packageName = type.getPackageName();
    writer.format("@Name(\"%s\")", simpleName).println();

    writer.format("@Namespace(\"%s\")", model.getType().translatePackageName(id).replace(".", "\\\\")).println();
    writer.format("@PhpGen(%s.class)", fqn).println();
    writer.println("@SuppressWarnings(\"ALL\")");
    writer.format("public class %s extends DataObjectWrapper<%s> {", simpleName, fqn).println();
  }

  @Override
  void genConstructor(DataObjectModel model, CodeWriter writer) {
    ClassTypeInfo type = model.getType();
    String simpleName = type.getSimpleName();
    String fqn = type.getName();
    writer.format("public %s(Environment env, %s wrappedObject) {", simpleName, fqn).println();
    writer.indent();
    writer.println("super(env, wrappedObject);");
    writer.unindent().println("}");

    if (!model.isAbstract()) {
      if (model.hasEmptyConstructor()) {
        writer.println("@Signature");
        writer.println("public Memory __construct() {");
        writer.indent();
        writer.format("this.__wrappedObject = new %s();", fqn).println();
        writer.println("return Memory.NULL;");
        writer.unindent().println("}");
      }
      writer.println("@Signature");
      writer.println("public Memory __construct(Memory memory) {");
      writer.indent();
      writer.format("this.__wrappedObject = new %s(new JsonObject(JsonFunctions.json_encode(memory)));", fqn).println();
      writer.println("return Memory.NULL;");
      writer.unindent().println("}");
    }
  }

  @Override
  void genImportsOrUses(DataObjectModel model, CodeWriter writer) {
    Set<String> importClassSet = new TreeSet<>();
    importClassSet.add("io.vertx.lang.jphp.wrapper.PhpGen");
    importClassSet.add("io.vertx.lang.jphp.wrapper.DataObjectWrapper");
    importClassSet.add("php.runtime.env.Environment");
    importClassSet.add("io.vertx.lang.jphp.Utils");
    importClassSet.add("php.runtime.annotation.Reflection.Signature");
    importClassSet.add("php.runtime.annotation.Reflection.Name");
    importClassSet.add("php.runtime.annotation.Reflection.Namespace");
    importClassSet.add("php.runtime.Memory");
    importClassSet.add("io.vertx.core.json.JsonObject");
    importClassSet.add("org.develnext.jphp.zend.ext.json.JsonFunctions");
    importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
    importClassSet.add("io.vertx.lang.jphp.converter.VertxGenVariable0Converter");
    importClassSet.add("io.vertx.lang.jphp.converter.EnumConverter");
    importClassSet.add("io.vertx.lang.jphp.converter.DataObjectConverter");

    for (PropertyInfo property : model.getPropertyMap().values()) {
      addImport(model, importClassSet, property.getType());
      if (!property.getKind().isValue()) {
        importClassSet.add("io.vertx.lang.jphp.converter.ContainerConverter");
      }
    }

    for (String importClass : importClassSet) {
      writer.format("import %s;", importClass).println();
    }
  }


  @Override
  protected String renderLinkToHtml(Tag.Link link) {
    return renderJavaLinkToHtml(link);
  }

  @Override
  void genAdderMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    writer.println("@Signature");
    boolean basic = property.getKind().isValue() && property.getType().getKind().basic;
    String adderParamType = basic ? property.getType().getSimpleName() : "Memory";
    if (property.getKind().isMap()) {
      writer.format("public Memory %s(Environment __ENV__, String key, %s %s) {", property.getAdderMethod(), adderParamType, property.getName()).println();
      String valueInfo;
      if (basic) {
        valueInfo = property.getName();
      } else {
        valueInfo = getTypeConverter(model, property.getType()) + ".convParam(__ENV__, " + property.getName() + ")";
      }
      writer.indent().format("this.getWrappedObject().%s(key, %s);", property.getAdderMethod(), valueInfo).println();
      writer.println("return toMemory();");
      writer.unindent().println("}");
    } else {
      writer.format("public Memory %s(Environment __ENV__, %s %s) {", property.getAdderMethod(), adderParamType, property.getName()).println();
      writer.indent().format("this.getWrappedObject().%s(", property.getAdderMethod());
      if (basic) {
        writer.print(property.getName());
      } else {
        writer.print(getTypeConverter(model, property.getType()));
        writer.format(".convParam(__ENV__, %s)", property.getName());
      }
      writer.println(");");
      writer.println("return toMemory();");
      writer.unindent().println("}");
    }
  }

  @Override
  void genGetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    String method = property.getGetterMethod();
    boolean basic = property.getKind().isValue() && property.getType().getKind().basic;
    writer.println("@Signature");
    writer.format("public %s %s(Environment __ENV__) {", basic ? property.getType().getSimpleName() : "Memory", method).println();
    writer.indent();
    if (basic) {
      writer.format("return this.getWrappedObject().%s();", method).println();
    } else {
      String typeConverter = getTypeConverter(model, property.getType());
      switch (property.getKind()) {
        case MAP:
          writer.format("return ContainerConverter.createMapConverter(%s).convReturn(__ENV__, this.getWrappedObject().%s());", typeConverter, method);
          break;
        case SET:
          writer.format("return ContainerConverter.createSetConverter(%s).convReturn(__ENV__, this.getWrappedObject().%s());", typeConverter, method);
          break;
        case LIST:
          writer.format("return ContainerConverter.createListConverter(%s).convReturn(__ENV__, this.getWrappedObject().%s());", typeConverter, method);
          break;
        case VALUE:
          writer.format("return %s.convReturn(__ENV__, this.getWrappedObject().%s());", typeConverter, method);
          break;
      }
      writer.println();
    }
    writer.unindent().println("}");
  }

  private boolean isKeyword(String name) {
    return name.equals("default");
  }

  @Override
  void genSetterMethod(DataObjectModel model, PropertyInfo property, CodeWriter writer) {
    String method = property.getSetterMethod();
    String propertyName = property.getName();
    propertyName = isKeyword(propertyName) ? "value" : propertyName;

    boolean basic = property.getKind().isValue() && property.getType().getKind().basic;
    writer.println("@Signature");
    writer.format("public Memory %s(Environment __ENV__, %s %s) {", method, basic ? property.getType().getSimpleName() : "Memory", propertyName).println();
    writer.indent();
    if (basic) {
      writer.format("this.getWrappedObject().%s(%s);", method, propertyName).println();
    } else {
      String typeConverter = getTypeConverter(model, property.getType());
      switch (property.getKind()) {
        case MAP:
          writer.format("this.getWrappedObject().%s(ContainerConverter.createMapConverter(%s).convParam(__ENV__, %s));", method, typeConverter, propertyName);
          break;
        case SET:
          writer.format("this.getWrappedObject().%s(ContainerConverter.createSetConverter(%s).convParam(__ENV__, %s));", method, typeConverter, propertyName);
          break;
        case LIST:
          writer.format("this.getWrappedObject().%s(ContainerConverter.createListConverter(%s).convParam(__ENV__, %s));", method, typeConverter, propertyName);
          break;
        case VALUE:
          writer.format("this.getWrappedObject().%s(%s.convParam(__ENV__, %s));", method, typeConverter, propertyName);
          break;
      }
      writer.println();
    }
    writer.println("return toMemory();");
    writer.unindent().println("}");
  }
}
