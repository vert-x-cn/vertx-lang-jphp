package io.vertx.lang.jphp;

import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.EnumTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.type.TypeMirrorFactory;
import io.vertx.codetrans.CodeTranslator;
import io.vertx.codetrans.lang.jphp.JPhpLang;
import io.vertx.docgen.Coordinate;
import io.vertx.docgen.DocGenerator;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.*;

public class JPhpDocGenerator implements DocGenerator {
  private CodeTranslator translator;
  private TypeMirrorFactory factory;

  @Override
  public void init(ProcessingEnvironment processingEnv) {
    translator = new CodeTranslator(processingEnv);
    factory = new TypeMirrorFactory(processingEnv.getElementUtils(), processingEnv.getTypeUtils());
  }

  @Override
  public String getName() {
    return "php";
  }

  @Override
  public String renderSource(ExecutableElement elt, String source) {
    JPhpLang lang = new JPhpLang();
    try {
      return translator.translate(elt, lang);
    } catch (Exception e) {
      System.out.println("Cannot generate " + elt.getEnclosingElement().getSimpleName() + "#" + elt.getSimpleName() + " : " + e.getMessage());
      return "Code not translatable";
    }
  }

  @Override
  public String resolveTypeLink(TypeElement elt, Coordinate coordinate) {
    TypeInfo type;
    try {
      type = factory.create(elt.asType());
    } catch (Exception e) {
      System.out.println("Could not resolve doc link for type " + elt.getQualifiedName());
      return null;
    }
    String moduleName;
    if (type.getRaw() != null) {
      moduleName = type.getRaw().getModuleName() + "-jphp/";
    } else moduleName = "";
    if ((type.getKind() == ClassKind.ENUM && ((EnumTypeInfo) type).isGen()) || (type.getKind() == ClassKind.DATA_OBJECT)) {
      String baselink;
      if (coordinate == null) {
        baselink = "../";
      } else {
        baselink = "../../" + coordinate.getArtifactId() + "/";
      }
      String adocLink;
      if (type.getKind() == ClassKind.DATA_OBJECT) {
        adocLink = moduleName + "enums.adoc";
      } else {
        adocLink = moduleName + "dataobjects.adoc";
      }
      return baselink + adocLink + "#" + elt.getSimpleName().toString();
    } else if (type.getKind() == ClassKind.API) {

      return "https://vertx.okou.tk/phpdoc/" + moduleName + "classes/" + type.getRaw().translatePackageName("jphp") + "." + type.getRaw().getSimpleName() + ".html";
    }
    return null;
  }

  @Override
  public String resolveConstructorLink(ExecutableElement elt, Coordinate coordinate) {
    return toExecutableLink(elt, "__construct");
  }

  @Override
  public String resolveMethodLink(ExecutableElement elt, Coordinate coordinate) {
    return toExecutableLink(elt, elt.getSimpleName().toString());
  }

  private String toExecutableLink(ExecutableElement elt, String name) {
    TypeElement typeElt = (TypeElement) elt.getEnclosingElement();
    String link = resolveTypeLink(typeElt, null);
    StringBuilder anchor = new StringBuilder("#method_");
    anchor.append(name);
    return link + anchor;
  }

  @Override
  public String resolveLabel(Element elt, String defaultLabel) {
    String result = defaultLabel;
    if (elt.getModifiers().contains(Modifier.STATIC)) {
      result = result.replace(".", "::");
    } else {
      result = result.replace(".", "->");
    }
    return result;
  }

  @Override
  public String resolveFieldLink(VariableElement elt, Coordinate coordinate) {
//        return javaGen.resolveFieldLink(elt, coordinate);
    return null;
  }
}
