package io.vertx.codetrans.lang.jphp;

import io.vertx.codetrans.CodeBuilder;
import io.vertx.codetrans.Lang;
import io.vertx.codetrans.Script;

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
    public String getExtension() {
        return "jphp";
    }

}
