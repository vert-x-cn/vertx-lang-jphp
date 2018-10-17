package io.vertx.lang.jphp.generator;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Helper;
import io.vertx.codegen.Model;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.*;
import io.vertx.codegen.writer.CodeWriter;

import javax.lang.model.element.Element;
import java.io.StringWriter;
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

  final List<String> getPHPDocType(TypeInfo type) {
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
      return Arrays.asList(type.getRaw().getSimpleName(), "mixed");
    } else if (kind == ENUM) {
      return Collections.singletonList("string");
    } else if (kind == API) {
      ApiTypeInfo typeInfo = (ApiTypeInfo) type;
      return typeInfo.isHandler() ? Arrays.asList(type.getRaw().getSimpleName(), "callable") : Collections.singletonList(type.getRaw().getSimpleName());
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

  final String getTypeConverter(M model, TypeInfo typeInfo) {
    ClassKind typeKind = typeInfo.getKind();
    String simpleName = typeInfo.getRaw().getSimpleName();
    String fqn = typeInfo.getRaw().getName();
    if (typeKind.basic || typeKind.json || typeKind == THROWABLE || typeKind == VOID) {
      return "TypeConverter." + typeConverterMap.get(typeKind == PRIMITIVE ? typeInfo.getName() : simpleName);
    } else if (typeKind == ENUM) {
      return "EnumConverter.create(" + typeInfo.getSimpleName() + ".class)";
    } else if (typeKind == DATA_OBJECT) {
      DataObjectTypeInfo type = (DataObjectTypeInfo) typeInfo;
      String creator = type.isAbstract() ? "null" : typeInfo.getRaw().getName() + "::new";
      return "DataObjectConverter.create(" + typeInfo.getRaw().getName() + ".class, " + creator + ", " + simpleName + "::new)";
    } else if (typeKind == LIST || typeKind == SET || typeKind == MAP) {
      ParameterizedTypeInfo type = (ParameterizedTypeInfo) typeInfo;
      TypeInfo containerType = null;
      if (typeKind != MAP) {
        containerType = type.getArg(0);
      } else {
        containerType = type.getArg(1);
      }
      return "ContainerConverter.create" + simpleName + "Converter(" + getTypeConverter(model, containerType) + ")";
    } else if (typeKind == API) {
      List<TypeInfo> args = typeInfo.isParameterized() ? ((ParameterizedTypeInfo) typeInfo).getArgs() : Collections.emptyList();
      StringBuilder returnInfo = new StringBuilder("VertxGenVariable0Converter.<");
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
          } else {
            typeParamInfo.append(arg.getRaw().getSimpleName());
          }
        }
      }
      String typeParamInfo2 = (typeParamInfo.toString().equals("")) ? "" : ("<" + typeParamInfo + ">");
      returnInfo.append(fqn).append(typeParamInfo2).append(", ").append(simpleName).append(typeParamInfo2);
      returnInfo.append(typeParamInfo.toString().equals("") ? "" : ", ");
      returnInfo.append(typeParamInfo);
      returnInfo.append(">create").append(args.size()).append("(").append(simpleName).append(".class, ").append(simpleName).append("::__create");
      for (TypeInfo arg : args) {
        returnInfo.append(", ").append(getTypeConverter(model, arg));
      }
      return returnInfo + ")";
    } else if (typeInfo.isVariable() && ((TypeVariableInfo) typeInfo).getParam().isClass()) {
      return getConverterMethodName(model, "get", typeInfo.getName()) + "()";
    } else {
      return "TypeConverter.UNKNOWN_TYPE";
    }
  }

  protected String getConverterMethodName(M model, String methodPrefix, String paramName) {
    throw new RuntimeException("只有class wrapper才会调用此方法");
  }

  String javaFileName(M model) {
    return model.getModule().translateQualifiedName(model.getFqn(), "jphp") + ".java";
  }

  String phpFileName(M model) {
    return model.getModule().translateQualifiedName(model.getFqn(), "jphp").replace(".", "/") + ".php";
  }

  String getReturnInfo(TypeInfo propertyType) {
    ClassKind propertyKind = propertyType.getKind();
    if (propertyKind.collection || propertyKind.json) {
      return "[]";
    } else if (propertyKind.basic) {
      if (propertyKind == STRING) {
        return "\"\"";
      } else if (propertyType.getSimpleName().equals("Boolean") || propertyType.getSimpleName().equals("boolean")) {
        return "false";
      } else {
        return "0";
      }
    } else {
      return null;
    }
  }
}
