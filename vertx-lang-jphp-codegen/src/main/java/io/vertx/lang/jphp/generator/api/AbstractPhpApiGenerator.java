package io.vertx.lang.jphp.generator.api;

import io.vertx.codegen.ClassModel;
import io.vertx.lang.jphp.generator.AbstractClassGenerator;

import java.util.Collections;

abstract class AbstractPhpApiGenerator extends AbstractClassGenerator<ClassModel> {
    AbstractPhpApiGenerator(boolean implement, String suffix) {
        super(implement, suffix);
        this.kinds = Collections.singleton("class");
    }
}
