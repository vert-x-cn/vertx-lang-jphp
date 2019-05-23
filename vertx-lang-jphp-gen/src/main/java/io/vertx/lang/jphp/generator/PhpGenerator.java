package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Helper;
import io.vertx.codegen.Model;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.*;
import io.vertx.codegen.writer.CodeWriter;

import javax.lang.model.element.Element;
import java.io.StringWriter;
import java.time.Instant;
import java.util.*;

import static io.vertx.codegen.type.ClassKind.*;

abstract class PhpGenerator<M extends Model> extends Generator<M> {
  static final String id = "jphp";

  PhpGenerator() {
    this.name = "JPhp";
  }

  @Override
  public final String render(M model, int index, int size, Map<String, Object> session) {
    StringWriter buffer = new StringWriter();
    CodeWriter writer = new CodeWriter(buffer);
    writer.indentSize(2);
    render(model, index, size, session, writer);
    return buffer.toString();
  }

  abstract void render(M model, int index, int size, Map<String, Object> session, CodeWriter writer);

  String translateClassName(TypeInfo classType) {
//        return classType.getRaw().translatePackageName(id) + "." + classType.getRaw().getSimpleName();
    return classType.getRaw().translateName(id);
  }

  String translateClassName(TypeInfo classType, boolean php) {
    String result = translateClassName(classType);
    return !php ? result : result.replace(".", "\\");
  }

  final String renderJavaLinkToHtml(Tag.Link link) {
    ClassTypeInfo rawType = link.getTargetType().getRaw();
    if (rawType.getModule() != null) {
      String label = link.getLabel().trim();
      if (rawType.getKind() == DATA_OBJECT) {
        return "{@link " + rawType.getName() + "}";
      } else {
        if (rawType.getKind() == ClassKind.API) {
          Element elt = link.getTargetElement();
          String eltKind = elt.getKind().name();
          String ret = "{@link " + rawType.translateName(id);
          if ("METHOD".equals(eltKind)) {
            /* todo find a way for translating the complete signature */
            ret += "#" + elt.getSimpleName().toString();
          }
          if (label.length() > 0) {
            ret += " " + label;
          }
          ret += "}";
          return ret;
        }
      }
    }
    return "{@link " + rawType.getName() + "}";
  }

  void addImport(M model, Set<String> importClassSet, TypeInfo typeInfo) {
    if (typeInfo.isVariable()) {
      return;
    }
    String simpleName = Helper.getSimpleName(model.getFqn());
    if (simpleName.equals(typeInfo.getSimpleName())) {
      return;
    }
    ClassKind typeKind = typeInfo.getKind();
    String packageName = Helper.getPackageName(model.getFqn());
    if (typeKind == ClassKind.API || typeKind == ClassKind.DATA_OBJECT) {
      if (!typeInfo.getRaw().getPackageName().equals(packageName)) {
        importClassSet.add(translateClassName(typeInfo));
      }
    } else if (typeKind == ClassKind.ENUM) {
      importClassSet.add(typeInfo.getRaw().getPackageName() + "." + typeInfo.getRaw().getSimpleName());
    } else if (typeKind.json) {
      importClassSet.add(typeInfo.getRaw().getPackageName() + "." + typeInfo.getRaw().getSimpleName());
    }
  }

  final String renderPhpLinkToHtml(Tag.Link link) {
    ClassTypeInfo rawType = link.getTargetType().getRaw();
    if (rawType.getModule() != null) {
      String label = link.getLabel().trim();
      if (rawType.getKind() == DATA_OBJECT) {
        return "@see \\" + translateClassName(rawType, true);
      } else {
        if (rawType.getKind() == ClassKind.API) {
          Element elt = link.getTargetElement();
          String eltKind = elt.getKind().name();
          String ret = "@see \\" + translateClassName(rawType, true);
          if ("METHOD".equals(eltKind)) {
            /* todo find a way for translating the complete signature */
            ret += "::" + elt.getSimpleName().toString();
          }
          if (label.length() > 0) {
            ret += " " + label;
          }
          return ret;
        }
      }
    }
    return "{@link " + rawType.getName() + "}";
  }

  final List<String> getPHPDocType(TypeInfo type, boolean param) {
    ClassKind kind = type.getKind();
    if (type.getName().equals("void")) {
      return Collections.singletonList("void");
    } else if (kind == STRING) {
      return Collections.singletonList("string");
    } else if (kind == PRIMITIVE || kind == BOXED_PRIMITIVE) {
      switch (type.getSimpleName()) {
        case "boolean":
        case "Boolean":
          return Collections.singletonList("boolean");
        case "char":
        case "Character":
          return Collections.singletonList("string");
        case "double":
        case "Double":
        case "float":
        case "Float":
          return Collections.singletonList("float");
        default:
          return Collections.singletonList("integer");
      }
    } else if (kind == JSON_OBJECT) {
      return Collections.singletonList("array");
    } else if (kind == JSON_ARRAY) {
      return Collections.singletonList("array");
    } else if (kind == DATA_OBJECT) {
      return !param ? Collections.singletonList(type.getRaw().getSimpleName()) : Arrays.asList(type.getSimpleName(), "array");
    } else if (kind == ENUM) {
      return Collections.singletonList("string");
    } else if (kind == API) {
//      ApiTypeInfo typeInfo = (ApiTypeInfo) type.getRaw();
//      return typeInfo.isHandler() ? Arrays.asList(type.getSimpleName(), "callable") : Collections.singletonList(type.getSimpleName());
      return Collections.singletonList(type.getSimpleName());
    } else if (kind.collection) {
      return Collections.singletonList("array");
    } else if (kind == MAP) {
      return Collections.singletonList("array");
    } else if (kind == OBJECT) {
      return Collections.singletonList("mixed");
    } else if (kind == HANDLER) {
      return Collections.singletonList("callable");
    } else if (kind == FUNCTION) {
      return Collections.singletonList("callable");
    } else if (kind == THROWABLE) {
      return Collections.singletonList("\\Exception");
    } else if (kind == CLASS_TYPE) {
      return Collections.singletonList("string");
    } else {
      return Collections.singletonList("todo" + type.getName());
    }
  }

  private final Map<String, String> typeConverterMap = new HashMap<>();

  {
    typeConverterMap.put("String", "STRING");
    typeConverterMap.put("byte", "BYTE");
    typeConverterMap.put("Byte", "BYTE");
    typeConverterMap.put("char", "CHARACTER");
    typeConverterMap.put("Character", "CHARACTER");
    typeConverterMap.put("short", "SHORT");
    typeConverterMap.put("Short", "SHORT");
    typeConverterMap.put("int", "INTEGER");
    typeConverterMap.put("Integer", "INTEGER");
    typeConverterMap.put("long", "LONG");
    typeConverterMap.put("Long", "LONG");
    typeConverterMap.put("double", "DOUBLE");
    typeConverterMap.put("Double", "DOUBLE");
    typeConverterMap.put("float", "FLOAT");
    typeConverterMap.put("Float", "FLOAT");
    typeConverterMap.put("boolean", "BOOLEAN");
    typeConverterMap.put("Boolean", "BOOLEAN");
    typeConverterMap.put("JsonObject", "JSON_OBJECT");
    typeConverterMap.put("JsonArray", "JSON_ARRAY");
    typeConverterMap.put("Throwable", "THROWABLE");
    typeConverterMap.put("Void", "VOID");
  }

  private String getVariable(List<TypeInfo> args) {
    StringBuilder typeParamInfo = new StringBuilder();
    boolean first = true;
    for (TypeInfo arg : args) {
      if (!first) {
        typeParamInfo.append(", ");
      } else {
        first = false;
      }
      if (arg.isVariable()) {
        TypeVariableInfo variable = (TypeVariableInfo) arg;
        if (variable.getParam().isClass()) {
          typeParamInfo.append(arg.getName());
        } else {
          typeParamInfo.append("Object");
        }
      } else {
        ClassKind argKind = arg.getKind();
        if (argKind == API || argKind == DATA_OBJECT) {
          typeParamInfo.append(arg.getRaw().getName());
          if (arg.isParameterized()) {
            String result = getVariable(((ParameterizedTypeInfo)arg).getArgs());
            typeParamInfo.append(result.equals("") ? "" : "<" + result + ">");
          }
        } else {
          typeParamInfo.append(arg.getRaw().getSimpleName());
        }
      }
    }
    return typeParamInfo.toString();
  }

  final String getTypeConverter(M model, TypeInfo typeInfo) {
    ClassKind typeKind = typeInfo.getKind();
//    String simpleName = typeInfo.getRaw().getSimpleName();
//    String fqn = typeInfo.getRaw().getName();
    if (typeKind.basic || typeKind.json || typeKind == THROWABLE || typeKind == VOID) {
      return "TypeConverter." + typeConverterMap.get(typeKind == PRIMITIVE ? typeInfo.getName() : typeInfo.getRaw().getSimpleName());
    } else if (typeKind == ENUM) {
      return "EnumConverter.create(" + typeInfo.getSimpleName() + ".class)";
    } else if (typeKind == DATA_OBJECT) {
      DataObjectTypeInfo type = (DataObjectTypeInfo) typeInfo;
      String creator = type.isAbstract() ? "null" : typeInfo.getRaw().getName() + "::new";
      return "DataObjectConverter.create(" + typeInfo.getRaw().getName() + ".class, " + creator + ", " + typeInfo.getRaw().getSimpleName() + "::new)";
    } else if (typeKind == LIST || typeKind == SET || typeKind == MAP) {
      ParameterizedTypeInfo type = (ParameterizedTypeInfo) typeInfo;
      TypeInfo containerType = null;
      String caseStartInfo = "";
      String caseEndInfo = "";
      if (typeKind != MAP) {
        containerType = type.getArg(0);
        caseStartInfo = "((TypeConverter<" + typeInfo.getRaw().getSimpleName() + "<" + (containerType.isVariable() ? "Object" : containerType.getRaw().getName()) + ">>)";
        caseEndInfo = ")";
      } else {
        containerType = type.getArg(1);
      }
      return caseStartInfo + "ContainerConverter.<" + (containerType.isVariable() ? "Object" : containerType.getRaw().getName()) + ">create" + typeInfo.getRaw().getSimpleName() + "Converter(" + getTypeConverter(model, containerType) + ")" + caseEndInfo;
    } else if (typeKind == API) {
      List<TypeInfo> args = typeInfo.isParameterized() ? ((ParameterizedTypeInfo) typeInfo).getArgs() : Collections.emptyList();
      StringBuilder returnInfo = new StringBuilder("VertxGenVariable0Converter.<");
      String typeParamInfo = getVariable(args);
      String typeParamInfo2 = (typeParamInfo.equals("")) ? "" : ("<" + typeParamInfo + ">");
      returnInfo.append(typeInfo.getRaw().getName()).append(typeParamInfo2).append(", ").append(typeInfo.getRaw().getSimpleName()).append(typeParamInfo2);
      returnInfo.append(typeParamInfo.equals("") ? "" : ", ");
      returnInfo.append(typeParamInfo);
      returnInfo.append(">create").append(args.size()).append("(").append(typeInfo.getRaw().getName()).append(".class, ").append(typeInfo.getRaw().getSimpleName()).append("::__create");
      for (TypeInfo arg : args) {
        returnInfo.append(", ").append(getTypeConverter(model, arg));
      }
      return returnInfo + ")";
    } else if (typeInfo.isVariable() && ((TypeVariableInfo) typeInfo).getParam().isClass()) {
      return getConverterMethodName(model, "get", typeInfo.getName()) + "()";
    } else if (typeKind == HANDLER){
      //FIXME 测试一下Handler不写泛型时的情况
      ParameterizedTypeInfo type = (ParameterizedTypeInfo) typeInfo;
      TypeInfo arg = type.getArg(0);
      if (arg.getKind() == ASYNC_RESULT) {
        ParameterizedTypeInfo result = (ParameterizedTypeInfo) arg;
        return "HandlerConverter.createResult(" + getTypeConverter(model, result.getArg(0)) + ")";
      } else {
        return "HandlerConverter.create(" + getTypeConverter(model, arg) + ")";
      }
    } else if (typeKind == FUNCTION){
      ParameterizedTypeInfo type = (ParameterizedTypeInfo) typeInfo;
      TypeInfo typeT = type.getArg(0);
      TypeInfo typeR = type.getArg(1);
      return "FunctionConverter.create(" + getTypeConverter(model, typeT) + ", "  + getTypeConverter(model, typeR) + ")";
    } else if (typeKind == CLASS_TYPE){
      return "TypeConverter.CLASS";
    } else {
      if (typeInfo.getName().equals(Instant.class.getName())) {
        return "TypeConverter.INSTANT";
      }
      return "TypeConverter.createUnknownType()";
    }
  }

  protected String getConverterMethodName(M model, String methodPrefix, String paramName) {
    throw new RuntimeException("只有class wrapper才会调用此方法");
  }

  String javaFileName(M model) {
    return model.getModule().translateQualifiedName(model.getFqn(), "jphp") + ".java";
  }

  String phpFileName(M model) {
    return "resources/" + model.getModule().translateQualifiedName(model.getFqn(), "jphp").replace(".", "/") + ".php";
  }

  String getReturnInfo(TypeInfo propertyType) {
//    ClassKind propertyKind = propertyType.getKind();
//    if (propertyKind.collection || propertyKind.json) {
//      return "[]";
//    } else if (propertyKind.basic) {
//      if (propertyKind == STRING) {
//        return "\"\"";
//      } else if (propertyType.getSimpleName().equals("Boolean") || propertyType.getSimpleName().equals("boolean")) {
//        return "false";
//      } else {
//        return "0";
//      }
//    } else {
//      return null;
//    }
    return null;
  }

  final void genJavaPackage(CodeWriter writer, String packageOrNamespace){
    genLicense(writer);
    writer.format("package %s;", packageOrNamespace).println();
  }
  final void genPhpNamespace(CodeWriter writer, String packageOrNamespace){
    writer.println("<?php /** @noinspection ALL */");
    genLicense(writer);
    writer.format("namespace %s;", packageOrNamespace.replace(".", "\\")).println();
  }

  private void genLicense(CodeWriter writer) {
    writer.println("/*");
    writer.println(" * Copyright (c) 2019 The vertx-lang-jphp-gen Project");
    writer.println(" *");
    writer.println(" * Licensed under the Apache License, version 2.0 (the \"License\");");
    writer.println(" * you may not use this file except in compliance with the License.");
    writer.println(" * You may obtain a copy of the License at:");
    writer.println(" *");
    writer.println(" *   http://www.apache.org/licenses/LICENSE-2.0");
    writer.println(" *");
    writer.println(" * Unless required by applicable law or agreed to in writing, software");
    writer.println(" * distributed under the License is distributed on an \"AS IS\" BASIS,");
    writer.println(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    writer.println(" * See the License for the specific language governing permissions and");
    writer.println(" * limitations under the License.");
    writer.println(" */");
  }
}
