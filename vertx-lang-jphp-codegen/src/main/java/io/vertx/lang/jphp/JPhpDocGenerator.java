package io.vertx.lang.jphp;

import io.vertx.codetrans.CodeTranslator;
import io.vertx.codetrans.lang.jphp.JPhpLang;
import io.vertx.docgen.Coordinate;
import io.vertx.docgen.DocGenerator;
import io.vertx.docgen.JavaDocGenerator;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.*;

public class JPhpDocGenerator implements DocGenerator {
    private JavaDocGenerator javaGen = new JavaDocGenerator();
    private CodeTranslator translator;

    @Override
    public void init(ProcessingEnvironment processingEnv) {
        translator = new CodeTranslator(processingEnv);
        javaGen.init(processingEnv);
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
        return javaGen.resolveTypeLink(elt, coordinate);
    }

    @Override
    public String resolveConstructorLink(ExecutableElement elt, Coordinate coordinate) {
        return javaGen.resolveConstructorLink(elt, coordinate);
    }

    @Override
    public String resolveMethodLink(ExecutableElement elt, Coordinate coordinate) {
        return javaGen.resolveMethodLink(elt, coordinate);
    }

    @Override
    public String resolveLabel(Element elt, String defaultLabel) {
        String result = javaGen.resolveLabel(elt, defaultLabel);
        if (elt.getModifiers().contains(Modifier.STATIC)) {
            result = result.replace(".", "::");
        } else {
            result = result.replace(".", "->");
        }
        return result;
    }

    @Override
    public String resolveFieldLink(VariableElement elt, Coordinate coordinate) {
        System.err.println("=============" + elt.getEnclosingElement() + "." + elt.getSimpleName());
        return javaGen.resolveFieldLink(elt, coordinate);
    }
}
