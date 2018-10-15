package io.vertx.lang.jphp;

import io.vertx.codegen.ClassModel;

import java.util.Collections;

public abstract class AbstractPhpClassGenerator extends PhpGenerator<ClassModel> {
    public AbstractPhpClassGenerator() {
        this.kinds = Collections.singleton("class");
    }
}
