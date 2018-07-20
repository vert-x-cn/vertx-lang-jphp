package io.vertx.lang.jphp.generator.dataobject;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.ModuleInfo;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.lang.jphp.generator.PhpGenerator;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;

public class PhpDataObjectGenerator extends AbstractPhpDataObjectGenerator {

    public PhpDataObjectGenerator() {
        super(false, "php");
    }

    @Override
    protected void render(DataObjectModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        writer.println("<?php");
        super.render(model, index, size, session, writer);
    }
}
